package Lesson24.ad;

import Lesson24.statistic.StatisticEventManager;
import Lesson24.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class AdvertisementManager {
    private Logger logger = Logger.getLogger(AdvertisementManager.class.getName());
    private final int timeInSeconds;
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    public AdvertisementManager(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }
    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException();
        }
        this.totalTimeSecondLeft = Integer.MAX_VALUE;
        obtainOptimalVideoSet(new ArrayList<>(), timeInSeconds, 0L);
        VideoSelectedEventDataRow row = new VideoSelectedEventDataRow(optimalVideoSet, maxAmount,timeInSeconds,new Date());

        StatisticEventManager.getInstance().register(row);
        displayAdvertisement();
    }
    private long maxAmount;
    private List<Advertisement> optimalVideoSet;
    private int totalTimeSecondLeft;
    private void obtainOptimalVideoSet(List<Advertisement> totalList, int currentTimeSecondLeft, long currentAmount){
        if (currentTimeSecondLeft < 0){
            return;
        }else if (currentAmount > maxAmount || currentAmount == maxAmount &&
                (totalTimeSecondLeft > currentTimeSecondLeft || totalTimeSecondLeft == currentTimeSecondLeft &&
                        totalList.size() < optimalVideoSet.size())){
            this.totalTimeSecondLeft = currentTimeSecondLeft;
                    this.optimalVideoSet = totalList;
                    this.maxAmount =currentAmount;
                    if (currentTimeSecondLeft == 0) {
                        return;
                    }
        }
        ArrayList<Advertisement> temp = getActualAdvertisements();
        temp.removeAll(totalList);
        for (Advertisement ad:temp) {
            if (!ad.isActive()) continue;
            ArrayList<Advertisement> currentList = new ArrayList<>(totalList);
            currentList.add(ad);
            obtainOptimalVideoSet(currentList, currentTimeSecondLeft - ad.getDuration(),
            currentAmount + ad.getAmountPerOneDisplaying());
        }
       // optimalVideoSet.forEach(System.out::println);
    }
    private ArrayList<Advertisement> getActualAdvertisements() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        for (Advertisement ad: storage.list()) {
            if (ad.isActive()){
                advertisements.add(ad);
            }
        }return advertisements;
    }
    private void displayAdvertisement(){
        if (optimalVideoSet == null || optimalVideoSet.isEmpty()){
            throw new NoVideoAvailableException();
        }
        optimalVideoSet.sort(((o1, o2) -> {
            long l = o2.getAmountPerOneDisplaying()-o1.getAmountPerOneDisplaying();
            return (int) (l!=0 ? l : o2.getDuration() - o1.getDuration());
        }));

        for (Advertisement ad: optimalVideoSet) {
            System.out.println(ad.getName() + " is displaying " + ad.getAmountPerOneDisplaying()+ " rotation " + " , "
                    + " profit " + (1000 * ad.getAmountPerOneDisplaying() / ad.getDuration() + " kopeek "));
            ad.revalidate();
        }

    }
       /** Collections.sort(storage.list(), new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                int result = Long.compare(o1.getAmountPerOneDisplaying(), o2.getAmountPerOneDisplaying());
                if (result !=0)
                return -result;

                long costForSecond1 = o1.getAmountPerOneDisplaying()* 1000/o1.getDuration();
                long costForSecond2 = o2.getAmountPerOneDisplaying()* 1000/o2.getDuration();
                return Long.compare(costForSecond1,costForSecond2);
            }
        });
        List<Advertisement> adList = storage.list();
        if (storage.list().isEmpty()){
            throw new NoVideoAvailableException();}
         //   logger.log(Level.INFO, "No such video for this " + );
            int totalDuration = 0;
            long totalAmount = 0;
            List<Advertisement> adsForShow = new ArrayList<>();
        for (Advertisement ad:adList) {
            totalAmount += ad.getAmountPerOneDisplaying();
            totalDuration += ad.getDuration();
            if (totalDuration <= timeInSeconds && ad.getDuration() <= timeInSeconds){
                adsForShow.add(ad);
            }else {
                totalAmount -= ad.getAmountPerOneDisplaying();
                totalDuration -= ad.getDuration();
            }
        }

        StatisticManager.getInstance().register(new VideoSelectedEventDataRow(adsForShow, totalAmount, totalDuration,new Date()));

        int timeLeft = timeInSeconds;
        for (Advertisement advertisement: adsForShow) {
            if (timeLeft < advertisement.getDuration())continue;

            ConsoleHelper.writeMessage(advertisement.getName() + "is displaying... "
                    + advertisement.getAmountPerOneDisplaying() + ", "
                    + advertisement.getAmountPerOneDisplaying() * 1000/ advertisement.getDuration());

            timeLeft -= advertisement.getDuration();
            advertisement.revalidate();
        }


    }*/

}

package Lesson24.ad;

import Lesson24.ConsoleHelper;
import Lesson24.statistic.StatisticManager;
import Lesson24.statistic.event.VideoSelectedEventDataRow;

import java.util.*;
import java.util.logging.Logger;

public class AdvertisementManager {
    private Logger logger = Logger.getLogger(AdvertisementManager.class.getName());
    private final int timeInSeconds;
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    public AdvertisementManager(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public void processVideos(){
        Collections.sort(storage.list(), new Comparator<Advertisement>() {
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


    }
}

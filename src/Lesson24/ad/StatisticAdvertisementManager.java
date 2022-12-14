package Lesson24.ad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StatisticAdvertisementManager {
    private static AdvertisementStorage advertisementStorage = AdvertisementStorage.getInstance();
    private static StatisticAdvertisementManager instanceHolder = new StatisticAdvertisementManager();

    public static StatisticAdvertisementManager getInstance(){
        return instanceHolder;
    }
    private StatisticAdvertisementManager(){

    }
    public List<Advertisement> getActiveAdvertisements (Boolean isActive){
        List<Advertisement> videos = new ArrayList<>();
        for (Advertisement ad: advertisementStorage.list()){
            if (!isActive && ad.getHits() == 0){
                videos.add(ad);
            }
            if (isActive && ad.getHits() != 0){
                videos.add(ad);
            }
        }
        Collections.sort(videos, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return videos;


        }
    }


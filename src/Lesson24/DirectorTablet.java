package Lesson24;

import Lesson24.ad.Advertisement;
import Lesson24.ad.StatisticAdvertisementManager;
import Lesson24.statistic.StatisticEventManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DirectorTablet {
    public void printAdvertisementProfit(){
        StatisticEventManager statisticEventManager = StatisticEventManager.getInstance();
        Map<String, Long> profitMap = statisticEventManager.getProfitMap();
        ArrayList<String> keys = new ArrayList<>(profitMap.keySet());
        Collections.sort(keys);

        for (String key: keys) {
            System.out.println(key + " - " + profitMap.get(key));
        }

    }
    public void printCookWorkLoading(){
        StatisticEventManager statisticEventManager = StatisticEventManager.getInstance();
        Map<String, Map<String, Integer>> loadingMap = statisticEventManager.getCookWorkLoadingMap();
        ArrayList<String> keys = new ArrayList<>(loadingMap.keySet());
        Collections.sort(keys);

        for (String key: keys) {
            System.out.println(key + " - " + loadingMap.get(key));
        }


    }
    public void printActiveVideoSet(){
        List<Advertisement> list = StatisticAdvertisementManager.getInstance().getActiveAdvertisements(true);
        for (Advertisement ad: list) {
            ConsoleHelper.writeMessage(ad.getName() + " - " + ad.getHits());
        }

    }
    public void printArchivedVideoSet(){
        List<Advertisement> list = StatisticAdvertisementManager.getInstance().getActiveAdvertisements(false);
        for (Advertisement ad: list) {
            ConsoleHelper.writeMessage(ad.getName());
        }
    }
}

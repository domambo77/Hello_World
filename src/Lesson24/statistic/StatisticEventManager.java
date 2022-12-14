package Lesson24.statistic;

import Lesson24.statistic.event.CookedOrderEventDataRow;
import Lesson24.statistic.event.EventDataRow;
import Lesson24.statistic.event.EventType;
import Lesson24.statistic.event.VideoSelectedEventDataRow;

import java.text.SimpleDateFormat;
import java.util.*;

public class StatisticEventManager {
    private StatisticStorage statisticEventStorage = new StatisticStorage();

    public void register(EventDataRow data){

    }
    private StatisticEventManager(){

    }
    public static StatisticEventManager getInstance(){
    return InstanceHolder.statisticEventManager;}

    private static class InstanceHolder{
        private static StatisticEventManager statisticEventManager = new StatisticEventManager();
    }
    private static class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();
        private StatisticStorage(){
            for (EventType e: EventType.values()) {
                this.storage.put(e, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data){
            EventType type = data.getType();
            if (!this.storage.containsKey(type)){
                throw new UnsupportedOperationException();
            }
            this.storage.get(type).add(data);
        }
    }

    public Map<String, Long> getProfitMap(){
        Map<String, Long> result = new HashMap<>();
        List<EventDataRow> rows = statisticEventStorage.storage.get(EventType.SELECTED_VIDEOS);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        long total = 0L;
        for (EventDataRow row: rows) {
            VideoSelectedEventDataRow videoSelectedEventDataRow = (VideoSelectedEventDataRow) row;
            String date = simpleDateFormat.format(videoSelectedEventDataRow.getDate());
            if (!result.containsKey(date)){
                result.put(date, 0L);
            }total += videoSelectedEventDataRow.getAmount();
            result.put(date, result.get(date) + videoSelectedEventDataRow.getAmount());
        }
        result.put("Summarized", total);
        return result;
    }
    public Map<String, Map<String, Integer>> getCookWorkLoadingMap() {
        Map<String, Map<String, Integer>> result = new HashMap<>();
        List<EventDataRow> rows = statisticEventStorage.storage.get(EventType.COOKED_ORDER);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (EventDataRow row: rows) {
            CookedOrderEventDataRow cookedOrderEventDataRow = (CookedOrderEventDataRow) row;
            String date = simpleDateFormat.format(cookedOrderEventDataRow.getDate());
            if (!result.containsKey(date)){
                result.put(date, new HashMap<>());
            }
            Map<String, Integer> cookMap = result.get(date);
            String cookName = cookedOrderEventDataRow.getCookName();
            if (!cookMap.containsKey(cookName)){
                cookMap.put(cookName, 0);
            }
            Integer totalTime = cookMap.get(cookName);
            cookMap.put(cookName,totalTime + cookedOrderEventDataRow.getTime());
        }return result;
    }
    }
  /**  private StatisticStorage statisticStorage = new StatisticStorage();
    private static final StatisticManager ourInstance = new StatisticManager();
    private StatisticManager(){}
    public static StatisticManager getInstance(){
        return ourInstance;
    }

    public void register(EventDataRow data){
        statisticStorage.put(data);
}

private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();
        private StatisticStorage(){
            for (EventType type:EventType.values()){
                storage.put(type, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data){
            storage.get(data.getType()).add(data);
        }
}
    public void register(Cook cook){
//cooks.add(cook);
    }
    //public Map<String,Long> getProfitMap(){
      //  Map<String,Long> result
    //}

}*/

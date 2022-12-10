package Lesson24.statistic;

import Lesson24.kitchen.Cook;
import Lesson24.statistic.event.EventDataRow;
import Lesson24.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticManager {
    private StatisticStorage statisticStorage = new StatisticStorage();
    private static final StatisticManager ourInstance = new StatisticManager();
    private StatisticManager(){}
    public static StatisticManager getInstance(){
        return ourInstance;
    }

    public void register(EventDataRow data){
        statisticStorage.put(data);
}
public void register(Cook cook){

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
}

package Lesson24.statistic.event;

import Lesson24.ad.Advertisement;

import java.util.Date;
import java.util.List;

public class VideoSelectedEventDataRow implements EventDataRow {
  private List<Advertisement> optimalVideoSet;
    private Long amount;
   private int totalDuration;
   private Date currentDate;

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, Long amount, int totalDuration, Date currentDate) {
        this.optimalVideoSet = optimalVideoSet;
        this.amount = amount;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    public List<Advertisement> getOptimalVideoSet() {
        return optimalVideoSet;
    }

    public Long getAmount() {
        return amount;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    @Override
    public EventType getType() {
        return EventType.SELECTED_VIDEOS;
    }

    @Override
    public Date getDate() {
        return currentDate;
    }

    @Override
    public int getTime() {
        return totalDuration;
    }
}

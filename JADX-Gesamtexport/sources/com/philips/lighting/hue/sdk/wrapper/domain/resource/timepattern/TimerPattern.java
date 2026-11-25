package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TimerPattern extends TimePatternImpl {
    private TimePatternTime startTime;

    public TimerPattern(TimePatternTime timePatternTime) {
        super(TimePatternType.TIMER);
        this.startTime = timePatternTime;
    }

    public TimePatternTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(TimePatternTime timePatternTime) {
        this.startTime = timePatternTime;
    }
}

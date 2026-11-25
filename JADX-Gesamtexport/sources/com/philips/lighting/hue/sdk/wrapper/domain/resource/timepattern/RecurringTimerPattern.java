package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RecurringTimerPattern extends TimerPattern {
    private int recurringTimes;

    public RecurringTimerPattern(TimePatternTime timePatternTime, int i) {
        super(timePatternTime);
        this.recurringTimes = i;
        this.type = TimePatternType.RECURRING_TIMER;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.recurringTimes == ((RecurringTimerPattern) obj).recurringTimes;
    }

    public int getRecurringTimes() {
        return this.recurringTimes;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        return (super.hashCode() * 31) + this.recurringTimes;
    }

    public void setRecurringTimes(int i) {
        this.recurringTimes = i;
    }
}

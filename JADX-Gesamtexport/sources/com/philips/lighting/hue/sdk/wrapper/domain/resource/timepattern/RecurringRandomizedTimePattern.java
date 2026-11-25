package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RecurringRandomizedTimePattern extends RecurringTimePattern {
    private TimePatternTime randomElement;

    public RecurringRandomizedTimePattern(TimePatternTime timePatternTime, int i, TimePatternTime timePatternTime2) {
        super(timePatternTime, i);
        this.randomElement = timePatternTime2;
        this.type = TimePatternType.RECURRING_RANDOMIZED_TIME;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TruncatedTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RecurringRandomizedTimePattern recurringRandomizedTimePattern = (RecurringRandomizedTimePattern) obj;
        TimePatternTime timePatternTime = this.randomElement;
        if (timePatternTime == null) {
            if (recurringRandomizedTimePattern.randomElement != null) {
                return false;
            }
        } else if (!timePatternTime.equals(recurringRandomizedTimePattern.randomElement)) {
            return false;
        }
        return true;
    }

    public TimePatternTime getRandomElement() {
        return this.randomElement;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TruncatedTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternTime timePatternTime = this.randomElement;
        return iHashCode + (timePatternTime == null ? 0 : timePatternTime.hashCode());
    }

    public void setRandomElement(TimePatternTime timePatternTime) {
        this.randomElement = timePatternTime;
    }
}

package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RandomizedTimePattern extends AbsoluteTimePattern {
    private TimePatternTime randomElement;

    public RandomizedTimePattern(TimePatternDate timePatternDate, TimePatternTime timePatternTime) {
        super(timePatternDate);
        this.randomElement = timePatternTime;
        this.type = TimePatternType.RANDOMIZED_TIME;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.AbsoluteTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RandomizedTimePattern randomizedTimePattern = (RandomizedTimePattern) obj;
        TimePatternTime timePatternTime = this.randomElement;
        if (timePatternTime == null) {
            if (randomizedTimePattern.randomElement != null) {
                return false;
            }
        } else if (!timePatternTime.equals(randomizedTimePattern.randomElement)) {
            return false;
        }
        return true;
    }

    public TimePatternTime getRandomElement() {
        return this.randomElement;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.AbsoluteTimePattern, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternTime timePatternTime = this.randomElement;
        return iHashCode + (timePatternTime == null ? 0 : timePatternTime.hashCode());
    }

    public void setRandomElement(TimePatternTime timePatternTime) {
        this.randomElement = timePatternTime;
    }
}

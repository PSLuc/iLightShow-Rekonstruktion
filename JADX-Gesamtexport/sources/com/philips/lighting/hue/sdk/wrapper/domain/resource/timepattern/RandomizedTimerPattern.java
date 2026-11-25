package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class RandomizedTimerPattern extends TimerPattern {
    private TimePatternTime randomElement;

    public RandomizedTimerPattern(TimePatternTime timePatternTime, TimePatternTime timePatternTime2) {
        super(timePatternTime);
        this.randomElement = timePatternTime2;
        this.type = TimePatternType.RANDOMIZED_TIMER;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RandomizedTimerPattern randomizedTimerPattern = (RandomizedTimerPattern) obj;
        TimePatternTime timePatternTime = this.randomElement;
        if (timePatternTime == null) {
            if (randomizedTimerPattern.randomElement != null) {
                return false;
            }
        } else if (!timePatternTime.equals(randomizedTimerPattern.randomElement)) {
            return false;
        }
        return true;
    }

    public TimePatternTime getRandomElement() {
        return this.randomElement;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternTime timePatternTime = this.randomElement;
        return iHashCode + (timePatternTime == null ? 0 : timePatternTime.hashCode());
    }

    public void setRandomElement(TimePatternTime timePatternTime) {
        this.randomElement = timePatternTime;
    }
}

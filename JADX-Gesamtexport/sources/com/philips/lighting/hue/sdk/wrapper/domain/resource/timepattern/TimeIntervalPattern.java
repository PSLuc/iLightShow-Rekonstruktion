package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TimeIntervalPattern extends TimePatternImpl {
    private TimePatternTime endTime;
    private TimePatternTime startTime;

    public TimeIntervalPattern(TimePatternTime timePatternTime, TimePatternTime timePatternTime2) {
        super(TimePatternType.TIME_INTERVAL);
        this.startTime = timePatternTime;
        this.endTime = timePatternTime2;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        TimeIntervalPattern timeIntervalPattern = (TimeIntervalPattern) obj;
        TimePatternTime timePatternTime = this.endTime;
        if (timePatternTime == null) {
            if (timeIntervalPattern.endTime != null) {
                return false;
            }
        } else if (!timePatternTime.equals(timeIntervalPattern.endTime)) {
            return false;
        }
        TimePatternTime timePatternTime2 = this.startTime;
        if (timePatternTime2 == null) {
            if (timeIntervalPattern.startTime != null) {
                return false;
            }
        } else if (!timePatternTime2.equals(timeIntervalPattern.startTime)) {
            return false;
        }
        return true;
    }

    public TimePatternTime getEndTime() {
        return this.endTime;
    }

    public TimePatternTime getStartTime() {
        return this.startTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternTime timePatternTime = this.endTime;
        int iHashCode2 = (iHashCode + (timePatternTime == null ? 0 : timePatternTime.hashCode())) * 31;
        TimePatternTime timePatternTime2 = this.startTime;
        return iHashCode2 + (timePatternTime2 != null ? timePatternTime2.hashCode() : 0);
    }

    public void setEndTime(TimePatternTime timePatternTime) {
        this.endTime = timePatternTime;
    }

    public void setStartTime(TimePatternTime timePatternTime) {
        this.startTime = timePatternTime;
    }
}

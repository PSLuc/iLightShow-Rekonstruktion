package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TruncatedTimePattern extends TimePatternImpl {
    private TimePatternTime startTime;

    public TruncatedTimePattern(TimePatternTime timePatternTime) {
        super(TimePatternType.TRUNCATED_TIME);
        this.startTime = timePatternTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        TruncatedTimePattern truncatedTimePattern = (TruncatedTimePattern) obj;
        TimePatternTime timePatternTime = this.startTime;
        if (timePatternTime == null) {
            if (truncatedTimePattern.startTime != null) {
                return false;
            }
        } else if (!timePatternTime.equals(truncatedTimePattern.startTime)) {
            return false;
        }
        return true;
    }

    public TimePatternTime getStartTime() {
        return this.startTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternTime timePatternTime = this.startTime;
        return iHashCode + (timePatternTime == null ? 0 : timePatternTime.hashCode());
    }

    public void setStartTime(TimePatternTime timePatternTime) {
        this.startTime = timePatternTime;
    }
}

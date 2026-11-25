package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class AbsoluteTimePattern extends TimePatternImpl {
    private TimePatternDate startDate;

    public AbsoluteTimePattern(TimePatternDate timePatternDate) {
        super(TimePatternType.ABSOLUTE_TIME);
        this.startDate = timePatternDate;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        AbsoluteTimePattern absoluteTimePattern = (AbsoluteTimePattern) obj;
        TimePatternDate timePatternDate = this.startDate;
        if (timePatternDate == null) {
            if (absoluteTimePattern.startDate != null) {
                return false;
            }
        } else if (!timePatternDate.equals(absoluteTimePattern.startDate)) {
            return false;
        }
        return true;
    }

    public TimePatternDate getStartDate() {
        return this.startDate;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePatternImpl, com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        TimePatternDate timePatternDate = this.startDate;
        return iHashCode + (timePatternDate == null ? 0 : timePatternDate.hashCode());
    }

    public void setStartDate(TimePatternDate timePatternDate) {
        this.startDate = timePatternDate;
    }
}

package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimePatternImpl implements TimePattern {
    protected TimePatternType type;

    public TimePatternImpl(TimePatternType timePatternType) {
        this.type = timePatternType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.type == ((TimePatternImpl) obj).type;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public TimePatternType getType() {
        return this.type;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public int hashCode() {
        TimePatternType timePatternType = this.type;
        return 31 + (timePatternType == null ? 0 : timePatternType.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern
    public native String toString();
}

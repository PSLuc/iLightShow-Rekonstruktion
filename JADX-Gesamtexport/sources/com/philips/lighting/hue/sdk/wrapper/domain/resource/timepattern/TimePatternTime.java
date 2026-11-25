package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TimePatternTime {
    private int hour;
    private int minute;
    private int seconds;

    public TimePatternTime() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimePatternTime timePatternTime = (TimePatternTime) obj;
        return this.hour == timePatternTime.hour && this.minute == timePatternTime.minute && this.seconds == timePatternTime.seconds;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return ((((this.hour + 31) * 31) + this.minute) * 31) + this.seconds;
    }

    public void setHour(int i) {
        this.hour = i;
    }

    public void setMinute(int i) {
        this.minute = i;
    }

    public void setSeconds(int i) {
        this.seconds = i;
    }

    public TimePatternTime(int i, int i3, int i6) {
        this.hour = i;
        this.minute = i3;
        this.seconds = i6;
    }
}

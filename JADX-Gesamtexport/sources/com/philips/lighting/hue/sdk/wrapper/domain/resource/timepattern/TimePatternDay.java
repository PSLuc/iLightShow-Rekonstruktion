package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TimePatternDay {
    private int day;
    private int month;

    public TimePatternDay() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimePatternDay timePatternDay = (TimePatternDay) obj;
        return this.day == timePatternDay.day && this.month == timePatternDay.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int hashCode() {
        return ((this.day + 31) * 31) + this.month;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public TimePatternDay(int i, int i3) {
        this.month = i;
        this.day = i3;
    }
}

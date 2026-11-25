package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

/* JADX INFO: loaded from: classes.dex */
public class TimePatternDate {
    private int day;
    private int hour;
    private int minute;
    private int month;
    private int seconds;
    private int year;

    public TimePatternDate() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimePatternDate timePatternDate = (TimePatternDate) obj;
        return this.day == timePatternDate.day && this.hour == timePatternDate.hour && this.minute == timePatternDate.minute && this.month == timePatternDate.month && this.seconds == timePatternDate.seconds && this.year == timePatternDate.year;
    }

    public int getDay() {
        return this.day;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getMonth() {
        return this.month;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return ((((((((((this.day + 31) * 31) + this.hour) * 31) + this.minute) * 31) + this.month) * 31) + this.seconds) * 31) + this.year;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setHour(int i) {
        this.hour = i;
    }

    public void setMinute(int i) {
        this.minute = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setSeconds(int i) {
        this.seconds = i;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public TimePatternDate(int i, int i3, int i6, int i7, int i8, int i9) {
        this.year = i;
        this.month = i3;
        this.day = i6;
        this.hour = i7;
        this.minute = i8;
        this.seconds = i9;
    }
}

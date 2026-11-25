package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;

/* JADX INFO: loaded from: classes.dex */
public class TimePatternBuilder extends SessionObject {
    private native void destroyNative();

    public native TimePattern build();

    public native TimePatternBuilder endAt(int i, int i3, int i6);

    public void finalize() throws Throwable {
        destroyNative();
        super.finalize();
    }

    public native TimePatternBuilder repeatsOnAllDays();

    public native TimePatternBuilder repeatsOnFriday();

    public native TimePatternBuilder repeatsOnMonday();

    public native TimePatternBuilder repeatsOnSaturday();

    public native TimePatternBuilder repeatsOnSunday();

    public native TimePatternBuilder repeatsOnThursday();

    public native TimePatternBuilder repeatsOnTuesday();

    public native TimePatternBuilder repeatsOnWednesday();

    public native TimePatternBuilder repeatsOnWeekdays();

    public native TimePatternBuilder repeatsOnWeekend();

    public native TimePatternBuilder repeatsTimes(int i);

    public native TimePatternBuilder setDayInterval(int i, int i3, int i6, int i7);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void setSessionKey(long j4) {
    }

    public native TimePatternBuilder startAfter(int i, int i3, int i6);

    public native TimePatternBuilder startAt(int i, int i3, int i6);

    public native TimePatternBuilder startAtDate(int i, int i3, int i6, int i7, int i8, int i9);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    public native TimePatternBuilder withRandomOffset(int i, int i3, int i6);
}

package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0473d f7977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7980d;

    public C0585o(AbstractC0473d abstractC0473d) {
        if (abstractC0473d == null) {
            throw new NullPointerException("ticker");
        }
        this.f7977a = abstractC0473d;
    }

    public final void a() {
        if (this.f7978b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f7978b = true;
        this.f7980d = this.f7977a.Y();
    }

    public final String toString() {
        String str;
        long jY = this.f7978b ? (this.f7977a.Y() - this.f7980d) + this.f7979c : this.f7979c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jY, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jY, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jY, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jY, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jY, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jY, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jY / timeUnit2.convert(1L, timeUnit)));
        switch (AbstractC0583n.f7973a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }
}

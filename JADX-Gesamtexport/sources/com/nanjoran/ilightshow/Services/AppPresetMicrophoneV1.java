package com.nanjoran.ilightshow.Services;

import c5.AbstractC0476a0;
import c5.C0485f;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class AppPresetMicrophoneV1 {
    public static final int $stable = 0;
    public static final C0687o Companion = new C0687o();
    private final Boolean autoCalibration;
    private final boolean enabled;

    public /* synthetic */ AppPresetMicrophoneV1(int i, boolean z5, Boolean bool, c5.k0 k0Var) {
        if (1 != (i & 1)) {
            AbstractC0476a0.j(i, 1, C0685n.f8438a.getDescriptor());
            throw null;
        }
        this.enabled = z5;
        if ((i & 2) == 0) {
            this.autoCalibration = null;
        } else {
            this.autoCalibration = bool;
        }
    }

    public static /* synthetic */ AppPresetMicrophoneV1 copy$default(AppPresetMicrophoneV1 appPresetMicrophoneV1, boolean z5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = appPresetMicrophoneV1.enabled;
        }
        if ((i & 2) != 0) {
            bool = appPresetMicrophoneV1.autoCalibration;
        }
        return appPresetMicrophoneV1.copy(z5, bool);
    }

    public static final /* synthetic */ void write$Self$app_release(AppPresetMicrophoneV1 appPresetMicrophoneV1, b5.b bVar, a5.g gVar) {
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.Y(gVar, 0, appPresetMicrophoneV1.enabled);
        if (!cVar.p(gVar) && appPresetMicrophoneV1.autoCalibration == null) {
            return;
        }
        cVar.n(gVar, 1, C0485f.f7447a, appPresetMicrophoneV1.autoCalibration);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final Boolean component2() {
        return this.autoCalibration;
    }

    public final AppPresetMicrophoneV1 copy(boolean z5, Boolean bool) {
        return new AppPresetMicrophoneV1(z5, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppPresetMicrophoneV1)) {
            return false;
        }
        AppPresetMicrophoneV1 appPresetMicrophoneV1 = (AppPresetMicrophoneV1) obj;
        return this.enabled == appPresetMicrophoneV1.enabled && E4.k.a(this.autoCalibration, appPresetMicrophoneV1.autoCalibration);
    }

    public final Boolean getAutoCalibration() {
        return this.autoCalibration;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Boolean bool = this.autoCalibration;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "AppPresetMicrophoneV1(enabled=" + this.enabled + ", autoCalibration=" + this.autoCalibration + ")";
    }

    public AppPresetMicrophoneV1(boolean z5, Boolean bool) {
        this.enabled = z5;
        this.autoCalibration = bool;
    }

    public /* synthetic */ AppPresetMicrophoneV1(boolean z5, Boolean bool, int i, E4.g gVar) {
        this(z5, (i & 2) != 0 ? null : bool);
    }
}

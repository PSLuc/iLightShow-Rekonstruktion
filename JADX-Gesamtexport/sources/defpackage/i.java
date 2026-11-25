package defpackage;

import com.google.protobuf.C0649q;
import com.google.protobuf.M;
import com.google.protobuf.Q;
import com.google.protobuf.r;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class i extends r {
    public static final int BARRHYTHM_FIELD_NUMBER = 16;
    public static final int BASS_FIELD_NUMBER = 3;
    public static final int BEATDURATION_FIELD_NUMBER = 14;
    public static final int BEATFXDURATION_FIELD_NUMBER = 13;
    private static final i DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 7;
    public static final int FXDURATION_FIELD_NUMBER = 8;
    public static final int HIGH_FIELD_NUMBER = 4;
    public static final int LOUDNESS_FIELD_NUMBER = 2;
    public static final int NEWBAR_FIELD_NUMBER = 6;
    public static final int NEWSECTIONCOLOR_FIELD_NUMBER = 9;
    public static final int NEWSECTIONRHYTHM_FIELD_NUMBER = 10;
    public static final int NEWSECTIONSTROBE_FIELD_NUMBER = 11;
    public static final int NEWSECTION_FIELD_NUMBER = 12;
    private static volatile M PARSER = null;
    public static final int RELATIVE_LOUDNESS_FIELD_NUMBER = 15;
    public static final int SPTBEAT_FIELD_NUMBER = 5;
    public static final int START_FIELD_NUMBER = 1;
    private int barRhythm_;
    private boolean bass_;
    private float beatDuration_;
    private float beatFxDuration_;
    private float duration_;
    private float fxDuration_;
    private boolean high_;
    private int loudness_;
    private boolean newBar_;
    private int newSectionColor_;
    private int newSectionRhythm_;
    private int newSectionStrobe_;
    private boolean newSection_;
    private int relativeLoudness_;
    private boolean sptBeat_;
    private float start_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        r.i(i.class, iVar);
    }

    public static void k(i iVar, int i) {
        iVar.barRhythm_ = i;
    }

    public static void l(i iVar, float f6) {
        iVar.beatDuration_ = f6;
    }

    public static void m(i iVar, float f6) {
        iVar.duration_ = f6;
    }

    public static void n(i iVar) {
        iVar.newBar_ = true;
    }

    public static void o(i iVar, int i) {
        iVar.relativeLoudness_ = i;
    }

    @Override // com.google.protobuf.r
    public final Object a(int i) {
        M c0649q;
        switch (AbstractC0916i.d(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Q(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0001\u0002\u000f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0001\b\u0001\t\u000b\n\u000b\u000b\u000b\f\u0007\r\u0001\u000e\u0001\u000f\u0004\u0010\u0004", new Object[]{"start_", "loudness_", "bass_", "high_", "sptBeat_", "newBar_", "duration_", "fxDuration_", "newSectionColor_", "newSectionRhythm_", "newSectionStrobe_", "newSection_", "beatFxDuration_", "beatDuration_", "relativeLoudness_", "barRhythm_"});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                M m6 = PARSER;
                if (m6 != null) {
                    return m6;
                }
                synchronized (i.class) {
                    try {
                        c0649q = PARSER;
                        if (c0649q == null) {
                            c0649q = new C0649q();
                            PARSER = c0649q;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0649q;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int p() {
        return this.barRhythm_;
    }

    public final float q() {
        return this.beatDuration_;
    }

    public final int r() {
        return this.loudness_;
    }

    public final boolean s() {
        return this.newBar_;
    }

    public final boolean t() {
        return this.newSection_;
    }

    public final int u() {
        return this.relativeLoudness_;
    }

    public final boolean v() {
        return this.sptBeat_;
    }

    public final float w() {
        return this.start_;
    }
}

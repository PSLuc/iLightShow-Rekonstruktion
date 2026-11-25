package defpackage;

import com.google.protobuf.C0649q;
import com.google.protobuf.M;
import com.google.protobuf.Q;
import com.google.protobuf.r;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {
    public static final int AGGRESSIVEACT_FIELD_NUMBER = 15;
    public static final int BEATACT_FIELD_NUMBER = 10;
    public static final int BEAT_FIELD_NUMBER = 9;
    public static final int BUILDUPACT_FIELD_NUMBER = 6;
    public static final int BUILDUP_FIELD_NUMBER = 5;
    private static final b DEFAULT_INSTANCE;
    public static final int DOWNBEATACT_FIELD_NUMBER = 12;
    public static final int DOWNBEAT_FIELD_NUMBER = 11;
    public static final int DRUMACT_FIELD_NUMBER = 4;
    public static final int DRUM_FIELD_NUMBER = 3;
    public static final int FRAMEINPORTION_FIELD_NUMBER = 2;
    public static final int FRAMEINTRACK_FIELD_NUMBER = 1;
    private static volatile M PARSER = null;
    public static final int PARTYACT_FIELD_NUMBER = 16;
    public static final int SECTIONACT_FIELD_NUMBER = 14;
    public static final int SECTION_FIELD_NUMBER = 13;
    public static final int SINGLELIGHTUSE_FIELD_NUMBER = 19;
    public static final int STROBEACT_FIELD_NUMBER = 8;
    public static final int STROBE_FIELD_NUMBER = 7;
    public static final int TIMEBEFORENEXTBEAT_FIELD_NUMBER = 18;
    public static final int TIMEBEFORENEXTDRUM_FIELD_NUMBER = 17;
    private int aggressiveAct_;
    private int beatAct_;
    private boolean beat_;
    private int buildupAct_;
    private boolean buildup_;
    private int downbeatAct_;
    private boolean downbeat_;
    private int drumAct_;
    private boolean drum_;
    private int frameInPortion_;
    private int frameInTrack_;
    private int partyAct_;
    private int sectionAct_;
    private boolean section_;
    private boolean singleLightUse_;
    private int strobeAct_;
    private boolean strobe_;
    private double timeBeforeNextBeat_;
    private double timeBeforeNextDrum_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        r.i(b.class, bVar);
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
                return new Q(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0007\u0004\u000b\u0005\u0007\u0006\u000b\u0007\u0007\b\u000b\t\u0007\n\u000b\u000b\u0007\f\u000b\r\u0007\u000e\u000b\u000f\u000b\u0010\u000b\u0011\u0000\u0012\u0000\u0013\u0007", new Object[]{"frameInTrack_", "frameInPortion_", "drum_", "drumAct_", "buildup_", "buildupAct_", "strobe_", "strobeAct_", "beat_", "beatAct_", "downbeat_", "downbeatAct_", "section_", "sectionAct_", "aggressiveAct_", "partyAct_", "timeBeforeNextDrum_", "timeBeforeNextBeat_", "singleLightUse_"});
            case 3:
                return new b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                M m6 = PARSER;
                if (m6 != null) {
                    return m6;
                }
                synchronized (b.class) {
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

    public final int l() {
        return this.aggressiveAct_;
    }

    public final boolean m() {
        return this.beat_;
    }

    public final boolean n() {
        return this.buildup_;
    }

    public final boolean o() {
        return this.downbeat_;
    }

    public final boolean p() {
        return this.drum_;
    }

    public final int q() {
        return this.drumAct_;
    }

    public final int r() {
        return this.frameInTrack_;
    }

    public final int s() {
        return this.partyAct_;
    }

    public final boolean t() {
        return this.section_;
    }

    public final boolean u() {
        return this.singleLightUse_;
    }

    public final boolean v() {
        return this.strobe_;
    }

    public final double w() {
        return this.timeBeforeNextBeat_;
    }

    public final double x() {
        return this.timeBeforeNextDrum_;
    }
}

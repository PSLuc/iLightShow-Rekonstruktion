package defpackage;

import com.google.protobuf.AbstractC0640h;
import com.google.protobuf.C0649q;
import com.google.protobuf.InterfaceC0651t;
import com.google.protobuf.M;
import com.google.protobuf.P;
import com.google.protobuf.Q;
import com.google.protobuf.r;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends r {
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int CHROMAPRINT_FIELD_NUMBER = 7;
    private static final c DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 1;
    public static final int ISRC_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 8;
    private static volatile M PARSER = null;
    public static final int SHAZAM_FIELD_NUMBER = 5;
    public static final int TEMPO_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 2;
    private double duration_;
    private double tempo_;
    private String title_ = "";
    private String artist_ = "";
    private String isrc_ = "";
    private AbstractC0640h shazam_ = AbstractC0640h.i;
    private String chromaprint_ = "";
    private InterfaceC0651t items_ = P.f8179k;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        r.i(c.class, cVar);
    }

    public static c o(byte[] bArr) {
        return (c) r.h(DEFAULT_INSTANCE, bArr);
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
                return new Q(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\n\u0007Ȉ\b\u001b\t\u0000", new Object[]{"duration_", "title_", "artist_", "isrc_", "shazam_", "chromaprint_", "items_", b.class, "tempo_"});
            case 3:
                return new c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                M m6 = PARSER;
                if (m6 != null) {
                    return m6;
                }
                synchronized (c.class) {
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

    public final String k() {
        return this.isrc_;
    }

    public final InterfaceC0651t l() {
        return this.items_;
    }

    public final AbstractC0640h m() {
        return this.shazam_;
    }

    public final double n() {
        return this.tempo_;
    }
}

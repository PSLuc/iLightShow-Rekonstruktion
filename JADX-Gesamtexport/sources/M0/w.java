package M0;

import G0.C0110f;
import G0.I;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f3453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f3455c;

    static {
        D.x xVar = W.m.f5538a;
    }

    public w(C0110f c0110f, long j4, I i) {
        this.f3453a = c0110f;
        this.f3454b = AbstractC0599v0.h(c0110f.f1494h.length(), j4);
        this.f3455c = i != null ? new I(AbstractC0599v0.h(c0110f.f1494h.length(), i.f1470a)) : null;
    }

    public static w a(w wVar, C0110f c0110f, long j4, int i) {
        if ((i & 1) != 0) {
            c0110f = wVar.f3453a;
        }
        if ((i & 2) != 0) {
            j4 = wVar.f3454b;
        }
        I i3 = (i & 4) != 0 ? wVar.f3455c : null;
        wVar.getClass();
        return new w(c0110f, j4, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return I.a(this.f3454b, wVar.f3454b) && E4.k.a(this.f3455c, wVar.f3455c) && E4.k.a(this.f3453a, wVar.f3453a);
    }

    public final int hashCode() {
        int iHashCode = this.f3453a.hashCode() * 31;
        int i = I.f1469c;
        int iL = p012c.k.l(iHashCode, 31, this.f3454b);
        I i3 = this.f3455c;
        return iL + (i3 != null ? Long.hashCode(i3.f1470a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3453a) + "', selection=" + ((Object) I.g(this.f3454b)) + ", composition=" + this.f3455c + ')';
    }

    public w(int i, String str, long j4) {
        this(new C0110f((i & 1) != 0 ? "" : str, null, 6), (i & 2) != 0 ? I.f1468b : j4, (I) null);
    }
}

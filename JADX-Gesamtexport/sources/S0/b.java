package S0;

import S1.h0;
import com.fasterxml.jackson.databind.deser.std.d0;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    default float C(long j4) {
        if (!n.a(m.b(j4), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = T0.b.f5145a;
        if (n() < 1.03f) {
            return n() * m.c(j4);
        }
        T0.a aVarA = T0.b.a(n());
        if (aVarA != null) {
            return aVarA.b(m.c(j4));
        }
        return n() * m.c(j4);
    }

    default int H(float f6) {
        float fY = y(f6);
        if (Float.isInfinite(fY)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fY);
    }

    default long S(long j4) {
        if (j4 != 9205357640488583168L) {
            return h0.f(y(g.b(j4)), y(g.a(j4)));
        }
        return 9205357640488583168L;
    }

    default float V(long j4) {
        if (n.a(m.b(j4), 4294967296L)) {
            return y(C(j4));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    float a();

    default long b0(float f6) {
        return v(j0(f6));
    }

    default float i0(int i) {
        return i / a();
    }

    default float j0(float f6) {
        return f6 / a();
    }

    float n();

    default long v(float f6) {
        float[] fArr = T0.b.f5145a;
        if (!(n() >= 1.03f)) {
            return d0.y(f6 / n(), 4294967296L);
        }
        T0.a aVarA = T0.b.a(n());
        return d0.y(aVarA != null ? aVarA.a(f6) : f6 / n(), 4294967296L);
    }

    default long w(long j4) {
        if (j4 != 9205357640488583168L) {
            return G4.a.c(j0(p030f0.f.d(j4)), j0(p030f0.f.b(j4)));
        }
        return 9205357640488583168L;
    }

    default float y(float f6) {
        return a() * f6;
    }
}

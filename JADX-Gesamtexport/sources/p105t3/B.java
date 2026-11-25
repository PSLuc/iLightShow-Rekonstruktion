package p105t3;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import p012c.k;
import p116v3.d;
import p138z3.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f12557h;
    public static final y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ B[] f12558j;

    static {
        x xVar = new x();
        f12557h = xVar;
        y yVar = new y();
        i = yVar;
        f12558j = new B[]{xVar, yVar, new B() { // from class: t3.z
            public static Double b(String str, a aVar) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        boolean z5 = true;
                        if (aVar.f14644v != 1) {
                            z5 = false;
                        }
                        if (!z5) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.J());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e6) {
                    StringBuilder sbW = k.w("Cannot parse ", str, "; at path ");
                    sbW.append(aVar.J());
                    throw new JsonParseException(sbW.toString(), e6);
                }
            }

            @Override // p105t3.B
            public final Number a(a aVar) throws IOException {
                String strD0 = aVar.d0();
                if (strD0.indexOf(46) >= 0) {
                    return b(strD0, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(strD0));
                } catch (NumberFormatException unused) {
                    return b(strD0, aVar);
                }
            }
        }, new B() { // from class: t3.A
            @Override // p105t3.B
            public final Number a(a aVar) throws IOException {
                String strD0 = aVar.d0();
                try {
                    return d.j(strD0);
                } catch (NumberFormatException e6) {
                    StringBuilder sbW = k.w("Cannot parse ", strD0, "; at path ");
                    sbW.append(aVar.J());
                    throw new JsonParseException(sbW.toString(), e6);
                }
            }
        }};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f12558j.clone();
    }

    public abstract Number a(a aVar);
}

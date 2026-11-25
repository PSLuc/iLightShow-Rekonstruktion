package p105t3;

import java.io.IOException;
import p138z3.a;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public class j extends C {
    @Override // p105t3.C
    public final Object a(a aVar) throws IOException {
        if (aVar.f0() != 9) {
            return Long.valueOf(aVar.Y());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(c cVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            cVar.G();
        } else {
            cVar.Z(number.toString());
        }
    }
}

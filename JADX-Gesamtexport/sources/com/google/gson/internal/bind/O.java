package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.BitSet;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public class O extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        boolean zT;
        BitSet bitSet = new BitSet();
        aVar.b();
        int iF0 = aVar.f0();
        int i = 0;
        while (iF0 != 2) {
            int iD = AbstractC0916i.d(iF0);
            if (iD == 5 || iD == 6) {
                int iX = aVar.X();
                if (iX == 0) {
                    zT = false;
                } else {
                    if (iX != 1) {
                        StringBuilder sbV = p012c.k.v(iX, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbV.append(aVar.J());
                        throw new JsonSyntaxException(sbV.toString());
                    }
                    zT = true;
                }
            } else {
                if (iD != 7) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + p138z3.b.b(iF0) + "; at path " + aVar.D());
                }
                zT = aVar.T();
            }
            if (zT) {
                bitSet.set(i);
            }
            i++;
            iF0 = aVar.f0();
        }
        aVar.s();
        return bitSet;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        cVar.c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            cVar.V(bitSet.get(i) ? 1L : 0L);
        }
        cVar.s();
    }
}

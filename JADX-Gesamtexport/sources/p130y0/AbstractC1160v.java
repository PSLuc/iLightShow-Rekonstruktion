package p130y0;

import E0.a;
import E0.g;
import E0.l;
import E0.r;
import android.R;
import java.util.LinkedHashMap;
import p049j1.c;
import p049j1.h;

/* JADX INFO: renamed from: y0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1160v {
    public static final void a(h hVar, l lVar) {
        if (H.l(lVar)) {
            r rVar = g.f934v;
            LinkedHashMap linkedHashMap = lVar.f947d.f939h;
            Object obj = linkedHashMap.get(rVar);
            if (obj == null) {
                obj = null;
            }
            a aVar = (a) obj;
            if (aVar != null) {
                hVar.a(new c(null, R.id.accessibilityActionPageUp, aVar.f902a, null));
            }
            Object obj2 = linkedHashMap.get(g.f936x);
            if (obj2 == null) {
                obj2 = null;
            }
            a aVar2 = (a) obj2;
            if (aVar2 != null) {
                hVar.a(new c(null, R.id.accessibilityActionPageDown, aVar2.f902a, null));
            }
            Object obj3 = linkedHashMap.get(g.f935w);
            if (obj3 == null) {
                obj3 = null;
            }
            a aVar3 = (a) obj3;
            if (aVar3 != null) {
                hVar.a(new c(null, R.id.accessibilityActionPageLeft, aVar3.f902a, null));
            }
            Object obj4 = linkedHashMap.get(g.f937y);
            if (obj4 == null) {
                obj4 = null;
            }
            a aVar4 = (a) obj4;
            if (aVar4 != null) {
                hVar.a(new c(null, R.id.accessibilityActionPageRight, aVar4.f902a, null));
            }
        }
    }
}

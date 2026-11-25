package p098s2;

import K.y;
import java.util.Map;
import p015c2.h;
import p109u2.C;
import p109u2.n;
import p115v2.k;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y[] f12186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12187b;

    public m(n nVar) {
        int size = ((o) nVar.f12708h).f13238h.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this.f12187b = i - 1;
        y[] yVarArr = new y[i];
        for (Map.Entry entry : (k) ((o) nVar.f12708h).entrySet()) {
            C c6 = (C) entry.getKey();
            p015c2.o oVar = (p015c2.o) entry.getValue();
            int i3 = c6.f12672a & this.f12187b;
            y yVar = yVarArr[i3];
            y yVar2 = new y();
            yVar2.f2033d = yVar;
            yVar2.f2032c = oVar;
            yVar2.f2031b = c6.f12675d;
            yVar2.f2030a = c6.f12673b;
            yVar2.f2034e = c6.f12674c;
            yVarArr[i3] = yVar2;
        }
        this.f12186a = yVarArr;
    }

    public final p015c2.o a(h hVar) {
        y yVar = this.f12186a[(hVar.f7282l - 1) & this.f12187b];
        if (yVar == null) {
            return null;
        }
        if (!yVar.f2031b && hVar.equals((h) yVar.f2034e)) {
            return (p015c2.o) yVar.f2032c;
        }
        while (true) {
            yVar = (y) yVar.f2033d;
            if (yVar == null) {
                return null;
            }
            if (!yVar.f2031b && hVar.equals((h) yVar.f2034e)) {
                return (p015c2.o) yVar.f2032c;
            }
        }
    }

    public final p015c2.o b(Class cls) {
        y yVar = this.f12186a[cls.getName().hashCode() & this.f12187b];
        if (yVar == null) {
            return null;
        }
        if (((Class) yVar.f2030a) == cls && !yVar.f2031b) {
            return (p015c2.o) yVar.f2032c;
        }
        while (true) {
            yVar = (y) yVar.f2033d;
            if (yVar == null) {
                return null;
            }
            if (((Class) yVar.f2030a) == cls && !yVar.f2031b) {
                return (p015c2.o) yVar.f2032c;
            }
        }
    }
}

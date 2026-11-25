package p111u4;

import D4.e;
import E4.k;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements e {
    public static final b i = new b(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f12747j = new b(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i6) {
        super(i3);
        this.f12748h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f12748h) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                k.f("acc", str);
                k.f("element", gVar);
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                k.f("acc", iVar);
                k.f("element", gVar2);
                i iVarD = iVar.D(gVar2.getKey());
                j jVar = j.f12751h;
                if (iVarD == jVar) {
                    return gVar2;
                }
                e eVar = e.f12750h;
                f fVar = (f) iVarD.J(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarD);
                } else {
                    i iVarD2 = iVarD.D(eVar);
                    if (iVarD2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarD2));
                }
                return cVar;
        }
    }
}

package p2;

import java.io.Serializable;
import java.util.HashMap;
import p015c2.h;
import p015c2.o;
import p093r2.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f10839h;
    public HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10840j;

    @Override // p093r2.k
    public final o a(h hVar) {
        o oVarB;
        o oVar;
        Class superclass = hVar.f7281k;
        p104t2.b bVar = new p104t2.b(superclass);
        if (superclass.isInterface()) {
            HashMap map = this.i;
            if (map != null && (oVar = (o) map.get(bVar)) != null) {
                return oVar;
            }
        } else {
            HashMap map2 = this.f10839h;
            if (map2 != null) {
                o oVar2 = (o) map2.get(bVar);
                if (oVar2 != null) {
                    return oVar2;
                }
                if (this.f10840j && hVar.l0()) {
                    bVar.i = Enum.class;
                    String name = Enum.class.getName();
                    bVar.f12489h = name;
                    bVar.f12490j = name.hashCode();
                    o oVar3 = (o) this.f10839h.get(bVar);
                    if (oVar3 != null) {
                        return oVar3;
                    }
                }
                for (Class superclass2 = superclass; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    bVar.i = superclass2;
                    String name2 = superclass2.getName();
                    bVar.f12489h = name2;
                    bVar.f12490j = name2.hashCode();
                    o oVar4 = (o) this.f10839h.get(bVar);
                    if (oVar4 != null) {
                        return oVar4;
                    }
                }
            }
        }
        if (this.i == null) {
            return null;
        }
        o oVarB2 = b(superclass, bVar);
        if (oVarB2 != null) {
            return oVarB2;
        }
        if (superclass.isInterface()) {
            return null;
        }
        do {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return null;
            }
            oVarB = b(superclass, bVar);
        } while (oVarB == null);
        return oVarB;
    }

    public final o b(Class cls, p104t2.b bVar) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            bVar.i = cls2;
            String name = cls2.getName();
            bVar.f12489h = name;
            bVar.f12490j = name.hashCode();
            o oVar = (o) this.i.get(bVar);
            if (oVar != null) {
                return oVar;
            }
            o oVarB = b(cls2, bVar);
            if (oVarB != null) {
                return oVarB;
            }
        }
        return null;
    }
}

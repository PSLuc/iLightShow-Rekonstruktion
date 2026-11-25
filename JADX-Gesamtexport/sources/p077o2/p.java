package p077o2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import p015c2.f;
import p015c2.h;
import p015c2.r;
import p026e2.o;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f10657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f10658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f10659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10660f;

    public p(o oVar, h hVar, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(hVar, oVar.i.f8680h);
        this.f10657c = oVar;
        this.f10658d = concurrentHashMap;
        this.f10659e = map;
        this.f10660f = oVar.k(r.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    @Override // p077o2.o
    public final String a() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry entry : this.f10659e.entrySet()) {
            if (((h) entry.getValue()).j0()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // p077o2.o
    public final String b(Object obj) {
        return e(obj.getClass());
    }

    @Override // p077o2.o
    public final String c(Class cls, Object obj) {
        return obj == null ? e(cls) : e(obj.getClass());
    }

    @Override // p077o2.o
    public final h d(f fVar, String str) {
        if (this.f10660f) {
            str = str.toLowerCase();
        }
        return (h) this.f10659e.get(str);
    }

    public final String e(Class cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        ConcurrentHashMap concurrentHashMap = this.f10658d;
        String strX = (String) concurrentHashMap.get(name);
        if (strX == null) {
            Class cls2 = this.f10655a.j(cls).f7281k;
            o oVar = this.f10657c;
            oVar.getClass();
            if (oVar.k(r.USE_ANNOTATIONS)) {
                strX = oVar.d().X(oVar.j(cls2).f9566e);
            }
            if (strX == null) {
                String name2 = cls2.getName();
                int iLastIndexOf = name2.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name2 = name2.substring(iLastIndexOf + 1);
                }
                strX = name2;
            }
            concurrentHashMap.put(name, strX);
        }
        return strX;
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", p.class.getName(), this.f10659e);
    }
}

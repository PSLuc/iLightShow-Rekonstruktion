package T4;

import E4.z;
import O1.C0308a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p111u4.d[] f5257a = new p111u4.d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0308a f5258b = new C0308a("NULL", 1);

    public static final Object a(p111u4.i iVar, Object obj, Object obj2, D4.e eVar, p111u4.d dVar) {
        Object objL = U4.a.l(iVar, obj2);
        try {
            w wVar = new w(dVar, iVar);
            z.d(2, eVar);
            Object objD = eVar.d(obj, wVar);
            U4.a.f(iVar, objL);
            if (objD == v4.a.f13292h) {
                E4.k.f("frame", dVar);
            }
            return objD;
        } catch (Throwable th) {
            U4.a.f(iVar, objL);
            throw th;
        }
    }
}

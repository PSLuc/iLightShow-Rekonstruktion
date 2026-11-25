package T1;

import B.AbstractC0013g0;
import D.x;
import java.io.StringReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p015c2.u;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public class c extends r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f5159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final V1.h f5161r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Z1.c f5162h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f5165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V1.h f5166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final char f5167n;

    static {
        int iB = 0;
        for (int i : AbstractC0916i.e(4)) {
            if (i == 0) {
                throw null;
            }
            iB |= AbstractC0013g0.b(i);
        }
        f5158o = iB;
        int i3 = 0;
        for (g gVar : g.values()) {
            if (gVar.f5207h) {
                i3 |= gVar.i;
            }
        }
        f5159p = i3;
        int i6 = 0;
        for (d dVar : d.values()) {
            if (dVar.f5180h) {
                i6 |= dVar.i;
            }
        }
        f5160q = i6;
        f5161r = p009b2.f.f7068o;
    }

    public c(u uVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f5162h = new Z1.c((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        System.currentTimeMillis();
        new AtomicReference(new Z2.f(18, false));
        this.i = f5158o;
        this.f5163j = f5159p;
        this.f5164k = f5160q;
        this.f5166m = f5161r;
        this.f5165l = uVar;
        this.f5167n = '\"';
    }

    public final p009b2.a c() {
        SoftReference softReference;
        if (!AbstractC0013g0.a(4, this.i)) {
            return new p009b2.a();
        }
        ThreadLocal threadLocal = p009b2.b.f7059b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        p009b2.a aVar = softReference2 == null ? null : (p009b2.a) softReference2.get();
        if (aVar == null) {
            aVar = new p009b2.a();
            x xVar = p009b2.b.f7058a;
            if (xVar != null) {
                ReferenceQueue referenceQueue = (ReferenceQueue) xVar.f707j;
                softReference = new SoftReference(aVar, referenceQueue);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xVar.i;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(aVar);
            }
            threadLocal.set(softReference);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [char[], java.io.Serializable] */
    public final Y1.e d(String str) {
        int length = str.length();
        int i = this.i;
        Z1.c cVar = this.f5162h;
        if (length > 32768) {
            StringReader stringReader = new StringReader(str);
            return new Y1.e(new I1.b(c(), new V1.c(stringReader, true), false), this.f5163j, stringReader, this.f5165l, new Z1.c(cVar, i, cVar.f5988c, (Z1.b) cVar.f5987b.get()));
        }
        V1.c cVar2 = new V1.c(str, true);
        p009b2.a aVarC = c();
        I1.b bVar = new I1.b(aVarC, cVar2, true);
        if (((char[]) bVar.f1818f) != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        ?? A5 = aVarC.a(0, length);
        bVar.f1818f = A5;
        str.getChars(0, length, A5, 0);
        return new Y1.e(bVar, this.f5163j, this.f5165l, new Z1.c(cVar, i, cVar.f5988c, (Z1.b) cVar.f5987b.get()), A5, length);
    }
}

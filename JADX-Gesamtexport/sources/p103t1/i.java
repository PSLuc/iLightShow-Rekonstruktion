package p103t1;

import D4.e;
import E4.k;
import N3.J0;
import S1.V;
import X4.d;
import h5.C;
import h5.C0739q;
import h5.y;
import java.io.IOException;
import p084p4.x;
import p089q4.j;
import p092r1.I;
import p092r1.InterfaceC0880a;
import p092r1.T;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0880a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f12474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f12475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f12476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f12477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f12478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f12479f;

    public i(y yVar, C c6, T t6, e eVar) {
        k.f("fileSystem", yVar);
        k.f("path", c6);
        k.f("coordinator", t6);
        this.f12474a = yVar;
        this.f12475b = c6;
        this.f12476c = t6;
        this.f12477d = eVar;
        this.f12478e = new a();
        this.f12479f = new d();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [N3.J0] */
    public final Object a(J0 j4, c cVar) throws Throwable {
        g gVar;
        Throwable th;
        c cVar2;
        i iVar;
        boolean z5;
        ?? r10;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.f12466p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.f12466p = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        ?? r11 = gVar.f12464n;
        a aVar = a.f13292h;
        int i3 = gVar.f12466p;
        try {
            if (i3 == 0) {
                V.O(r11);
                if (this.f12478e.f12444a.get()) {
                    throw new IllegalStateException("StorageConnection has already been disposed.");
                }
                boolean zD = this.f12479f.d();
                c cVar3 = new c(this.f12474a, this.f12475b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zD);
                    gVar.f12461k = this;
                    gVar.f12462l = cVar3;
                    gVar.f12463m = zD;
                    gVar.f12466p = 1;
                    Object objC = j4.c(cVar3, boolValueOf, gVar);
                    if (objC == aVar) {
                        return aVar;
                    }
                    iVar = this;
                    z5 = zD ? 1 : 0;
                    r10 = objC;
                    cVar2 = cVar3;
                    cVar2.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z5) {
                        iVar.f12479f.e(null);
                    }
                    return r10;
                } catch (Throwable th2) {
                    th = th2;
                    cVar2 = cVar3;
                    r11 = zD;
                    cVar2.close();
                    throw th;
                }
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = gVar.f12463m;
            cVar2 = gVar.f12462l;
            iVar = gVar.f12461k;
            try {
                V.O(r11);
                r10 = r11;
                try {
                    cVar2.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (th != null) {
                    if (z5) {
                        iVar.f12479f.e(null);
                    }
                    return r10;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r11 = z5;
                    this = iVar;
                }
            } catch (Throwable th5) {
                r11 = z5 ? 1 : 0;
                this = iVar;
                th = th5;
                try {
                    cVar2.close();
                    throw th;
                } catch (Throwable th6) {
                    p081p0.c.D(th, th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (r11 != 0) {
            this.f12479f.e(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011c A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013a, B:74:0x0148, B:73:0x0145), top: B:105:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0124 A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_LEAVE, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013a, B:74:0x0148, B:73:0x0145), top: B:105:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013a A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013a, B:74:0x0148, B:73:0x0145), top: B:105:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(I i, c cVar) throws Throwable {
        h hVar;
        Object obj;
        C c6;
        i iVar;
        e eVar;
        C c7;
        C0739q c0739qB;
        y yVar;
        C cD;
        k kVar;
        Throwable th;
        InterfaceC0880a interfaceC0880a;
        i iVar2;
        Object obj2;
        C c8;
        if (cVar instanceof h) {
            h hVar2 = (h) cVar;
            int i3 = hVar2.f12473q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar2.f12473q = i3 - Integer.MIN_VALUE;
                hVar = hVar2;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj3 = hVar.f12471o;
        a aVar = a.f13292h;
        int i6 = hVar.f12473q;
        try {
            try {
                try {
                    try {
                        if (i6 == 0) {
                            V.O(obj3);
                            if (this.f12478e.f12444a.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            C c9 = this.f12475b.c();
                            if (c9 == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            y yVar2 = this.f12474a;
                            yVar2.getClass();
                            j<C> jVar = new j();
                            for (C c10 = c9; c10 != null && !yVar2.a(c10); c10 = c10.c()) {
                                jVar.addFirst(c10);
                            }
                            for (C c11 : jVar) {
                                k.f("dir", c11);
                                if (!c11.e().mkdir() && ((c0739qB = yVar2.b(c11)) == null || !c0739qB.f9362b)) {
                                    throw new IOException("failed to create directory: " + c11);
                                }
                            }
                            hVar.f12467k = this;
                            hVar.f12468l = i;
                            hVar.f12469m = c9;
                            d dVar = this.f12479f;
                            hVar.f12470n = dVar;
                            hVar.f12473q = 1;
                            if (dVar.c(hVar) != aVar) {
                                eVar = i;
                                c7 = c9;
                                obj = dVar;
                            }
                            return aVar;
                        }
                        if (i6 != 1) {
                            if (i6 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0880a = (InterfaceC0880a) hVar.f12470n;
                            C c12 = hVar.f12469m;
                            X4.a aVar2 = (X4.a) hVar.f12468l;
                            iVar2 = hVar.f12467k;
                            try {
                                V.O(obj3);
                                obj2 = aVar2;
                                c8 = c12;
                                try {
                                    interfaceC0880a.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (iVar2.f12474a.a(c8)) {
                                    iVar2.f12474a.c(c8, iVar2.f12475b);
                                }
                                ((d) obj2).e(null);
                                return x.f10867a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC0880a.close();
                                } catch (Throwable th4) {
                                    p081p0.c.D(th, th4);
                                }
                                throw th;
                            }
                        }
                        X4.a aVar3 = (X4.a) hVar.f12470n;
                        c7 = hVar.f12469m;
                        e eVar2 = (e) hVar.f12468l;
                        i iVar3 = hVar.f12467k;
                        V.O(obj3);
                        obj = aVar3;
                        this = iVar3;
                        eVar = eVar2;
                        hVar.f12467k = this;
                        hVar.f12468l = obj;
                        hVar.f12469m = cD;
                        hVar.f12470n = kVar;
                        hVar.f12473q = 2;
                        if (eVar.d(kVar, hVar) != aVar) {
                            iVar2 = this;
                            obj2 = obj;
                            interfaceC0880a = kVar;
                            c8 = cD;
                            interfaceC0880a.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (iVar2.f12474a.a(c8)) {
                                iVar2.f12474a.c(c8, iVar2.f12475b);
                            }
                            ((d) obj2).e(null);
                            return x.f10867a;
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC0880a = kVar;
                        interfaceC0880a.close();
                        throw th;
                    }
                    yVar.d(cD);
                    kVar = new k(yVar, cD);
                } catch (IOException e6) {
                    iVar = this;
                    e = e6;
                    c6 = cD;
                    obj = obj;
                    if (iVar.f12474a.a(c6)) {
                        try {
                            y yVar3 = iVar.f12474a;
                            yVar3.getClass();
                            yVar3.d(c6);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                StringBuilder sb = new StringBuilder();
                C c13 = this.f12475b;
                yVar = this.f12474a;
                sb.append(c13.b());
                sb.append(".tmp");
                cD = c7.d(sb.toString());
            } catch (Throwable th6) {
                th = th6;
                ((d) obj).e(null);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            obj = aVar;
            iVar = hVar;
            c6 = i;
        } catch (Throwable th7) {
            th = th7;
            obj = aVar;
            ((d) obj).e(null);
            throw th;
        }
    }

    @Override // p092r1.InterfaceC0880a
    public final void close() {
        this.f12478e.f12444a.set(true);
        this.f12477d.invoke();
    }
}

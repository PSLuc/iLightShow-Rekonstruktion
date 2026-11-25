package p091r0;

import E4.k;
import K3.e;
import P.d;
import Z.n;
import c5.C0495p;
import java.util.ArrayList;
import java.util.List;
import p030f0.c;
import p080p.l;
import p080p.m;
import p080p.w;
import p085q.a;
import p089q4.u;
import p113v0.InterfaceC1033p;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.Y;
import p124x0.k0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f11487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f11488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y f11489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f11490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11492h;
    public boolean i;

    public g(n nVar) {
        super(0);
        this.f11486b = nVar;
        e eVar = new e(10);
        eVar.f2139c = new long[2];
        this.f11487c = eVar;
        this.f11488d = new l(2);
        this.f11492h = true;
        this.i = true;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x027f  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p091r0.h
    public final boolean a(l lVar, InterfaceC1033p interfaceC1033p, C0495p c0495p, boolean z5) {
        l lVar2;
        e eVar;
        Object obj;
        boolean z6;
        boolean z7;
        i iVar;
        int i;
        boolean z8;
        boolean zA = super.a(lVar, interfaceC1033p, c0495p, z5);
        ?? E5 = this.f11486b;
        boolean z9 = true;
        if (!E5.f5969t) {
            return true;
        }
        ?? dVar = 0;
        while (E5 != 0) {
            if (E5 instanceof k0) {
                this.f11489e = AbstractC1098f.q((k0) E5, 16);
            } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                n nVar = ((AbstractC1105m) E5).f14046v;
                int i3 = 0;
                E5 = E5;
                dVar = dVar;
                while (nVar != null) {
                    if ((nVar.f5959j & 16) != 0) {
                        i3++;
                        dVar = dVar;
                        if (i3 == 1) {
                            E5 = nVar;
                        } else {
                            if (dVar == 0) {
                                dVar = new d(new n[16]);
                            }
                            if (E5 != 0) {
                                dVar.c(E5);
                                E5 = 0;
                            }
                            dVar.c(nVar);
                        }
                    }
                    nVar = nVar.f5962m;
                    E5 = E5;
                    dVar = dVar;
                }
                if (i3 == 1) {
                }
            }
            E5 = AbstractC1098f.e(dVar);
        }
        int iD = lVar.d();
        int i6 = 0;
        while (true) {
            lVar2 = this.f11488d;
            eVar = this.f11487c;
            if (i6 >= iD) {
                break;
            }
            long jA = lVar.a(i6);
            q qVar = (q) lVar.e(i6);
            if (eVar.d(jA)) {
                boolean z10 = z9;
                long j4 = qVar.f11514g;
                if (c.f(j4)) {
                    long j6 = qVar.f11510c;
                    if (c.f(j6)) {
                        z8 = z10;
                        List list = qVar.f11517k;
                        u uVar = u.f11237h;
                        if (list == null) {
                            list = uVar;
                        }
                        ArrayList arrayList = new ArrayList(list.size());
                        List list2 = qVar.f11517k;
                        if (list2 == null) {
                            list2 = uVar;
                        }
                        int size = list2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = size;
                            c cVar = (c) list2.get(i7);
                            long j7 = jA;
                            long j8 = cVar.f11473b;
                            if (c.f(j8)) {
                                Y y2 = this.f11489e;
                                k.c(y2);
                                arrayList.add(new c(cVar.f11472a, y2.U0(interfaceC1033p, j8), cVar.f11474c));
                            }
                            i7++;
                            size = i8;
                            jA = j7;
                        }
                        Y y6 = this.f11489e;
                        k.c(y6);
                        long jU0 = y6.U0(interfaceC1033p, j4);
                        Y y7 = this.f11489e;
                        k.c(y7);
                        q qVar2 = new q(qVar.f11508a, qVar.f11509b, y7.U0(interfaceC1033p, j6), qVar.f11511d, qVar.f11512e, qVar.f11513f, jU0, qVar.f11515h, qVar.i, arrayList, qVar.f11516j, qVar.f11518l);
                        qVar2.f11519m = qVar.f11519m;
                        lVar2.b(jA, qVar2);
                    } else {
                        z8 = z10;
                    }
                } else {
                    z8 = z10;
                }
            } else {
                z8 = z9;
            }
            i6++;
            z9 = z8;
            zA = zA;
            iD = iD;
        }
        boolean z11 = zA;
        boolean z12 = z9;
        if (lVar2.d() == 0) {
            eVar.f2138b = 0;
            this.f11493a.i();
            return z12;
        }
        int i9 = eVar.f2138b;
        while (true) {
            i9--;
            if (-1 >= i9) {
                break;
            }
            long j9 = ((long[]) eVar.f2139c)[i9];
            if (lVar.f10740h) {
                int i10 = lVar.f10742k;
                long[] jArr = lVar.i;
                Object[] objArr = lVar.f10741j;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr[i12];
                    if (obj2 != m.f10743a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                lVar.f10740h = false;
                lVar.f10742k = i11;
            }
            if (a.b(lVar.i, lVar.f10742k, j9) < 0) {
                eVar.l(i9);
            }
        }
        ArrayList arrayList2 = new ArrayList(lVar2.d());
        int iD2 = lVar2.d();
        for (int i13 = 0; i13 < iD2; i13++) {
            arrayList2.add(lVar2.e(i13));
        }
        i iVar2 = new i(arrayList2, c0495p);
        int size2 = arrayList2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i14);
            if (c0495p.m(((q) obj).f11508a)) {
                break;
            }
            i14++;
        }
        q qVar3 = (q) obj;
        if (qVar3 != null) {
            boolean z13 = qVar3.f11511d;
            if (z5) {
                z6 = false;
                if (!this.f11492h && (z13 || qVar3.f11515h)) {
                    Y y8 = this.f11489e;
                    k.c(y8);
                    this.f11492h = !o.d(qVar3, y8.f13138j);
                }
            } else {
                z6 = false;
                this.f11492h = false;
            }
            boolean z14 = this.f11492h;
            boolean z15 = this.f11491g;
            if (z14 == z15 || !((i = iVar2.f11496c) == 3 || i == 4 || i == 5)) {
                int i15 = iVar2.f11496c;
                if (i15 == 4 && z15 && !this.i) {
                    iVar2.f11496c = 3;
                } else if (i15 == 5 && z14 && z13) {
                    iVar2.f11496c = 3;
                }
            } else {
                iVar2.f11496c = z14 ? 4 : 5;
            }
        } else {
            z6 = false;
        }
        if (!z11 && iVar2.f11496c == 3 && (iVar = this.f11490f) != null) {
            ?? r6 = iVar.f11494a;
            int size3 = r6.size();
            ?? r7 = iVar2.f11494a;
            if (size3 != r7.size()) {
                z7 = z12;
                break;
            }
            int size4 = r7.size();
            ?? r8 = z6;
            while (true) {
                if (r8 >= size4) {
                    z7 = z6;
                    break;
                }
                if (!c.b(((q) r6.get(r8)).f11510c, ((q) r7.get(r8)).f11510c)) {
                    z7 = z12;
                    break;
                }
                r8++;
            }
        } else {
            z7 = z12;
            break;
        }
        this.f11490f = iVar2;
        return z7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p091r0.h
    public final void c(C0495p c0495p) {
        super.c(c0495p);
        i iVar = this.f11490f;
        if (iVar == null) {
            return;
        }
        this.f11491g = this.f11492h;
        ?? r6 = iVar.f11494a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) r6.get(i);
            boolean z5 = qVar.f11511d;
            long j4 = qVar.f11508a;
            boolean zM = c0495p.m(j4);
            boolean z6 = this.f11492h;
            if ((!z5 && !zM) || (!z5 && !z6)) {
                e eVar = this.f11487c;
                int i3 = eVar.f2138b;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (j4 == ((long[]) eVar.f2139c)[i6]) {
                        eVar.l(i6);
                        break;
                    }
                }
            }
        }
        this.f11492h = false;
        this.i = iVar.f11496c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void f() {
        d dVar = this.f11493a;
        int i = dVar.f4583j;
        if (i > 0) {
            Object[] objArr = dVar.f4582h;
            int i3 = 0;
            do {
                ((g) objArr[i3]).f();
                i3++;
            } while (i3 < i);
        }
        ?? E5 = this.f11486b;
        ?? dVar2 = 0;
        while (E5 != 0) {
            if (E5 instanceof k0) {
                ((k0) E5).X();
            } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                n nVar = ((AbstractC1105m) E5).f14046v;
                int i6 = 0;
                dVar2 = dVar2;
                E5 = E5;
                while (nVar != null) {
                    if ((nVar.f5959j & 16) != 0) {
                        i6++;
                        dVar2 = dVar2;
                        if (i6 == 1) {
                            E5 = nVar;
                        } else {
                            if (dVar2 == 0) {
                                dVar2 = new d(new n[16]);
                            }
                            if (E5 != 0) {
                                dVar2.c(E5);
                                E5 = 0;
                            }
                            dVar2.c(nVar);
                        }
                    }
                    nVar = nVar.f5962m;
                    dVar2 = dVar2;
                    E5 = E5;
                }
                if (i6 == 1) {
                }
            }
            E5 = AbstractC1098f.e(dVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean g(C0495p c0495p) {
        d dVar;
        int i;
        l lVar = this.f11488d;
        boolean z5 = true;
        if (lVar.d() == 0) {
            z5 = false;
        } else {
            n nVar = this.f11486b;
            if (nVar.f5969t) {
                i iVar = this.f11490f;
                k.c(iVar);
                Y y2 = this.f11489e;
                k.c(y2);
                long j4 = y2.f13138j;
                ?? E5 = nVar;
                ?? dVar2 = 0;
                while (E5 != 0) {
                    if (E5 instanceof k0) {
                        ((k0) E5).f0(iVar, j.f11498j, j4);
                    } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                        n nVar2 = ((AbstractC1105m) E5).f14046v;
                        int i3 = 0;
                        E5 = E5;
                        dVar2 = dVar2;
                        while (nVar2 != null) {
                            if ((nVar2.f5959j & 16) != 0) {
                                i3++;
                                dVar2 = dVar2;
                                if (i3 == 1) {
                                    E5 = nVar2;
                                } else {
                                    if (dVar2 == 0) {
                                        dVar2 = new d(new n[16]);
                                    }
                                    if (E5 != 0) {
                                        dVar2.c(E5);
                                        E5 = 0;
                                    }
                                    dVar2.c(nVar2);
                                }
                            }
                            nVar2 = nVar2.f5962m;
                            E5 = E5;
                            dVar2 = dVar2;
                        }
                        if (i3 == 1) {
                        }
                    }
                    E5 = AbstractC1098f.e(dVar2);
                }
                if (nVar.f5969t && (i = (dVar = this.f11493a).f4583j) > 0) {
                    Object[] objArr = dVar.f4582h;
                    int i6 = 0;
                    do {
                        ((g) objArr[i6]).g(c0495p);
                        i6++;
                    } while (i6 < i);
                }
            } else {
                z5 = false;
            }
        }
        c(c0495p);
        int i7 = lVar.f10742k;
        Object[] objArr2 = lVar.f10741j;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr2[i8] = null;
        }
        lVar.f10742k = 0;
        lVar.f10740h = false;
        this.f11489e = null;
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [P.d] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [P.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v10, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [P.d] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h(C0495p c0495p, boolean z5) {
        d dVar;
        int i;
        if (!(this.f11488d.d() == 0)) {
            ?? E5 = this.f11486b;
            if (E5.f5969t) {
                i iVar = this.f11490f;
                k.c(iVar);
                Y y2 = this.f11489e;
                k.c(y2);
                long j4 = y2.f13138j;
                ?? E6 = E5;
                ?? dVar2 = 0;
                while (E6 != 0) {
                    if (E6 instanceof k0) {
                        ((k0) E6).f0(iVar, j.f11497h, j4);
                    } else if ((E6.f5959j & 16) != 0 && (E6 instanceof AbstractC1105m)) {
                        n nVar = ((AbstractC1105m) E6).f14046v;
                        int i3 = 0;
                        E6 = E6;
                        dVar2 = dVar2;
                        while (nVar != null) {
                            if ((nVar.f5959j & 16) != 0) {
                                i3++;
                                dVar2 = dVar2;
                                if (i3 == 1) {
                                    E6 = nVar;
                                } else {
                                    if (dVar2 == 0) {
                                        dVar2 = new d(new n[16]);
                                    }
                                    if (E6 != 0) {
                                        dVar2.c(E6);
                                        E6 = 0;
                                    }
                                    dVar2.c(nVar);
                                }
                            }
                            nVar = nVar.f5962m;
                            E6 = E6;
                            dVar2 = dVar2;
                        }
                        if (i3 == 1) {
                        }
                    }
                    E6 = AbstractC1098f.e(dVar2);
                }
                if (E5.f5969t && (i = (dVar = this.f11493a).f4583j) > 0) {
                    Object[] objArr = dVar.f4582h;
                    int i6 = 0;
                    do {
                        g gVar = (g) objArr[i6];
                        k.c(this.f11489e);
                        gVar.h(c0495p, z5);
                        i6++;
                    } while (i6 < i);
                }
                if (E5.f5969t) {
                    ?? dVar3 = 0;
                    while (E5 != 0) {
                        if (E5 instanceof k0) {
                            ((k0) E5).f0(iVar, j.i, j4);
                        } else if ((E5.f5959j & 16) != 0 && (E5 instanceof AbstractC1105m)) {
                            n nVar2 = ((AbstractC1105m) E5).f14046v;
                            int i7 = 0;
                            E5 = E5;
                            dVar3 = dVar3;
                            while (nVar2 != null) {
                                if ((nVar2.f5959j & 16) != 0) {
                                    i7++;
                                    dVar3 = dVar3;
                                    if (i7 == 1) {
                                        E5 = nVar2;
                                    } else {
                                        if (dVar3 == 0) {
                                            dVar3 = new d(new n[16]);
                                        }
                                        if (E5 != 0) {
                                            dVar3.c(E5);
                                            E5 = 0;
                                        }
                                        dVar3.c(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f5962m;
                                E5 = E5;
                                dVar3 = dVar3;
                            }
                            if (i7 == 1) {
                            }
                        }
                        E5 = AbstractC1098f.e(dVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void i(long j4, w wVar) {
        e eVar = this.f11487c;
        int i = 0;
        if (eVar.d(j4)) {
            Object[] objArr = wVar.f10794a;
            int i3 = wVar.f10795b;
            int i6 = 0;
            while (true) {
                if (i6 >= i3) {
                    i6 = -1;
                    break;
                } else if (equals(objArr[i6])) {
                    break;
                } else {
                    i6++;
                }
            }
            if (!(i6 >= 0)) {
                int i7 = eVar.f2138b;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (j4 == ((long[]) eVar.f2139c)[i8]) {
                        eVar.l(i8);
                        break;
                    }
                }
                this.f11488d.c(j4);
            }
        }
        d dVar = this.f11493a;
        int i9 = dVar.f4583j;
        if (i9 > 0) {
            Object[] objArr2 = dVar.f4582h;
            do {
                ((g) objArr2[i]).i(j4, wVar);
                i++;
            } while (i < i9);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f11486b + ", children=" + this.f11493a + ", pointerIds=" + this.f11487c + ')';
    }
}

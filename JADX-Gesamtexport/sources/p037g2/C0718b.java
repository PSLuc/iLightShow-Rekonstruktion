package p037g2;

import O1.u;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import java.util.Set;
import p015c2.A;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p032f2.e;
import p032f2.r;
import p032f2.t;
import p109u2.s;

/* JADX INFO: renamed from: g2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718b extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final e f9111C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final r[] f9112D;

    public C0718b(e eVar, r[] rVarArr) {
        super(eVar);
        this.f9111C = eVar;
        this.f9112D = rVarArr;
    }

    public final void A(i iVar, f fVar) throws MismatchedInputException {
        fVar.t0(getValueType(fVar), iVar.s(), iVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", p109u2.i.r(this.f8883h), iVar.s());
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) throws IOException {
        if (!iVar.w0()) {
            A(iVar, fVar);
            throw null;
        }
        boolean z5 = this.f8889o;
        boolean z6 = this.f8895u;
        int i = 0;
        r[] rVarArr = this.f9112D;
        t tVar = this.f8884j;
        if (z5) {
            Object objV = tVar.v(fVar);
            iVar.E0(objV);
            int length = rVarArr.length;
            while (true) {
                k kVarB0 = iVar.B0();
                k kVar = k.END_ARRAY;
                if (kVarB0 == kVar) {
                    break;
                }
                if (i != length) {
                    r rVar = rVarArr[i];
                    if (rVar != null) {
                        try {
                            rVar.j(iVar, fVar, objV);
                        } catch (Exception e6) {
                            e.y(fVar, e6, objV, rVar.f8933j.f7195h);
                            throw null;
                        }
                    } else {
                        iVar.F0();
                    }
                    i++;
                } else {
                    if (!z6 && fVar.B0(g.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        fVar.L0(this, kVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                    do {
                        iVar.F0();
                    } while (iVar.B0() != k.END_ARRAY);
                }
            }
            return objV;
        }
        if (this.f8888n) {
            return n(iVar, fVar);
        }
        Object objV2 = tVar.v(fVar);
        iVar.E0(objV2);
        if (this.f8891q != null) {
            t(fVar, objV2);
        }
        if (this.f8896v) {
            fVar.getClass();
        }
        int length2 = rVarArr.length;
        while (true) {
            k kVarB1 = iVar.B0();
            k kVar2 = k.END_ARRAY;
            if (kVarB1 == kVar2) {
                break;
            }
            if (i != length2) {
                r rVar2 = rVarArr[i];
                i++;
                if (rVar2 != null) {
                    try {
                        rVar2.j(iVar, fVar, objV2);
                    } catch (Exception e7) {
                        e.y(fVar, e7, objV2, rVar2.f8933j.f7195h);
                        throw null;
                    }
                } else {
                    iVar.F0();
                }
            } else {
                if (!z6) {
                    fVar.L0(this, kVar2, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
                do {
                    iVar.F0();
                } while (iVar.B0() != k.END_ARRAY);
            }
        }
        return objV2;
    }

    @Override // p032f2.e
    public final Object e(i iVar, f fVar) throws IOException {
        h hVar = this.f8883h;
        u uVar = this.f8887m;
        z zVarV = uVar.v(iVar, fVar, this.f8882A);
        r[] rVarArr = this.f9112D;
        int length = rVarArr.length;
        if (this.f8896v) {
            fVar.getClass();
        }
        int i = 0;
        Object objD = null;
        while (iVar.B0() != k.END_ARRAY) {
            r rVar = i < length ? rVarArr[i] : null;
            if (rVar == null) {
                iVar.F0();
            } else {
                A a6 = rVar.f8933j;
                if (objD != null) {
                    try {
                        rVar.j(iVar, fVar, objD);
                    } catch (Exception e6) {
                        e.y(fVar, e6, objD, a6.f7195h);
                        throw null;
                    }
                } else {
                    String str = a6.f7195h;
                    r rVarG = uVar.g(str);
                    if (!zVarV.d(str) || rVarG != null) {
                        if (rVarG == null) {
                            zVarV.c(rVar, rVar.i(iVar, fVar));
                        } else if (zVarV.b(rVarG, rVarG.i(iVar, fVar))) {
                            try {
                                objD = uVar.d(fVar, zVarV);
                                iVar.E0(objD);
                                if (objD.getClass() != hVar.f7281k) {
                                    fVar.O("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + p109u2.i.r(hVar) + ", actual type " + p109u2.i.m(objD));
                                    throw null;
                                }
                            } catch (Exception e7) {
                                e.y(fVar, e7, hVar.f7281k, str);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            i++;
        }
        if (objD != null) {
            return objD;
        }
        try {
            return uVar.d(fVar, zVarV);
        } catch (Exception e8) {
            z(e8, fVar);
            throw null;
        }
    }

    @Override // p032f2.e
    public final e i() {
        return this;
    }

    @Override // p032f2.e
    public final e u(C0719c c0719c) {
        return new C0718b(this.f9111C.u(c0719c), this.f9112D);
    }

    @Override // p032f2.e, p015c2.j
    public final j unwrappingDeserializer(s sVar) {
        return this.f9111C.unwrappingDeserializer(sVar);
    }

    @Override // p032f2.e
    public final e v(Set set, Set set2) {
        return new C0718b(this.f9111C.v(set, set2), this.f9112D);
    }

    @Override // p032f2.e
    public final e w() {
        return new C0718b(this.f9111C.w(), this.f9112D);
    }

    @Override // p032f2.e
    public final e x(r rVar) {
        return new C0718b(this.f9111C.x(rVar), this.f9112D);
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar, Object obj) throws IOException {
        iVar.E0(obj);
        if (iVar.w0()) {
            if (this.f8891q != null) {
                t(fVar, obj);
            }
            r[] rVarArr = this.f9112D;
            int length = rVarArr.length;
            int i = 0;
            while (true) {
                k kVarB0 = iVar.B0();
                k kVar = k.END_ARRAY;
                if (kVarB0 == kVar) {
                    break;
                }
                if (i == length) {
                    if (!this.f8895u && fVar.B0(g.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        fVar.L0(this, kVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                    do {
                        iVar.F0();
                    } while (iVar.B0() != k.END_ARRAY);
                } else {
                    r rVar = rVarArr[i];
                    if (rVar != null) {
                        try {
                            rVar.j(iVar, fVar, obj);
                        } catch (Exception e6) {
                            e.y(fVar, e6, obj, rVar.f8933j.f7195h);
                            throw null;
                        }
                    } else {
                        iVar.F0();
                    }
                    i++;
                }
            }
            return obj;
        }
        A(iVar, fVar);
        throw null;
    }
}

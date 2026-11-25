package p037g2;

import O1.u;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Set;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p032f2.e;
import p032f2.r;
import p032f2.t;
import p046i2.C0772h;
import p109u2.s;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0717a extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final e f9107C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final r[] f9108D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0772h f9109E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final h f9110F;

    public C0717a(e eVar, h hVar, r[] rVarArr, C0772h c0772h) {
        super(eVar);
        this.f9107C = eVar;
        this.f9110F = hVar;
        this.f9108D = rVarArr;
        this.f9109E = c0772h;
    }

    public final Object A(f fVar, Object obj) throws IOException {
        try {
            return this.f9109E.f9547l.invoke(obj, null);
        } catch (Exception e6) {
            z(e6, fVar);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) throws IOException {
        Object objV;
        boolean zW0 = iVar.w0();
        h hVar = this.f8883h;
        if (!zW0) {
            fVar.t0(getValueType(fVar), iVar.s(), iVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", hVar.f7281k.getName(), iVar.s());
            throw null;
        }
        boolean z5 = this.f8889o;
        boolean z6 = this.f8895u;
        int i = 0;
        r[] rVarArr = this.f9108D;
        t tVar = this.f8884j;
        if (z5) {
            Object objV2 = tVar.v(fVar);
            int length = rVarArr.length;
            while (iVar.B0() != k.END_ARRAY) {
                if (i == length) {
                    if (z6 || !fVar.B0(g.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (iVar.B0() != k.END_ARRAY) {
                            iVar.F0();
                        }
                        return A(fVar, objV2);
                    }
                    Class cls = hVar.f7281k;
                    throw new MismatchedInputException((Closeable) fVar.f7252o, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length)));
                }
                r rVar = rVarArr[i];
                if (rVar != null) {
                    try {
                        objV2 = rVar.k(iVar, fVar, objV2);
                    } catch (Exception e6) {
                        e.y(fVar, e6, objV2, rVar.f8933j.f7195h);
                        throw null;
                    }
                } else {
                    iVar.F0();
                }
                i++;
            }
            return A(fVar, objV2);
        }
        if (!this.f8888n) {
            objV = tVar.v(fVar);
            if (this.f8891q != null) {
                t(fVar, objV);
            }
            if (this.f8896v) {
                fVar.getClass();
            }
            int length2 = rVarArr.length;
            while (true) {
                k kVarB0 = iVar.B0();
                k kVar = k.END_ARRAY;
                if (kVarB0 == kVar) {
                    break;
                }
                if (i == length2) {
                    if (!z6 && fVar.B0(g.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        fVar.L0(this, kVar, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                        throw null;
                    }
                    while (iVar.B0() != k.END_ARRAY) {
                        iVar.F0();
                    }
                    break;
                }
                r rVar2 = rVarArr[i];
                i++;
                if (rVar2 != null) {
                    try {
                        rVar2.k(iVar, fVar, objV);
                    } catch (Exception e7) {
                        e.y(fVar, e7, objV, rVar2.f8933j.f7195h);
                        throw null;
                    }
                } else {
                    iVar.F0();
                }
            }
        } else {
            objV = n(iVar, fVar);
        }
        return A(fVar, objV);
    }

    @Override // p032f2.e
    public final Object e(i iVar, f fVar) throws IOException {
        h hVar = this.f8883h;
        u uVar = this.f8887m;
        z zVarV = uVar.v(iVar, fVar, this.f8882A);
        r[] rVarArr = this.f9108D;
        int length = rVarArr.length;
        if (this.f8896v) {
            fVar.getClass();
        }
        int i = 0;
        Object objK = null;
        while (iVar.B0() != k.END_ARRAY) {
            r rVar = i < length ? rVarArr[i] : null;
            if (rVar == null) {
                iVar.F0();
            } else {
                A a6 = rVar.f8933j;
                if (objK != null) {
                    try {
                        objK = rVar.k(iVar, fVar, objK);
                    } catch (Exception e6) {
                        e.y(fVar, e6, objK, a6.f7195h);
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
                                objK = uVar.d(fVar, zVarV);
                                if (objK.getClass() != hVar.f7281k) {
                                    fVar.O("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + p109u2.i.r(hVar) + ", actual type " + objK.getClass().getName());
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
        if (objK != null) {
            return objK;
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

    @Override // p032f2.e, p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.FALSE;
    }

    @Override // p032f2.e
    public final e u(C0719c c0719c) {
        return new C0717a(this.f9107C.u(c0719c), this.f9110F, this.f9108D, this.f9109E);
    }

    @Override // p032f2.e, p015c2.j
    public final j unwrappingDeserializer(s sVar) {
        return this.f9107C.unwrappingDeserializer(sVar);
    }

    @Override // p032f2.e
    public final e v(Set set, Set set2) {
        return new C0717a(this.f9107C.v(set, set2), this.f9110F, this.f9108D, this.f9109E);
    }

    @Override // p032f2.e
    public final e w() {
        return new C0717a(this.f9107C.w(), this.f9110F, this.f9108D, this.f9109E);
    }

    @Override // p032f2.e
    public final e x(r rVar) {
        return new C0717a(this.f9107C.x(rVar), this.f9110F, this.f9108D, this.f9109E);
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar, Object obj) {
        return this.f9107C.deserialize(iVar, fVar, obj);
    }
}

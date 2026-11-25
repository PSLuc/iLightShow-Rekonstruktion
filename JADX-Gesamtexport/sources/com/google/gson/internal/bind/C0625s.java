package com.google.gson.internal.bind;

import B.C0025m0;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0625s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105t3.w f8126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p105t3.q f8127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p105t3.m f8128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p132y3.a f8129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p105t3.D f8130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0025m0 f8131f = new C0025m0(24, this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile p105t3.C f8133h;

    public C0625s(p105t3.w wVar, p105t3.q qVar, p105t3.m mVar, p132y3.a aVar, p105t3.D d6, boolean z5) {
        this.f8126a = wVar;
        this.f8127b = qVar;
        this.f8128c = mVar;
        this.f8129d = aVar;
        this.f8130e = d6;
        this.f8132g = z5;
    }

    public static p105t3.D d(final p132y3.a aVar, final Object obj) {
        final boolean z5 = aVar.getType() == aVar.getRawType();
        return new p105t3.D(obj, aVar, z5) { // from class: com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final p132y3.a f8043h;
            public final boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final p105t3.w f8044j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final p105t3.q f8045k;

            {
                this.f8044j = (p105t3.w) obj;
                this.f8045k = (p105t3.q) obj;
                this.f8043h = aVar;
                this.i = z5;
            }

            @Override // p105t3.D
            public final p105t3.C a(p105t3.m mVar, p132y3.a aVar2) {
                p132y3.a aVar3 = this.f8043h;
                if (aVar3 == null) {
                    aVar2.getRawType();
                    throw null;
                }
                if (aVar3.equals(aVar2) || (this.i && aVar3.getType() == aVar2.getRawType())) {
                    return new C0625s(this.f8044j, this.f8045k, mVar, aVar2, this, true);
                }
                return null;
            }
        };
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) {
        p105t3.q qVar = this.f8127b;
        if (qVar == null) {
            p105t3.C cH = this.f8133h;
            if (cH == null) {
                cH = this.f8128c.h(this.f8130e, this.f8129d);
                this.f8133h = cH;
            }
            return cH.a(aVar);
        }
        p105t3.r rVarI = p116v3.d.i(aVar);
        if (this.f8132g) {
            rVarI.getClass();
            if (rVarI instanceof p105t3.s) {
                return null;
            }
        }
        return qVar.deserialize(rVarI, this.f8129d.getType(), this.f8131f);
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        p105t3.w wVar = this.f8126a;
        if (wVar == null) {
            p105t3.C cH = this.f8133h;
            if (cH == null) {
                cH = this.f8128c.h(this.f8130e, this.f8129d);
                this.f8133h = cH;
            }
            cH.b(cVar, obj);
            return;
        }
        if (this.f8132g && obj == null) {
            cVar.G();
            return;
        }
        p105t3.r rVarSerialize = wVar.serialize(obj, this.f8129d.getType(), this.f8131f);
        Z.f8079z.getClass();
        N.d(rVarSerialize, cVar);
    }

    @Override // com.google.gson.internal.bind.r
    public final p105t3.C c() {
        if (this.f8126a != null) {
            return this;
        }
        p105t3.C c6 = this.f8133h;
        if (c6 != null) {
            return c6;
        }
        p105t3.C cH = this.f8128c.h(this.f8130e, this.f8129d);
        this.f8133h = cH;
        return cH;
    }
}

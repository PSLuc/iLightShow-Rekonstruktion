package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: com.google.gson.internal.bind.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0617j extends p105t3.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p105t3.D f8103b = c(p105t3.B.i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105t3.B f8104a;

    public C0617j(p105t3.B b6) {
        this.f8104a = b6;
    }

    public static p105t3.D c(p105t3.B b6) {
        final C0617j c0617j = new C0617j(b6);
        return new p105t3.D() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // p105t3.D
            public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
                if (aVar.getRawType() == Number.class) {
                    return this.f8034h;
                }
                return null;
            }
        };
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        int iF0 = aVar.f0();
        int iD = AbstractC0916i.d(iF0);
        if (iD == 5 || iD == 6) {
            return this.f8104a.a(aVar);
        }
        if (iD == 8) {
            aVar.b0();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + p138z3.b.b(iF0) + "; at path " + aVar.D());
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.Y((Number) obj);
    }
}

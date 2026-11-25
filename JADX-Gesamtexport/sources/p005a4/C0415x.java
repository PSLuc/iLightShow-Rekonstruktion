package p005a4;

import R3.a;
import R3.c;
import R3.k;
import R3.l;

/* JADX INFO: renamed from: a4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415x extends AbstractC0393a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f6335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6336k;

    public C0415x(a aVar, l lVar, int i) {
        super(aVar);
        this.f6335j = lVar;
        this.f6336k = i;
    }

    @Override // R3.a
    public final void f(c cVar) {
        k kVarA = this.f6335j.a();
        boolean z5 = cVar instanceof X3.a;
        int i = this.f6336k;
        a aVar = this.i;
        if (z5) {
            aVar.e(new C0413v((X3.a) cVar, kVarA, i));
        } else {
            aVar.e(new C0414w(cVar, kVarA, i));
        }
    }
}

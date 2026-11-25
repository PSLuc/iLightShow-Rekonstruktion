package p005a4;

import R3.c;
import R3.k;
import R3.l;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0393a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f6223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6224k;

    public T(C0402j c0402j, l lVar, boolean z5) {
        super(c0402j);
        this.f6223j = lVar;
        this.f6224k = z5;
    }

    @Override // R3.a
    public final void f(c cVar) {
        k kVarA = this.f6223j.a();
        S s6 = new S(cVar, kVarA, this.i, this.f6224k);
        cVar.h(s6);
        kVarA.c(s6);
    }
}

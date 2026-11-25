package p005a4;

import R3.a;
import R3.c;
import p011b4.e;
import p011b4.h;

/* JADX INFO: renamed from: a4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0407o extends a {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6289j;

    public /* synthetic */ C0407o(int i, Object obj) {
        this.i = i;
        this.f6289j = obj;
    }

    @Override // R3.a
    public final void f(c cVar) {
        switch (this.i) {
            case 0:
                boolean z5 = cVar instanceof X3.a;
                Object[] objArr = (Object[]) this.f6289j;
                if (!z5) {
                    cVar.h(new C0406n(cVar, objArr, 1));
                } else {
                    cVar.h(new C0406n((X3.a) cVar, objArr, 0));
                }
                break;
            default:
                ((e) this.f6289j).b(new h(cVar));
                break;
        }
    }
}

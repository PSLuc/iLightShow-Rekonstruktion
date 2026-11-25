package p024e0;

import D4.c;
import P.d;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f8666b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f8667c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8668a = new d(new o[16]);

    public final boolean a(c cVar) {
        if (this == f8666b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f8667c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        d dVar = this.f8668a;
        if (!dVar.n()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i = dVar.f4583j;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = dVar.f4582h;
        int i3 = 0;
        boolean z5 = false;
        do {
            Z.n nVar = ((Z.n) ((o) objArr[i3])).f5958h;
            if (!nVar.f5969t) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            d dVar2 = new d(new Z.n[16]);
            Z.n nVar2 = nVar.f5962m;
            if (nVar2 == null) {
                AbstractC1098f.b(dVar2, nVar);
            } else {
                dVar2.c(nVar2);
            }
            while (dVar2.n()) {
                Z.n nVarE = (Z.n) dVar2.p(dVar2.f4583j - 1);
                if ((nVarE.f5960k & 1024) == 0) {
                    AbstractC1098f.b(dVar2, nVarE);
                } else {
                    while (nVarE != null) {
                        if ((nVarE.f5959j & 1024) != 0) {
                            d dVar3 = null;
                            while (nVarE != null) {
                                if (nVarE instanceof r) {
                                    r rVar = (r) nVarE;
                                    if (rVar.y0().f8655a ? ((Boolean) cVar.invoke(rVar)).booleanValue() : d.i(rVar, 7, cVar)) {
                                        z5 = true;
                                        break;
                                    }
                                } else if (((nVarE.f5959j & 1024) != 0) && (nVarE instanceof AbstractC1105m)) {
                                    int i6 = 0;
                                    for (Z.n nVar3 = ((AbstractC1105m) nVarE).f14046v; nVar3 != null; nVar3 = nVar3.f5962m) {
                                        if ((nVar3.f5959j & 1024) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                nVarE = nVar3;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new d(new Z.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    dVar3.c(nVarE);
                                                    nVarE = null;
                                                }
                                                dVar3.c(nVar3);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                nVarE = AbstractC1098f.e(dVar3);
                            }
                            break;
                        }
                        nVarE = nVarE.f5962m;
                    }
                }
            }
            i3++;
        } while (i3 < i);
        return z5;
    }
}

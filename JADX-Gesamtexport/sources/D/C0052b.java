package D;

import S1.V;
import S4.InterfaceC0369f;
import android.os.Build;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p092r1.C0881b;
import p092r1.C0895p;
import p092r1.J;
import p092r1.K;
import p092r1.M;
import p092r1.U;
import p130y0.C1152q0;

/* JADX INFO: renamed from: D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0052b implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f671h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0052b(int i, Object obj) {
        this.f671h = i;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) throws Throwable {
        C0895p c0895p;
        Object objE;
        switch (this.f671h) {
            case 0:
                x xVar = (x) this.i;
                if (Build.VERSION.SDK_INT >= 34) {
                    k.f693a.a(xVar.m(), (View) xVar.i);
                }
                return p084p4.x.f10867a;
            case 1:
                ((E4.w) this.i).f1074h = obj;
                throw new AbortFlowException(this);
            case 2:
                if (dVar instanceof C0895p) {
                    c0895p = (C0895p) dVar;
                    int i = c0895p.f11684l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0895p.f11684l = i - Integer.MIN_VALUE;
                    } else {
                        c0895p = new C0895p(this, dVar);
                    }
                } else {
                    c0895p = new C0895p(this, dVar);
                }
                Object obj2 = c0895p.f11683k;
                v4.a aVar = v4.a.f13292h;
                int i3 = c0895p.f11684l;
                if (i3 == 0) {
                    V.O(obj2);
                    U u6 = (U) obj;
                    if (u6 instanceof M) {
                        throw ((M) u6).f11610b;
                    }
                    if (!(u6 instanceof C0881b)) {
                        if (u6 instanceof K ? true : u6 instanceof p092r1.V) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((C0881b) u6).f11636b;
                    c0895p.f11684l = 1;
                    if (((InterfaceC0369f) this.i).m(obj3, c0895p) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj2);
                }
                return p084p4.x.f10867a;
            case 3:
                J j4 = (J) this.i;
                boolean z5 = j4.f11601h.q() instanceof K;
                p084p4.x xVar2 = p084p4.x.f10867a;
                return (z5 || (objE = J.e(j4, true, dVar)) != v4.a.f13292h) ? xVar2 : objE;
            default:
                ((C1152q0) this.i).f14450h.j(((Number) obj).floatValue());
                return p084p4.x.f10867a;
        }
    }
}

package p091r0;

import S1.V;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import p122w4.a;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f11543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11544m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, a aVar) {
        super(aVar);
        this.f11543l = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        this.f11542k = obj;
        this.f11544m |= Integer.MIN_VALUE;
        y yVar = this.f11543l;
        yVar.getClass();
        if (this instanceof x) {
            int i = this.f11544m;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.f11544m = i - Integer.MIN_VALUE;
            } else {
                this = new x(yVar, this);
            }
        } else {
            this = new x(yVar, this);
        }
        Object objJ = this.f11542k;
        v4.a aVar = v4.a.f13292h;
        int i3 = this.f11544m;
        try {
            if (i3 == 0) {
                V.O(objJ);
                this.f11544m = 1;
                objJ = yVar.j(0L, null, this);
                if (objJ == aVar) {
                    objJ = aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(objJ);
            }
            return objJ;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }
}

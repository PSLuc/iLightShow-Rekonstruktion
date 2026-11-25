package v4;

import D4.e;
import E4.k;
import E4.z;
import S1.V;
import p111u4.d;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f13298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f13299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, e eVar, d dVar2) {
        super(dVar, iVar);
        this.f13298l = eVar;
        this.f13299m = dVar2;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        int i = this.f13297k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f13297k = 2;
            V.O(obj);
            return obj;
        }
        this.f13297k = 1;
        V.O(obj);
        e eVar = this.f13298l;
        k.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>", eVar);
        z.d(2, eVar);
        return eVar.d(this.f13299m, this);
    }
}

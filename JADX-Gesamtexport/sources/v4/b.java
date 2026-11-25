package v4;

import D4.e;
import E4.k;
import E4.z;
import S1.V;
import p111u4.d;
import p122w4.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f13295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f13296k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, d dVar, d dVar2) {
        super(dVar);
        this.f13295j = eVar;
        this.f13296k = dVar2;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.i = 2;
            V.O(obj);
            return obj;
        }
        this.i = 1;
        V.O(obj);
        e eVar = this.f13295j;
        k.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>", eVar);
        z.d(2, eVar);
        return eVar.d(this.f13296k, this);
    }
}

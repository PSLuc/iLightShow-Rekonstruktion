package p122w4;

import p111u4.d;
import p111u4.i;
import p111u4.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(d dVar) {
        super(dVar);
        if (dVar != null && dVar.e() != j.f12751h) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p111u4.d
    public final i e() {
        return j.f12751h;
    }
}

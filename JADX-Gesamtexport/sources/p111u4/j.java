package p111u4;

import D4.e;
import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f12751h = new j();

    @Override // p111u4.i
    public final i D(h hVar) {
        k.f("key", hVar);
        return this;
    }

    @Override // p111u4.i
    public final g J(h hVar) {
        k.f("key", hVar);
        return null;
    }

    @Override // p111u4.i
    public final Object T(Object obj, e eVar) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p111u4.i
    public final i o(i iVar) {
        k.f("context", iVar);
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

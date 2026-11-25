package p084p4;

import D4.a;
import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f10854h;
    public volatile Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f10855j;

    public m(a aVar) {
        k.f("initializer", aVar);
        this.f10854h = aVar;
        this.i = u.f10864a;
        this.f10855j = this;
    }

    @Override // p084p4.f
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.i;
        u uVar = u.f10864a;
        if (obj != uVar) {
            return obj;
        }
        synchronized (this.f10855j) {
            objInvoke = this.i;
            if (objInvoke == uVar) {
                a aVar = this.f10854h;
                k.c(aVar);
                objInvoke = aVar.invoke();
                this.i = objInvoke;
                this.f10854h = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.i != u.f10864a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package p109u2;

import T1.f;
import T1.j;
import V1.c;
import Y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class B extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f12668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(j jVar) {
        super(jVar);
        c cVar = c.f5492j;
        this.f12668c = jVar.c();
        this.f12670e = jVar.a();
        this.f12671f = jVar.b();
        if (!(jVar instanceof b)) {
            this.f12669d = f.f5182n;
        } else {
            b bVar = (b) jVar;
            this.f12669d = new f(cVar, -1L, -1L, bVar.f5824h, bVar.i);
        }
    }

    @Override // T1.j
    public final String a() {
        return this.f12670e;
    }

    @Override // T1.j
    public final Object b() {
        return this.f12671f;
    }

    @Override // T1.j
    public final j c() {
        return this.f12668c;
    }

    @Override // T1.j
    public final void g(Object obj) {
        this.f12671f = obj;
    }

    public B(j jVar, f fVar) {
        super(jVar);
        this.f12668c = jVar.c();
        this.f12670e = jVar.a();
        this.f12671f = jVar.b();
        this.f12669d = fVar;
    }

    public B() {
        super(0);
        this.f12668c = null;
        this.f12669d = f.f5182n;
    }

    public B(B b6, int i) {
        super(i);
        this.f12668c = b6;
        this.f12669d = b6.f12669d;
    }
}

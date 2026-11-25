package p5;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.e f11138b;

    public r0(t5.e eVar) {
        super(1);
        if (eVar == null) {
            throw new NullPointerException("server names must not be null");
        }
        this.f11138b = eVar;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        t5.e eVar = this.f11138b;
        if (eVar == null) {
            jVar.b(0, 16);
            return;
        }
        jVar.b(eVar.i + 2, 16);
        jVar.b(eVar.i, 16);
        for (t5.d dVar : eVar.f12603h) {
            byte b6 = p012c.k.b(dVar.f12600a);
            if (jVar.f10454c < 7) {
                jVar.c(new byte[]{b6});
            } else {
                jVar.f10452a.write(b6);
            }
            byte[] bArr = dVar.f12601b;
            jVar.b(bArr.length, 16);
            jVar.c(bArr);
        }
    }

    @Override // p5.S
    public final int c() {
        t5.e eVar = this.f11138b;
        if (eVar != null) {
            return 6 + eVar.i;
        }
        return 4;
    }
}

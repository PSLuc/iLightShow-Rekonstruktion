package p072n3;

import O1.w;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f10547j;

    public /* synthetic */ h(int i, Object obj) {
        this.i = i;
        this.f10547j = obj;
    }

    @Override // p072n3.e
    public final void a() {
        switch (this.i) {
            case 0:
                synchronized (((i) this.f10547j).f10554f) {
                    try {
                        if (((i) this.f10547j).f10558k.get() > 0 && ((i) this.f10547j).f10558k.decrementAndGet() > 0) {
                            ((i) this.f10547j).f10550b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        i iVar = (i) this.f10547j;
                        if (iVar.f10560m != null) {
                            iVar.f10550b.c("Unbind from service.", new Object[0]);
                            i iVar2 = (i) this.f10547j;
                            iVar2.f10549a.unbindService(iVar2.f10559l);
                            i iVar3 = (i) this.f10547j;
                            iVar3.f10555g = false;
                            iVar3.f10560m = null;
                            iVar3.f10559l = null;
                        }
                        ((i) this.f10547j).c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                i iVar4 = (i) ((w) this.f10547j).f4539b;
                iVar4.f10550b.c("unlinkToDeath", new Object[0]);
                ((b) iVar4.f10560m).f10541a.unlinkToDeath(iVar4.f10557j, 0);
                iVar4.f10560m = null;
                iVar4.f10555g = false;
                return;
        }
    }
}

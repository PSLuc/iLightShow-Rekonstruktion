package p103t1;

import S1.V;
import h5.AbstractC0724b;
import h5.C;
import h5.F;
import h5.x;
import java.io.RandomAccessFile;
import p114v1.i;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {
    /* JADX WARN: Code duplicated, block: B:71:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, c cVar) throws Throwable {
        j jVar;
        x xVar;
        F fB;
        x xVar2;
        x xVar3;
        p084p4.x xVar4;
        Throwable th;
        p084p4.x xVar5;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.f12485p;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.f12485p = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj2 = jVar.f12483n;
        a aVar = a.f13292h;
        int i3 = jVar.f12485p;
        p084p4.x xVar6 = p084p4.x.f10867a;
        Throwable th2 = null;
        if (i3 == 0) {
            V.O(obj2);
            if (this.f12452c.f12444a.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            this.f12450a.getClass();
            C c6 = this.f12451b;
            E4.k.f("file", c6);
            xVar = new x(true, new RandomAccessFile(c6.e(), "rw"));
            try {
                fB = AbstractC0724b.b(x.b(xVar));
                try {
                    i iVar = i.f13215a;
                    jVar.f12480k = xVar;
                    jVar.f12481l = xVar;
                    jVar.f12482m = fB;
                    jVar.f12485p = 1;
                    iVar.b(obj, fB);
                    if (xVar6 == aVar) {
                        return aVar;
                    }
                    xVar3 = xVar;
                    xVar2 = xVar3;
                } catch (Throwable th3) {
                    th = th3;
                    xVar2 = xVar;
                    if (fB != null) {
                        fB.close();
                    }
                    th = th;
                    xVar5 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (xVar != null) {
                    xVar.close();
                }
                th2 = th;
                xVar4 = null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fB = jVar.f12482m;
            xVar3 = jVar.f12481l;
            xVar2 = jVar.f12480k;
            try {
                V.O(obj2);
            } catch (Throwable th5) {
                th = th5;
                if (fB != null) {
                    try {
                        fB.close();
                    } catch (Throwable th6) {
                        try {
                            p081p0.c.D(th, th6);
                        } catch (Throwable th7) {
                            th = th7;
                            xVar = xVar2;
                            if (xVar != null) {
                                try {
                                    xVar.close();
                                } catch (Throwable th8) {
                                    p081p0.c.D(th, th8);
                                }
                            }
                            th2 = th;
                            xVar4 = null;
                        }
                    }
                }
                th = th;
                xVar5 = null;
            }
        }
        xVar3.flush();
        if (fB != null) {
            try {
                fB.close();
            } catch (Throwable th9) {
                th = th9;
            }
        }
        th = null;
        xVar5 = xVar6;
        x xVar7 = xVar2;
        if (th != null) {
            throw th;
        }
        E4.k.c(xVar5);
        if (xVar7 != null) {
            try {
                xVar7.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        xVar4 = xVar6;
        if (th2 != null) {
            throw th2;
        }
        E4.k.c(xVar4);
        return xVar6;
    }
}

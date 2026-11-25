package B;

import java.util.Arrays;
import java.util.Iterator;
import p096s.AbstractC0924q;
import p096s.InterfaceC0930x;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements p096s.z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f327h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f328j;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(int i, int i3, D4.a aVar) {
        this.f327h = i;
        this.i = i3;
        this.f328j = (E4.l) aVar;
    }

    public void c(Iterator it) {
        int i = this.f327h;
        int i3 = this.i;
        if (i < i3) {
            Iterator[] itArr = (Iterator[]) this.f328j;
            this.f327h = i + 1;
            itArr[i] = it;
            return;
        }
        if (((Iterator[]) this.f328j) == null) {
            this.i = 10;
            this.f328j = new Iterator[10];
        } else {
            int iMin = Math.min(4000, Math.max(20, i3 >> 1)) + i3;
            this.i = iMin;
            this.f328j = (Iterator[]) Arrays.copyOf((Iterator[]) this.f328j, iMin);
        }
        Iterator[] itArr2 = (Iterator[]) this.f328j;
        int i6 = this.f327h;
        this.f327h = i6 + 1;
        itArr2[i6] = it;
    }

    public void d(p087q2.f fVar) {
        int i = this.f327h;
        int i3 = this.i;
        if (i < i3) {
            p087q2.f[] fVarArr = (p087q2.f[]) this.f328j;
            this.f327h = i + 1;
            fVarArr[i] = fVar;
            return;
        }
        if (((p087q2.f[]) this.f328j) == null) {
            this.i = 10;
            this.f328j = new p087q2.f[10];
        } else {
            int iMin = Math.min(4000, Math.max(20, i3 >> 1)) + i3;
            this.i = iMin;
            this.f328j = (p087q2.f[]) Arrays.copyOf((p087q2.f[]) this.f328j, iMin);
        }
        p087q2.f[] fVarArr2 = (p087q2.f[]) this.f328j;
        int i6 = this.f327h;
        this.f327h = i6 + 1;
        fVarArr2[i6] = fVar;
    }

    @Override // p096s.y0
    public AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((H1.d) this.f328j).f(j4, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    @Override // p096s.z0
    public int g() {
        return this.i;
    }

    @Override // p096s.z0
    public int j() {
        return this.f327h;
    }

    @Override // p096s.y0
    public AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return ((H1.d) this.f328j).k(j4, abstractC0924q, abstractC0924q2, abstractC0924q3);
    }

    public h1(int i, int i3, InterfaceC0930x interfaceC0930x) {
        this.f327h = i;
        this.i = i3;
        this.f328j = new H1.d((p096s.A) new p096s.C(i, i3, interfaceC0930x));
    }
}

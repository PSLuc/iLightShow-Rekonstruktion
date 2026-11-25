package N;

import X.AbstractC0391h;
import p096s.C0917j;
import p096s.C0920m;

/* JADX INFO: loaded from: classes.dex */
public final class W extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3677h;
    public final /* synthetic */ E4.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W(D4.c cVar, int i) {
        super(1);
        this.f3677h = i;
        switch (i) {
            case 1:
                this.i = (E4.l) cVar;
                super(1);
                break;
            case 2:
                this.i = (E4.l) cVar;
                super(1);
                break;
            case 3:
                this.i = (E4.l) cVar;
                super(1);
                break;
            case 4:
                this.i = (E4.l) cVar;
                super(1);
                break;
            case 5:
                this.i = (E4.l) cVar;
                super(1);
                break;
            case 6:
            default:
                this.i = (E4.l) cVar;
                break;
            case 7:
                this.i = (E4.l) cVar;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v22, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v27, types: [D4.e, E4.l] */
    /* JADX WARN: Type inference failed for: r6v29, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v3, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r6v7, types: [D4.c, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f3677h) {
            case 0:
                return this.i.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                AbstractC0391h abstractC0391h = (AbstractC0391h) this.i.invoke((X.m) obj);
                synchronized (X.o.f5709b) {
                    X.o.f5710c = X.o.f5710c.k(abstractC0391h.d());
                }
                return abstractC0391h;
            case 2:
                return new S0.h(S1.h0.c(((Number) this.i.invoke(Integer.valueOf((int) (((S0.j) obj).f4896a >> 32)))).intValue(), 0));
            case 3:
                return new S0.h(S1.h0.c(0, ((Number) this.i.invoke(Integer.valueOf((int) (((S0.j) obj).f4896a & 4294967295L)))).intValue()));
            case 4:
                return new S0.h(S1.h0.c(((Number) this.i.invoke(Integer.valueOf((int) (((S0.j) obj).f4896a >> 32)))).intValue(), 0));
            case 5:
                return new S0.h(S1.h0.c(0, ((Number) this.i.invoke(Integer.valueOf((int) (((S0.j) obj).f4896a & 4294967295L)))).intValue()));
            case 6:
                C0917j c0917j = (C0917j) obj;
                Object value = c0917j.f12018e.getValue();
                p096s.w0 w0Var = p096s.x0.f12138a;
                this.i.d(value, Float.valueOf(((C0920m) c0917j.f12019f).f12032a));
                return p084p4.x.f10867a;
            default:
                return this.i.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W(D4.e eVar) {
        super(1);
        this.f3677h = 6;
        p096s.w0 w0Var = p096s.x0.f12138a;
        this.i = (E4.l) eVar;
    }
}

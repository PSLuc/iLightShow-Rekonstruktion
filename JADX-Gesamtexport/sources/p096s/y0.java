package p096s;

/* JADX INFO: loaded from: classes.dex */
public interface y0 {
    boolean a();

    long b(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3);

    AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3);

    AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3);

    default AbstractC0924q m(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        return k(b(abstractC0924q, abstractC0924q2, abstractC0924q3), abstractC0924q, abstractC0924q2, abstractC0924q3);
    }
}

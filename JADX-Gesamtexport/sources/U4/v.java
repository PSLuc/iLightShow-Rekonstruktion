package U4;

import P4.I;
import P4.J;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5383b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I[] f5384a;

    public final void a(I i) {
        i.c((J) this);
        I[] iArr = this.f5384a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5383b;
        if (iArr == null) {
            iArr = new I[4];
            this.f5384a = iArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= iArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(iArr, atomicIntegerFieldUpdater.get(this) * 2);
            E4.k.e("copyOf(this, newSize)", objArrCopyOf);
            iArr = (I[]) objArrCopyOf;
            this.f5384a = iArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        iArr[i3] = i;
        i.i = i3;
        c(i3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final I b(int i) {
        int i3;
        int i6;
        Object[] objArr;
        int i7;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f5384a;
        E4.k.c(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5383b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i8 = (i - 1) / 2;
            if (i > 0) {
                I i9 = objArr2[i];
                E4.k.c(i9);
                Object obj2 = objArr2[i8];
                E4.k.c(obj2);
                if (i9.compareTo(obj2) < 0) {
                    d(i, i8);
                    c(i8);
                } else {
                    while (true) {
                        i3 = i * 2;
                        i6 = i3 + 1;
                        if (i6 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f5384a;
                        E4.k.c(objArr);
                        i7 = i3 + 2;
                        if (i7 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i7];
                            E4.k.c(comparable3);
                            obj = objArr[i6];
                            E4.k.c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i7 = i6;
                            }
                        } else {
                            i7 = i6;
                        }
                        comparable = objArr[i];
                        E4.k.c(comparable);
                        comparable2 = objArr[i7];
                        E4.k.c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i, i7);
                        i = i7;
                    }
                }
            } else {
                while (true) {
                    i3 = i * 2;
                    i6 = i3 + 1;
                    if (i6 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f5384a;
                    E4.k.c(objArr);
                    i7 = i3 + 2;
                    if (i7 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i7];
                        E4.k.c(comparable3);
                        obj = objArr[i6];
                        E4.k.c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i7 = i6;
                        }
                    } else {
                        i7 = i6;
                    }
                    comparable = objArr[i];
                    E4.k.c(comparable);
                    comparable2 = objArr[i7];
                    E4.k.c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i, i7);
                    i = i7;
                }
            }
        }
        I i10 = objArr2[atomicIntegerFieldUpdater.get(this)];
        E4.k.c(i10);
        i10.c(null);
        i10.i = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return i10;
    }

    public final void c(int i) {
        while (i > 0) {
            I[] iArr = this.f5384a;
            E4.k.c(iArr);
            int i3 = (i - 1) / 2;
            I i6 = iArr[i3];
            E4.k.c(i6);
            I i7 = iArr[i];
            E4.k.c(i7);
            if (i6.compareTo(i7) <= 0) {
                return;
            }
            d(i, i3);
            i = i3;
        }
    }

    public final void d(int i, int i3) {
        I[] iArr = this.f5384a;
        E4.k.c(iArr);
        I i6 = iArr[i3];
        E4.k.c(i6);
        I i7 = iArr[i];
        E4.k.c(i7);
        iArr[i] = i6;
        iArr[i3] = i7;
        i6.i = i;
        i7.i = i3;
    }
}

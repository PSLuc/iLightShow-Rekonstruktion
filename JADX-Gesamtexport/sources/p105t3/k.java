package p105t3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p138z3.a;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f12565b;

    public /* synthetic */ k(C c6, int i) {
        this.f12564a = i;
        this.f12565b = c6;
    }

    @Override // p105t3.C
    public final Object a(a aVar) throws IOException {
        switch (this.f12564a) {
            case 0:
                return new AtomicLong(((Number) this.f12565b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.L()) {
                    arrayList.add(Long.valueOf(((Number) this.f12565b.a(aVar)).longValue()));
                }
                aVar.s();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.f0() != 9) {
                    return this.f12565b.a(aVar);
                }
                aVar.b0();
                return null;
        }
    }

    @Override // p105t3.C
    public final void b(c cVar, Object obj) throws IOException {
        switch (this.f12564a) {
            case 0:
                this.f12565b.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.c();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f12565b.b(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.s();
                break;
            default:
                if (obj == null) {
                    cVar.G();
                } else {
                    this.f12565b.b(cVar, obj);
                }
                break;
        }
    }
}

package S3;

import F.C0071m;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p034f4.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5011h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f5012j;

    public /* synthetic */ a(int i) {
        this.f5011h = i;
    }

    public static void d(C0071m c0071m) {
        if (c0071m == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) c0071m.f1192e) {
            if (obj instanceof b) {
                try {
                    ((b) obj).a();
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw p047i4.c.a((Throwable) arrayList.get(0));
        }
    }

    @Override // S3.b
    public final void a() {
        switch (this.f5011h) {
            case 0:
                if (this.i) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            C0071m c0071m = (C0071m) this.f5012j;
                            this.f5012j = null;
                            d(c0071m);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                if (this.i) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.i) {
                            this.i = true;
                            LinkedList linkedList = (LinkedList) this.f5012j;
                            ArrayList arrayList = null;
                            this.f5012j = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((b) it.next()).a();
                                    } catch (Throwable th2) {
                                        p027e3.a.w0(th2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th2);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new CompositeException(arrayList);
                                    }
                                    throw p047i4.c.a((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    public final boolean b(b bVar) {
        switch (this.f5011h) {
            case 0:
                if (!this.i) {
                    synchronized (this) {
                        try {
                            if (!this.i) {
                                C0071m c0071m = (C0071m) this.f5012j;
                                if (c0071m == null) {
                                    c0071m = new C0071m(3);
                                    int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    c0071m.f1189b = iNumberOfLeadingZeros - 1;
                                    c0071m.f1191d = (int) (0.75f * iNumberOfLeadingZeros);
                                    c0071m.f1192e = new Object[iNumberOfLeadingZeros];
                                    this.f5012j = c0071m;
                                }
                                c0071m.a(bVar);
                                return true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bVar.a();
                return false;
            default:
                if (!this.i) {
                    synchronized (this) {
                        try {
                            if (!this.i) {
                                LinkedList linkedList = (LinkedList) this.f5012j;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f5012j = linkedList;
                                }
                                linkedList.add(bVar);
                                return true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                bVar.a();
                return false;
        }
    }

    public final boolean c(b bVar) {
        Object obj;
        switch (this.f5011h) {
            case 0:
                if (this.i) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.i) {
                            return false;
                        }
                        C0071m c0071m = (C0071m) this.f5012j;
                        if (c0071m != null) {
                            Object[] objArr = (Object[]) c0071m.f1192e;
                            int i = c0071m.f1189b;
                            int iHashCode = bVar.hashCode() * (-1640531527);
                            int i3 = (iHashCode ^ (iHashCode >>> 16)) & i;
                            Object obj2 = objArr[i3];
                            if (obj2 != null) {
                                if (obj2.equals(bVar)) {
                                    c0071m.f(i3, i, objArr);
                                } else {
                                    do {
                                        i3 = (i3 + 1) & i;
                                        obj = objArr[i3];
                                        if (obj == null) {
                                        }
                                    } while (!obj.equals(bVar));
                                    c0071m.f(i3, i, objArr);
                                }
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                boolean z5 = false;
                if (!this.i) {
                    synchronized (this) {
                        try {
                            if (!this.i) {
                                LinkedList linkedList = (LinkedList) this.f5012j;
                                if (linkedList != null && linkedList.remove(bVar)) {
                                    z5 = true;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    break;
                }
                return z5;
        }
    }

    public final boolean e(b bVar) {
        switch (this.f5011h) {
            case 0:
                if (!c(bVar)) {
                    return false;
                }
                bVar.a();
                return true;
            default:
                if (!c(bVar)) {
                    return false;
                }
                ((q) bVar).a();
                return true;
        }
    }
}

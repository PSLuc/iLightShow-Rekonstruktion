package androidx.lifecycle;

import B.AbstractC0013g0;
import android.os.Looper;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p068n.a f7000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0454n f7001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f7002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7006h;
    public final S4.P i;

    public C0460u(InterfaceC0458s interfaceC0458s) {
        new AtomicReference(null);
        this.f6999a = true;
        this.f7000b = new p068n.a();
        EnumC0454n enumC0454n = EnumC0454n.i;
        this.f7001c = enumC0454n;
        this.f7006h = new ArrayList();
        this.f7002d = new WeakReference(interfaceC0458s);
        this.i = S4.F.b(enumC0454n);
    }

    public final void a(r rVar) {
        InterfaceC0457q fVar;
        Object obj;
        InterfaceC0458s interfaceC0458s;
        EnumC0453m enumC0453m;
        ArrayList arrayList = this.f7006h;
        int i = 1;
        E4.k.f("observer", rVar);
        c("addObserver");
        EnumC0454n enumC0454n = this.f7001c;
        EnumC0454n enumC0454n2 = EnumC0454n.f6991h;
        if (enumC0454n != enumC0454n2) {
            enumC0454n2 = EnumC0454n.i;
        }
        C0459t c0459t = new C0459t();
        HashMap map = AbstractC0461v.f7007a;
        boolean z5 = rVar instanceof InterfaceC0457q;
        boolean z6 = rVar instanceof InterfaceC0445e;
        if (z5 && z6) {
            fVar = new G2.f((InterfaceC0445e) rVar, (InterfaceC0457q) rVar);
        } else if (z6) {
            fVar = new G2.f((InterfaceC0445e) rVar, null);
        } else if (z5) {
            fVar = (InterfaceC0457q) rVar;
        } else {
            Class<?> cls = rVar.getClass();
            if (AbstractC0461v.b(cls) == 2) {
                Object obj2 = AbstractC0461v.f7008b.get(cls);
                E4.k.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0461v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0448h[] interfaceC0448hArr = new InterfaceC0448h[size];
                if (size > 0) {
                    AbstractC0461v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                fVar = new J1.b(i, interfaceC0448hArr);
            } else {
                fVar = new G2.f(rVar);
            }
        }
        c0459t.f6998b = fVar;
        c0459t.f6997a = enumC0454n2;
        p068n.a aVar = this.f7000b;
        p068n.c cVarC = aVar.c(rVar);
        if (cVarC != null) {
            obj = cVarC.i;
        } else {
            HashMap map2 = aVar.f10498l;
            p068n.c cVar = new p068n.c(rVar, c0459t);
            aVar.f10508k++;
            p068n.c cVar2 = aVar.i;
            if (cVar2 == null) {
                aVar.f10506h = cVar;
                aVar.i = cVar;
            } else {
                cVar2.f10502j = cVar;
                cVar.f10503k = cVar2;
                aVar.i = cVar;
            }
            map2.put(rVar, cVar);
            obj = null;
        }
        if (((C0459t) obj) == null && (interfaceC0458s = (InterfaceC0458s) this.f7002d.get()) != null) {
            boolean z7 = this.f7003e != 0 || this.f7004f;
            EnumC0454n enumC0454nB = b(rVar);
            this.f7003e++;
            while (c0459t.f6997a.compareTo(enumC0454nB) < 0 && this.f7000b.f10498l.containsKey(rVar)) {
                arrayList.add(c0459t.f6997a);
                C0451k c0451k = EnumC0453m.Companion;
                EnumC0454n enumC0454n3 = c0459t.f6997a;
                c0451k.getClass();
                E4.k.f(AccountsQueryParameters.STATE, enumC0454n3);
                int iOrdinal = enumC0454n3.ordinal();
                if (iOrdinal == 1) {
                    enumC0453m = EnumC0453m.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC0453m = iOrdinal != 3 ? null : EnumC0453m.ON_RESUME;
                } else {
                    enumC0453m = EnumC0453m.ON_START;
                }
                if (enumC0453m == null) {
                    throw new IllegalStateException("no event up from " + c0459t.f6997a);
                }
                c0459t.a(interfaceC0458s, enumC0453m);
                arrayList.remove(arrayList.size() - 1);
                enumC0454nB = b(rVar);
            }
            if (!z7) {
                h();
            }
            this.f7003e--;
        }
    }

    public final EnumC0454n b(r rVar) {
        C0459t c0459t;
        HashMap map = this.f7000b.f10498l;
        p068n.c cVar = map.containsKey(rVar) ? ((p068n.c) map.get(rVar)).f10503k : null;
        EnumC0454n enumC0454n = (cVar == null || (c0459t = (C0459t) cVar.i) == null) ? null : c0459t.f6997a;
        ArrayList arrayList = this.f7006h;
        EnumC0454n enumC0454n2 = arrayList.isEmpty() ? null : (EnumC0454n) arrayList.get(arrayList.size() - 1);
        EnumC0454n enumC0454n3 = this.f7001c;
        E4.k.f("state1", enumC0454n3);
        if (enumC0454n == null || enumC0454n.compareTo(enumC0454n3) >= 0) {
            enumC0454n = enumC0454n3;
        }
        return (enumC0454n2 == null || enumC0454n2.compareTo(enumC0454n) >= 0) ? enumC0454n : enumC0454n2;
    }

    public final void c(String str) {
        if (this.f6999a) {
            ((p062m.a) p062m.a.R().f10401d).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0013g0.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0453m enumC0453m) {
        E4.k.f("event", enumC0453m);
        c("handleLifecycleEvent");
        e(enumC0453m.a());
    }

    public final void e(EnumC0454n enumC0454n) {
        EnumC0454n enumC0454n2 = this.f7001c;
        if (enumC0454n2 == enumC0454n) {
            return;
        }
        EnumC0454n enumC0454n3 = EnumC0454n.i;
        EnumC0454n enumC0454n4 = EnumC0454n.f6991h;
        if (enumC0454n2 == enumC0454n3 && enumC0454n == enumC0454n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0454n + ", but was " + this.f7001c + " in component " + this.f7002d.get()).toString());
        }
        this.f7001c = enumC0454n;
        if (this.f7004f || this.f7003e != 0) {
            this.f7005g = true;
            return;
        }
        this.f7004f = true;
        h();
        this.f7004f = false;
        if (this.f7001c == enumC0454n4) {
            this.f7000b = new p068n.a();
        }
    }

    public final void f(r rVar) {
        E4.k.f("observer", rVar);
        c("removeObserver");
        this.f7000b.d(rVar);
    }

    public final void g(EnumC0454n enumC0454n) {
        E4.k.f(AccountsQueryParameters.STATE, enumC0454n);
        c("setCurrentState");
        e(enumC0454n);
    }

    public final void h() {
        EnumC0453m enumC0453m;
        EnumC0453m enumC0453m2;
        InterfaceC0458s interfaceC0458s = (InterfaceC0458s) this.f7002d.get();
        if (interfaceC0458s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p068n.a aVar = this.f7000b;
            if (aVar.f10508k != 0) {
                p068n.c cVar = aVar.f10506h;
                E4.k.c(cVar);
                EnumC0454n enumC0454n = ((C0459t) cVar.i).f6997a;
                p068n.c cVar2 = this.f7000b.i;
                E4.k.c(cVar2);
                EnumC0454n enumC0454n2 = ((C0459t) cVar2.i).f6997a;
                if (enumC0454n == enumC0454n2 && this.f7001c == enumC0454n2) {
                    break;
                }
                this.f7005g = false;
                EnumC0454n enumC0454n3 = this.f7001c;
                p068n.c cVar3 = this.f7000b.f10506h;
                E4.k.c(cVar3);
                if (enumC0454n3.compareTo(((C0459t) cVar3.i).f6997a) < 0) {
                    p068n.a aVar2 = this.f7000b;
                    p068n.b bVar = new p068n.b(aVar2.i, aVar2.f10506h, 1);
                    aVar2.f10507j.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f7005g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        E4.k.e("next()", entry);
                        r rVar = (r) entry.getKey();
                        C0459t c0459t = (C0459t) entry.getValue();
                        while (c0459t.f6997a.compareTo(this.f7001c) > 0 && !this.f7005g && this.f7000b.f10498l.containsKey(rVar)) {
                            C0451k c0451k = EnumC0453m.Companion;
                            EnumC0454n enumC0454n4 = c0459t.f6997a;
                            c0451k.getClass();
                            E4.k.f(AccountsQueryParameters.STATE, enumC0454n4);
                            int iOrdinal = enumC0454n4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0453m2 = EnumC0453m.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0453m2 = iOrdinal != 4 ? null : EnumC0453m.ON_PAUSE;
                            } else {
                                enumC0453m2 = EnumC0453m.ON_STOP;
                            }
                            if (enumC0453m2 == null) {
                                throw new IllegalStateException("no event down from " + c0459t.f6997a);
                            }
                            this.f7006h.add(enumC0453m2.a());
                            c0459t.a(interfaceC0458s, enumC0453m2);
                            ArrayList arrayList = this.f7006h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p068n.c cVar4 = this.f7000b.i;
                if (!this.f7005g && cVar4 != null && this.f7001c.compareTo(((C0459t) cVar4.i).f6997a) > 0) {
                    p068n.a aVar3 = this.f7000b;
                    aVar3.getClass();
                    p068n.d dVar = new p068n.d(aVar3);
                    aVar3.f10507j.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f7005g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        r rVar2 = (r) entry2.getKey();
                        C0459t c0459t2 = (C0459t) entry2.getValue();
                        while (c0459t2.f6997a.compareTo(this.f7001c) < 0 && !this.f7005g && this.f7000b.f10498l.containsKey(rVar2)) {
                            this.f7006h.add(c0459t2.f6997a);
                            C0451k c0451k2 = EnumC0453m.Companion;
                            EnumC0454n enumC0454n5 = c0459t2.f6997a;
                            c0451k2.getClass();
                            E4.k.f(AccountsQueryParameters.STATE, enumC0454n5);
                            int iOrdinal2 = enumC0454n5.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC0453m = EnumC0453m.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC0453m = iOrdinal2 != 3 ? null : EnumC0453m.ON_RESUME;
                            } else {
                                enumC0453m = EnumC0453m.ON_START;
                            }
                            if (enumC0453m == null) {
                                throw new IllegalStateException("no event up from " + c0459t2.f6997a);
                            }
                            c0459t2.a(interfaceC0458s, enumC0453m);
                            ArrayList arrayList2 = this.f7006h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f7005g = false;
        this.i.h(this.f7001c);
    }
}

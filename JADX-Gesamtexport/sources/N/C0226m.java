package N;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: N.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226m extends AbstractC0234q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f3725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3726e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f3727f = C0208d.K(V.e.f5395k, U.f3671k);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0230o f3728g;

    public C0226m(C0230o c0230o, int i, boolean z5, boolean z6, U u6) {
        this.f3728g = c0230o;
        this.f3722a = i;
        this.f3723b = z5;
        this.f3724c = z6;
    }

    @Override // N.AbstractC0234q
    public final void a(C0239t c0239t, V.a aVar) {
        this.f3728g.f3746b.a(c0239t, aVar);
    }

    @Override // N.AbstractC0234q
    public final void b() {
        this.f3728g.f3769z--;
    }

    @Override // N.AbstractC0234q
    public final boolean c() {
        return this.f3728g.f3746b.c();
    }

    @Override // N.AbstractC0234q
    public final boolean d() {
        return this.f3723b;
    }

    @Override // N.AbstractC0234q
    public final boolean e() {
        return this.f3724c;
    }

    @Override // N.AbstractC0234q
    public final InterfaceC0225l0 f() {
        return (InterfaceC0225l0) this.f3727f.getValue();
    }

    @Override // N.AbstractC0234q
    public final int g() {
        return this.f3722a;
    }

    @Override // N.AbstractC0234q
    public final p111u4.i h() {
        return this.f3728g.f3746b.h();
    }

    @Override // N.AbstractC0234q
    public final void i(C0239t c0239t) {
        C0230o c0230o = this.f3728g;
        c0230o.f3746b.i(c0230o.f3751g);
        c0230o.f3746b.i(c0239t);
    }

    @Override // N.AbstractC0234q
    public final void j(Set set) {
        HashSet hashSet = this.f3725d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3725d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // N.AbstractC0234q
    public final void k(C0230o c0230o) {
        this.f3726e.add(c0230o);
    }

    @Override // N.AbstractC0234q
    public final void l(C0239t c0239t) {
        this.f3728g.f3746b.l(c0239t);
    }

    @Override // N.AbstractC0234q
    public final void m() {
        this.f3728g.f3769z++;
    }

    @Override // N.AbstractC0234q
    public final void n(C0230o c0230o) {
        HashSet<Set> hashSet = this.f3725d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl", c0230o);
                set.remove(c0230o.f3747c);
            }
        }
        E4.z.a(this.f3726e).remove(c0230o);
    }

    @Override // N.AbstractC0234q
    public final void o(C0239t c0239t) {
        this.f3728g.f3746b.o(c0239t);
    }

    public final void p() {
        LinkedHashSet<C0230o> linkedHashSet = this.f3726e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f3725d;
        if (hashSet != null) {
            for (C0230o c0230o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0230o.f3747c);
                }
            }
        }
        linkedHashSet.clear();
    }
}

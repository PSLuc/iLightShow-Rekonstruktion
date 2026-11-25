package D3;

import N.C0217h0;
import X.s;
import X.y;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ListIterator;
import java.util.Set;
import okhttp3.internal.http2.Settings;
import p089q4.m;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f780l = new s();

    public f(int i) {
        this.f804f = true;
        this.f802d = true;
        this.f806h = new h(b());
        for (int i3 = 0; i3 < 8; i3++) {
            this.f780l.add(new g(i));
        }
    }

    @Override // D3.j
    public final void a(d dVar) {
        a aVar = dVar.f767a;
        if (aVar == null) {
            return;
        }
        int i = (int) ((((double) dVar.f768b) / 10.0d) * ((double) 1000));
        if (i < 0) {
            i = 0;
        }
        h hVar = this.f806h;
        double dMin = hVar != null ? hVar.f791f : 1.0d;
        if (!dVar.f770d) {
            dMin = Math.min(((double) dVar.f771e) / 255.0d, dMin);
        }
        double dM = p081p0.c.M(dMin, 0.0d, 1.0d);
        s sVar = this.f780l;
        Set setX0 = p089q4.l.x0(p089q4.l.o0(p081p0.c.O((int) (((double) sVar.size()) * dM), 0, sVar.size()), d0.C(new J4.d(0, sVar.size() - 1, 1))));
        ListIterator listIterator = sVar.listIterator();
        int i3 = 0;
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                return;
            }
            Object next = yVar.next();
            int i6 = i3 + 1;
            if (i3 < 0) {
                m.O();
                throw null;
            }
            g gVar = (g) next;
            if (setX0.contains(Integer.valueOf(i3))) {
                gVar.getClass();
                gVar.f785e.setValue(Integer.valueOf(i));
                gVar.f781a.setValue(Integer.valueOf(p081p0.c.O(aVar.f761a, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
                gVar.f782b.setValue(Integer.valueOf(p081p0.c.O(aVar.f762b, 0, 255)));
                Integer numValueOf = Integer.valueOf(p081p0.c.O(aVar.f763c, 0, 255));
                C0217h0 c0217h0 = gVar.f783c;
                c0217h0.setValue(numValueOf);
                gVar.f784d.setValue(Boolean.valueOf(((Number) c0217h0.getValue()).intValue() > 0));
            } else if (dVar.f774h) {
                gVar.f785e.setValue(Integer.valueOf(i));
                gVar.f783c.setValue(0);
                gVar.f784d.setValue(Boolean.FALSE);
            }
            i3 = i6;
        }
    }

    @Override // D3.j
    public final void e() {
        ListIterator listIterator = this.f780l.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                return;
            }
            g gVar = (g) yVar.next();
            gVar.f784d.setValue(Boolean.TRUE);
        }
    }
}

package p077o2;

import B.AbstractC0013g0;
import T1.i;
import T1.k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.h;
import p015c2.r;
import p046i2.t;
import p071n2.c;
import p071n2.d;
import p109u2.A;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BitSet f10634u = new BitSet(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f10635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f10636t;

    public b(h hVar, o oVar, h hVar2, C0474e c0474e, ArrayList arrayList) {
        super(hVar, oVar, null, false, hVar2, null);
        this.f10635s = new HashMap();
        boolean zK = c0474e.k(r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            c cVar = (c) obj;
            List listB = c0474e.n(c0474e.i.f8680h.j(cVar.f10538h)).b();
            BitSet bitSet = new BitSet(listB.size() + i);
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                String name = ((t) it.next()).getName();
                name = zK ? name.toLowerCase() : name;
                HashMap map2 = this.f10635s;
                Integer numValueOf = (Integer) map2.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                    map2.put(name, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(numValueOf.intValue());
            }
            Class cls = cVar.f10538h;
            String str = (String) map.put(bitSet, cls.getName());
            if (str != null) {
                throw new IllegalStateException(AbstractC0013g0.j("Subtypes ", str, " and ", cls.getName(), " have the same signature and cannot be uniquely deduced."));
            }
        }
        this.f10636t = map;
    }

    @Override // p077o2.g, p077o2.a, p071n2.d
    public final Object d(i iVar, f fVar) {
        String str;
        k kVarS = iVar.s();
        if (kVarS == k.START_OBJECT) {
            kVarS = iVar.B0();
        } else if (kVarS != k.FIELD_NAME) {
            return m(iVar, fVar, null, "Unexpected input");
        }
        k kVar = k.END_OBJECT;
        HashMap map = this.f10636t;
        if (kVarS == kVar && (str = (String) map.get(f10634u)) != null) {
            return l(iVar, fVar, null, str);
        }
        LinkedList linkedList = new LinkedList(map.keySet());
        A aA0 = fVar.a0(iVar);
        boolean zK = fVar.f7249l.k(r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (kVarS == k.FIELD_NAME) {
            String strO = iVar.o();
            if (zK) {
                strO = strO.toLowerCase();
            }
            aA0.I0(iVar);
            Integer num = (Integer) this.f10635s.get(strO);
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(iIntValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return l(iVar, fVar, aA0, (String) map.get(linkedList.get(0)));
                }
            }
            kVarS = iVar.B0();
        }
        return m(iVar, fVar, aA0, String.format("Cannot deduce unique subtype of %s (%d candidates match)", p109u2.i.r(this.i), Integer.valueOf(linkedList.size())));
    }

    @Override // p077o2.g, p077o2.a, p071n2.d
    public final d f(InterfaceC0472c interfaceC0472c) {
        return interfaceC0472c == this.f10627j ? this : new b(this, interfaceC0472c);
    }

    public b(b bVar, InterfaceC0472c interfaceC0472c) {
        super(bVar, interfaceC0472c);
        this.f10635s = bVar.f10635s;
        this.f10636t = bVar.f10636t;
    }
}

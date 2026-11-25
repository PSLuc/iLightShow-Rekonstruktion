package p098s2;

import T1.k;
import com.fasterxml.jackson.databind.ser.std.y;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003a2.a;
import p015c2.E;
import p015c2.InterfaceC0472c;
import p015c2.o;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f12165j = new e(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f12166k = new e(1);
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(y yVar, Boolean bool, int i) {
        super(yVar, bool);
        this.i = i;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.y
    public final o c(InterfaceC0472c interfaceC0472c, Boolean bool) {
        switch (this.i) {
            case 0:
                return new e(this, bool, 0);
            default:
                return new e(this, bool, 1);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.y
    public final r d() {
        switch (this.i) {
            case 0:
                break;
        }
        return createSchemaNode("string", true);
    }

    public void e(List list, T1.e eVar, E e6, int i) throws IOException {
        for (int i3 = 0; i3 < i; i3++) {
            try {
                String str = (String) list.get(i3);
                if (str == null) {
                    e6.g0(eVar);
                } else {
                    eVar.s0(str);
                }
            } catch (Exception e7) {
                wrapAndThrow(e6, e7, list, i3);
                return;
            }
        }
    }

    public void f(Collection collection, T1.e eVar, E e6) throws IOException {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    e6.g0(eVar);
                } else {
                    eVar.s0(str);
                }
                i++;
            }
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, collection, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L23;
     */
    @Override // p015c2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(java.lang.Object r6, T1.e r7, p015c2.E r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.i
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            java.util.Collection r6 = (java.util.Collection) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L24
            java.lang.Boolean r0 = r5.f7770h
            if (r0 != 0) goto L1c
            c2.D r1 = p015c2.D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            c2.C r2 = r8.f7226j
            boolean r1 = r2.p(r1)
            if (r1 != 0) goto L20
        L1c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L24
        L20:
            r5.f(r6, r7, r8)
            goto L2d
        L24:
            r7.n0(r6)
            r5.f(r6, r7, r8)
            r7.L()
        L2d:
            return
        L2e:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L4d
            java.lang.Boolean r2 = r5.f7770h
            if (r2 != 0) goto L45
            c2.D r3 = p015c2.D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            c2.C r4 = r8.f7226j
            boolean r3 = r4.p(r3)
            if (r3 != 0) goto L49
        L45:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r2 != r3) goto L4d
        L49:
            r5.e(r6, r7, r8, r1)
            goto L56
        L4d:
            r7.n0(r6)
            r5.e(r6, r7, r8, r0)
            r7.L()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p098s2.e.serialize(java.lang.Object, T1.e, c2.E):void");
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, E e6, p071n2.e eVar2) throws IOException {
        switch (this.i) {
            case 0:
                List list = (List) obj;
                a aVarE = eVar2.e(eVar, eVar2.d(k.START_ARRAY, list));
                eVar.C(list);
                e(list, eVar, e6, list.size());
                eVar2.f(eVar, aVarE);
                break;
            default:
                Collection collection = (Collection) obj;
                a aVarE2 = eVar2.e(eVar, eVar2.d(k.START_ARRAY, collection));
                eVar.C(collection);
                f(collection, eVar, e6);
                eVar2.f(eVar, aVarE2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i) {
        super(List.class);
        this.i = i;
        switch (i) {
            case 1:
                super(Collection.class);
                break;
            default:
                break;
        }
    }
}

package p135z0;

import E0.l;
import E0.o;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p030f0.c;
import p049j1.h;
import p089q4.m;
import p089q4.u;
import p125x1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [q4.u] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean a(ArrayList arrayList) {
        ?? arrayList2;
        long j4;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                arrayList2 = u.f11237h;
            } else {
                arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iL = m.L(arrayList);
                int i = 0;
                while (i < iL) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    l lVar = (l) obj2;
                    l lVar2 = (l) obj;
                    arrayList2.add(new c(p081p0.c.y(Math.abs(c.d(lVar2.e().a()) - c.d(lVar.e().a())), Math.abs(c.e(lVar2.e().a()) - c.e(lVar.e().a())))));
                    obj = obj2;
                }
            }
            if (arrayList2.size() == 1) {
                j4 = ((c) p089q4.l.X(arrayList2)).f8837a;
            } else {
                if (arrayList2.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object objX = p089q4.l.X(arrayList2);
                int iL2 = m.L(arrayList2);
                if (1 <= iL2) {
                    int i3 = 1;
                    while (true) {
                        objX = new c(c.h(((c) objX).f8837a, ((c) arrayList2.get(i3)).f8837a));
                        if (i3 == iL2) {
                            break;
                        }
                        i3++;
                    }
                }
                j4 = ((c) objX).f8837a;
            }
            if (c.e(j4) >= c.d(j4)) {
                return false;
            }
        }
        return true;
    }

    public static b b(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j4;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                j4 = -1;
                break;
            }
            int i6 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i3++;
        }
        if (j4 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j4 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j6 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i7 = 0; i7 < j6; i7++) {
                int i8 = byteBufferDuplicate.getInt();
                long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    byteBufferDuplicate.position((int) (j7 + j4));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f11788k = byteBufferDuplicate;
                    bVar.f11786h = iPosition;
                    int i9 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.i = i9;
                    bVar.f11787j = ((ByteBuffer) bVar.f11788k).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void c(h hVar, l lVar) {
        Object obj = lVar.i().f939h.get(o.f977g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        l lVarJ = lVar.j();
        if (lVarJ == null) {
            return;
        }
        Object obj2 = lVarJ.i().f939h.get(o.f975e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = lVarJ.i().f939h.get(o.f976f);
            if ((obj3 != null ? obj3 : null) != null) {
                throw new ClassCastException();
            }
            if (lVar.i().f939h.containsKey(o.f965A)) {
                ArrayList arrayList = new ArrayList();
                List listH = l.h(lVarJ, 4);
                int size = listH.size();
                int i = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    l lVar2 = (l) listH.get(i3);
                    if (lVar2.i().f939h.containsKey(o.f965A)) {
                        arrayList.add(lVar2);
                        if (lVar2.f946c.s() < lVar.f946c.s()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zA = a(arrayList);
                int i6 = zA ? 0 : i;
                int i7 = zA ? i : 0;
                Object obj4 = lVar.i().f939h.get(o.f965A);
                if (obj4 == null) {
                    obj4 = Boolean.FALSE;
                }
                hVar.f9708a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, 1, i7, 1, false, ((Boolean) obj4).booleanValue()));
            }
        }
    }
}

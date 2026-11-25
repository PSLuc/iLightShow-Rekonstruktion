package N;

import X.C0386c;
import android.os.Trace;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: N.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244v0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f3830h;
    public final /* synthetic */ p080p.A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p080p.A f3831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f3832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f3833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p080p.A f3834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f3835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p080p.A f3836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Set f3837p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244v0(C0248x0 c0248x0, p080p.A a6, p080p.A a7, List list, List list2, p080p.A a8, List list3, p080p.A a9, Set set) {
        super(1);
        this.f3830h = c0248x0;
        this.i = a6;
        this.f3831j = a7;
        this.f3832k = list;
        this.f3833l = list2;
        this.f3834m = a8;
        this.f3835n = list3;
        this.f3836o = a9;
        this.f3837p = set;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0169  */
    /* JADX WARN: Code duplicated, block: B:105:0x0178 A[Catch: all -> 0x019c, Exception -> 0x019e, TryCatch #9 {Exception -> 0x019e, blocks: (B:100:0x0160, B:103:0x016a, B:105:0x0178, B:107:0x0184, B:109:0x018a), top: B:223:0x0160, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0184 A[Catch: all -> 0x019c, Exception -> 0x019e, TryCatch #9 {Exception -> 0x019e, blocks: (B:100:0x0160, B:103:0x016a, B:105:0x0178, B:107:0x0184, B:109:0x018a), top: B:223:0x0160, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x018a A[Catch: all -> 0x019c, Exception -> 0x019e, TRY_LEAVE, TryCatch #9 {Exception -> 0x019e, blocks: (B:100:0x0160, B:103:0x016a, B:105:0x0178, B:107:0x0184, B:109:0x018a), top: B:223:0x0160, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:122:0x01af A[LOOP:2: B:103:0x016a->B:122:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x01c6 A[Catch: all -> 0x02cc, TryCatch #6 {all -> 0x02cc, blocks: (B:29:0x0065, B:30:0x006a, B:40:0x0088, B:41:0x0089, B:42:0x008f, B:44:0x0096, B:47:0x009e, B:60:0x00ce, B:66:0x00e1, B:91:0x0141, B:98:0x015a, B:123:0x01b4, B:129:0x01c6, B:130:0x01c8, B:132:0x01cc, B:133:0x01cd, B:136:0x01e3, B:137:0x01e4, B:127:0x01c2, B:128:0x01c5, B:126:0x01be, B:95:0x0150, B:96:0x0153, B:94:0x014b, B:64:0x00dd, B:65:0x00e0, B:63:0x00d8, B:149:0x0209, B:151:0x0212, B:177:0x027b, B:179:0x0281, B:180:0x0284, B:182:0x028a, B:183:0x0295, B:185:0x029b, B:186:0x02a8, B:190:0x02ae, B:153:0x021a, B:154:0x021c, B:176:0x027a, B:191:0x02b6, B:192:0x02b7, B:198:0x02c6, B:199:0x02c9, B:194:0x02be, B:200:0x02ca, B:201:0x02cb, B:31:0x006b, B:33:0x0071, B:34:0x0074, B:39:0x0083, B:131:0x01c9, B:69:0x00ec, B:72:0x00fd, B:74:0x010d, B:76:0x0117, B:78:0x011d, B:93:0x0145, B:138:0x01e5, B:140:0x01ec, B:142:0x01f8, B:147:0x0203, B:100:0x0160, B:103:0x016a, B:105:0x0178, B:107:0x0184, B:109:0x018a, B:49:0x00a4, B:51:0x00ab, B:56:0x00bb, B:58:0x00c2, B:62:0x00d2, B:193:0x02b8, B:125:0x01b8, B:155:0x021d, B:157:0x0228, B:159:0x0234, B:161:0x023a, B:164:0x0241, B:165:0x0244, B:167:0x024c, B:169:0x0258, B:171:0x025e, B:174:0x026e, B:173:0x0266, B:175:0x0271), top: B:218:0x0065, inners: #0, #1, #3, #5, #7, #9, #10, #11, #13, #14, #15 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:210:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01b4 A[EDGE_INSN: B:240:0x01b4->B:123:0x01b4 BREAK  A[LOOP:2: B:103:0x016a->B:122:0x01af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01b4 A[EDGE_INSN: B:241:0x01b4->B:123:0x01b4 BREAK  A[LOOP:2: B:103:0x016a->B:122:0x01af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0141 A[EDGE_INSN: B:243:0x0141->B:91:0x0141 BREAK  A[LOOP:4: B:72:0x00fd->B:89:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0141 A[EDGE_INSN: B:244:0x0141->B:91:0x0141 BREAK  A[LOOP:4: B:72:0x00fd->B:89:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d A[Catch: all -> 0x012b, Exception -> 0x012d, TryCatch #2 {Exception -> 0x012d, blocks: (B:69:0x00ec, B:72:0x00fd, B:74:0x010d, B:76:0x0117, B:78:0x011d), top: B:212:0x00ec, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0117 A[Catch: all -> 0x012b, Exception -> 0x012d, TryCatch #2 {Exception -> 0x012d, blocks: (B:69:0x00ec, B:72:0x00fd, B:74:0x010d, B:76:0x0117, B:78:0x011d), top: B:212:0x00ec, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011d A[Catch: all -> 0x012b, Exception -> 0x012d, TRY_LEAVE, TryCatch #2 {Exception -> 0x012d, blocks: (B:69:0x00ec, B:72:0x00fd, B:74:0x010d, B:76:0x0117, B:78:0x011d), top: B:212:0x00ec, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x013a A[LOOP:4: B:72:0x00fd->B:89:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x013d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        boolean zU;
        Object[] objArr;
        char c6;
        long[] jArr;
        int length;
        long j4;
        long j6;
        int i;
        long j7;
        int i3;
        int i6;
        Object[] objArr2;
        long[] jArr2;
        int length2;
        int i7;
        long j8;
        Object[] objArr3;
        long[] jArr3;
        int i8;
        int i9;
        boolean z5;
        long jLongValue = ((Number) obj).longValue();
        C0248x0 c0248x0 = this.f3830h;
        synchronized (c0248x0.f3855b) {
            zU = c0248x0.u();
        }
        if (zU) {
            C0248x0 c0248x1 = this.f3830h;
            Trace.beginSection("Recomposer:animation");
            try {
                c0248x1.f3854a.a(jLongValue);
                synchronized (X.o.f5709b) {
                    p080p.A a6 = ((C0386c) X.o.i.get()).f5674h;
                    if (a6 != null) {
                        z5 = a6.h();
                    }
                }
                if (z5) {
                    X.o.a();
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        C0248x0 c0248x2 = this.f3830h;
        p080p.A a7 = this.i;
        p080p.A a8 = this.f3831j;
        List list = this.f3832k;
        List list2 = this.f3833l;
        p080p.A a9 = this.f3834m;
        List list3 = this.f3835n;
        p080p.A a10 = this.f3836o;
        Set set = this.f3837p;
        Trace.beginSection("Recomposer:recompose");
        try {
            C0248x0.q(c0248x2);
            synchronized (c0248x2.f3855b) {
                try {
                    P.d dVar = c0248x2.f3861h;
                    int i10 = dVar.f4583j;
                    if (i10 > 0) {
                        Object[] objArr4 = dVar.f4582h;
                        int i11 = 0;
                        do {
                            list.add((C0239t) objArr4[i11]);
                            i11++;
                        } while (i11 < i10);
                    }
                    c0248x2.f3861h.i();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a7.b();
            a8.b();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    try {
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            C0239t c0239t = (C0239t) list.get(i12);
                            C0239t c0239tP = C0248x0.p(c0248x2, c0239t, a7);
                            if (c0239tP != null) {
                                list3.add(c0239tP);
                            }
                            a8.a(c0239t);
                        }
                        list.clear();
                        if (a7.h() || c0248x2.f3861h.n()) {
                            synchronized (c0248x2.f3855b) {
                                try {
                                    List listW = c0248x2.w();
                                    int size2 = listW.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        C0239t c0239t2 = (C0239t) listW.get(i13);
                                        if (!a8.c(c0239t2) && c0239t2.s(set)) {
                                            list.add(c0239t2);
                                        }
                                    }
                                    P.d dVar2 = c0248x2.f3861h;
                                    int i14 = dVar2.f4583j;
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < i14; i16++) {
                                        C0239t c0239t3 = (C0239t) dVar2.f4582h[i16];
                                        if (!a8.c(c0239t3) && !list.contains(c0239t3)) {
                                            list.add(c0239t3);
                                            i15++;
                                        } else if (i15 > 0) {
                                            Object[] objArr5 = dVar2.f4582h;
                                            objArr5[i16 - i15] = objArr5[i16];
                                        }
                                    }
                                    int i17 = i14 - i15;
                                    p089q4.k.j0(i17, i14, dVar2.f4582h);
                                    dVar2.f4583j = i17;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                C0246w0.s(list2, c0248x2);
                                while (!list2.isEmpty()) {
                                    List listY = c0248x2.y(list2, a7);
                                    a9.getClass();
                                    for (Object obj2 : listY) {
                                        a9.f10709b[a9.d(obj2)] = obj2;
                                    }
                                    C0246w0.s(list2, c0248x2);
                                }
                            } catch (Exception e6) {
                                c0248x2.z(e6, null);
                                C0246w0.q(c0248x2, list, list2, list3, a9, a10, a7, a8);
                            }
                        }
                    } catch (Throwable th4) {
                        list.clear();
                        throw th4;
                    }
                } catch (Exception e7) {
                    c0248x2.z(e7, null);
                    C0246w0.q(c0248x2, list, list2, list3, a9, a10, a7, a8);
                    list.clear();
                }
                Trace.endSection();
                return p084p4.x.f10867a;
            }
            if (list3.isEmpty()) {
                if (a9.h()) {
                    a10.i(a9);
                    objArr = a9.f10709b;
                    c6 = 7;
                    jArr = a9.f10708a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j4 = 128;
                        while (true) {
                            j7 = jArr[i];
                            j6 = 255;
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                i3 = 8 - ((~(i - length)) >>> 31);
                                for (i6 = 0; i6 < i3; i6++) {
                                    if ((j7 & 255) < 128) {
                                        ((C0239t) objArr[(i << 3) + i6]).f();
                                    }
                                    j7 >>= 8;
                                }
                                if (i3 == 8) {
                                    break;
                                    break;
                                }
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        j4 = 128;
                        j6 = 255;
                    }
                    a9.b();
                } else {
                    c6 = 7;
                    j4 = 128;
                    j6 = 255;
                }
                if (a10.h()) {
                    objArr2 = a10.f10709b;
                    jArr2 = a10.f10708a;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i7 = 0;
                        while (true) {
                            j8 = jArr2[i7];
                            objArr3 = objArr2;
                            jArr3 = jArr2;
                            if ((((~j8) << c6) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (i9 = 0; i9 < i8; i9++) {
                                    if ((j8 & j6) < j4) {
                                        ((C0239t) objArr3[(i7 << 3) + i9]).g();
                                    }
                                    j8 >>= 8;
                                }
                                if (i8 == 8) {
                                    break;
                                    break;
                                }
                            }
                            if (i7 != length2) {
                                break;
                                break;
                            }
                            i7++;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                        }
                    }
                    a10.b();
                    synchronized (c0248x2.f3855b) {
                        c0248x2.t();
                        X.o.k().m();
                        a8.b();
                        a7.b();
                        c0248x2.f3866n = null;
                    }
                } else {
                    synchronized (c0248x2.f3855b) {
                        c0248x2.t();
                        X.o.k().m();
                        a8.b();
                        a7.b();
                        c0248x2.f3866n = null;
                    }
                }
            } else {
                try {
                    try {
                        int size3 = list3.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            a10.a((C0239t) list3.get(i18));
                        }
                        int size4 = list3.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            ((C0239t) list3.get(i19)).d();
                        }
                        list3.clear();
                        if (a9.h()) {
                            try {
                                try {
                                    a10.i(a9);
                                    objArr = a9.f10709b;
                                    c6 = 7;
                                    jArr = a9.f10708a;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i = 0;
                                        j4 = 128;
                                        while (true) {
                                            j7 = jArr[i];
                                            j6 = 255;
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                if (i != length) {
                                                    break;
                                                    break;
                                                }
                                                i++;
                                            } else {
                                                i3 = 8 - ((~(i - length)) >>> 31);
                                                while (i6 < i3) {
                                                    if ((j7 & 255) < 128) {
                                                        ((C0239t) objArr[(i << 3) + i6]).f();
                                                    }
                                                    j7 >>= 8;
                                                }
                                                if (i3 == 8) {
                                                    break;
                                                }
                                                if (i != length) {
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                    } else {
                                        j4 = 128;
                                        j6 = 255;
                                    }
                                    a9.b();
                                } catch (Throwable th5) {
                                    a9.b();
                                    throw th5;
                                }
                            } catch (Exception e8) {
                                c0248x2.z(e8, null);
                                C0246w0.q(c0248x2, list, list2, list3, a9, a10, a7, a8);
                                a9.b();
                            }
                        } else {
                            c6 = 7;
                            j4 = 128;
                            j6 = 255;
                        }
                        if (a10.h()) {
                            try {
                                try {
                                    objArr2 = a10.f10709b;
                                    jArr2 = a10.f10708a;
                                    length2 = jArr2.length - 2;
                                    if (length2 >= 0) {
                                        i7 = 0;
                                        while (true) {
                                            j8 = jArr2[i7];
                                            objArr3 = objArr2;
                                            jArr3 = jArr2;
                                            if ((((~j8) << c6) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                i8 = 8 - ((~(i7 - length2)) >>> 31);
                                                while (i9 < i8) {
                                                    if ((j8 & j6) < j4) {
                                                        ((C0239t) objArr3[(i7 << 3) + i9]).g();
                                                    }
                                                    j8 >>= 8;
                                                }
                                                if (i8 == 8) {
                                                    break;
                                                }
                                            }
                                            if (i7 != length2) {
                                                break;
                                            }
                                            i7++;
                                            objArr2 = objArr3;
                                            jArr2 = jArr3;
                                        }
                                    }
                                    a10.b();
                                    synchronized (c0248x2.f3855b) {
                                        c0248x2.t();
                                    }
                                    X.o.k().m();
                                    a8.b();
                                    a7.b();
                                    c0248x2.f3866n = null;
                                } catch (Throwable th6) {
                                    a10.b();
                                    throw th6;
                                }
                            } catch (Exception e9) {
                                c0248x2.z(e9, null);
                                C0246w0.q(c0248x2, list, list2, list3, a9, a10, a7, a8);
                                a10.b();
                            }
                        } else {
                            synchronized (c0248x2.f3855b) {
                                c0248x2.t();
                                X.o.k().m();
                                a8.b();
                                a7.b();
                                c0248x2.f3866n = null;
                            }
                        }
                    } catch (Throwable th7) {
                        list3.clear();
                        throw th7;
                    }
                } catch (Exception e10) {
                    c0248x2.z(e10, null);
                    C0246w0.q(c0248x2, list, list2, list3, a9, a10, a7, a8);
                    list3.clear();
                }
            }
            Trace.endSection();
            return p084p4.x.f10867a;
        } catch (Throwable th8) {
            Trace.endSection();
            throw th8;
        }
    }
}

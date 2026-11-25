package N;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: N.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246w0 extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f3839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f3840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f3841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p080p.A f3842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p080p.A f3843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p080p.A f3844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Set f3845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p080p.A f3846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ V f3848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0248x0 f3849v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246w0(C0248x0 c0248x0, p111u4.d dVar) {
        super(3, dVar);
        this.f3849v = c0248x0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void q(C0248x0 c0248x0, List list, List list2, List list3, p080p.A a6, p080p.A a7, p080p.A a8, p080p.A a9) {
        char c6;
        long j4;
        long j6;
        synchronized (c0248x0.f3855b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C0239t c0239t = (C0239t) list3.get(i);
                    c0239t.a();
                    c0248x0.A(c0239t);
                }
                list3.clear();
                Object[] objArr = a6.f10709b;
                long[] jArr = a6.f10708a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    j4 = 255;
                    while (true) {
                        long j7 = jArr[i3];
                        c6 = 7;
                        j6 = -9187201950435737472L;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i6 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j7 & 255) < 128) {
                                    C0239t c0239t2 = (C0239t) objArr[(i3 << 3) + i7];
                                    c0239t2.a();
                                    c0248x0.A(c0239t2);
                                }
                                j7 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    c6 = 7;
                    j4 = 255;
                    j6 = -9187201950435737472L;
                }
                a6.b();
                Object[] objArr2 = a7.f10709b;
                long[] jArr2 = a7.f10708a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr2[i8];
                        if ((((~j8) << c6) & j8 & j6) == j6) {
                            if (i8 != length2) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j8 & j4) < 128) {
                                    ((C0239t) objArr2[(i8 << 3) + i10]).g();
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length2) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                a7.b();
                a8.b();
                Object[] objArr3 = a9.f10709b;
                long[] jArr3 = a9.f10708a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j9 = jArr3[i11];
                        if ((((~j9) << c6) & j9 & j6) == j6) {
                            if (i11 != length3) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length3)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j9 & j4) < 128) {
                                    C0239t c0239t3 = (C0239t) objArr3[(i11 << 3) + i13];
                                    c0239t3.a();
                                    c0248x0.A(c0239t3);
                                }
                                j9 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length3) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                a9.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void s(List list, C0248x0 c0248x0) {
        list.clear();
        synchronized (c0248x0.f3855b) {
            try {
                ArrayList arrayList = c0248x0.f3862j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((Y) arrayList.get(i));
                }
                c0248x0.f3862j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0246w0 c0246w0 = new C0246w0(this.f3849v, (p111u4.d) obj3);
        c0246w0.f3848u = (V) obj2;
        c0246w0.o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d0 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x00c8, B:22:0x00d0), top: B:67:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0123 -> B:44:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01d3 -> B:12:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0246w0.o(java.lang.Object):java.lang.Object");
    }
}

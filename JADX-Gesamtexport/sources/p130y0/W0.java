package p130y0;

import D4.e;
import R4.a;
import R4.b;
import S4.InterfaceC0369f;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import p084p4.x;
import p111u4.d;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f14320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f14322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f14323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Uri f14324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p076o1.a f14325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f14326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14327s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(ContentResolver contentResolver, Uri uri, p076o1.a aVar, b bVar, Context context, d dVar) {
        super(2, dVar);
        this.f14323o = contentResolver;
        this.f14324p = uri;
        this.f14325q = aVar;
        this.f14326r = bVar;
        this.f14327s = context;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        b bVar = this.f14326r;
        W0 w6 = new W0(this.f14323o, this.f14324p, this.f14325q, bVar, this.f14327s, dVar);
        w6.f14322n = obj;
        return w6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((W0) b((InterfaceC0369f) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.m(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r10.f14321m
            o1.a r2 = r10.f14325q
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f14323o
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            R4.a r1 = r10.f14320l
            java.lang.Object r6 = r10.f14322n
            S4.f r6 = (S4.InterfaceC0369f) r6
            S1.V.O(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r10 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L26:
            R4.a r1 = r10.f14320l
            java.lang.Object r6 = r10.f14322n
            S4.f r6 = (S4.InterfaceC0369f) r6
            S1.V.O(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            S1.V.O(r11)
            java.lang.Object r11 = r10.f14322n
            S4.f r11 = (S4.InterfaceC0369f) r11
            android.net.Uri r1 = r10.f14324p
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            R4.b r1 = r10.f14326r     // Catch: java.lang.Throwable -> L1c
            R4.a r6 = new R4.a     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f14322n = r11     // Catch: java.lang.Throwable -> L1c
            r10.f14320l = r6     // Catch: java.lang.Throwable -> L1c
            r10.f14321m = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.a(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f14327s     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f14322n = r6     // Catch: java.lang.Throwable -> L1c
            r10.f14320l = r1     // Catch: java.lang.Throwable -> L1c
            r10.f14321m = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.m(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
        L7f:
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            p4.x r10 = p084p4.x.f10867a
            return r10
        L86:
            r5.unregisterContentObserver(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p130y0.W0.o(java.lang.Object):java.lang.Object");
    }
}

package R2;

import B.C0031p0;
import K2.o;
import K2.u;
import K2.v;
import K2.x;
import L2.n;
import S1.h0;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.f f4790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.d f4791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f4793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T2.b f4794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U2.a f4795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U2.a f4796h;
    public final S2.c i;

    public l(Context context, M2.f fVar, S2.d dVar, d dVar2, Executor executor, T2.b bVar, U2.a aVar, U2.a aVar2, S2.c cVar) {
        this.f4789a = context;
        this.f4790b = fVar;
        this.f4791c = dVar;
        this.f4792d = dVar2;
        this.f4793e = executor;
        this.f4794f = bVar;
        this.f4795g = aVar;
        this.f4796h = aVar2;
        this.i = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x040d  */
    /* JADX WARN: Code duplicated, block: B:129:0x041d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0425  */
    /* JADX WARN: Code duplicated, block: B:132:0x042f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0432  */
    /* JADX WARN: Code duplicated, block: B:136:0x0435  */
    /* JADX WARN: Code duplicated, block: B:139:0x0444  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0454 A[SYNTHETIC] */
    public final void a(final L2.i iVar, int i) {
        M2.g gVar;
        M2.a aVar;
        int i3;
        String str;
        J2.c cVarB;
        int i6;
        String str2;
        Integer numValueOf;
        String str3;
        K2.k kVar;
        int i7;
        HashMap map;
        Iterator it;
        int i8;
        String str4;
        final l lVar = this;
        final L2.i iVar2 = iVar;
        int i9 = 2;
        final int i10 = 1;
        final int i11 = 0;
        M2.g gVarA = lVar.f4790b.a(iVar2.f3065a);
        long jMax = 0;
        while (true) {
            T2.a aVar2 = new T2.a(lVar) { // from class: R2.h
                public final /* synthetic */ l i;

                {
                    this.i = lVar;
                }

                @Override // T2.a
                public final Object execute() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            L2.i iVar3 = iVar2;
                            S2.h hVar = (S2.h) this.i.f4791c;
                            SQLiteDatabase sQLiteDatabaseB = hVar.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = S2.h.c(sQLiteDatabaseB, iVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            S2.h hVar2 = (S2.h) this.i.f4791c;
                            hVar2.getClass();
                            return (Iterable) hVar2.k(new j(hVar2, 2, iVar2));
                    }
                }
            };
            S2.h hVar = (S2.h) lVar.f4794f;
            if (!((Boolean) hVar.v(aVar2)).booleanValue()) {
                hVar.v(new k(jMax, lVar, iVar2));
                return;
            }
            final Iterable iterable = (Iterable) hVar.v(new T2.a(lVar) { // from class: R2.h
                public final /* synthetic */ l i;

                {
                    this.i = lVar;
                }

                @Override // T2.a
                public final Object execute() {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            L2.i iVar3 = iVar2;
                            S2.h hVar2 = (S2.h) this.i.f4791c;
                            SQLiteDatabase sQLiteDatabaseB = hVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lC = S2.h.c(sQLiteDatabaseB, iVar3);
                                if (lC == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lC.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        default:
                            S2.h hVar3 = (S2.h) this.i.f4791c;
                            hVar3.getClass();
                            return (Iterable) hVar3.k(new j(hVar3, 2, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar2.f3066b;
            if (gVarA == null) {
                h0.j("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar = new M2.a(3, -1L);
                i3 = i9;
                gVar = gVarA;
            } else {
                int i12 = i10;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((S2.b) it2.next()).f4996c);
                }
                String str5 = "proto";
                if ((bArr != null ? i12 : i11) != 0) {
                    S2.c cVar = lVar.i;
                    Objects.requireNonNull(cVar);
                    O2.a aVar3 = (O2.a) hVar.v(new J2.b(i9, cVar));
                    A0.b bVar = new A0.b();
                    bVar.f13f = new HashMap();
                    bVar.f11d = Long.valueOf(lVar.f4795g.d());
                    bVar.f12e = Long.valueOf(lVar.f4796h.d());
                    bVar.f8a = "GDT_CLIENT_METRICS";
                    I2.b bVar2 = new I2.b("proto");
                    aVar3.getClass();
                    p091r0.d dVar = n.f3077a;
                    dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dVar.f(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    bVar.f10c = new L2.l(bVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((J2.d) gVarA).a(bVar.D()));
                }
                J2.d dVar2 = (J2.d) gVarA;
                HashMap map2 = new HashMap();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    L2.h hVar2 = (L2.h) obj;
                    String str6 = hVar2.f3059a;
                    if (map2.containsKey(str6)) {
                        ((List) map2.get(str6)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map2.put(str6, arrayList2);
                    }
                    arrayList = arrayList;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    L2.h hVar3 = (L2.h) ((List) entry.getValue()).get(0);
                    x xVar = x.f2127h;
                    long jD = dVar2.f1920f.d();
                    long jD2 = dVar2.f1919e.d();
                    K2.j jVar = new K2.j(new K2.h(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a(ClipAttribute.Sensor.Configuration.Device), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        L2.h hVar4 = (L2.h) it4.next();
                        Iterator it5 = it3;
                        L2.l lVar2 = hVar4.f3061c;
                        Iterator it6 = it4;
                        I2.b bVar3 = lVar2.f3074a;
                        M2.g gVar2 = gVarA;
                        boolean zEquals = bVar3.equals(new I2.b(str5));
                        byte[] bArr2 = lVar2.f3075b;
                        if (zEquals) {
                            kVar = new K2.k();
                            kVar.f2105l = bArr2;
                            str3 = str5;
                        } else {
                            str3 = str5;
                            if (bVar3.equals(new I2.b("json"))) {
                                String str7 = new String(bArr2, Charset.forName("UTF-8"));
                                K2.k kVar2 = new K2.k();
                                kVar2.f2106m = str7;
                                kVar = kVar2;
                            } else if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                bVar3.toString();
                            }
                            it3 = it5;
                            it4 = it6;
                            gVarA = gVar2;
                            str5 = str3;
                        }
                        kVar.f2102h = Long.valueOf(hVar4.f3062d);
                        kVar.i = Long.valueOf(hVar4.f3063e);
                        String str8 = (String) hVar4.f3064f.get("tz-offset");
                        kVar.f2103j = Long.valueOf(str8 == null ? 0L : Long.valueOf(str8).longValue());
                        kVar.f2107n = new o((v) v.f2126h.get(hVar4.b("net-type")), (u) u.f2125h.get(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f3060b;
                        if (num != null) {
                            kVar.f2104k = num;
                        }
                        String strConcat = ((Long) kVar.f2102h) == null ? " eventTimeMs" : "";
                        if (((Long) kVar.i) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) kVar.f2103j) == null) {
                            strConcat = strConcat + " timezoneOffsetSeconds";
                        }
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        arrayList4.add(new K2.l(((Long) kVar.f2102h).longValue(), (Integer) kVar.f2104k, ((Long) kVar.i).longValue(), (byte[]) kVar.f2105l, (String) kVar.f2106m, ((Long) kVar.f2103j).longValue(), (o) kVar.f2107n));
                        it3 = it5;
                        it4 = it6;
                        gVarA = gVar2;
                        str5 = str3;
                    }
                    arrayList3.add(new K2.m(jD, jD2, jVar, numValueOf, str2, arrayList4));
                    it3 = it3;
                    gVarA = gVarA;
                    str5 = str5;
                }
                gVar = gVarA;
                K2.i iVar3 = new K2.i(arrayList3);
                URL urlB = dVar2.f1918d;
                if (bArr != null) {
                    try {
                        J2.a aVarA = J2.a.a(bArr);
                        str = aVarA.f1910b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = aVarA.f1909a;
                        if (str9 != null) {
                            urlB = J2.d.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new M2.a(3, -1L);
                        i3 = 2;
                    }
                } else {
                    str = null;
                }
                try {
                    try {
                        C0031p0 c0031p0 = new C0031p0(urlB, iVar3, str, 5);
                        J2.b bVar4 = new J2.b(0, dVar2);
                        int i14 = 5;
                        while (true) {
                            cVarB = bVar4.b(c0031p0);
                            URL url = (URL) cVarB.f1914c;
                            if (url != null) {
                                h0.j("CctTransportBackend", "Following redirect to: %s", url);
                                try {
                                    c0031p0 = new C0031p0(url, (K2.i) c0031p0.f394j, (String) c0031p0.f395k, 5);
                                } catch (IOException unused4) {
                                    Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
                                    i3 = 2;
                                    aVar = new M2.a(2, -1L);
                                    i7 = aVar.f3475a;
                                    if (i7 == i3) {
                                        final long j4 = jMax;
                                        hVar.v(new T2.a() { // from class: R2.i
                                            @Override // T2.a
                                            public final Object execute() {
                                                l lVar3 = this.f4782h;
                                                S2.h hVar5 = (S2.h) lVar3.f4791c;
                                                hVar5.getClass();
                                                Iterable iterable2 = iterable;
                                                if (iterable2.iterator().hasNext()) {
                                                    String str10 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + S2.h.C(iterable2);
                                                    SQLiteDatabase sQLiteDatabaseB = hVar5.b();
                                                    sQLiteDatabaseB.beginTransaction();
                                                    try {
                                                        sQLiteDatabaseB.compileStatement(str10).execute();
                                                        Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                                        while (cursorRawQuery.moveToNext()) {
                                                            try {
                                                                hVar5.s(cursorRawQuery.getInt(0), O2.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                                            } catch (Throwable th) {
                                                                cursorRawQuery.close();
                                                                throw th;
                                                            }
                                                        }
                                                        cursorRawQuery.close();
                                                        sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                                        sQLiteDatabaseB.setTransactionSuccessful();
                                                        sQLiteDatabaseB.endTransaction();
                                                    } catch (Throwable th2) {
                                                        sQLiteDatabaseB.endTransaction();
                                                        throw th2;
                                                    }
                                                }
                                                hVar5.k(new S2.e(lVar3.f4795g.d() + j4, iVar));
                                                return null;
                                            }
                                        });
                                        this.f4792d.a(iVar, i + 1, true);
                                        return;
                                    }
                                    hVar.v(new j(this, 0, iterable));
                                    if (i7 == 1) {
                                        jMax = Math.max(jMax, aVar.f3476b);
                                        if (bArr != null) {
                                            hVar.v(new J2.b(4, this));
                                        }
                                    } else {
                                        if (i7 == 4) {
                                            map = new HashMap();
                                            it = iterable.iterator();
                                            while (it.hasNext()) {
                                                str4 = ((S2.b) it.next()).f4996c.f3059a;
                                                if (map.containsKey(str4)) {
                                                    map.put(str4, Integer.valueOf(((Integer) map.get(str4)).intValue() + 1));
                                                } else {
                                                    map.put(str4, 1);
                                                }
                                            }
                                            i8 = 1;
                                            hVar.v(new j(this, i8, map));
                                        }
                                        i9 = i3;
                                        lVar = this;
                                        iVar2 = iVar;
                                        i11 = 0;
                                        i10 = i8;
                                        gVarA = gVar;
                                    }
                                    i8 = 1;
                                    i9 = i3;
                                    lVar = this;
                                    iVar2 = iVar;
                                    i11 = 0;
                                    i10 = i8;
                                    gVarA = gVar;
                                }
                            } else {
                                c0031p0 = null;
                            }
                            if (c0031p0 == null || (i14 = i14 - 1) < (i6 = i12)) {
                                break;
                                break;
                            }
                            i12 = i6;
                        }
                        int i15 = cVarB.f1912a;
                        if (i15 == 200) {
                            aVar = new M2.a(1, cVarB.f1913b);
                        } else if (i15 >= 500 || i15 == 404) {
                            aVar = new M2.a(2, -1L);
                        } else if (i15 == 400) {
                            try {
                                aVar = new M2.a(4, -1L);
                            } catch (IOException unused5) {
                                Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
                                i3 = 2;
                                aVar = new M2.a(2, -1L);
                            }
                        } else {
                            aVar = new M2.a(3, -1L);
                        }
                        i3 = 2;
                    } catch (IOException unused6) {
                    }
                } catch (IOException unused7) {
                }
                i7 = aVar.f3475a;
                if (i7 == i3) {
                    final long j6 = jMax;
                    hVar.v(new T2.a() { // from class: R2.i
                        @Override // T2.a
                        public final Object execute() {
                            l lVar3 = this.f4782h;
                            S2.h hVar5 = (S2.h) lVar3.f4791c;
                            hVar5.getClass();
                            Iterable iterable2 = iterable;
                            if (iterable2.iterator().hasNext()) {
                                String str10 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + S2.h.C(iterable2);
                                SQLiteDatabase sQLiteDatabaseB = hVar5.b();
                                sQLiteDatabaseB.beginTransaction();
                                try {
                                    sQLiteDatabaseB.compileStatement(str10).execute();
                                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                    while (cursorRawQuery.moveToNext()) {
                                        try {
                                            hVar5.s(cursorRawQuery.getInt(0), O2.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                        } catch (Throwable th) {
                                            cursorRawQuery.close();
                                            throw th;
                                        }
                                    }
                                    cursorRawQuery.close();
                                    sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                    sQLiteDatabaseB.setTransactionSuccessful();
                                    sQLiteDatabaseB.endTransaction();
                                } catch (Throwable th2) {
                                    sQLiteDatabaseB.endTransaction();
                                    throw th2;
                                }
                            }
                            hVar5.k(new S2.e(lVar3.f4795g.d() + j6, iVar));
                            return null;
                        }
                    });
                    this.f4792d.a(iVar, i + 1, true);
                    return;
                }
                hVar.v(new j(this, 0, iterable));
                if (i7 == 1) {
                    jMax = Math.max(jMax, aVar.f3476b);
                    if (bArr != null) {
                        hVar.v(new J2.b(4, this));
                    }
                } else {
                    if (i7 == 4) {
                        map = new HashMap();
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            str4 = ((S2.b) it.next()).f4996c.f3059a;
                            if (map.containsKey(str4)) {
                                map.put(str4, 1);
                            } else {
                                map.put(str4, Integer.valueOf(((Integer) map.get(str4)).intValue() + 1));
                            }
                        }
                        i8 = 1;
                        hVar.v(new j(this, i8, map));
                    }
                    i9 = i3;
                    lVar = this;
                    iVar2 = iVar;
                    i11 = 0;
                    i10 = i8;
                    gVarA = gVar;
                }
                i8 = 1;
                i9 = i3;
                lVar = this;
                iVar2 = iVar;
                i11 = 0;
                i10 = i8;
                gVarA = gVar;
            }
            i7 = aVar.f3475a;
            if (i7 == i3) {
                final long j7 = jMax;
                hVar.v(new T2.a() { // from class: R2.i
                    @Override // T2.a
                    public final Object execute() {
                        l lVar3 = this.f4782h;
                        S2.h hVar5 = (S2.h) lVar3.f4791c;
                        hVar5.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str10 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + S2.h.C(iterable2);
                            SQLiteDatabase sQLiteDatabaseB = hVar5.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                sQLiteDatabaseB.compileStatement(str10).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        hVar5.s(cursorRawQuery.getInt(0), O2.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseB.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseB.setTransactionSuccessful();
                                sQLiteDatabaseB.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseB.endTransaction();
                                throw th2;
                            }
                        }
                        hVar5.k(new S2.e(lVar3.f4795g.d() + j7, iVar));
                        return null;
                    }
                });
                this.f4792d.a(iVar, i + 1, true);
                return;
            }
            hVar.v(new j(this, 0, iterable));
            if (i7 == 1) {
                jMax = Math.max(jMax, aVar.f3476b);
                if (bArr != null) {
                    hVar.v(new J2.b(4, this));
                }
            } else {
                if (i7 == 4) {
                    map = new HashMap();
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        str4 = ((S2.b) it.next()).f4996c.f3059a;
                        if (map.containsKey(str4)) {
                            map.put(str4, 1);
                        } else {
                            map.put(str4, Integer.valueOf(((Integer) map.get(str4)).intValue() + 1));
                        }
                    }
                    i8 = 1;
                    hVar.v(new j(this, i8, map));
                }
                i9 = i3;
                lVar = this;
                iVar2 = iVar;
                i11 = 0;
                i10 = i8;
                gVarA = gVar;
            }
            i8 = 1;
            i9 = i3;
            lVar = this;
            iVar2 = iVar;
            i11 = 0;
            i10 = i8;
            gVarA = gVar;
        }
    }
}

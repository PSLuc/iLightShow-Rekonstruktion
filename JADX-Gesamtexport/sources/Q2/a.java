package Q2;

import L2.i;
import L2.l;
import O2.d;
import O2.e;
import O2.g;
import S1.h0;
import S2.f;
import S2.h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements T2.a, f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4691h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4693k;

    public /* synthetic */ a(h hVar, Object obj, i iVar, int i) {
        this.f4691h = i;
        this.f4693k = hVar;
        this.i = obj;
        this.f4692j = iVar;
    }

    @Override // S2.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        int i;
        O2.c cVar;
        int i3 = 6;
        int i6 = 5;
        int i7 = 4;
        int i8 = 3;
        O2.c cVar2 = O2.c.CACHE_FULL;
        int i9 = 2;
        Object obj2 = this.i;
        int i10 = 0;
        Object obj3 = this.f4692j;
        Object obj4 = this.f4693k;
        int i11 = 1;
        switch (this.f4691h) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h hVar = (h) obj4;
                long jSimpleQueryForLong = hVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                S2.a aVar = hVar.f5004k;
                long j4 = aVar.f4989a;
                L2.h hVar2 = (L2.h) obj2;
                String str = hVar2.f3059a;
                if (jSimpleQueryForLong >= j4) {
                    hVar.s(1L, cVar2, str);
                    return -1L;
                }
                i iVar = (i) obj3;
                Long lC = h.c(sQLiteDatabase, iVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f3065a);
                    contentValues.put("priority", Integer.valueOf(V2.a.a(iVar.f3067c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f3066b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                l lVar = hVar2.f3061c;
                byte[] bArr2 = lVar.f3075b;
                int length = bArr2.length;
                int i12 = aVar.f4993e;
                boolean z5 = length <= i12;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f3062d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f3063e));
                contentValues2.put("payload_encoding", lVar.f3074a.f1853a);
                contentValues2.put(AccountsQueryParameters.CODE, hVar2.f3060b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z5));
                contentValues2.put("payload", z5 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z5) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i12));
                    for (int i13 = 1; i13 <= iCeil; i13++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i13 - 1) * i12, Math.min(i13 * i12, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.f3064f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                Cursor cursor2 = (Cursor) obj;
                h hVar3 = (h) obj4;
                hVar3.getClass();
                while (cursor2.moveToNext()) {
                    long j6 = cursor2.getLong(0);
                    int i14 = cursor2.getInt(7) != 0 ? i11 : 0;
                    A0.b bVar = new A0.b();
                    bVar.f13f = new HashMap();
                    String string = cursor2.getString(i11);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    bVar.f8a = string;
                    bVar.f11d = Long.valueOf(cursor2.getLong(i9));
                    bVar.f12e = Long.valueOf(cursor2.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor2.getString(4);
                        bVar.f10c = new l(string2 == null ? h.f5001m : new I2.b(string2), cursor2.getBlob(5));
                        i = i11;
                    } else {
                        String string3 = cursor2.getString(4);
                        I2.b bVar2 = string3 == null ? h.f5001m : new I2.b(string3);
                        Cursor cursorQuery = hVar3.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                int i15 = i11;
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                                i11 = i15;
                            }
                            i = i11;
                            byte[] bArr3 = new byte[length2];
                            int i16 = 0;
                            int length3 = 0;
                            while (i16 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i16);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList2 = arrayList;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i16++;
                                    cursorQuery = cursor;
                                    arrayList = arrayList2;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            bVar.f10c = new l(bVar2, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        bVar.f9b = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj2).add(new S2.b(j6, (i) obj3, bVar.D()));
                    i11 = i;
                    i9 = 2;
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                h hVar4 = (h) obj4;
                hVar4.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i10);
                        int i17 = cursor3.getInt(1);
                        O2.c cVar3 = O2.c.REASON_UNKNOWN;
                        if (i17 != 0) {
                            if (i17 == 1) {
                                cVar3 = O2.c.MESSAGE_TOO_OLD;
                            } else if (i17 == 2) {
                                cVar = cVar2;
                            } else if (i17 == i8) {
                                cVar3 = O2.c.PAYLOAD_TOO_BIG;
                            } else if (i17 == i7) {
                                cVar3 = O2.c.MAX_RETRIES_REACHED;
                            } else if (i17 == i6) {
                                cVar3 = O2.c.INVALID_PAYLOD;
                            } else if (i17 == i3) {
                                cVar3 = O2.c.SERVER_ERROR;
                            } else {
                                h0.j("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i17));
                            }
                            cVar = cVar3;
                        } else {
                            cVar = cVar3;
                        }
                        long j7 = cursor3.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new d(j7, cVar));
                        i3 = 6;
                        i6 = 5;
                        i7 = 4;
                        i8 = 3;
                        i10 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            H1.d dVar = (H1.d) obj2;
                            if (!it.hasNext()) {
                                long jD = hVar4.i.d();
                                SQLiteDatabase sQLiteDatabaseB = hVar4.b();
                                sQLiteDatabaseB.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        g gVar = new g(cursorRawQuery.getLong(0), jD);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseB.setTransactionSuccessful();
                                        sQLiteDatabaseB.endTransaction();
                                        dVar.i = gVar;
                                        dVar.f1759k = new O2.b(new O2.f(hVar4.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), S2.a.f4988f.f4989a));
                                        dVar.f1757h = (String) hVar4.f5005l.get();
                                        return new O2.a((g) dVar.i, Collections.unmodifiableList((ArrayList) dVar.f1758j), (O2.b) dVar.f1759k, (String) dVar.f1757h);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseB.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i18 = e.f4560c;
                            new ArrayList();
                            ((ArrayList) dVar.f1758j).add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
        }
    }

    @Override // T2.a
    public Object execute() {
        b bVar = (b) this.f4693k;
        h hVar = (h) bVar.f4698d;
        hVar.getClass();
        i iVar = (i) this.f4692j;
        L2.h hVar2 = (L2.h) this.i;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(iVar.f3067c);
        }
        ((Long) hVar.k(new a(hVar, (Object) hVar2, iVar, 1))).getClass();
        bVar.f4695a.a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f4691h = i;
        this.f4693k = obj;
        this.f4692j = obj2;
        this.i = obj3;
    }
}

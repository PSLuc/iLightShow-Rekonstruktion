package S2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4997h = 1;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4998j;

    public /* synthetic */ e(long j4, L2.i iVar) {
        this.i = j4;
        this.f4998j = iVar;
    }

    @Override // S2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (this.f4997h) {
            case 0:
                h hVar = (h) this.f4998j;
                hVar.getClass();
                String[] strArr = {String.valueOf(this.i)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.s(cursorRawQuery.getInt(0), O2.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(this.i));
                L2.i iVar = (L2.i) this.f4998j;
                String str = iVar.f3065a;
                I2.c cVar = iVar.f3067c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(V2.a.a(cVar))}) < 1) {
                    contentValues.put("backend_name", iVar.f3065a);
                    contentValues.put("priority", Integer.valueOf(V2.a.a(cVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ e(h hVar, long j4) {
        this.f4998j = hVar;
        this.i = j4;
    }
}

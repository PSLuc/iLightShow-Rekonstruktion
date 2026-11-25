package R2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements T2.a, S2.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4787h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4788j;

    public /* synthetic */ k(long j4, Object obj, Object obj2) {
        this.i = obj;
        this.f4788j = obj2;
        this.f4787h = j4;
    }

    @Override // S2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((O2.c) this.f4788j).f4557h;
        String string = Integer.toString(i);
        String str = (String) this.i;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z5 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j4 = this.f4787h;
            if (z5) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // T2.a
    public Object execute() {
        l lVar = (l) this.i;
        long jD = lVar.f4795g.d() + this.f4787h;
        S2.h hVar = (S2.h) lVar.f4791c;
        L2.i iVar = (L2.i) this.f4788j;
        hVar.getClass();
        hVar.k(new S2.e(jD, iVar));
        return null;
    }
}

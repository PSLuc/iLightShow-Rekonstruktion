package S2;

import R2.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d, T2.b, c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I2.b f5001m = new I2.b("proto");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f5002h;
    public final U2.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U2.a f5003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f5004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p079o4.a f5005l;

    public h(U2.a aVar, U2.a aVar2, a aVar3, j jVar, p079o4.a aVar4) {
        this.f5002h = jVar;
        this.i = aVar;
        this.f5003j = aVar2;
        this.f5004k = aVar3;
        this.f5005l = aVar4;
    }

    public static String C(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f4994a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object D(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, L2.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f3065a, String.valueOf(V2.a.a(iVar.f3067c))));
        byte[] bArr = iVar.f3066b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase b() {
        j jVar = this.f5002h;
        Objects.requireNonNull(jVar);
        U2.a aVar = this.f5003j;
        long jD = aVar.d();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar.d() >= ((long) this.f5004k.f4991c) + jD) {
                    throw new SynchronizationException("Timed out while trying to open db.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5002h.close();
    }

    public final Object k(f fVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList o(SQLiteDatabase sQLiteDatabase, L2.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, iVar);
        if (lC == null) {
            return arrayList;
        }
        D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", AccountsQueryParameters.CODE, "inline"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new Q2.a(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void s(long j4, O2.c cVar, String str) {
        k(new k(j4, str, cVar));
    }

    public final Object v(T2.a aVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        U2.a aVar2 = this.f5003j;
        long jD = aVar2.d();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objExecute = aVar.execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (aVar2.d() >= ((long) this.f5004k.f4991c) + jD) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}

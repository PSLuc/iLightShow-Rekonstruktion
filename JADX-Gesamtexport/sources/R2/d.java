package R2;

import S1.h0;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.d f4770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4771c;

    public d(Context context, S2.d dVar, b bVar) {
        this.f4769a = context;
        this.f4770b = dVar;
        this.f4771c = bVar;
    }

    public final void a(L2.i iVar, int i, boolean z5) {
        Context context = this.f4769a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f3065a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        I2.c cVar = iVar.f3067c;
        adler32.update(byteBufferAllocate.putInt(V2.a.a(cVar)).array());
        byte[] bArr = iVar.f3066b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z5) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i3 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i3 < i) {
                        break;
                    }
                    h0.j("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseB = ((S2.h) this.f4770b).b();
        String strValueOf = String.valueOf(V2.a.a(cVar));
        String str = iVar.f3065a;
        Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f4771c;
            builder.setMinimumLatency(bVar.a(cVar, jLongValue, i));
            Set set = ((c) bVar.f4765b.get(cVar)).f4768c;
            if (set.contains(e.f4772h)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f4773j)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.i)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", V2.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(cVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}

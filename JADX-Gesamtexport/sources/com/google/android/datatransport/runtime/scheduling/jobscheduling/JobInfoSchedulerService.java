package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B.C0031p0;
import I1.g;
import L2.i;
import L2.q;
import R2.f;
import R2.l;
import V2.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7773h = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        C0031p0 c0031p0A = i.a();
        c0031p0A.t(string);
        c0031p0A.f395k = a.b(i);
        if (string2 != null) {
            c0031p0A.f394j = Base64.decode(string2, 0);
        }
        l lVar = q.a().f3084d;
        i iVarB = c0031p0A.b();
        g gVar = new g(this, 1, jobParameters);
        lVar.getClass();
        lVar.f4793e.execute(new f(lVar, iVarB, i3, gVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

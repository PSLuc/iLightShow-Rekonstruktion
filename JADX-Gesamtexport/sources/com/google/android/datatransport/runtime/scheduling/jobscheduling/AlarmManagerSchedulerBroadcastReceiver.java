package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B.C0031p0;
import L2.i;
import L2.q;
import R2.f;
import R2.l;
import V2.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7772a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        q.b(context);
        C0031p0 c0031p0A = i.a();
        c0031p0A.t(queryParameter);
        c0031p0A.f395k = a.b(iIntValue);
        if (queryParameter2 != null) {
            c0031p0A.f394j = Base64.decode(queryParameter2, 0);
        }
        l lVar = q.a().f3084d;
        i iVarB = c0031p0A.b();
        R2.a aVar = new R2.a();
        lVar.getClass();
        lVar.f4793e.execute(new f(lVar, iVarB, i, aVar));
    }
}

package com.nanjoran.ilightshow.Services;

import N.C0217h0;
import android.widget.Toast;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8231h;
    public final /* synthetic */ C0 i;

    public /* synthetic */ A0(C0 c6, int i) {
        this.f8231h = i;
        this.i = c6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8231h) {
            case 0:
                C0 c6 = this.i;
                E4.k.f("this$0", c6);
                C0217h0 c0217h0 = c6.f8245h;
                if (!((Boolean) c0217h0.getValue()).booleanValue()) {
                    if (c6.f8239b != null) {
                        Long l6 = c6.f8240c;
                        if ((l6 != null ? l6.longValue() : 0L) > p012c.k.o()) {
                        }
                    }
                    String str = (String) c6.f8242e.getValue();
                    if (str != null) {
                        Boolean bool = Boolean.TRUE;
                        c0217h0.setValue(bool);
                        p120w2.a aVar = p120w2.a.f13456b;
                        List listM = p089q4.m.M(new p084p4.h("grant_type", "refresh_token"), new p084p4.h("refresh_token", str), new p084p4.h("generate_ils_token", bool));
                        String str2 = C0.f8235k;
                        aVar.getClass();
                        E4.k.f("path", str2);
                        p126x2.r rVar = aVar.f13457a;
                        rVar.getClass();
                        rVar.b(p126x2.u.POST, str2, listM).r(new AuthRequest.Deserializer(), new B0(1, c6));
                        break;
                    }
                }
                break;
            default:
                C0 c7 = this.i;
                E4.k.f("this$0", c7);
                Toast.makeText(c7.f8238a, "Oops, an error occured.", 0).show();
                break;
        }
    }
}

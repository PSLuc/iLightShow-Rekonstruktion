package p066m3;

import O1.C0308a;
import com.google.android.gms.internal.play_billing.AbstractBinderC0560e;
import p060l3.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractBinderC0560e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0308a f10414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f10416d;

    public e(f fVar, b bVar) {
        C0308a c0308a = new C0308a("OnRequestInstallCallback");
        this.f10416d = fVar;
        super(3);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f10414b = c0308a;
        this.f10415c = bVar;
    }
}

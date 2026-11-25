package N3;

import P4.InterfaceC0335w;
import android.content.Context;
import android.net.Uri;
import com.nanjoran.ilightshow.Services.AbstractC0697x;
import com.nanjoran.ilightshow.Services.AppConfigWrapper;
import com.nanjoran.ilightshow.Services.News;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f4030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ defpackage.t f4031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Context context, defpackage.t tVar, p111u4.d dVar) {
        super(2, dVar);
        this.f4030l = context;
        this.f4031m = tVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new L0(this.f4030l, this.f4031m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        L0 l6 = (L0) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        l6.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        News news;
        News news2;
        AppConfigWrapper appConfigWrapperA;
        News news3;
        News news4;
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        AppConfigWrapper appConfigWrapperA2 = AbstractC0697x.a();
        String url = (appConfigWrapperA2 == null || (news4 = appConfigWrapperA2.getNews()) == null) ? null : news4.getUrl();
        if (url != null) {
            AppConfigWrapper appConfigWrapperA3 = AbstractC0697x.a();
            defpackage.t tVar = this.f4031m;
            if (appConfigWrapperA3 == null || (news2 = appConfigWrapperA3.getNews()) == null || ((Number) tVar.a(P0.f4082a[0])).intValue() != news2.getNewsID() || ((appConfigWrapperA = AbstractC0697x.a()) != null && (news3 = appConfigWrapperA.getNews()) != null && !news3.getTemporary())) {
                AppConfigWrapper appConfigWrapperA4 = AbstractC0697x.a();
                tVar.b(P0.f4082a[0], Integer.valueOf((appConfigWrapperA4 == null || (news = appConfigWrapperA4.getNews()) == null) ? 0 : news.getNewsID()));
                new N.P(2).a().u(this.f4030l, Uri.parse(url));
            }
        }
        return p084p4.x.f10867a;
    }
}

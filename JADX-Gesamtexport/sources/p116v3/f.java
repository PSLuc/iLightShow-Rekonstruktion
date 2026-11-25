package p116v3;

import com.google.gson.internal.Excluder;
import java.io.IOException;
import p105t3.C;
import p105t3.m;
import p132y3.a;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C f13257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f13260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f13261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Excluder f13262f;

    public f(Excluder excluder, boolean z5, boolean z6, m mVar, a aVar) {
        this.f13262f = excluder;
        this.f13258b = z5;
        this.f13259c = z6;
        this.f13260d = mVar;
        this.f13261e = aVar;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (this.f13258b) {
            aVar.m0();
            return null;
        }
        C cH = this.f13257a;
        if (cH == null) {
            cH = this.f13260d.h(this.f13262f, this.f13261e);
            this.f13257a = cH;
        }
        return cH.a(aVar);
    }

    @Override // p105t3.C
    public final void b(c cVar, Object obj) throws IOException {
        if (this.f13259c) {
            cVar.G();
            return;
        }
        C cH = this.f13257a;
        if (cH == null) {
            cH = this.f13260d.h(this.f13262f, this.f13261e);
            this.f13257a = cH;
        }
        cH.b(cVar, obj);
    }
}

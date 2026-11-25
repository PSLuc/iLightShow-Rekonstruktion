package W;

import B.C0031p0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f5510h;
    public final /* synthetic */ l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f5511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f5512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object[] f5514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, l lVar, i iVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f5510h = bVar;
        this.i = lVar;
        this.f5511j = iVar;
        this.f5512k = str;
        this.f5513l = obj;
        this.f5514m = objArr;
    }

    @Override // D4.a
    public final Object invoke() throws IllegalAccessException, IOException, InvocationTargetException {
        boolean z5;
        b bVar = this.f5510h;
        i iVar = bVar.i;
        i iVar2 = this.f5511j;
        boolean z6 = true;
        if (iVar != iVar2) {
            bVar.i = iVar2;
            z5 = true;
        } else {
            z5 = false;
        }
        String str = bVar.f5516j;
        String str2 = this.f5512k;
        if (E4.k.a(str, str2)) {
            z6 = z5;
        } else {
            bVar.f5516j = str2;
        }
        bVar.f5515h = this.i;
        bVar.f5517k = this.f5513l;
        bVar.f5518l = this.f5514m;
        C0031p0 c0031p0 = bVar.f5519m;
        if (c0031p0 != null && z6) {
            c0031p0.y();
            bVar.f5519m = null;
            bVar.c();
        }
        return x.f10867a;
    }
}

package M2;

import D.x;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3487c;

    public f(Context context, d dVar) {
        x xVar = new x(context);
        this.f3487c = new HashMap();
        this.f3485a = xVar;
        this.f3486b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f3487c.containsKey(str)) {
            return (g) this.f3487c.get(str);
        }
        CctBackendFactory cctBackendFactoryK = this.f3485a.k(str);
        if (cctBackendFactoryK == null) {
            return null;
        }
        d dVar = this.f3486b;
        g gVarCreate = cctBackendFactoryK.create(new b(dVar.f3481a, dVar.f3482b, dVar.f3483c, str));
        this.f3487c.put(str, gVarCreate);
        return gVarCreate;
    }
}

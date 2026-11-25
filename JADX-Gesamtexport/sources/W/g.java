package W;

import B.C0026n;
import B.d1;
import D.x;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f5528d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5530b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f5531c;

    static {
        d dVar = d.i;
        e eVar = e.i;
        x xVar = m.f5538a;
        f5528d = new x(dVar, 19, eVar);
    }

    public g(Map map) {
        this.f5529a = map;
    }

    public final void a(UUID uuid, V.a aVar, C0230o c0230o, int i) {
        int i3;
        c0230o.X(-1198538093);
        if ((i & 6) == 0) {
            i3 = (c0230o.h(uuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.h(this) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.Y(uuid);
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (objK == obj) {
                i iVar = this.f5531c;
                if (!(iVar != null ? iVar.a(uuid) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + uuid + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objK = new f(this, uuid);
                c0230o.f0(objK);
            }
            f fVar = (f) objK;
            C0208d.a(k.f5537a.a(fVar.f5527c), aVar, c0230o, (i3 & 112) | 8);
            p084p4.x xVar = p084p4.x.f10867a;
            boolean zH = c0230o.h(this) | c0230o.h(uuid) | c0230o.h(fVar);
            Object objK2 = c0230o.K();
            if (zH || objK2 == obj) {
                objK2 = new C0026n(this, uuid, fVar, 4);
                c0230o.f0(objK2);
            }
            C0208d.c(xVar, (D4.c) objK2, c0230o);
            if (c0230o.f3767x && c0230o.f3738F.i == c0230o.f3768y) {
                c0230o.f3768y = -1;
                c0230o.f3767x = false;
            }
            c0230o.p(false);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(this, uuid, aVar, i, 4);
        }
    }
}

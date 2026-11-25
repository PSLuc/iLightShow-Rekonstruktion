package M3;

import java.lang.ref.WeakReference;
import java.net.DatagramSocket;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public final class c extends K3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p110u3.a(serialize = false)
    public h f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p110u3.a(serialize = false)
    public f f3492b;

    @Override // K3.a
    public final void disconnect() {
        h hVar = this.f3491a;
        if (hVar != null) {
            try {
                DatagramSocket datagramSocket = hVar.f3518s;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
            } catch (Exception unused) {
            }
            hVar.f3518s = null;
        }
        f fVar = this.f3492b;
        if (fVar != null) {
            try {
                DatagramSocket datagramSocket2 = fVar.f3507s;
                if (datagramSocket2 != null) {
                    datagramSocket2.close();
                }
            } catch (Exception unused2) {
            }
            fVar.f3507s = null;
        }
    }

    @Override // K3.a
    public final ArrayList getLights() {
        ArrayList arrayList = new ArrayList();
        if (this.type == K3.d.f2135l) {
            f fVar = this.f3492b;
            if (fVar != null && fVar.f3504p == K3.b.f2128h) {
                fVar.f805g = new WeakReference(this);
                arrayList.add(fVar);
                return arrayList;
            }
        } else {
            h hVar = this.f3491a;
            if (hVar != null && getState() == K3.b.f2128h) {
                hVar.f805g = new WeakReference(this);
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    @Override // K3.a
    public final K3.b getState() {
        K3.b bVar;
        if (this.type == K3.d.f2135l) {
            f fVar = this.f3492b;
            return (fVar == null || (bVar = fVar.f3504p) == null) ? K3.b.i : bVar;
        }
        h hVar = this.f3491a;
        return hVar != null ? hVar.f3515p : K3.b.i;
    }

    @Override // K3.a
    public final void signup() {
        try {
            if (this.type == K3.d.f2135l) {
                f fVar = this.f3492b;
                if (fVar == null) {
                    return;
                }
                String str = fVar.f3500l;
                Integer num = fVar.f3501m;
                if (str == null || num == null) {
                    return;
                }
                f.f3499u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/new").post(RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), "")).build()).enqueue(new e(fVar, 2));
            } else {
                h hVar = this.f3491a;
                if (hVar == null) {
                    hVar = null;
                }
                if (hVar == null) {
                    return;
                }
                String str2 = hVar.f3511l;
                Integer num2 = hVar.f3512m;
                String str3 = "http://" + str2 + ":" + num2 + "/api/v1/new";
                if (str2 == null || num2 == null) {
                } else {
                    h.f3510u.newCall(new Request.Builder().url(str3).post(RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), "")).build()).enqueue(new g(hVar, 1));
                }
            }
        } catch (Exception unused) {
        }
    }
}

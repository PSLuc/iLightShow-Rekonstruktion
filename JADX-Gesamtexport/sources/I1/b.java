package I1;

import android.content.res.AssetManager;
import android.os.Build;
import com.spotify.protocol.WampClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f1818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f1819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1820h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f1813a = false;
        this.f1815c = executor;
        this.f1816d = eVar;
        this.f1819g = str;
        this.f1818f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = f.f1833e;
                    break;
                case 31:
                case 32:
                case WampClient.RequestType.SUBSCRIBED /* 33 */:
                case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                    bArr = f.f1832d;
                    break;
            }
        }
        this.f1814b = bArr;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void b(byte[] bArr) {
        byte[] bArr2 = this.f1814b;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        this.f1814b = null;
        ((p009b2.a) this.f1817e).f7056a.set(3, bArr);
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.f1815c).execute(new a(i, 0, this, serializable));
    }

    public b(p009b2.a aVar, V1.c cVar, boolean z5) {
        this.f1817e = aVar;
        this.f1815c = cVar;
        this.f1816d = cVar.f5493h;
        this.f1813a = z5;
    }
}

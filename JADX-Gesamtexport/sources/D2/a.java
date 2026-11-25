package D2;

import D4.e;
import E4.k;
import E4.l;
import java.net.HttpURLConnection;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f758h;
    public final /* synthetic */ HttpURLConnection i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(HttpURLConnection httpURLConnection, int i) {
        super(2);
        this.f758h = i;
        this.i = httpURLConnection;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f758h) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                k.f("key", str);
                k.f("values", str2);
                this.i.setRequestProperty(str, str2);
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                k.f("key", str3);
                k.f("value", str4);
                this.i.addRequestProperty(str3, str4);
                break;
        }
        return x.f10867a;
    }
}

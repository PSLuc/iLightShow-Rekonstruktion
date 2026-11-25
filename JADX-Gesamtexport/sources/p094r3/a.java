package p094r3;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import p083p3.c;
import p083p3.d;
import p099s3.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11760a;

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f11760a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                d dVar = (d) obj2;
                dVar.d(e.f12200g, entry.getKey());
                dVar.d(e.f12201h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}

package p094r3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p083p3.e;
import p083p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f11762a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f11762a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // p083p3.a
    public final void a(Object obj, Object obj2) {
        ((f) obj2).b(f11762a.format((Date) obj));
    }
}

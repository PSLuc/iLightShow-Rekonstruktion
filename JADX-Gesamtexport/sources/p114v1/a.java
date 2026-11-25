package p114v1;

import D4.c;
import E4.k;
import E4.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13203h = new a(1);

    @Override // D4.c
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        k.f("entry", entry);
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            k.f("<this>", bArr);
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i = 0;
            for (byte b6 : bArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b6));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
            k.e("toString(...)", strValueOf);
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f13210a + " = " + strValueOf;
    }
}

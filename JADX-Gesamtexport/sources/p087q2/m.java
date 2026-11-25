package p087q2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f11222h = new m();

    public static t a(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? t.i : new t(str);
    }
}

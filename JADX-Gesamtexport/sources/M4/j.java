package M4;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Pattern f3545h;

    public j(String str) {
        Pattern patternCompile = Pattern.compile(str);
        E4.k.e("compile(...)", patternCompile);
        this.f3545h = patternCompile;
    }

    public final String toString() {
        String string = this.f3545h.toString();
        E4.k.e("toString(...)", string);
        return string;
    }
}

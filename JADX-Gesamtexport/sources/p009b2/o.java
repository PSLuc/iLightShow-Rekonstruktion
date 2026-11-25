package p009b2;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}

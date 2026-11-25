package androidx.profileinstaller;

import I1.g;
import I1.j;
import K1.b;
import Z2.f;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // K1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // K1.b
    public final Object b(Context context) {
        j.a(new g(this, 0, context.getApplicationContext()));
        return new f(3, false);
    }
}

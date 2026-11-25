package H0;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i, int i3) {
        builder.setLineBreakConfig(D.j.c().setLineBreakStyle(i).setLineBreakWordStyle(i3).build());
    }
}

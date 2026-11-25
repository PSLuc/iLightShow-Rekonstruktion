package p002a1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f6139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f6140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6141c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f6139a = colorStateList;
        this.f6140b = configuration;
        this.f6141c = theme == null ? 0 : theme.hashCode();
    }
}

package K;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class A extends RippleDrawable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1947h;
    public p035g0.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f1948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1949k;

    public A(boolean z5) {
        super(ColorStateList.valueOf(-16777216), null, z5 ? new ColorDrawable(-1) : null);
        this.f1947h = z5;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1947h) {
            this.f1949k = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1949k = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1949k;
    }
}

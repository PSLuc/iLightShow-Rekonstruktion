package p057l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f10040a;

    public C0777a(ActionBarContainer actionBarContainer) {
        this.f10040a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f10040a;
        if (actionBarContainer.f6411n) {
            Drawable drawable = actionBarContainer.f6410m;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f6408k;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f6409l;
        if (drawable3 == null || !actionBarContainer.f6412o) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f10040a;
        if (actionBarContainer.f6411n) {
            if (actionBarContainer.f6410m != null) {
                actionBarContainer.f6408k.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f6408k;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

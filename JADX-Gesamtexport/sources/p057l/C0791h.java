package p057l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.nanjoran.ilightshow.R;
import p052k.a;

/* JADX INFO: renamed from: l.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0791h extends r implements InterfaceC0795j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0793i f10072k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791h(C0793i c0793i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f10072k = c0793i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        M0.a(this, getContentDescription());
        setOnTouchListener(new a(this, this));
    }

    @Override // p057l.InterfaceC0795j
    public final boolean b() {
        return false;
    }

    @Override // p057l.InterfaceC0795j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f10072k.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i3, int i6, int i7) {
        boolean frame = super.setFrame(i, i3, i6, i7);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            p014c1.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}

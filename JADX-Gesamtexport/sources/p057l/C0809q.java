package p057l;

import F.C0068j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.nanjoran.ilightshow.R;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: l.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0809q extends ImageButton {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0803n f10135h;
    public final C0068j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10136j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809q(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        A0.a(context);
        this.f10136j = false;
        z0.a(this, getContext());
        C0803n c0803n = new C0803n(this);
        this.f10135h = c0803n;
        c0803n.b(null, R.attr.toolbarNavigationButtonStyle);
        C0068j c0068j = new C0068j(this);
        this.i = c0068j;
        c0068j.g(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803n c0803n = this.f10135h;
        if (c0803n != null) {
            c0803n.a();
        }
        C0068j c0068j = this.i;
        if (c0068j != null) {
            c0068j.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0 b6;
        C0803n c0803n = this.f10135h;
        if (c0803n == null || (b6 = c0803n.f10125e) == null) {
            return null;
        }
        return (ColorStateList) b6.f9967c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0 b6;
        C0803n c0803n = this.f10135h;
        if (c0803n == null || (b6 = c0803n.f10125e) == null) {
            return null;
        }
        return (PorterDuff.Mode) b6.f9968d;
    }

    public ColorStateList getSupportImageTintList() {
        B0 b6;
        C0068j c0068j = this.i;
        if (c0068j == null || (b6 = (B0) c0068j.f1184d) == null) {
            return null;
        }
        return (ColorStateList) b6.f9967c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        B0 b6;
        C0068j c0068j = this.i;
        if (c0068j == null || (b6 = (B0) c0068j.f1184d) == null) {
            return null;
        }
        return (PorterDuff.Mode) b6.f9968d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.i.f1183c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803n c0803n = this.f10135h;
        if (c0803n != null) {
            c0803n.f10123c = -1;
            c0803n.d(null);
            c0803n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803n c0803n = this.f10135h;
        if (c0803n != null) {
            c0803n.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0068j c0068j = this.i;
        if (c0068j != null) {
            c0068j.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0068j c0068j = this.i;
        if (c0068j != null && drawable != null && !this.f10136j) {
            c0068j.f1182b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0068j != null) {
            c0068j.c();
            if (this.f10136j) {
                return;
            }
            ImageView imageView = (ImageView) c0068j.f1183c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0068j.f1182b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f10136j = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0068j c0068j = this.i;
        ImageView imageView = (ImageView) c0068j.f1183c;
        if (i != 0) {
            Drawable drawableZ = AbstractC0473d.z(imageView.getContext(), i);
            if (drawableZ != null) {
                H.a(drawableZ);
            }
            imageView.setImageDrawable(drawableZ);
        } else {
            imageView.setImageDrawable(null);
        }
        c0068j.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0068j c0068j = this.i;
        if (c0068j != null) {
            c0068j.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803n c0803n = this.f10135h;
        if (c0803n != null) {
            c0803n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803n c0803n = this.f10135h;
        if (c0803n != null) {
            c0803n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0068j c0068j = this.i;
        if (c0068j != null) {
            if (((B0) c0068j.f1184d) == null) {
                c0068j.f1184d = new B0();
            }
            B0 b6 = (B0) c0068j.f1184d;
            b6.f9967c = colorStateList;
            b6.f9966b = true;
            c0068j.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0068j c0068j = this.i;
        if (c0068j != null) {
            if (((B0) c0068j.f1184d) == null) {
                c0068j.f1184d = new B0();
            }
            B0 b6 = (B0) c0068j.f1184d;
            b6.f9968d = mode;
            b6.f9965a = true;
            c0068j.c();
        }
    }
}

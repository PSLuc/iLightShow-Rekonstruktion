package K;

import B.C0043w;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class r extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f2012m = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f2013n = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A f2014h;
    public Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f2015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I3.a f2016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0043w f2017l;

    private final void setRippleState(boolean z5) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f2016k;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l6 = this.f2015j;
        long jLongValue = jCurrentAnimationTimeMillis - (l6 != null ? l6.longValue() : 0L);
        if (z5 || jLongValue >= 5) {
            int[] iArr = z5 ? f2012m : f2013n;
            A a6 = this.f2014h;
            if (a6 != null) {
                a6.setState(iArr);
            }
        } else {
            I3.a aVar = new I3.a(2, this);
            this.f2016k = aVar;
            postDelayed(aVar, 50L);
        }
        this.f2015j = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(r rVar) {
        A a6 = rVar.f2014h;
        if (a6 != null) {
            a6.setState(f2013n);
        }
        rVar.f2016k = null;
    }

    public final void b(p117w.o oVar, boolean z5, long j4, int i, long j6, float f6, C0043w c0043w) {
        if (this.f2014h == null || !Boolean.valueOf(z5).equals(this.i)) {
            A a6 = new A(z5);
            setBackground(a6);
            this.f2014h = a6;
            this.i = Boolean.valueOf(z5);
        }
        A a7 = this.f2014h;
        E4.k.c(a7);
        this.f2017l = c0043w;
        e(j4, i, j6, f6);
        if (z5) {
            a7.setHotspot(p030f0.c.d(oVar.f13394a), p030f0.c.e(oVar.f13394a));
        } else {
            a7.setHotspot(a7.getBounds().centerX(), a7.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f2017l = null;
        I3.a aVar = this.f2016k;
        if (aVar != null) {
            removeCallbacks(aVar);
            I3.a aVar2 = this.f2016k;
            E4.k.c(aVar2);
            aVar2.run();
        } else {
            A a6 = this.f2014h;
            if (a6 != null) {
                a6.setState(f2013n);
            }
        }
        A a7 = this.f2014h;
        if (a7 == null) {
            return;
        }
        a7.setVisible(false, false);
        unscheduleDrawable(a7);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j4, int i, long j6, float f6) {
        A a6 = this.f2014h;
        if (a6 == null) {
            return;
        }
        Integer num = a6.f1948j;
        if (num == null || num.intValue() != i) {
            a6.f1948j = Integer.valueOf(i);
            z.f2035a.a(a6, i);
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        long jB = p035g0.r.b(f6, j6);
        p035g0.r rVar = a6.i;
        if (!(rVar == null ? false : p035g0.r.c(rVar.f9087a, jB))) {
            a6.i = new p035g0.r(jB);
            a6.setColor(ColorStateList.valueOf(H.v(jB)));
        }
        Rect rect = new Rect(0, 0, G4.a.D(p030f0.f.d(j4)), G4.a.D(p030f0.f.b(j4)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        a6.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws IllegalAccessException, IOException, InvocationTargetException {
        C0043w c0043w = this.f2017l;
        if (c0043w != null) {
            c0043w.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}

package p070n1;

import L2.o;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p057l.N;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f10518y = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f10519h;
    public final AccelerateInterpolator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ListView f10520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f10521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f10522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f10523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f10526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f10527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f10528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10531u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10532v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final N f10534x;

    public e(N n6) {
        a aVar = new a();
        aVar.f10514e = Long.MIN_VALUE;
        aVar.f10516g = -1L;
        aVar.f10515f = 0L;
        this.f10519h = aVar;
        this.i = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f10522l = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f10523m = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f10526p = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f10527q = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f10528r = fArr5;
        this.f10520j = n6;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f10524n = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f10525o = f10518y;
        aVar.f10510a = 500;
        aVar.f10511b = 500;
        this.f10534x = n6;
    }

    public static float b(float f6, float f7, float f8) {
        if (f6 > f8) {
            return f8;
        }
        return f6 < f7 ? f7 : f6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f6, float f7, float f8) {
        float fB;
        float interpolation;
        float fB2 = b(this.f10522l[i] * f7, 0.0f, this.f10523m[i]);
        float fC = c(f7 - f6, fB2) - c(f6, fB2);
        AccelerateInterpolator accelerateInterpolator = this.i;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f9 = this.f10526p[i];
            float f10 = this.f10527q[i];
            float f11 = this.f10528r[i];
            float f12 = f9 * f8;
            return fB > 0.0f ? b(fB * f12, f10, f11) : -b((-fB) * f12, f10, f11);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f10526p[i];
        float f14 = this.f10527q[i];
        float f15 = this.f10528r[i];
        float f16 = f13 * f8;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f6, float f7) {
        if (f7 != 0.0f) {
            int i = this.f10524n;
            if (i == 0 || i == 1) {
                if (f6 < f7) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f7);
                    }
                    if (this.f10532v && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f6 < 0.0f) {
                return f6 / (-f7);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f10530t) {
            this.f10532v = false;
            return;
        }
        a aVar = this.f10519h;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f10514e);
        int i6 = aVar.f10511b;
        if (i3 > i6) {
            i = i6;
        } else if (i3 >= 0) {
            i = i3;
        }
        aVar.i = i;
        aVar.f10517h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f10516g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        N n6;
        int count;
        a aVar = this.f10519h;
        float f6 = aVar.f10513d;
        int iAbs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f10512c);
        if (iAbs != 0 && (count = (n6 = this.f10534x).getCount()) != 0) {
            int childCount = n6.getChildCount();
            int firstVisiblePosition = n6.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && n6.getChildAt(0).getTop() >= 0)) : !(i >= count && n6.getChildAt(childCount - 1).getBottom() <= n6.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f10533w
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f10531u = r2
            r7.f10529s = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f10520j
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            n1.a r9 = r7.f10519h
            r9.f10512c = r0
            r9.f10513d = r8
            boolean r8 = r7.f10532v
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            L2.o r8 = r7.f10521k
            if (r8 != 0) goto L62
            L2.o r8 = new L2.o
            r9 = 8
            r8.<init>(r9, r7)
            r7.f10521k = r8
        L62:
            r7.f10532v = r2
            r7.f10530t = r2
            boolean r8 = r7.f10529s
            if (r8 != 0) goto L77
            int r8 = r7.f10525o
            if (r8 <= 0) goto L77
            L2.o r9 = r7.f10521k
            long r5 = (long) r8
            i1.q r8 = p045i1.A.f9394a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            L2.o r8 = r7.f10521k
            r8.run()
        L7c:
            r7.f10529s = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p070n1.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

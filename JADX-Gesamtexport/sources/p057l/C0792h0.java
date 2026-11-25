package p057l;

import A0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.nanjoran.ilightshow.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p080p.F;
import p080p.l;
import p080p.m;
import p085q.a;

/* JADX INFO: renamed from: l.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0792h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0792h0 f10074g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f10076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f10077b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f10078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f10080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f10073f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0790g0 f10075h = new C0790g0(6);

    public static synchronized C0792h0 b() {
        try {
            if (f10074g == null) {
                f10074g = new C0792h0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10074g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0790g0 c0790g0 = f10075h;
        c0790g0.getClass();
        int i3 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0790g0.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        Object obj;
        if (this.f10078c == null) {
            this.f10078c = new TypedValue();
        }
        TypedValue typedValue = this.f10078c;
        context.getResources().getValue(i, typedValue, true);
        long j4 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            l lVar = (l) this.f10077b.get(context);
            drawableNewDrawable = null;
            if (lVar != null) {
                int iB = a.b(lVar.i, lVar.f10742k, j4);
                if (iB < 0 || (obj = lVar.f10741j[iB]) == m.f10743a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        lVar.c(j4);
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableF = null;
        if (this.f10080e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableF = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165210)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableF = b.F(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableF = b.F(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableF = b.F(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableF == null) {
            return layerDrawableF;
        }
        layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableF.getConstantState();
                if (constantState2 != null) {
                    l lVar2 = (l) this.f10077b.get(context);
                    if (lVar2 == null) {
                        lVar2 = new l((Object) null);
                        this.f10077b.put(context, lVar2);
                    }
                    lVar2.b(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableF;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable drawableA;
        try {
            if (!this.f10079d) {
                this.f10079d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof M1.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f10079d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = Z0.a.b(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, drawableA);
            }
            if (drawableA != null) {
                H.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        F f6;
        WeakHashMap weakHashMap = this.f10076a;
        ColorStateList colorStateListG = null;
        colorStateList = (weakHashMap == null || (f6 = (F) weakHashMap.get(context)) == null) ? null : (ColorStateList) f6.c(i);
        if (colorStateList == null) {
            b bVar = this.f10080e;
            if (bVar != null) {
                colorStateListG = bVar.G(context, i);
            }
            if (colorStateListG != null) {
                if (this.f10076a == null) {
                    this.f10076a = new WeakHashMap();
                }
                F f7 = (F) this.f10076a.get(context);
                if (f7 == null) {
                    f7 = new F(0);
                    this.f10076a.put(context, f7);
                }
                f7.a(i, colorStateListG);
            }
            colorStateList = colorStateListG;
        }
        return colorStateList;
    }

    public final Drawable g(Context context, int i, Drawable drawable) {
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterE;
        int i3 = R.attr.colorControlNormal;
        ColorStateList colorStateListF = f(context, i);
        if (colorStateListF != null) {
            int[] iArr = H.f9980a;
            Drawable drawableMutate = drawable.mutate();
            p014c1.a.h(drawableMutate, colorStateListF);
            PorterDuff.Mode mode = null;
            if (this.f10080e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                p014c1.a.i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        if (this.f10080e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = z0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0805o.f10128b;
                b.H(drawableFindDrawableByLayerId, iC, mode2);
                b.H(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), z0.c(context, R.attr.colorControlNormal), mode2);
                b.H(layerDrawable.findDrawableByLayerId(android.R.id.progress), z0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = z0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0805o.f10128b;
                b.H(drawableFindDrawableByLayerId2, iB, mode3);
                b.H(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), z0.c(context, R.attr.colorControlActivated), mode3);
                b.H(layerDrawable2.findDrawableByLayerId(android.R.id.progress), z0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        b bVar = this.f10080e;
        boolean z5 = false;
        if (bVar != null) {
            PorterDuff.Mode mode4 = C0805o.f10128b;
            if (b.C((int[]) bVar.f8a, i)) {
                z5 = true;
                iRound = -1;
            } else {
                if (b.C((int[]) bVar.f10c, i)) {
                    i3 = R.attr.colorControlActivated;
                } else {
                    boolean zC = b.C((int[]) bVar.f11d, i);
                    i3 = android.R.attr.colorBackground;
                    if (zC) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131165230) {
                        iRound = Math.round(40.8f);
                        i3 = android.R.attr.colorForeground;
                        z5 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            i3 = 0;
                        }
                        iRound = -1;
                    }
                }
                z5 = true;
                iRound = -1;
            }
            if (z5) {
                int[] iArr2 = H.f9980a;
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = z0.c(context, i3);
                synchronized (C0805o.class) {
                    porterDuffColorFilterE = e(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterE);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
            }
        }
        return drawable;
    }
}

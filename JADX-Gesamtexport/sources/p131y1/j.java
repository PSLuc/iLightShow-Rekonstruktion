package p131y1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p119w1.h;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f14591a;

    public j(TransformationMethod transformationMethod) {
        this.f14591a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f14591a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || h.a().b() != 1) {
            return charSequence;
        }
        h hVarA = h.a();
        hVarA.getClass();
        return hVarA.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f14591a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i, rect);
        }
    }
}

package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Area;

/* JADX INFO: loaded from: classes.dex */
public class AreaEffect extends ColorAnimationEffect {
    static final boolean HAS_OPACITY_BOUND_TO_INTENSITY_DEFAULT = false;

    public AreaEffect() {
        super(WrapperObject.Scope.Internal);
        create("", 0, false);
    }

    public final native void addArea(Area area);

    public native void create(String str, int i, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.ColorAnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native void setArea(Area area);

    public AreaEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i, false);
    }

    public AreaEffect(String str, int i, boolean z5) {
        super(WrapperObject.Scope.Internal);
        create(str, i, z5);
    }

    public AreaEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}

package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnimationEffect extends Effect {
    public AnimationEffect(AnimationEffectDelegate animationEffectDelegate) {
        super(WrapperObject.Scope.Internal);
        if (animationEffectDelegate == null) {
            throw new IllegalArgumentException("Not valid delegate object!");
        }
        create("", 0, animationEffectDelegate);
    }

    public native void create(String str, int i, AnimationEffectDelegate animationEffectDelegate);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native List<Animation> getAnimations();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public native EffectDelegate getDelegate();

    public final native double getLength();

    public final native boolean isEndless();

    public final native void setSpeedAnimation(Animation animation);

    public AnimationEffect(String str, int i, AnimationEffectDelegate animationEffectDelegate) {
        super(WrapperObject.Scope.Internal);
        if (animationEffectDelegate != null) {
            create(str, i, animationEffectDelegate);
            return;
        }
        throw new IllegalArgumentException("Not valid delegate object!");
    }

    public AnimationEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}

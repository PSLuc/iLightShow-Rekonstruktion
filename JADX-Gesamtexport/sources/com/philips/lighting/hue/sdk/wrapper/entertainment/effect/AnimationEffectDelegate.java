package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.entertainment.animation.Animation;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface AnimationEffectDelegate extends AnimationEffectRenderDelegate {
    List<Animation> getAnimations(AnimationEffect animationEffect);
}

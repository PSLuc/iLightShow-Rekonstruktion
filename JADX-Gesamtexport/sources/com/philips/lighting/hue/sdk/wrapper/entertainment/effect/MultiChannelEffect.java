package com.philips.lighting.hue.sdk.wrapper.entertainment.effect;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.Channel;

/* JADX INFO: loaded from: classes.dex */
public class MultiChannelEffect extends AnimationEffect {
    public MultiChannelEffect() {
        super(WrapperObject.Scope.Internal);
        create("", 0);
    }

    public final native void addChannel(Channel channel);

    public final native void clear();

    public native void create(String str, int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect, com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public MultiChannelEffect(String str, int i) {
        super(WrapperObject.Scope.Internal);
        create(str, i);
    }

    public MultiChannelEffect(WrapperObject.Scope scope) {
        super(scope);
    }
}

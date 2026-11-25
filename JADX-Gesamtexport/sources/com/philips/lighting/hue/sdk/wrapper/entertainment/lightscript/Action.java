package com.philips.lighting.hue.sdk.wrapper.entertainment.lightscript;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.entertainment.effect.AnimationEffect;
import com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect;
import com.philips.lighting.hue.sdk.wrapper.entertainment.effect.EffectDelegate;

/* JADX INFO: loaded from: classes.dex */
public class Action extends Effect {
    static final long AUTOMATICALLY_DETERMINED_ENDPOSITION = -1;

    public Action() {
        super(WrapperObject.Scope.Internal);
        create();
    }

    public native void create();

    public native void create(String str, int i, AnimationEffect animationEffect, long j4, long j6);

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect, com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect
    public EffectDelegate getDelegate() {
        return null;
    }

    public final native AnimationEffect getEffect();

    public final native long getEndPosition();

    public final native long getStartPosition();

    public final native void setEffect(AnimationEffect animationEffect);

    public final native void setEndPosition(long j4);

    public final native void setStartPosition(long j4);

    public Action(String str, int i, AnimationEffect animationEffect, long j4) {
        super(WrapperObject.Scope.Internal);
        create(str, i, animationEffect, j4, AUTOMATICALLY_DETERMINED_ENDPOSITION);
    }

    public Action(String str, int i, AnimationEffect animationEffect, long j4, long j6) {
        super(WrapperObject.Scope.Internal);
        create(str, i, animationEffect, j4, j6);
    }

    public Action(WrapperObject.Scope scope) {
        super(scope);
    }
}

package com.nanjoran.ilightshow.Views;

import G4.a;
import Y4.d;
import c5.Y;
import java.lang.annotation.Annotation;
import p084p4.f;
import p084p4.g;

/* JADX INFO: loaded from: classes.dex */
@d
public final class SettingsScreenRoute {
    public static final int $stable = 0;
    public static final SettingsScreenRoute INSTANCE = new SettingsScreenRoute();
    private static final /* synthetic */ f $cachedSerializer$delegate = a.y(g.f10847h, new H3.g(20));

    private SettingsScreenRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Y4.a _init_$_anonymous_() {
        return new Y("com.nanjoran.ilightshow.Views.SettingsScreenRoute", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ Y4.a get$cachedSerializer() {
        return (Y4.a) $cachedSerializer$delegate.getValue();
    }

    public final Y4.a serializer() {
        return get$cachedSerializer();
    }
}

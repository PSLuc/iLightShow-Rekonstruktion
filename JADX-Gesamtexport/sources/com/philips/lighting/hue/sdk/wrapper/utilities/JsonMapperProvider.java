package com.philips.lighting.hue.sdk.wrapper.utilities;

import p015c2.D;
import p015c2.u;

/* JADX INFO: loaded from: classes.dex */
public final class JsonMapperProvider {
    private static u jsonMapper;

    static {
        u uVar = new u();
        uVar.i(D.INDENT_OUTPUT, true);
        jsonMapper = uVar;
    }

    private JsonMapperProvider() {
    }

    public static u getJsonMapper() {
        return jsonMapper;
    }
}

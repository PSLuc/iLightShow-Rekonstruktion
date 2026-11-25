package com.nanjoran.ilightshow.utils;

import java.util.HashMap;
import java.util.Locale;
import p105t3.C;
import p105t3.D;
import p105t3.m;
import p132y3.a;

/* JADX INFO: loaded from: classes.dex */
public class LowercaseEnumTypeAdapterFactory implements D {
    @Override // p105t3.D
    public final C a(m mVar, a aVar) {
        Class rawType = aVar.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        HashMap map = new HashMap();
        for (Object obj : rawType.getEnumConstants()) {
            map.put(obj.toString().toLowerCase(Locale.US), obj);
        }
        return new P3.a(this, map);
    }
}

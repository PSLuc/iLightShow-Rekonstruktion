package com.nanjoran.ilightshow.Model.Data;

import E4.k;
import S1.V;
import p084p4.j;
import p105t3.m;

/* JADX INFO: loaded from: classes.dex */
public final class AuthRequestKt {
    public static final boolean isSpotifyInvalidGrant(int i, String str) {
        Object objV;
        k.f("responseBody", str);
        if (i != 400) {
            return false;
        }
        try {
            SpotifyTokenErrorResponse spotifyTokenErrorResponse = (SpotifyTokenErrorResponse) new m().d(str, SpotifyTokenErrorResponse.class);
            objV = Boolean.valueOf(k.a(spotifyTokenErrorResponse != null ? spotifyTokenErrorResponse.getError() : null, "invalid_grant"));
        } catch (Throwable th) {
            objV = V.v(th);
        }
        Object obj = Boolean.FALSE;
        if (objV instanceof j) {
            objV = obj;
        }
        return ((Boolean) objV).booleanValue();
    }
}

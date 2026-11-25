package com.nanjoran.ilightshow.Model.Data;

import B.AbstractC0013g0;
import E4.k;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class SpotifyTokenErrorResponse {
    public static final int $stable = 0;
    private final String error;

    public SpotifyTokenErrorResponse(String str) {
        this.error = str;
    }

    public static /* synthetic */ SpotifyTokenErrorResponse copy$default(SpotifyTokenErrorResponse spotifyTokenErrorResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyTokenErrorResponse.error;
        }
        return spotifyTokenErrorResponse.copy(str);
    }

    public final String component1() {
        return this.error;
    }

    public final SpotifyTokenErrorResponse copy(String str) {
        return new SpotifyTokenErrorResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpotifyTokenErrorResponse) && k.a(this.error, ((SpotifyTokenErrorResponse) obj).error);
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        String str = this.error;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC0013g0.i("SpotifyTokenErrorResponse(error=", this.error, ")");
    }
}

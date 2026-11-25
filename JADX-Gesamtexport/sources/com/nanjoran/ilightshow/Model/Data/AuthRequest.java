package com.nanjoran.ilightshow.Model.Data;

import B.AbstractC0013g0;
import E4.k;
import androidx.annotation.Keep;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.io.InputStream;
import java.io.Reader;
import p020d2.n;
import p105t3.m;
import p126x2.A;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class AuthRequest {
    public static final int $stable = 0;
    private final String access_token;
    private final String ils_access_token;
    private final String refresh_token;

    public static final class Deserializer implements A {
        public static final int $stable = 0;

        @Override // p126x2.A
        public AuthRequest deserialize(Reader reader) {
            k.f("reader", reader);
            return null;
        }

        @Override // p126x2.A
        public AuthRequest deserialize(InputStream inputStream) {
            k.f("inputStream", inputStream);
            return null;
        }

        @Override // p126x2.h
        public AuthRequest deserialize(z zVar) {
            return (AuthRequest) n.p(this, zVar);
        }

        @Override // p126x2.A
        public AuthRequest deserialize(byte[] bArr) {
            k.f("bytes", bArr);
            return null;
        }

        @Override // p126x2.A
        public AuthRequest deserialize(String str) {
            k.f("content", str);
            return (AuthRequest) new m().d(str, AuthRequest.class);
        }
    }

    public AuthRequest(String str, String str2, String str3) {
        k.f(AccountsQueryParameters.ACCESS_TOKEN, str);
        this.access_token = str;
        this.refresh_token = str2;
        this.ils_access_token = str3;
    }

    public static /* synthetic */ AuthRequest copy$default(AuthRequest authRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authRequest.access_token;
        }
        if ((i & 2) != 0) {
            str2 = authRequest.refresh_token;
        }
        if ((i & 4) != 0) {
            str3 = authRequest.ils_access_token;
        }
        return authRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.refresh_token;
    }

    public final String component3() {
        return this.ils_access_token;
    }

    public final AuthRequest copy(String str, String str2, String str3) {
        k.f(AccountsQueryParameters.ACCESS_TOKEN, str);
        return new AuthRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRequest)) {
            return false;
        }
        AuthRequest authRequest = (AuthRequest) obj;
        return k.a(this.access_token, authRequest.access_token) && k.a(this.refresh_token, authRequest.refresh_token) && k.a(this.ils_access_token, authRequest.ils_access_token);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getIls_access_token() {
        return this.ils_access_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        int iHashCode = this.access_token.hashCode() * 31;
        String str = this.refresh_token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ils_access_token;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.access_token;
        String str2 = this.refresh_token;
        return p012c.k.u(AbstractC0013g0.o("AuthRequest(access_token=", str, ", refresh_token=", str2, ", ils_access_token="), this.ils_access_token, ")");
    }
}

package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0359v;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import p012c.k;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class UserStatus implements Item {
    public static final int STATUS_CODE_NOT_LOGGED_IN = 1;
    public static final int STATUS_CODE_OK = 0;

    @c(AccountsQueryParameters.CODE)
    @I(AccountsQueryParameters.CODE)
    public final int code;

    @c("long_text")
    @I("long_text")
    public final String longMessage;

    @c("short_text")
    @I("short_text")
    public final String shortMessage;

    private UserStatus() {
        this(1, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStatus)) {
            return false;
        }
        UserStatus userStatus = (UserStatus) obj;
        if (this.code != userStatus.code) {
            return false;
        }
        String str = this.shortMessage;
        if (str == null ? userStatus.shortMessage != null : !str.equals(userStatus.shortMessage)) {
            return false;
        }
        String str2 = this.longMessage;
        if (str2 != null) {
            return str2.equals(userStatus.longMessage);
        }
        return userStatus.longMessage == null;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.shortMessage;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.longMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @InterfaceC0359v
    public boolean isLoggedIn() {
        return this.code == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserStatus{code=");
        sb.append(this.code);
        sb.append(", shortMessage='");
        sb.append(this.shortMessage);
        sb.append("', longMessage='");
        return k.u(sb, this.longMessage, "'}");
    }

    public UserStatus(int i, String str, String str2) {
        this.code = i;
        this.shortMessage = str;
        this.longMessage = str2;
    }
}

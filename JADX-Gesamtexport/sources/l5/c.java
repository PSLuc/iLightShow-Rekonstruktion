package l5;

import B.AbstractC0013g0;
import java.security.Principal;
import m5.s;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10393d;

    public c(boolean z5, String str, String str2, String str3, b bVar) {
        this.f10390a = z5;
        this.f10391b = str;
        this.f10392c = str2;
        this.f10393d = str3;
    }

    @Override // l5.a
    public final Principal a(b bVar) {
        return new c(this.f10390a, this.f10391b, this.f10392c, this.f10393d, bVar);
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        String str = ((c) obj).f10393d;
        String str2 = this.f10393d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.f10393d;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return this.f10393d.hashCode();
    }

    @Override // java.security.Principal
    public final String toString() {
        boolean z5 = this.f10390a;
        String str = this.f10392c;
        if (!z5) {
            return AbstractC0013g0.i("PreSharedKey Identity [identity: ", str, "]");
        }
        return "PreSharedKey Identity [virtual host: " + this.f10391b + ", identity: " + str + "]";
    }

    public c(String str, String str2, boolean z5) {
        super(null);
        if (str2 != null) {
            this.f10390a = z5;
            if (z5) {
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    this.f10391b = null;
                } else if (s.f10492a.matcher(str).matches()) {
                    String lowerCase = str.toLowerCase();
                    this.f10391b = lowerCase;
                    sb.append(lowerCase);
                } else {
                    throw new IllegalArgumentException("virtual host is not a valid hostname");
                }
                this.f10393d = k.u(sb, ":", str2);
            } else if (str == null) {
                this.f10391b = null;
                this.f10393d = str2;
            } else {
                throw new IllegalArgumentException("virtual host is not supported, if sni is disabled");
            }
            this.f10392c = str2;
            return;
        }
        throw new NullPointerException("Identity must not be null");
    }
}

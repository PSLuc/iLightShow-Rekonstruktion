package com.nanjoran.ilightshow.Services.Analytics;

import B.AbstractC0013g0;
import E4.k;
import G3.b;
import Y4.a;
import Y4.d;
import a5.g;
import c5.AbstractC0476a0;
import c5.C0479c;
import c5.k0;
import c5.p0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.Set;
import okhttp3.internal.http2.Http2;
import p081p0.c;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@d
public final class AppContext {
    public static final int $stable = 8;
    private String app_build_number;
    private String app_version;
    private int app_version_major;
    private int app_version_minor;
    private int app_version_patch;
    private String country_code;
    private String device_id;
    private String locale;
    private String os_name;
    private String os_version;
    private int os_version_major;
    private int os_version_minor;
    private int os_version_patch;
    private String session_id;
    private String timezone;
    private String user_id;
    private Set<String> user_tags;
    public static final b Companion = new b();
    private static final a[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C0479c(p0.f7477a, 2)};

    public /* synthetic */ AppContext(int i, String str, String str2, String str3, String str4, String str5, int i3, int i6, int i7, String str6, String str7, int i8, int i9, int i10, String str8, String str9, String str10, Set set, k0 k0Var) {
        if (131071 != (i & 131071)) {
            AbstractC0476a0.j(i, 131071, G3.a.f1686a.getDescriptor());
            throw null;
        }
        this.user_id = str;
        this.device_id = str2;
        this.session_id = str3;
        this.os_name = str4;
        this.os_version = str5;
        this.os_version_major = i3;
        this.os_version_minor = i6;
        this.os_version_patch = i7;
        this.locale = str6;
        this.app_version = str7;
        this.app_version_major = i8;
        this.app_version_minor = i9;
        this.app_version_patch = i10;
        this.app_build_number = str8;
        this.country_code = str9;
        this.timezone = str10;
        this.user_tags = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppContext copy$default(AppContext appContext, String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set set, int i10, Object obj) {
        Set set2;
        String str11;
        String str12 = (i10 & 1) != 0 ? appContext.user_id : str;
        String str13 = (i10 & 2) != 0 ? appContext.device_id : str2;
        String str14 = (i10 & 4) != 0 ? appContext.session_id : str3;
        String str15 = (i10 & 8) != 0 ? appContext.os_name : str4;
        String str16 = (i10 & 16) != 0 ? appContext.os_version : str5;
        int i11 = (i10 & 32) != 0 ? appContext.os_version_major : i;
        int i12 = (i10 & 64) != 0 ? appContext.os_version_minor : i3;
        int i13 = (i10 & 128) != 0 ? appContext.os_version_patch : i6;
        String str17 = (i10 & HueLog.LogComponent.STREAMDTLS) != 0 ? appContext.locale : str6;
        String str18 = (i10 & HueLog.LogComponent.APPCORE) != 0 ? appContext.app_version : str7;
        int i14 = (i10 & 1024) != 0 ? appContext.app_version_major : i7;
        int i15 = (i10 & 2048) != 0 ? appContext.app_version_minor : i8;
        int i16 = (i10 & 4096) != 0 ? appContext.app_version_patch : i9;
        String str19 = (i10 & 8192) != 0 ? appContext.app_build_number : str8;
        String str20 = str12;
        String str21 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appContext.country_code : str9;
        String str22 = (i10 & 32768) != 0 ? appContext.timezone : str10;
        if ((i10 & 65536) != 0) {
            str11 = str22;
            set2 = appContext.user_tags;
        } else {
            set2 = set;
            str11 = str22;
        }
        return appContext.copy(str20, str13, str14, str15, str16, i11, i12, i13, str17, str18, i14, i15, i16, str19, str21, str11, set2);
    }

    public static final /* synthetic */ void write$Self$app_release(AppContext appContext, b5.b bVar, g gVar) {
        a[] aVarArr = $childSerializers;
        c cVar = (c) bVar;
        cVar.g0(gVar, 0, appContext.user_id);
        cVar.g0(gVar, 1, appContext.device_id);
        cVar.g0(gVar, 2, appContext.session_id);
        cVar.g0(gVar, 3, appContext.os_name);
        cVar.g0(gVar, 4, appContext.os_version);
        cVar.d0(5, appContext.os_version_major, gVar);
        cVar.d0(6, appContext.os_version_minor, gVar);
        cVar.d0(7, appContext.os_version_patch, gVar);
        cVar.g0(gVar, 8, appContext.locale);
        cVar.g0(gVar, 9, appContext.app_version);
        cVar.d0(10, appContext.app_version_major, gVar);
        cVar.d0(11, appContext.app_version_minor, gVar);
        cVar.d0(12, appContext.app_version_patch, gVar);
        cVar.g0(gVar, 13, appContext.app_build_number);
        cVar.g0(gVar, 14, appContext.country_code);
        cVar.g0(gVar, 15, appContext.timezone);
        cVar.f0(gVar, 16, aVarArr[16], appContext.user_tags);
    }

    public final String component1() {
        return this.user_id;
    }

    public final String component10() {
        return this.app_version;
    }

    public final int component11() {
        return this.app_version_major;
    }

    public final int component12() {
        return this.app_version_minor;
    }

    public final int component13() {
        return this.app_version_patch;
    }

    public final String component14() {
        return this.app_build_number;
    }

    public final String component15() {
        return this.country_code;
    }

    public final String component16() {
        return this.timezone;
    }

    public final Set<String> component17() {
        return this.user_tags;
    }

    public final String component2() {
        return this.device_id;
    }

    public final String component3() {
        return this.session_id;
    }

    public final String component4() {
        return this.os_name;
    }

    public final String component5() {
        return this.os_version;
    }

    public final int component6() {
        return this.os_version_major;
    }

    public final int component7() {
        return this.os_version_minor;
    }

    public final int component8() {
        return this.os_version_patch;
    }

    public final String component9() {
        return this.locale;
    }

    public final AppContext copy(String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set<String> set) {
        k.f("user_id", str);
        k.f("device_id", str2);
        k.f("session_id", str3);
        k.f("os_name", str4);
        k.f("os_version", str5);
        k.f("locale", str6);
        k.f("app_version", str7);
        k.f("app_build_number", str8);
        k.f("country_code", str9);
        k.f("timezone", str10);
        k.f("user_tags", set);
        return new AppContext(str, str2, str3, str4, str5, i, i3, i6, str6, str7, i7, i8, i9, str8, str9, str10, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContext)) {
            return false;
        }
        AppContext appContext = (AppContext) obj;
        return k.a(this.user_id, appContext.user_id) && k.a(this.device_id, appContext.device_id) && k.a(this.session_id, appContext.session_id) && k.a(this.os_name, appContext.os_name) && k.a(this.os_version, appContext.os_version) && this.os_version_major == appContext.os_version_major && this.os_version_minor == appContext.os_version_minor && this.os_version_patch == appContext.os_version_patch && k.a(this.locale, appContext.locale) && k.a(this.app_version, appContext.app_version) && this.app_version_major == appContext.app_version_major && this.app_version_minor == appContext.app_version_minor && this.app_version_patch == appContext.app_version_patch && k.a(this.app_build_number, appContext.app_build_number) && k.a(this.country_code, appContext.country_code) && k.a(this.timezone, appContext.timezone) && k.a(this.user_tags, appContext.user_tags);
    }

    public final String getApp_build_number() {
        return this.app_build_number;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final int getApp_version_major() {
        return this.app_version_major;
    }

    public final int getApp_version_minor() {
        return this.app_version_minor;
    }

    public final int getApp_version_patch() {
        return this.app_version_patch;
    }

    public final String getCountry_code() {
        return this.country_code;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOs_name() {
        return this.os_name;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final int getOs_version_major() {
        return this.os_version_major;
    }

    public final int getOs_version_minor() {
        return this.os_version_minor;
    }

    public final int getOs_version_patch() {
        return this.os_version_patch;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final Set<String> getUser_tags() {
        return this.user_tags;
    }

    public int hashCode() {
        return this.user_tags.hashCode() + AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0916i.c(this.app_version_patch, AbstractC0916i.c(this.app_version_minor, AbstractC0916i.c(this.app_version_major, AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0916i.c(this.os_version_patch, AbstractC0916i.c(this.os_version_minor, AbstractC0916i.c(this.os_version_major, AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(this.user_id.hashCode() * 31, this.device_id, 31), this.session_id, 31), this.os_name, 31), this.os_version, 31), 31), 31), 31), this.locale, 31), this.app_version, 31), 31), 31), 31), this.app_build_number, 31), this.country_code, 31), this.timezone, 31);
    }

    public final void setApp_build_number(String str) {
        k.f("<set-?>", str);
        this.app_build_number = str;
    }

    public final void setApp_version(String str) {
        k.f("<set-?>", str);
        this.app_version = str;
    }

    public final void setApp_version_major(int i) {
        this.app_version_major = i;
    }

    public final void setApp_version_minor(int i) {
        this.app_version_minor = i;
    }

    public final void setApp_version_patch(int i) {
        this.app_version_patch = i;
    }

    public final void setCountry_code(String str) {
        k.f("<set-?>", str);
        this.country_code = str;
    }

    public final void setDevice_id(String str) {
        k.f("<set-?>", str);
        this.device_id = str;
    }

    public final void setLocale(String str) {
        k.f("<set-?>", str);
        this.locale = str;
    }

    public final void setOs_name(String str) {
        k.f("<set-?>", str);
        this.os_name = str;
    }

    public final void setOs_version(String str) {
        k.f("<set-?>", str);
        this.os_version = str;
    }

    public final void setOs_version_major(int i) {
        this.os_version_major = i;
    }

    public final void setOs_version_minor(int i) {
        this.os_version_minor = i;
    }

    public final void setOs_version_patch(int i) {
        this.os_version_patch = i;
    }

    public final void setSession_id(String str) {
        k.f("<set-?>", str);
        this.session_id = str;
    }

    public final void setTimezone(String str) {
        k.f("<set-?>", str);
        this.timezone = str;
    }

    public final void setUser_id(String str) {
        k.f("<set-?>", str);
        this.user_id = str;
    }

    public final void setUser_tags(Set<String> set) {
        k.f("<set-?>", set);
        this.user_tags = set;
    }

    public String toString() {
        String str = this.user_id;
        String str2 = this.device_id;
        String str3 = this.session_id;
        String str4 = this.os_name;
        String str5 = this.os_version;
        int i = this.os_version_major;
        int i3 = this.os_version_minor;
        int i6 = this.os_version_patch;
        String str6 = this.locale;
        String str7 = this.app_version;
        int i7 = this.app_version_major;
        int i8 = this.app_version_minor;
        int i9 = this.app_version_patch;
        String str8 = this.app_build_number;
        String str9 = this.country_code;
        String str10 = this.timezone;
        Set<String> set = this.user_tags;
        StringBuilder sbO = AbstractC0013g0.o("AppContext(user_id=", str, ", device_id=", str2, ", session_id=");
        AbstractC0013g0.t(sbO, str3, ", os_name=", str4, ", os_version=");
        sbO.append(str5);
        sbO.append(", os_version_major=");
        sbO.append(i);
        sbO.append(", os_version_minor=");
        sbO.append(i3);
        sbO.append(", os_version_patch=");
        sbO.append(i6);
        sbO.append(", locale=");
        AbstractC0013g0.t(sbO, str6, ", app_version=", str7, ", app_version_major=");
        sbO.append(i7);
        sbO.append(", app_version_minor=");
        sbO.append(i8);
        sbO.append(", app_version_patch=");
        AbstractC0013g0.s(sbO, i9, ", app_build_number=", str8, ", country_code=");
        AbstractC0013g0.t(sbO, str9, ", timezone=", str10, ", user_tags=");
        sbO.append(set);
        sbO.append(")");
        return sbO.toString();
    }

    public AppContext(String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set<String> set) {
        k.f("user_id", str);
        k.f("device_id", str2);
        k.f("session_id", str3);
        k.f("os_name", str4);
        k.f("os_version", str5);
        k.f("locale", str6);
        k.f("app_version", str7);
        k.f("app_build_number", str8);
        k.f("country_code", str9);
        k.f("timezone", str10);
        k.f("user_tags", set);
        this.user_id = str;
        this.device_id = str2;
        this.session_id = str3;
        this.os_name = str4;
        this.os_version = str5;
        this.os_version_major = i;
        this.os_version_minor = i3;
        this.os_version_patch = i6;
        this.locale = str6;
        this.app_version = str7;
        this.app_version_major = i7;
        this.app_version_minor = i8;
        this.app_version_patch = i9;
        this.app_build_number = str8;
        this.country_code = str9;
        this.timezone = str10;
        this.user_tags = set;
    }
}

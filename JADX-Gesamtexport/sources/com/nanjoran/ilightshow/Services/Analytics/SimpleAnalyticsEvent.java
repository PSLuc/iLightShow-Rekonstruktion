package com.nanjoran.ilightshow.Services.Analytics;

import B.AbstractC0013g0;
import E4.k;
import G3.c;
import Y4.a;
import Y4.d;
import a5.g;
import b5.b;
import c5.AbstractC0476a0;
import c5.B;
import c5.C0479c;
import c5.E;
import c5.k0;
import c5.p0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.http2.Http2;
import p089q4.v;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@d
public final class SimpleAnalyticsEvent {
    private static final a[] $childSerializers;
    public static final int $stable = 8;
    public static final G3.d Companion = new G3.d();
    private String app_build_number;
    private String app_version;
    private int app_version_major;
    private int app_version_minor;
    private int app_version_patch;
    private String country_code;
    private String device_id;
    private Float event_float_value;
    private String event_name;
    private String event_string_value;
    private Map<String, Float> float_props;
    private String locale;
    private String os_name;
    private String os_version;
    private int os_version_major;
    private int os_version_minor;
    private int os_version_patch;
    private String session_id;
    private Map<String, String> string_props;
    private long timestamp;
    private String timezone;
    private String user_id;
    private Set<String> user_tags;

    static {
        p0 p0Var = p0.f7477a;
        $childSerializers = new a[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C0479c(p0Var, 2), null, null, null, new E(p0Var, p0Var, 1), new E(p0Var, B.f7379a, 1)};
    }

    public /* synthetic */ SimpleAnalyticsEvent(int i, long j4, String str, String str2, String str3, String str4, String str5, int i3, int i6, int i7, String str6, String str7, int i8, int i9, int i10, String str8, String str9, String str10, Set set, String str11, Float f6, String str12, Map map, Map map2, k0 k0Var) {
        if (524287 != (i & 524287)) {
            AbstractC0476a0.j(i, 524287, c.f1687a.getDescriptor());
            throw null;
        }
        this.timestamp = j4;
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
        this.event_name = str11;
        if ((524288 & i) == 0) {
            this.event_float_value = null;
        } else {
            this.event_float_value = f6;
        }
        if ((1048576 & i) == 0) {
            this.event_string_value = null;
        } else {
            this.event_string_value = str12;
        }
        int i11 = 2097152 & i;
        v vVar = v.f11238h;
        if (i11 == 0) {
            this.string_props = vVar;
        } else {
            this.string_props = map;
        }
        if ((i & 4194304) == 0) {
            this.float_props = vVar;
        } else {
            this.float_props = map2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleAnalyticsEvent copy$default(SimpleAnalyticsEvent simpleAnalyticsEvent, long j4, String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set set, String str11, Float f6, String str12, Map map, Map map2, int i10, Object obj) {
        Map map3;
        Map map4;
        long j6 = (i10 & 1) != 0 ? simpleAnalyticsEvent.timestamp : j4;
        String str13 = (i10 & 2) != 0 ? simpleAnalyticsEvent.user_id : str;
        String str14 = (i10 & 4) != 0 ? simpleAnalyticsEvent.device_id : str2;
        String str15 = (i10 & 8) != 0 ? simpleAnalyticsEvent.session_id : str3;
        String str16 = (i10 & 16) != 0 ? simpleAnalyticsEvent.os_name : str4;
        String str17 = (i10 & 32) != 0 ? simpleAnalyticsEvent.os_version : str5;
        int i11 = (i10 & 64) != 0 ? simpleAnalyticsEvent.os_version_major : i;
        int i12 = (i10 & 128) != 0 ? simpleAnalyticsEvent.os_version_minor : i3;
        int i13 = (i10 & HueLog.LogComponent.STREAMDTLS) != 0 ? simpleAnalyticsEvent.os_version_patch : i6;
        String str18 = (i10 & HueLog.LogComponent.APPCORE) != 0 ? simpleAnalyticsEvent.locale : str6;
        String str19 = (i10 & 1024) != 0 ? simpleAnalyticsEvent.app_version : str7;
        int i14 = (i10 & 2048) != 0 ? simpleAnalyticsEvent.app_version_major : i7;
        int i15 = (i10 & 4096) != 0 ? simpleAnalyticsEvent.app_version_minor : i8;
        long j7 = j6;
        int i16 = (i10 & 8192) != 0 ? simpleAnalyticsEvent.app_version_patch : i9;
        String str20 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? simpleAnalyticsEvent.app_build_number : str8;
        String str21 = (i10 & 32768) != 0 ? simpleAnalyticsEvent.country_code : str9;
        String str22 = (i10 & 65536) != 0 ? simpleAnalyticsEvent.timezone : str10;
        Set set2 = (i10 & 131072) != 0 ? simpleAnalyticsEvent.user_tags : set;
        String str23 = (i10 & 262144) != 0 ? simpleAnalyticsEvent.event_name : str11;
        Float f7 = (i10 & 524288) != 0 ? simpleAnalyticsEvent.event_float_value : f6;
        String str24 = (i10 & 1048576) != 0 ? simpleAnalyticsEvent.event_string_value : str12;
        Map map5 = (i10 & 2097152) != 0 ? simpleAnalyticsEvent.string_props : map;
        if ((i10 & 4194304) != 0) {
            map4 = map5;
            map3 = simpleAnalyticsEvent.float_props;
        } else {
            map3 = map2;
            map4 = map5;
        }
        return simpleAnalyticsEvent.copy(j7, str13, str14, str15, str16, str17, i11, i12, i13, str18, str19, i14, i15, i16, str20, str21, str22, set2, str23, f7, str24, map4, map3);
    }

    public static final /* synthetic */ void write$Self$app_release(SimpleAnalyticsEvent simpleAnalyticsEvent, b bVar, g gVar) {
        a[] aVarArr = $childSerializers;
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.e0(gVar, 0, simpleAnalyticsEvent.timestamp);
        cVar.g0(gVar, 1, simpleAnalyticsEvent.user_id);
        cVar.g0(gVar, 2, simpleAnalyticsEvent.device_id);
        cVar.g0(gVar, 3, simpleAnalyticsEvent.session_id);
        cVar.g0(gVar, 4, simpleAnalyticsEvent.os_name);
        cVar.g0(gVar, 5, simpleAnalyticsEvent.os_version);
        cVar.d0(6, simpleAnalyticsEvent.os_version_major, gVar);
        cVar.d0(7, simpleAnalyticsEvent.os_version_minor, gVar);
        cVar.d0(8, simpleAnalyticsEvent.os_version_patch, gVar);
        cVar.g0(gVar, 9, simpleAnalyticsEvent.locale);
        cVar.g0(gVar, 10, simpleAnalyticsEvent.app_version);
        cVar.d0(11, simpleAnalyticsEvent.app_version_major, gVar);
        cVar.d0(12, simpleAnalyticsEvent.app_version_minor, gVar);
        cVar.d0(13, simpleAnalyticsEvent.app_version_patch, gVar);
        cVar.g0(gVar, 14, simpleAnalyticsEvent.app_build_number);
        cVar.g0(gVar, 15, simpleAnalyticsEvent.country_code);
        cVar.g0(gVar, 16, simpleAnalyticsEvent.timezone);
        cVar.f0(gVar, 17, aVarArr[17], simpleAnalyticsEvent.user_tags);
        cVar.g0(gVar, 18, simpleAnalyticsEvent.event_name);
        if (cVar.p(gVar) || simpleAnalyticsEvent.event_float_value != null) {
            cVar.n(gVar, 19, B.f7379a, simpleAnalyticsEvent.event_float_value);
        }
        if (cVar.p(gVar) || simpleAnalyticsEvent.event_string_value != null) {
            cVar.n(gVar, 20, p0.f7477a, simpleAnalyticsEvent.event_string_value);
        }
        boolean zP = cVar.p(gVar);
        v vVar = v.f11238h;
        if (zP || !k.a(simpleAnalyticsEvent.string_props, vVar)) {
            cVar.f0(gVar, 21, aVarArr[21], simpleAnalyticsEvent.string_props);
        }
        if (!cVar.p(gVar) && k.a(simpleAnalyticsEvent.float_props, vVar)) {
            return;
        }
        cVar.f0(gVar, 22, aVarArr[22], simpleAnalyticsEvent.float_props);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component10() {
        return this.locale;
    }

    public final String component11() {
        return this.app_version;
    }

    public final int component12() {
        return this.app_version_major;
    }

    public final int component13() {
        return this.app_version_minor;
    }

    public final int component14() {
        return this.app_version_patch;
    }

    public final String component15() {
        return this.app_build_number;
    }

    public final String component16() {
        return this.country_code;
    }

    public final String component17() {
        return this.timezone;
    }

    public final Set<String> component18() {
        return this.user_tags;
    }

    public final String component19() {
        return this.event_name;
    }

    public final String component2() {
        return this.user_id;
    }

    public final Float component20() {
        return this.event_float_value;
    }

    public final String component21() {
        return this.event_string_value;
    }

    public final Map<String, String> component22() {
        return this.string_props;
    }

    public final Map<String, Float> component23() {
        return this.float_props;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.session_id;
    }

    public final String component5() {
        return this.os_name;
    }

    public final String component6() {
        return this.os_version;
    }

    public final int component7() {
        return this.os_version_major;
    }

    public final int component8() {
        return this.os_version_minor;
    }

    public final int component9() {
        return this.os_version_patch;
    }

    public final SimpleAnalyticsEvent copy(long j4, String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set<String> set, String str11, Float f6, String str12, Map<String, String> map, Map<String, Float> map2) {
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
        k.f("event_name", str11);
        k.f("string_props", map);
        k.f("float_props", map2);
        return new SimpleAnalyticsEvent(j4, str, str2, str3, str4, str5, i, i3, i6, str6, str7, i7, i8, i9, str8, str9, str10, set, str11, f6, str12, map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleAnalyticsEvent)) {
            return false;
        }
        SimpleAnalyticsEvent simpleAnalyticsEvent = (SimpleAnalyticsEvent) obj;
        return this.timestamp == simpleAnalyticsEvent.timestamp && k.a(this.user_id, simpleAnalyticsEvent.user_id) && k.a(this.device_id, simpleAnalyticsEvent.device_id) && k.a(this.session_id, simpleAnalyticsEvent.session_id) && k.a(this.os_name, simpleAnalyticsEvent.os_name) && k.a(this.os_version, simpleAnalyticsEvent.os_version) && this.os_version_major == simpleAnalyticsEvent.os_version_major && this.os_version_minor == simpleAnalyticsEvent.os_version_minor && this.os_version_patch == simpleAnalyticsEvent.os_version_patch && k.a(this.locale, simpleAnalyticsEvent.locale) && k.a(this.app_version, simpleAnalyticsEvent.app_version) && this.app_version_major == simpleAnalyticsEvent.app_version_major && this.app_version_minor == simpleAnalyticsEvent.app_version_minor && this.app_version_patch == simpleAnalyticsEvent.app_version_patch && k.a(this.app_build_number, simpleAnalyticsEvent.app_build_number) && k.a(this.country_code, simpleAnalyticsEvent.country_code) && k.a(this.timezone, simpleAnalyticsEvent.timezone) && k.a(this.user_tags, simpleAnalyticsEvent.user_tags) && k.a(this.event_name, simpleAnalyticsEvent.event_name) && k.a(this.event_float_value, simpleAnalyticsEvent.event_float_value) && k.a(this.event_string_value, simpleAnalyticsEvent.event_string_value) && k.a(this.string_props, simpleAnalyticsEvent.string_props) && k.a(this.float_props, simpleAnalyticsEvent.float_props);
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

    public final Float getEvent_float_value() {
        return this.event_float_value;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getEvent_string_value() {
        return this.event_string_value;
    }

    public final Map<String, Float> getFloat_props() {
        return this.float_props;
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

    public final Map<String, String> getString_props() {
        return this.string_props;
    }

    public final long getTimestamp() {
        return this.timestamp;
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
        int iC = AbstractC0013g0.c((this.user_tags.hashCode() + AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0916i.c(this.app_version_patch, AbstractC0916i.c(this.app_version_minor, AbstractC0916i.c(this.app_version_major, AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0916i.c(this.os_version_patch, AbstractC0916i.c(this.os_version_minor, AbstractC0916i.c(this.os_version_major, AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(AbstractC0013g0.c(Long.hashCode(this.timestamp) * 31, this.user_id, 31), this.device_id, 31), this.session_id, 31), this.os_name, 31), this.os_version, 31), 31), 31), 31), this.locale, 31), this.app_version, 31), 31), 31), 31), this.app_build_number, 31), this.country_code, 31), this.timezone, 31)) * 31, this.event_name, 31);
        Float f6 = this.event_float_value;
        int iHashCode = (iC + (f6 == null ? 0 : f6.hashCode())) * 31;
        String str = this.event_string_value;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        return this.float_props.hashCode() + ((this.string_props.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
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

    public final void setEvent_float_value(Float f6) {
        this.event_float_value = f6;
    }

    public final void setEvent_name(String str) {
        k.f("<set-?>", str);
        this.event_name = str;
    }

    public final void setEvent_string_value(String str) {
        this.event_string_value = str;
    }

    public final void setFloat_props(Map<String, Float> map) {
        k.f("<set-?>", map);
        this.float_props = map;
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

    public final void setString_props(Map<String, String> map) {
        k.f("<set-?>", map);
        this.string_props = map;
    }

    public final void setTimestamp(long j4) {
        this.timestamp = j4;
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
        long j4 = this.timestamp;
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
        String str11 = this.event_name;
        Float f6 = this.event_float_value;
        String str12 = this.event_string_value;
        Map<String, String> map = this.string_props;
        Map<String, Float> map2 = this.float_props;
        StringBuilder sb = new StringBuilder("SimpleAnalyticsEvent(timestamp=");
        sb.append(j4);
        sb.append(", user_id=");
        sb.append(str);
        AbstractC0013g0.t(sb, ", device_id=", str2, ", session_id=", str3);
        AbstractC0013g0.t(sb, ", os_name=", str4, ", os_version=", str5);
        sb.append(", os_version_major=");
        sb.append(i);
        sb.append(", os_version_minor=");
        sb.append(i3);
        sb.append(", os_version_patch=");
        sb.append(i6);
        sb.append(", locale=");
        sb.append(str6);
        sb.append(", app_version=");
        sb.append(str7);
        sb.append(", app_version_major=");
        sb.append(i7);
        sb.append(", app_version_minor=");
        sb.append(i8);
        sb.append(", app_version_patch=");
        sb.append(i9);
        AbstractC0013g0.t(sb, ", app_build_number=", str8, ", country_code=", str9);
        sb.append(", timezone=");
        sb.append(str10);
        sb.append(", user_tags=");
        sb.append(set);
        sb.append(", event_name=");
        sb.append(str11);
        sb.append(", event_float_value=");
        sb.append(f6);
        sb.append(", event_string_value=");
        sb.append(str12);
        sb.append(", string_props=");
        sb.append(map);
        sb.append(", float_props=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }

    public SimpleAnalyticsEvent(long j4, String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set<String> set, String str11, Float f6, String str12, Map<String, String> map, Map<String, Float> map2) {
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
        k.f("event_name", str11);
        k.f("string_props", map);
        k.f("float_props", map2);
        this.timestamp = j4;
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
        this.event_name = str11;
        this.event_float_value = f6;
        this.event_string_value = str12;
        this.string_props = map;
        this.float_props = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimpleAnalyticsEvent(long j4, String str, String str2, String str3, String str4, String str5, int i, int i3, int i6, String str6, String str7, int i7, int i8, int i9, String str8, String str9, String str10, Set set, String str11, Float f6, String str12, Map map, Map map2, int i10, E4.g gVar) {
        Float f7 = (i10 & 524288) != 0 ? null : f6;
        String str13 = (i10 & 1048576) != 0 ? null : str12;
        int i11 = i10 & 2097152;
        v vVar = v.f11238h;
        this(j4, str, str2, str3, str4, str5, i, i3, i6, str6, str7, i7, i8, i9, str8, str9, str10, set, str11, f7, str13, i11 != 0 ? vVar : map, (i10 & 4194304) != 0 ? vVar : map2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimpleAnalyticsEvent(AppContext appContext, long j4, String str, Float f6, String str2, Map map, Map map2, int i, E4.g gVar) {
        f6 = (i & 8) != 0 ? null : f6;
        str2 = (i & 16) != 0 ? null : str2;
        int i3 = i & 32;
        v vVar = v.f11238h;
        this(appContext, j4, str, f6, str2, i3 != 0 ? vVar : map, (i & 64) != 0 ? vVar : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleAnalyticsEvent(AppContext appContext, long j4, String str, Float f6, String str2, Map<String, String> map, Map<String, Float> map2) {
        this(j4, appContext.getUser_id(), appContext.getDevice_id(), appContext.getSession_id(), appContext.getOs_name(), appContext.getOs_version(), appContext.getOs_version_major(), appContext.getOs_version_minor(), appContext.getOs_version_patch(), appContext.getLocale(), appContext.getApp_version(), appContext.getApp_version_major(), appContext.getApp_version_minor(), appContext.getApp_version_patch(), appContext.getApp_build_number(), appContext.getCountry_code(), appContext.getTimezone(), appContext.getUser_tags(), str, f6, str2, map, map2);
        k.f("context", appContext);
        k.f("event_name", str);
        k.f("string_props", map);
        k.f("float_props", map2);
    }
}

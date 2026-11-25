package com.nanjoran.ilightshow.Services.lights.hue;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import Y4.d;
import b5.b;
import c5.AbstractC0476a0;
import c5.k0;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
@d
public final class HueBridgeConfigJSON {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bridgeid;
    private final String mac;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final Y4.a serializer() {
            return HueBridgeConfigJSON$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public /* synthetic */ HueBridgeConfigJSON(int i, String str, String str2, String str3, k0 k0Var) {
        if (7 != (i & 7)) {
            AbstractC0476a0.j(i, 7, HueBridgeConfigJSON$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.bridgeid = str2;
        this.mac = str3;
    }

    public static /* synthetic */ HueBridgeConfigJSON copy$default(HueBridgeConfigJSON hueBridgeConfigJSON, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hueBridgeConfigJSON.name;
        }
        if ((i & 2) != 0) {
            str2 = hueBridgeConfigJSON.bridgeid;
        }
        if ((i & 4) != 0) {
            str3 = hueBridgeConfigJSON.mac;
        }
        return hueBridgeConfigJSON.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(HueBridgeConfigJSON hueBridgeConfigJSON, b bVar, a5.g gVar) {
        c cVar = (c) bVar;
        cVar.g0(gVar, 0, hueBridgeConfigJSON.name);
        cVar.g0(gVar, 1, hueBridgeConfigJSON.bridgeid);
        cVar.g0(gVar, 2, hueBridgeConfigJSON.mac);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.bridgeid;
    }

    public final String component3() {
        return this.mac;
    }

    public final HueBridgeConfigJSON copy(String str, String str2, String str3) {
        k.f("name", str);
        k.f("bridgeid", str2);
        k.f("mac", str3);
        return new HueBridgeConfigJSON(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HueBridgeConfigJSON)) {
            return false;
        }
        HueBridgeConfigJSON hueBridgeConfigJSON = (HueBridgeConfigJSON) obj;
        return k.a(this.name, hueBridgeConfigJSON.name) && k.a(this.bridgeid, hueBridgeConfigJSON.bridgeid) && k.a(this.mac, hueBridgeConfigJSON.mac);
    }

    public final String getBridgeid() {
        return this.bridgeid;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.mac.hashCode() + AbstractC0013g0.c(this.name.hashCode() * 31, this.bridgeid, 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.bridgeid;
        return p012c.k.u(AbstractC0013g0.o("HueBridgeConfigJSON(name=", str, ", bridgeid=", str2, ", mac="), this.mac, ")");
    }

    public HueBridgeConfigJSON(String str, String str2, String str3) {
        k.f("name", str);
        k.f("bridgeid", str2);
        k.f("mac", str3);
        this.name = str;
        this.bridgeid = str2;
        this.mac = str3;
    }
}

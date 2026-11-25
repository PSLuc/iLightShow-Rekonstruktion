package com.nanjoran.ilightshow.Services.lights.hue;

import B.AbstractC0013g0;
import D3.b;
import D3.d;
import E4.g;
import E4.k;
import E4.w;
import F2.c;
import M4.l;
import S1.h0;
import android.graphics.Color;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorDef;
import com.nanjoran.ilightshow.Model.Presets.Palettes.ColorPalette;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.B0;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.Capabilities;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonGroup;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.LightsJSONValue;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.StateClass;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.Streaming;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.InputStream;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Semaphore;
import p000a.j;
import p015c2.AbstractC0473d;
import p020d2.n;
import p084p4.h;
import p084p4.q;
import p084p4.x;
import p089q4.u;
import p105t3.m;
import p126x2.A;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceHueBridge extends K3.a {
    private boolean connected;
    private j hueStream;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String TAG = "DeviceHueBridge";
    private ArrayList<D3.j> lightsArray = new ArrayList<>();
    private Integer maxStreamingLights = 10;
    private List<? extends D3.j> enabledStreamingLights = u.f11237h;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getDefaultClientName() {
            return "iLightShow#Android";
        }

        public final String getTAG() {
            return DeviceHueBridge.TAG;
        }

        public final h hueApiXy(D3.a aVar) {
            k.f("color", aVar);
            defpackage.k kVarR = h0.r(aVar);
            return rgb2xy(kVarR.f9797a, kVarR.f9798b, kVarR.f9799c);
        }

        public final h rgb2xy(double d6, double d7, double d8) {
            double dPow = d6 > 0.04045d ? Math.pow((d6 + 0.055d) / 1.055d, 2.4d) : d6 / 12.92d;
            double dPow2 = d7 > 0.04045d ? Math.pow((d7 + 0.055d) / 1.055d, 2.4d) : d7 / 12.92d;
            double dPow3 = d8 > 0.04045d ? Math.pow((d8 + 0.055d) / 1.055d, 2.4d) : d8 / 12.92d;
            double d9 = (0.197109d * dPow3) + (0.103455d * dPow2) + (0.649926d * dPow);
            double d10 = (0.022598d * dPow3) + (0.743075d * dPow2) + (0.234327d * dPow);
            double d11 = d9 + d10;
            double d12 = d11 + (dPow3 * 1.035763d) + (dPow2 * 0.053077d) + (dPow * 0.0d);
            return new h(Double.valueOf(d9 / d12), Double.valueOf(d10 / d12));
        }

        public final void setDefaultClientName(String str) {
            k.f("_", str);
        }

        public final void setTAG(String str) {
            k.f("<set-?>", str);
            DeviceHueBridge.TAG = str;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x send$lambda$7(c cVar) {
        k.f("it", cVar);
        Objects.toString(cVar.a());
        return x.f10867a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x signin$lambda$6(DeviceHueBridge deviceHueBridge, w wVar, p126x2.w wVar2, z zVar, c cVar) {
        k.f("this$0", deviceHueBridge);
        k.f("$newLights", wVar);
        k.f("<unused var>", wVar2);
        k.f("<unused var>", zVar);
        k.f("rsp", cVar);
        HueBridgeConfigJSON hueBridgeConfigJSON = (HueBridgeConfigJSON) cVar.a();
        if (hueBridgeConfigJSON != null) {
            deviceHueBridge.name = hueBridgeConfigJSON.getName();
            String lowerCase = hueBridgeConfigJSON.getBridgeid().toLowerCase(Locale.ROOT);
            k.e("toLowerCase(...)", lowerCase);
            deviceHueBridge.id = lowerCase;
            p126x2.w wVarB = DeviceHueBridgeKt.getUnsafeFuel().b(p126x2.u.GET, AbstractC0013g0.j("https://", deviceHueBridge.ip, "/api/", deviceHueBridge.token, "/lights"), null);
            a aVar = new a(deviceHueBridge, wVar, 0);
            final m mVar = new m();
            p137z2.a.e(wVarB, new A() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$lambda$6$$inlined$responseObject$1
                @Override // p126x2.A
                public HashMap<String, LightsJSONValue> deserialize(InputStream inputStream) {
                    k.f("inputStream", inputStream);
                    return null;
                }

                @Override // p126x2.A
                public HashMap<String, LightsJSONValue> deserialize(String str) {
                    k.f("content", str);
                    return null;
                }

                @Override // p126x2.A
                public HashMap<String, LightsJSONValue> deserialize(byte[] bArr) {
                    k.f("bytes", bArr);
                    return null;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.nanjoran.ilightshow.Services.lights.hue.huestream.LightsJSONValue>] */
                @Override // p126x2.h
                public HashMap<String, LightsJSONValue> deserialize(z zVar2) {
                    k.f(LoginActivity.RESPONSE_KEY, zVar2);
                    return n.p(this, zVar2);
                }

                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.nanjoran.ilightshow.Services.lights.hue.huestream.LightsJSONValue>] */
                @Override // p126x2.A
                public HashMap<String, LightsJSONValue> deserialize(Reader reader) {
                    k.f("reader", reader);
                    return mVar.b(reader, new p132y3.a<HashMap<String, LightsJSONValue>>() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$lambda$6$$inlined$responseObject$1.1
                    }.getType());
                }
            }, aVar);
        }
        return x.f10867a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x signin$lambda$6$lambda$5(DeviceHueBridge deviceHueBridge, w wVar, p126x2.w wVar2, z zVar, c cVar) {
        D3.j jVar;
        Streaming streaming;
        k.f("this$0", deviceHueBridge);
        k.f("$newLights", wVar);
        k.f("<unused var>", wVar2);
        k.f("<unused var>", zVar);
        k.f("rsp", cVar);
        DeviceDiscoveryHue.Companion.getTAG();
        HashMap map = (HashMap) cVar.a();
        x xVar = x.f10867a;
        if (map == null) {
            return xVar;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                p126x2.w wVarB = DeviceHueBridgeKt.getUnsafeFuel().b(p126x2.u.GET, AbstractC0013g0.j("https://", deviceHueBridge.ip, "/api/", deviceHueBridge.token, "/groups"), null);
                a aVar = new a(wVar, deviceHueBridge, 2);
                final m mVar = new m();
                p137z2.a.e(wVarB, new A() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$lambda$6$lambda$5$$inlined$responseObject$1
                    @Override // p126x2.A
                    public HashMap<String, HueJsonGroup> deserialize(InputStream inputStream) {
                        k.f("inputStream", inputStream);
                        return null;
                    }

                    @Override // p126x2.A
                    public HashMap<String, HueJsonGroup> deserialize(String str) {
                        k.f("content", str);
                        return null;
                    }

                    @Override // p126x2.A
                    public HashMap<String, HueJsonGroup> deserialize(byte[] bArr) {
                        k.f("bytes", bArr);
                        return null;
                    }

                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonGroup>] */
                    @Override // p126x2.h
                    public HashMap<String, HueJsonGroup> deserialize(z zVar2) {
                        k.f(LoginActivity.RESPONSE_KEY, zVar2);
                        return n.p(this, zVar2);
                    }

                    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonGroup>] */
                    @Override // p126x2.A
                    public HashMap<String, HueJsonGroup> deserialize(Reader reader) {
                        k.f("reader", reader);
                        return mVar.b(reader, new p132y3.a<HashMap<String, HueJsonGroup>>() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$lambda$6$lambda$5$$inlined$responseObject$1.1
                        }.getType());
                    }
                }, aVar);
                return xVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            LightsJSONValue lightsJSONValue = (LightsJSONValue) entry.getValue();
            ArrayList<D3.j> lights = deviceHueBridge.getLights();
            int size = lights.size();
            boolean z5 = false;
            int i = 0;
            do {
                if (i >= size) {
                    jVar = null;
                    break;
                }
                jVar = lights.get(i);
                i++;
            } while (!k.a(jVar.f799a, str));
            if (jVar == null) {
                b bVar = new b();
                bVar.f765m = new Date(0L);
                bVar.f805g = new WeakReference(deviceHueBridge);
                bVar.f764l = str;
                bVar.f799a = lightsJSONValue.getUniqueid();
                bVar.f800b = lightsJSONValue.getName();
                Capabilities capabilities = lightsJSONValue.getCapabilities();
                bVar.f802d = (capabilities == null || (streaming = capabilities.getStreaming()) == null) ? false : k.a(streaming.getRenderer(), Boolean.TRUE);
                StateClass state = lightsJSONValue.getState();
                if ((state != null ? state.getHue() : null) == null) {
                    StateClass state2 = lightsJSONValue.getState();
                    if ((state2 != null ? state2.getXy() : null) == null) {
                        StateClass state3 = lightsJSONValue.getState();
                        if ((state3 != null ? state3.getCt() : null) == null) {
                            z5 = true;
                        }
                    }
                }
                bVar.f803e = z5;
                ((ArrayList) wVar.f1074h).add(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x signin$lambda$6$lambda$5$lambda$4(w wVar, DeviceHueBridge deviceHueBridge, p126x2.w wVar2, z zVar, c cVar) {
        k.f("$newLights", wVar);
        k.f("this$0", deviceHueBridge);
        k.f("<unused var>", wVar2);
        k.f("<unused var>", zVar);
        k.f("groupsResult", cVar);
        HashMap map = (HashMap) cVar.a();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (k.a(((HueJsonGroup) entry.getValue()).getType(), "Room")) {
                    ((HueJsonGroup) entry.getValue()).setId((String) entry.getKey());
                    Iterator it = ((ArrayList) wVar.f1074h).iterator();
                    k.e("iterator(...)", it);
                    while (it.hasNext()) {
                        Object next = it.next();
                        k.e("next(...)", next);
                        b bVar = (b) next;
                        String[] lights = ((HueJsonGroup) entry.getValue()).getLights();
                        if (lights != null && p089q4.k.n0(lights, bVar.f764l) >= 0) {
                            bVar.f801c = ((HueJsonGroup) entry.getValue()).getName();
                        }
                    }
                }
            }
        }
        deviceHueBridge.connected = true;
        Object obj = wVar.f1074h;
        k.d("null cannot be cast to non-null type java.util.ArrayList<com.nanjoran.ilightshow.Model.Light.UMLight>", obj);
        deviceHueBridge.setLightsArray((ArrayList) obj);
        deviceHueBridge.notifyDelegate();
        return x.f10867a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    public static final x signup$lambda$2(DeviceHueBridge deviceHueBridge, p126x2.w wVar, z zVar, c cVar) {
        Object obj;
        Object obj2;
        k.f("this$0", deviceHueBridge);
        k.f("<unused var>", wVar);
        k.f("<unused var>", zVar);
        k.f("result", cVar);
        HashMap[] mapArr = (HashMap[]) cVar.a();
        if (mapArr == null) {
            obj = null;
        } else {
            HashMap map = mapArr.length == 0 ? null : mapArr[0];
            if (map != null) {
                obj = map.get(AccountsQueryParameters.ERROR);
            } else {
                obj = null;
            }
        }
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (k.a(map2 != null ? map2.get("address") : null, "/generateclientkey")) {
            deviceHueBridge.setLegacyOnly(Boolean.TRUE);
            M.f8305O.G(true);
        }
        HashMap[] mapArr2 = (HashMap[]) cVar.a();
        if (mapArr2 == null) {
            obj2 = null;
        } else {
            HashMap map3 = mapArr2.length == 0 ? null : mapArr2[0];
            if (map3 != null) {
                obj2 = map3.get("success");
            } else {
                obj2 = null;
            }
        }
        Map map4 = obj2 instanceof Map ? (Map) obj2 : null;
        x xVar = x.f10867a;
        if (map4 == null) {
            DeviceDiscoveryHue.Companion.getTAG();
            return xVar;
        }
        String str = (String) map4.get("username");
        String str2 = (String) map4.get("clientkey");
        if (str2 == null) {
            deviceHueBridge.setLegacyOnly(Boolean.TRUE);
            M.f8305O.G(true);
        }
        deviceHueBridge.token = str;
        deviceHueBridge.setClientKey(str2);
        DeviceDiscoveryHue.Companion.getTAG();
        deviceHueBridge.signin();
        return xVar;
    }

    public final void clearAllEntertainmentGroups() {
        String str;
        String str2;
        HueJsonGroup[] hueJsonGroupArrE;
        j jVar = this.hueStream;
        if (jVar == null || (hueJsonGroupArrE = j.e((str = jVar.f6095a), (str2 = jVar.f6096b))) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (HueJsonGroup hueJsonGroup : hueJsonGroupArrE) {
            String name = hueJsonGroup.getName();
            if (name != null && l.a0(name, "iLightShow#")) {
                arrayList.add(hueJsonGroup);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j.c(str, str2, ((HueJsonGroup) obj).getId());
        }
    }

    @Override // K3.a
    public void disconnect() {
        shutdownStream();
        this.connected = false;
        setLightsArray(new ArrayList<>());
    }

    public final String getClientKey() {
        return this.customInfo.get("clientkey");
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public List<D3.j> getEnabledStreamingLights() {
        return this.enabledStreamingLights;
    }

    public final Boolean getLegacyOnly() {
        return Boolean.valueOf(k.a(this.customInfo.get("legacyOnly"), "true"));
    }

    @Override // K3.a
    public ArrayList<D3.j> getLights() {
        return this.lightsArray;
    }

    public final ArrayList<D3.j> getLightsArray() {
        return this.lightsArray;
    }

    @Override // K3.a
    public Integer getMaxStreamingLights() {
        return this.maxStreamingLights;
    }

    @Override // K3.a
    public K3.b getState() {
        if (this.connected || !this.lightsArray.isEmpty()) {
            return K3.b.f2128h;
        }
        return this.token != null ? K3.b.f2129j : K3.b.f2130k;
    }

    public final void send(d dVar, b bVar) {
        k.f("cmd", dVar);
        k.f("light", bVar);
        j jVar = this.hueStream;
        D3.a aVar = dVar.f767a;
        if (aVar == null) {
            return;
        }
        try {
            defpackage.k kVarR = h0.r(aVar);
            int i = (int) (kVarR.f9797a * 65535.0d);
            int i3 = (int) (kVarR.f9798b * 65535.0d);
            int i6 = (int) (kVarR.f9799c * 65535.0d);
            if (getEnabledStreamingLights().contains(bVar) && M.f8305O.n() && jVar != null) {
                String str = bVar.f764l;
                if (str == null) {
                    return;
                }
                jVar.g(str, i, i3, i6, ((double) dVar.f768b) / 10.0d);
                return;
            }
            h hVarHueApiXy = Companion.hueApiXy(aVar);
            String str2 = "\"bri\":" + Integer.valueOf(aVar.f763c) + ", \"transitiontime\": " + dVar.f768b;
            Object obj = hVarHueApiXy.f10849h;
            Object obj2 = hVarHueApiXy.i;
            if (!Double.isNaN(((Number) obj).doubleValue()) && !Double.isNaN(((Number) obj2).doubleValue())) {
                str2 = str2 + ", \"xy\": [" + hVarHueApiXy.f10849h + "," + obj2 + "]";
            }
            if (new Date().getTime() - bVar.f765m.getTime() > 20000) {
                bVar.f765m = new Date();
                str2 = str2 + ", \"on\": true";
            }
            DeviceHueBridgeKt.getUnsafeFuel().b(p126x2.u.PUT, "https://" + this.ip + "/api/" + this.token + "/lights/" + bVar.f764l + "/state", null).h("{" + str2 + "}", M4.a.f3520a).m(new defpackage.d(27));
        } catch (Exception unused) {
        }
    }

    public final void setClientKey(String str) {
        Map<String, String> map = this.customInfo;
        if (str == null) {
            return;
        }
        map.put("clientkey", str);
    }

    public final void setConnected(boolean z5) {
        this.connected = z5;
    }

    @Override // K3.a
    public void setEnabledStreamingLights(List<? extends D3.j> list) throws Throwable {
        ColorDef colorDef;
        ColorPalette colorDefs;
        boolean z5 = false;
        k.f("value", list);
        this.enabledStreamingLights = list;
        j jVar = this.hueStream;
        if (jVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((b) it.next()).f764l;
            if (str != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(p089q4.n.P(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new q(AbstractC0473d.V((String) obj)));
        }
        Set setX0 = p089q4.l.x0(arrayList2);
        Semaphore semaphore = jVar.f6105l;
        try {
            try {
                semaphore.acquire();
                HashMap map = jVar.f6106m;
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        if (setX0.contains(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                    HashMap map2 = jVar.f6107n;
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (setX0.contains(entry2.getKey())) {
                            map2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    jVar.i = setX0;
                    Iterator it2 = setX0.iterator();
                    while (it2.hasNext()) {
                        int i3 = ((q) it2.next()).f10860h;
                        if (!map.containsKey(new q(i3))) {
                            UMPreset uMPresetG = M.f8305O.g();
                            if (uMPresetG == null || (colorDefs = uMPresetG.getColorDefs()) == null || (colorDef = ColorPalette.getRandomFromPalette$default(colorDefs, null, 1, null)) == null) {
                                colorDef = new ColorDef();
                            }
                            int iHSVToColor = Color.HSVToColor(new float[]{colorDef.getHue() / 65535.0f, colorDef.getSat() / 255.0f, colorDef.getSat() / 255.0f});
                            map.put(new q(i3), new p000a.c(Color.red(iHSVToColor), Color.green(iHSVToColor), Color.blue(iHSVToColor)));
                        }
                    }
                    semaphore.release();
                } catch (InterruptedException unused) {
                    z5 = true;
                    Thread.currentThread().interrupt();
                    if (z5) {
                        semaphore.release();
                    }
                } catch (Throwable th) {
                    th = th;
                    z5 = true;
                    if (z5) {
                        semaphore.release();
                    }
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void setLegacyOnly(Boolean bool) {
        this.customInfo.put("legacyOnly", k.a(bool, Boolean.TRUE) ? "true" : "false");
    }

    public final void setLightsArray(ArrayList<D3.j> arrayList) {
        String str;
        String str2;
        String clientKey;
        k.f("newValue", arrayList);
        this.lightsArray = arrayList;
        if (arrayList.isEmpty() || this.hueStream != null || (str = this.ip) == null || (str2 = this.token) == null || (clientKey = getClientKey()) == null) {
            return;
        }
        this.hueStream = new j(str, str2, clientKey);
    }

    public void setMaxStreamingLights(Integer num) {
        this.maxStreamingLights = num;
    }

    public final void shutdownStream() {
        j jVar = this.hueStream;
        if (jVar != null) {
            jVar.f6102h = false;
            p106t4.a aVar = jVar.f6100f;
            if (aVar != null) {
                aVar.interrupt();
            }
            if (aVar != null && !aVar.equals(Thread.currentThread())) {
                try {
                    aVar.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            jVar.f6100f = null;
            jVar.k();
        }
        this.hueStream = null;
    }

    public final void signin() {
        if ((getClientKey() != null || k.a(getLegacyOnly(), Boolean.TRUE)) && this.token != null) {
            w wVar = new w();
            wVar.f1074h = new ArrayList();
            try {
                p126x2.w wVarB = DeviceHueBridgeKt.getUnsafeFuel().b(p126x2.u.GET, "https://" + this.ip + "/api/" + this.token + "/config", null);
                a aVar = new a(this, wVar, 1);
                final m mVar = new m();
                p137z2.a.e(wVarB, new A() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$$inlined$responseObject$1
                    @Override // p126x2.A
                    public HueBridgeConfigJSON deserialize(InputStream inputStream) {
                        k.f("inputStream", inputStream);
                        return null;
                    }

                    @Override // p126x2.A
                    public HueBridgeConfigJSON deserialize(String str) {
                        k.f("content", str);
                        return null;
                    }

                    @Override // p126x2.A
                    public HueBridgeConfigJSON deserialize(byte[] bArr) {
                        k.f("bytes", bArr);
                        return null;
                    }

                    /* JADX WARN: Type inference failed for: r1v1, types: [com.nanjoran.ilightshow.Services.lights.hue.HueBridgeConfigJSON, java.lang.Object] */
                    @Override // p126x2.h
                    public HueBridgeConfigJSON deserialize(z zVar) {
                        k.f(LoginActivity.RESPONSE_KEY, zVar);
                        return n.p(this, zVar);
                    }

                    /* JADX WARN: Type inference failed for: r1v2, types: [com.nanjoran.ilightshow.Services.lights.hue.HueBridgeConfigJSON, java.lang.Object] */
                    @Override // p126x2.A
                    public HueBridgeConfigJSON deserialize(Reader reader) {
                        k.f("reader", reader);
                        return mVar.b(reader, new p132y3.a<HueBridgeConfigJSON>() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signin$$inlined$responseObject$1.1
                        }.getType());
                    }
                }, aVar);
            } catch (MalformedURLException e6) {
                DeviceDiscoveryHue.Companion.getTAG();
                e6.getMessage();
            }
        }
    }

    @Override // K3.a
    public void signup() {
        String str = this.ip;
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("devicetype", Companion.getDefaultClientName());
        Boolean legacyOnly = getLegacyOnly();
        Boolean bool = Boolean.TRUE;
        if (!k.a(legacyOnly, bool)) {
            map.put("generateclientkey", bool);
        }
        try {
            p126x2.w wVarB = DeviceHueBridgeKt.getUnsafeFuel().b(p126x2.u.POST, AbstractC0013g0.i("https://", str, "/api"), null);
            String strK = new m().k(map, new p132y3.a<HashMap<String, Object>>() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signup$$inlined$jsonBody$1
            }.getType());
            p120w2.a aVar = p120w2.a.f13456b;
            new DeviceHueBridge$signup$$inlined$jsonBody$2(strK);
            aVar.getClass();
            if (strK == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            p137z2.a.c(wVarB, strK);
            B0 b6 = new B0(2, this);
            final m mVar = new m();
            p137z2.a.e(wVarB, new A() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signup$$inlined$responseObject$1
                @Override // p126x2.A
                public HashMap<String, Object>[] deserialize(InputStream inputStream) {
                    k.f("inputStream", inputStream);
                    return null;
                }

                @Override // p126x2.A
                public HashMap<String, Object>[] deserialize(String str2) {
                    k.f("content", str2);
                    return null;
                }

                @Override // p126x2.A
                public HashMap<String, Object>[] deserialize(byte[] bArr) {
                    k.f("bytes", bArr);
                    return null;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>[]] */
                @Override // p126x2.h
                public HashMap<String, Object>[] deserialize(z zVar) {
                    k.f(LoginActivity.RESPONSE_KEY, zVar);
                    return n.p(this, zVar);
                }

                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>[]] */
                @Override // p126x2.A
                public HashMap<String, Object>[] deserialize(Reader reader) {
                    k.f("reader", reader);
                    return mVar.b(reader, new p132y3.a<HashMap<String, Object>[]>() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge$signup$$inlined$responseObject$1.1
                    }.getType());
                }
            }, b6);
        } catch (Exception e6) {
            DeviceDiscoveryHue.Companion.getTAG();
            e6.getMessage();
        }
    }

    public final void stopStream() {
        j jVar = this.hueStream;
        if (jVar != null) {
            jVar.k();
        }
    }
}

package w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ J[] f13501h;

    /* JADX INFO: Fake field, exist only in values array */
    J EF5;

    static {
        J[] jArr = {new J("GetService", 0), new J("StateService", 1), new J("GetHostInfo", 2), new J("StateHostInfo", 3), new J("GetHostFirmware", 4), new J("StateHostFirmware", 5), new J("GetWifiInfo", 6), new J("StateWifiInfo", 7), new J("GetWifiFirmware", 8), new J("StateWifiFirmware", 9), new J("GetPower", 10), new J("SetPower", 11), new J("StatePower", 12), new J("GetLabel", 13), new J("SetLabel", 14), new J("StateLabel", 15), new J("GetVersion", 16), new J("StateVersion", 17), new J("GetInfo", 18), new J("StateInfo", 19), new J("Acknowledgement", 20), new J("GetLocation", 21), new J("SetLocation", 22), new J("StateLocation", 23), new J("GetGroup", 24), new J("SetGroup", 25), new J("StateGroup", 26), new J("EchoRequest", 27), new J("EchoResponse", 28), new J("LightGet", 29), new J("LightSetColor", 30), new J("LightSetWaveform", 31), new J("LightState", 32), new J("LightSetWaveformOptional", 33), new J("LightGetPower", 34), new J("LightSetPower", 35), new J("LightStatePower", 36), new J("GetInfrared", 37), new J("StateInfrared", 38), new J("SetInfrared", 39), new J("SetColorZones", 40), new J("GetColorZones", 41), new J("StateZone", 42), new J("StateMultiZone", 43), new J("GetDeviceChain", 44), new J("StateDeviceChain", 45), new J("SetUserPosition", 46), new J("GetTileState64", 47), new J("StateTileState64", 48), new J("SetTileState64", 49)};
        f13501h = jArr;
        p081p0.c.i0(jArr);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f13501h.clone();
    }
}

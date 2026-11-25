package p058l0;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.ArrayList;
import java.util.List;
import p089q4.u;

/* JADX INFO: renamed from: l0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0821d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10269h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f10270j;

    public C0821d(String str, float f6, float f7, float f8, float f9, float f10, float f11, float f12, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f6 = (i & 2) != 0 ? 0.0f : f6;
        f7 = (i & 4) != 0 ? 0.0f : f7;
        f8 = (i & 8) != 0 ? 0.0f : f8;
        f9 = (i & 16) != 0 ? 1.0f : f9;
        f10 = (i & 32) != 0 ? 1.0f : f10;
        f11 = (i & 64) != 0 ? 0.0f : f11;
        f12 = (i & 128) != 0 ? 0.0f : f12;
        if ((i & HueLog.LogComponent.STREAMDTLS) != 0) {
            int i3 = G.f10217a;
            list = u.f11237h;
        }
        ArrayList arrayList = new ArrayList();
        this.f10262a = str;
        this.f10263b = f6;
        this.f10264c = f7;
        this.f10265d = f8;
        this.f10266e = f9;
        this.f10267f = f10;
        this.f10268g = f11;
        this.f10269h = f12;
        this.i = list;
        this.f10270j = arrayList;
    }
}

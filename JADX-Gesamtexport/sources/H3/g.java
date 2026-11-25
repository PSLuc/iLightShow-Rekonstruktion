package H3;

import N3.P0;
import S1.h0;
import X.s;
import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.C0;
import com.nanjoran.ilightshow.Services.C0689p;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.nanjoran.ilightshow.Services.SharedPaletteStorageDocument;
import com.nanjoran.ilightshow.Views.BrightnessRoute;
import com.nanjoran.ilightshow.Views.DevicesViewRoute;
import com.nanjoran.ilightshow.Views.FXModeSelectionRoute;
import com.nanjoran.ilightshow.Views.FXSizeSelectionRoute;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import com.nanjoran.ilightshow.Views.IntensitySelectionRoute;
import com.nanjoran.ilightshow.Views.LightsScreenRoute;
import com.nanjoran.ilightshow.Views.ManualDelayRoute;
import com.nanjoran.ilightshow.Views.MicrophoneRoute;
import com.nanjoran.ilightshow.Views.MusicServicesRoute;
import com.nanjoran.ilightshow.Views.PalettesListRoute;
import com.nanjoran.ilightshow.Views.SettingsScreenRoute;
import com.spotify.sdk.android.auth.AuthorizationClient;
import d5.n;
import d5.p;
import d5.r;
import d5.u;
import d5.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Arrays;
import p084p4.x;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1791h;

    public /* synthetic */ g(int i) {
        this.f1791h = i;
    }

    @Override // D4.a
    public final Object invoke() throws IllegalAccessException, IOException, InvocationTargetException {
        x xVar = x.f10867a;
        switch (this.f1791h) {
            case 0:
                return MusicServiceType._init_$_anonymous_();
            case 1:
                return BrightnessRoute._init_$_anonymous_();
            case 2:
                M m6 = M.f8305O;
                m6.B();
                m6.A();
                return xVar;
            case 3:
                M m7 = M.f8305O;
                m7.F(m7.m() - 0.01d);
                m7.B();
                m7.A();
                return xVar;
            case 4:
                M m8 = M.f8305O;
                m8.F(m8.m() + 0.01d);
                m8.B();
                m8.A();
                return xVar;
            case 5:
                C0.i.d(false);
                return xVar;
            case 6:
                return DevicesViewRoute._init_$_anonymous_();
            case 7:
                return FXModeSelectionRoute._init_$_anonymous_();
            case 8:
                return FXSizeSelectionRoute._init_$_anonymous_();
            case 9:
                return HomeScreenRoute._init_$_anonymous_();
            case 10:
                return IntensitySelectionRoute._init_$_anonymous_();
            case 11:
                return xVar;
            case 12:
                return LightsScreenRoute._init_$_anonymous_();
            case 13:
                K4.e[] eVarArr = P0.f4082a;
                return null;
            case 14:
                C0.i.d(false);
                return xVar;
            case 15:
                return ManualDelayRoute._init_$_anonymous_();
            case 16:
                return MicrophoneRoute._init_$_anonymous_();
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return MusicServicesRoute._init_$_anonymous_();
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                C0 c6 = C0.i;
                c6.f8239b = null;
                c6.f8242e.setValue(null);
                c6.f8241d = null;
                c6.f8240c = 0L;
                c6.c();
                c6.f8243f.setValue(Boolean.FALSE);
                c6.d(false);
                c6.e();
                AuthorizationClient.clearCookies(c6.f8238a);
                f.f1787d.d(null);
                return xVar;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return PalettesListRoute._init_$_anonymous_();
            case 20:
                return SettingsScreenRoute._init_$_anonymous_();
            case 21:
                File file = AbstractC0665d0.f8380a;
                if (file == null) {
                    E4.k.m("storageFile");
                    throw null;
                }
                if (!file.exists()) {
                    return new s();
                }
                File file2 = AbstractC0665d0.f8380a;
                if (file2 == null) {
                    E4.k.m("storageFile");
                    throw null;
                }
                Charset charset = M4.a.f3520a;
                E4.k.f("charset", charset);
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[8192];
                    for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                        stringWriter.write(cArr, 0, i);
                    }
                    String string = stringWriter.toString();
                    E4.k.e("toString(...)", string);
                    inputStreamReader.close();
                    if (string.length() <= 0) {
                        return new s();
                    }
                    try {
                        SharedPaletteStorageDocument sharedPaletteStorageDocumentA = AbstractC0665d0.a(string);
                        File file3 = AbstractC0665d0.f8380a;
                        if (file3 == null) {
                            E4.k.m("storageFile");
                            throw null;
                        }
                        n nVar = AbstractC0665d0.f8381b;
                        nVar.getClass();
                        p006b.a.G(file3, nVar.b(SharedPaletteStorageDocument.Companion.serializer(), sharedPaletteStorageDocumentA));
                        Palette[] paletteArr = (Palette[]) l.n0(sharedPaletteStorageDocumentA.getPalettes(), new C0689p(2)).toArray(new Palette[0]);
                        Object[] objArrCopyOf = Arrays.copyOf(paletteArr, paletteArr.length);
                        s sVar = new s();
                        sVar.addAll(p089q4.k.t0(objArrCopyOf));
                        return sVar;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return new s();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        h0.i(inputStreamReader, th);
                        throw th2;
                    }
                }
            case 22:
                return w.f8633b;
            case 23:
                return r.f8626b;
            case 24:
                return p.f8624b;
            case 25:
                return u.f8631b;
            default:
                return d5.f.f8602b;
        }
    }
}

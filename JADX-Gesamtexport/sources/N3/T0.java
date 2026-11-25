package N3;

import N.C0230o;
import N.InterfaceC0203a0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4111h;
    public final /* synthetic */ Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4112j;

    public /* synthetic */ T0(Context context, InterfaceC0203a0 interfaceC0203a0, int i) {
        this.f4111h = i;
        this.i = context;
        this.f4112j = interfaceC0203a0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4111h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    final InterfaceC0203a0 interfaceC0203a0 = this.f4112j;
                    final Context context = this.i;
                    final int i = 0;
                    L.L.a(new D4.a() { // from class: N3.S0
                        @Override // D4.a
                        public final Object invoke() {
                            p084p4.x xVar = p084p4.x.f10867a;
                            InterfaceC0203a0 interfaceC0203a1 = interfaceC0203a0;
                            Context context2 = context;
                            switch (i) {
                                case 0:
                                    E4.k.f("$ctx", context2);
                                    interfaceC0203a1.setValue(Boolean.FALSE);
                                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.music")));
                                    break;
                                default:
                                    E4.k.f("$ctx", context2);
                                    interfaceC0203a1.setValue(Boolean.FALSE);
                                    int i3 = H3.b.i;
                                    ((Activity) context2).startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                                    break;
                            }
                            return xVar;
                        }
                    }, null, false, null, null, null, null, null, P.f4075d, c0230o, 805306368, 510);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    final InterfaceC0203a0 interfaceC0203a1 = this.f4112j;
                    final Context context2 = this.i;
                    final int i3 = 1;
                    L.L.a(new D4.a() { // from class: N3.S0
                        @Override // D4.a
                        public final Object invoke() {
                            p084p4.x xVar = p084p4.x.f10867a;
                            InterfaceC0203a0 interfaceC0203a2 = interfaceC0203a1;
                            Context context3 = context2;
                            switch (i3) {
                                case 0:
                                    E4.k.f("$ctx", context3);
                                    interfaceC0203a2.setValue(Boolean.FALSE);
                                    context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.music")));
                                    break;
                                default:
                                    E4.k.f("$ctx", context3);
                                    interfaceC0203a2.setValue(Boolean.FALSE);
                                    int i6 = H3.b.i;
                                    ((Activity) context3).startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                                    break;
                            }
                            return xVar;
                        }
                    }, null, false, null, null, null, null, null, P.f4079h, c0230o2, 805306368, 510);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}

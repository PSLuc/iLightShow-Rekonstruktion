package D;

import p113v0.InterfaceC1033p;

/* JADX INFO: renamed from: D.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0054d extends E4.i implements D4.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f675p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054d(z zVar) {
        super(1, E4.j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f675p = zVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        float[] fArr = ((p035g0.A) obj).f9008a;
        InterfaceC1033p interfaceC1033p = (InterfaceC1033p) this.f675p.f714x.getValue();
        if (interfaceC1033p != null) {
            if (!interfaceC1033p.K()) {
                interfaceC1033p = null;
            }
            if (interfaceC1033p != null) {
                interfaceC1033p.M(fArr);
            }
        }
        return p084p4.x.f10867a;
    }
}

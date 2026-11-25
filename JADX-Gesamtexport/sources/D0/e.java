package D0;

import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class e extends E4.l implements D4.c {
    public static final e i = new e(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f731j = new e(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f732k = new e(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f733h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i6) {
        super(i3);
        this.f733h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f733h) {
            case 0:
                ((Number) obj).longValue();
                return x.f10867a;
            case 1:
                return Integer.valueOf(((m) obj).f753b);
            default:
                S0.i iVar = ((m) obj).f754c;
                return Integer.valueOf(iVar.f4895d - iVar.f4893b);
        }
    }
}

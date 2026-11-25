package B2;

import M4.u;

/* JADX INFO: loaded from: classes.dex */
public final class g extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f503h;
    public final /* synthetic */ StringBuilder i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, StringBuilder sb) {
        super(2);
        this.f503h = i;
        this.i = sb;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f503h) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                E4.k.f("key", str);
                E4.k.f("value", str2);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String strU = p012c.k.u(sb, " : ", str2);
                StringBuilder sb2 = this.i;
                sb2.append(strU);
                sb2.append(u.f3549a);
                return sb2;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                E4.k.f("key", str3);
                E4.k.f("value", str4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                String strU2 = p012c.k.u(sb3, " : ", str4);
                StringBuilder sb4 = this.i;
                sb4.append(strU2);
                sb4.append(u.f3549a);
                return sb4;
        }
    }
}

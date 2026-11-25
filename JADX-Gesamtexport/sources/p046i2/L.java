package p046i2;

import S1.EnumC0345g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L f9516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final L f9517n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC0345g f9518h;
    public final EnumC0345g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EnumC0345g f9519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EnumC0345g f9520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EnumC0345g f9521l;

    static {
        EnumC0345g enumC0345g = EnumC0345g.i;
        EnumC0345g enumC0345g2 = EnumC0345g.f4936h;
        f9516m = new L(enumC0345g, enumC0345g, enumC0345g2, enumC0345g2, enumC0345g);
        f9517n = new L(enumC0345g, enumC0345g, enumC0345g, enumC0345g, enumC0345g);
    }

    public L(EnumC0345g enumC0345g, EnumC0345g enumC0345g2, EnumC0345g enumC0345g3, EnumC0345g enumC0345g4, EnumC0345g enumC0345g5) {
        this.f9518h = enumC0345g;
        this.i = enumC0345g2;
        this.f9519j = enumC0345g3;
        this.f9520k = enumC0345g4;
        this.f9521l = enumC0345g5;
    }

    public final String toString() {
        return "[Visibility: getter=" + this.f9518h + ",isGetter=" + this.i + ",setter=" + this.f9519j + ",creator=" + this.f9520k + ",field=" + this.f9521l + "]";
    }
}

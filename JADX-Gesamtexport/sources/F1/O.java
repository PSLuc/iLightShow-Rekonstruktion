package F1;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f1309r;

    public O(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f1309r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // F1.Q, F1.S
    public final String b() {
        return this.f1309r.getName();
    }

    @Override // F1.Q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum c(String str) {
        Object obj;
        Class cls = this.f1309r;
        Object[] enumConstants = cls.getEnumConstants();
        E4.k.e("type.enumConstants", enumConstants);
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (M4.s.Q(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r6 = (Enum) obj;
        if (r6 != null) {
            return r6;
        }
        StringBuilder sbW = p012c.k.w("Enum value ", str, " not found for type ");
        sbW.append(cls.getName());
        sbW.append('.');
        throw new IllegalArgumentException(sbW.toString());
    }
}

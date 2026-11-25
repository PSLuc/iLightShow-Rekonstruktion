package p5;

/* JADX INFO: renamed from: p5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0848m extends AbstractC0844i {
    @Override // p5.S
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (EnumC0843h enumC0843h : this.f11071c) {
            sb.append("\t\t\t\tClient certificate type: ");
            sb.append(enumC0843h);
            sb.append(m5.s.f10493b);
        }
        return sb.toString();
    }
}

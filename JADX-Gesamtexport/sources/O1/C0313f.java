package O1;

/* JADX INFO: renamed from: O1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0313f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4492c;

    public C0313f(int i, String str, int i3) {
        this.f4490a = i;
        this.f4491b = i3;
        this.f4492c = str;
    }

    public g a() {
        g gVar = new g();
        gVar.f4493a = this.f4490a;
        gVar.f4494b = this.f4491b;
        gVar.f4495c = this.f4492c;
        return gVar;
    }

    public int b(m5.h hVar) {
        int iA = hVar.a() / 8;
        String str = this.f4492c;
        if (iA < 2) {
            throw new IllegalArgumentException(String.format("Not enough bytes for %s! Required %d, available %d.", str, 2, Integer.valueOf(iA)));
        }
        int iE = hVar.e(8);
        int i = this.f4490a;
        if (iE != i) {
            throw new IllegalArgumentException(String.format("No %s, found %02x instead of %02x!", str, Integer.valueOf(iE), Integer.valueOf(i)));
        }
        int iE2 = hVar.e(8);
        if (iE2 > 127) {
            int i3 = iE2 & 127;
            if (i3 > 4) {
                throw new IllegalArgumentException(String.format("%s length-size %d too long!", str, Integer.valueOf(i3)));
            }
            int iA2 = hVar.a() / 8;
            if (i3 > iA2) {
                throw new IllegalArgumentException(String.format("%s length %d exceeds available bytes %d!", str, Integer.valueOf(i3), Integer.valueOf(iA2)));
            }
            int i6 = 0;
            for (byte b6 : hVar.f(i3)) {
                i6 = (i6 << 8) + (b6 & 255);
            }
            iE2 = i6;
        }
        int i7 = this.f4491b;
        if (iE2 > i7) {
            throw new IllegalArgumentException(String.format("%s lenght %d too large! (supported maxium %d)", str, Integer.valueOf(iE2), Integer.valueOf(i7)));
        }
        int iA3 = hVar.a() / 8;
        if (iE2 <= iA3) {
            return iE2;
        }
        throw new IllegalArgumentException(String.format("%s lengh %d exceeds available bytes %d!", str, Integer.valueOf(iE2), Integer.valueOf(iA3)));
    }
}

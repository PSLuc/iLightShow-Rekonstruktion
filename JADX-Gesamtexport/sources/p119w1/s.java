package p119w1;

import H1.d;
import java.nio.ByteBuffer;
import p125x1.a;
import p125x1.b;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13446d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13449c = 0;

    public s(d dVar, int i) {
        this.f13448b = dVar;
        this.f13447a = i;
    }

    public final int a(int i) {
        a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f11788k;
        int i3 = iA + aVarB.f11786h;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final a b() {
        ThreadLocal threadLocal = f13446d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = (b) this.f13448b.i;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i = iA + bVar.f11786h;
            int i3 = (this.f13447a * 4) + ((ByteBuffer) bVar.f11788k).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) bVar.f11788k).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f11788k;
            aVar.f11788k = byteBuffer;
            if (byteBuffer != null) {
                aVar.f11786h = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                aVar.i = i7;
                aVar.f11787j = ((ByteBuffer) aVar.f11788k).getShort(i7);
                return aVar;
            }
            aVar.f11786h = 0;
            aVar.i = 0;
            aVar.f11787j = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f11788k).getInt(iA + aVarB.f11786h) : 0));
        sb.append(", codepoints:");
        a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i3 = iA2 + aVarB2.f11786h;
            i = ((ByteBuffer) aVarB2.f11788k).getInt(((ByteBuffer) aVarB2.f11788k).getInt(i3) + i3);
        } else {
            i = 0;
        }
        for (int i6 = 0; i6 < i; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

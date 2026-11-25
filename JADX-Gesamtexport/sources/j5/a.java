package j5;

import c5.C0495p;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayInputStream f9721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9725h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9718a = new byte[4160];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9719b = new int[1040];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0495p f9720c = new C0495p(11);
    public int i = 0;

    public static void a(a aVar, boolean z5) {
        if (aVar.f9722e) {
            int i = ((aVar.f9725h << 2) + ((aVar.f9724g + 7) >> 3)) - 8;
            int i3 = aVar.i;
            if (i > i3) {
                throw new c("Read after end");
            }
            if (z5 && i != i3) {
                throw new c("Unused bytes after end");
            }
        }
    }

    public static void b(a aVar) {
        int i = aVar.f9724g;
        if (i >= 32) {
            int i3 = aVar.f9725h;
            aVar.f9725h = i3 + 1;
            aVar.f9723f = (((long) aVar.f9719b[i3]) << 32) | (aVar.f9723f >>> 32);
            aVar.f9724g = i - 32;
        }
    }

    public static int c(a aVar) {
        return (aVar.f9722e ? (aVar.i + 3) >> 2 : 1024) - aVar.f9725h;
    }

    public static int d(a aVar, int i) {
        b(aVar);
        long j4 = aVar.f9723f;
        int i3 = aVar.f9724g;
        int i6 = ((int) (j4 >>> i3)) & ((1 << i) - 1);
        aVar.f9724g = i3 + i;
        return i6;
    }

    public static void e(a aVar) {
        int i = aVar.f9725h;
        if (i <= 1015) {
            return;
        }
        if (aVar.f9722e) {
            if (c(aVar) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i3 = i << 2;
        int i6 = 4096 - i3;
        byte[] bArr = aVar.f9718a;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        aVar.f9725h = 0;
        while (i6 < 4096) {
            try {
                int i7 = aVar.f9721d.read(bArr, i6, 4096 - i6);
                if (i7 <= 0) {
                    aVar.f9722e = true;
                    aVar.i = i6;
                    i6 += 3;
                    break;
                }
                i6 += i7;
            } catch (IOException e6) {
                throw new c("Failed to read input", e6);
            }
        }
        int i8 = i6 >> 2;
        for (int i9 = 0; i9 < i8; i9++) {
            C0495p c0495p = aVar.f9720c;
            int[] iArr = (int[]) c0495p.f7476j;
            byte[] bArr2 = (byte[]) c0495p.i;
            int i10 = i9 * 4;
            iArr[i9] = ((bArr2[i10 + 3] & 255) << 24) | (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8) | ((bArr2[i10 + 2] & 255) << 16);
        }
    }
}

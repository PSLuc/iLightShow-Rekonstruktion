package N4;

import B.AbstractC0013g0;
import E4.k;
import okhttp3.internal.http2.Http2Connection;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {
    public static final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f4326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f4327k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4328h;

    static {
        int i3 = b.f4329a;
        i = AbstractC0473d.p(4611686018427387903L);
        f4326j = AbstractC0473d.p(-4611686018427387903L);
    }

    public static final long a(long j4, long j6) {
        long j7 = 1000000;
        long j8 = j6 / j7;
        long j9 = j4 + j8;
        if (-4611686018426L > j9 || j9 >= 4611686018427L) {
            return AbstractC0473d.p(p081p0.c.P(j9, -4611686018427387903L, 4611686018427387903L));
        }
        long j10 = ((j9 * j7) + (j6 - (j8 * j7))) << 1;
        int i3 = b.f4329a;
        return j10;
    }

    public static final void b(StringBuilder sb, int i3, int i6, int i7, String str, boolean z5) {
        CharSequence charSequenceSubSequence;
        sb.append(i3);
        if (i6 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i6);
            k.f("<this>", strValueOf);
            if (i7 < 0) {
                throw new IllegalArgumentException(AbstractC0013g0.f(i7, "Desired length ", " is less than zero."));
            }
            if (i7 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i7);
                int length = i7 - strValueOf.length();
                int i8 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i9 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i9 = length2;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length2 = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (z5 || i11 >= 3) {
                sb.append((CharSequence) string, 0, ((i9 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i11);
            }
        }
        sb.append(str);
    }

    public static final int c(long j4) {
        if (d(j4)) {
            return 0;
        }
        return (((int) j4) & 1) == 1 ? (int) (((j4 >> 1) % ((long) 1000)) * ((long) 1000000)) : (int) ((j4 >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final boolean d(long j4) {
        return j4 == i || j4 == f4326j;
    }

    public static final long e(long j4, long j6) {
        if (d(j4)) {
            if (!d(j6) || (j6 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j6)) {
            return j6;
        }
        int i3 = ((int) j4) & 1;
        if (i3 != (((int) j6) & 1)) {
            return i3 == 1 ? a(j4 >> 1, j6 >> 1) : a(j6 >> 1, j4 >> 1);
        }
        long j7 = (j4 >> 1) + (j6 >> 1);
        if (i3 != 0) {
            return AbstractC0473d.q(j7);
        }
        if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
            return AbstractC0473d.p(j7 / ((long) 1000000));
        }
        long j8 = j7 << 1;
        int i6 = b.f4329a;
        return j8;
    }

    public static final long f(long j4, c cVar) {
        k.f("unit", cVar);
        if (j4 == i) {
            return Long.MAX_VALUE;
        }
        if (j4 == f4326j) {
            return Long.MIN_VALUE;
        }
        long j6 = j4 >> 1;
        c cVar2 = (((int) j4) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        k.f("sourceUnit", cVar2);
        return cVar.f4336h.convert(j6, cVar2.f4336h);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = ((a) obj).f4328h;
        long j6 = this.f4328h;
        long j7 = j6 ^ j4;
        if (j7 >= 0 && (((int) j7) & 1) != 0) {
            int i3 = (((int) j6) & 1) - (((int) j4) & 1);
            return j6 < 0 ? -i3 : i3;
        }
        if (j6 < j4) {
            return -1;
        }
        return j6 == j4 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f4328h == ((a) obj).f4328h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4328h);
    }

    public final String toString() {
        long j4 = this.f4328h;
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == i) {
            return "Infinity";
        }
        if (j4 == f4326j) {
            return "-Infinity";
        }
        int i3 = 0;
        boolean z5 = j4 < 0;
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append('-');
        }
        if (j4 < 0) {
            j4 = ((long) (((int) j4) & 1)) + ((-(j4 >> 1)) << 1);
            int i6 = b.f4329a;
        }
        long jF = f(j4, c.DAYS);
        int iF = d(j4) ? 0 : (int) (f(j4, c.HOURS) % ((long) 24));
        int iF2 = d(j4) ? 0 : (int) (f(j4, c.MINUTES) % ((long) 60));
        int iF3 = d(j4) ? 0 : (int) (f(j4, c.SECONDS) % ((long) 60));
        int iC = c(j4);
        boolean z6 = jF != 0;
        boolean z7 = iF != 0;
        boolean z8 = iF2 != 0;
        boolean z9 = (iF3 == 0 && iC == 0) ? false : true;
        if (z6) {
            sb.append(jF);
            sb.append('d');
            i3 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i7 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i3 = i7;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i8 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iF2);
            sb.append('m');
            i3 = i8;
        }
        if (z9) {
            int i9 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (iF3 != 0 || z6 || z7 || z8) {
                b(sb, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i3 = i9;
        }
        if (z5 && i3 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        k.e("toString(...)", string);
        return string;
    }
}

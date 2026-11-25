package O1;

import B.C0031p0;
import S1.V;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.v1;
import p112v.C0984i0;
import p112v.C1017z0;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4439b;

    public /* synthetic */ B(Object obj, boolean z5) {
        this.f4439b = obj;
        this.f4438a = z5;
    }

    public void a() {
        this.f4438a = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j4, long j6, p122w4.c cVar) {
        C0984i0 c0984i0;
        long jD;
        if (cVar instanceof C0984i0) {
            c0984i0 = (C0984i0) cVar;
            int i = c0984i0.f12994n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0984i0.f12994n = i - Integer.MIN_VALUE;
            } else {
                c0984i0 = new C0984i0(this, cVar);
            }
        } else {
            c0984i0 = new C0984i0(this, cVar);
        }
        Object objB = c0984i0.f12992l;
        v4.a aVar = v4.a.f13292h;
        int i3 = c0984i0.f12994n;
        if (i3 == 0) {
            V.O(objB);
            if (this.f4438a) {
                c0984i0.f12991k = j6;
                c0984i0.f12994n = 1;
                objB = ((C1017z0) this.f4439b).b(j6, c0984i0);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                jD = 0;
            }
            return new S0.o(jD);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j6 = c0984i0.f12991k;
        V.O(objB);
        jD = S0.o.d(j6, ((S0.o) objB).f4904a);
        return new S0.o(jD);
    }

    public void c(byte b6) {
        ((K3.e) this.f4439b).m(String.valueOf(b6));
    }

    public void d(char c6) {
        K3.e eVar = (K3.e) this.f4439b;
        eVar.f(eVar.f2138b, 1);
        char[] cArr = (char[]) eVar.f2139c;
        int i = eVar.f2138b;
        eVar.f2138b = i + 1;
        cArr[i] = c6;
    }

    public void e(int i) {
        ((K3.e) this.f4439b).m(String.valueOf(i));
    }

    public void f(long j4) {
        ((K3.e) this.f4439b).m(String.valueOf(j4));
    }

    public void g(String str) {
        E4.k.f("v", str);
        ((K3.e) this.f4439b).m(str);
    }

    public void h(short s6) {
        ((K3.e) this.f4439b).m(String.valueOf(s6));
    }

    public void i(String str) {
        byte b6;
        E4.k.f("value", str);
        K3.e eVar = (K3.e) this.f4439b;
        eVar.f(eVar.f2138b, str.length() + 2);
        char[] cArr = (char[]) eVar.f2139c;
        int i = eVar.f2138b;
        int i3 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i6 = length + i3;
        int i7 = i3;
        while (i7 < i6) {
            char c6 = cArr[i7];
            byte[] bArr = e5.p.f8798b;
            if (c6 < bArr.length && bArr[c6] != 0) {
                int length2 = str.length();
                for (int i8 = i7 - i3; i8 < length2; i8++) {
                    eVar.f(i7, 2);
                    char cCharAt = str.charAt(i8);
                    byte[] bArr2 = e5.p.f8798b;
                    if (cCharAt >= bArr2.length || (b6 = bArr2[cCharAt]) == 0) {
                        int i9 = i7 + 1;
                        ((char[]) eVar.f2139c)[i7] = cCharAt;
                        i7 = i9;
                    } else if (b6 == 1) {
                        String str2 = e5.p.f8797a[cCharAt];
                        E4.k.c(str2);
                        eVar.f(i7, str2.length());
                        str2.getChars(0, str2.length(), (char[]) eVar.f2139c, i7);
                        int length3 = str2.length() + i7;
                        eVar.f2138b = length3;
                        i7 = length3;
                    } else {
                        char[] cArr2 = (char[]) eVar.f2139c;
                        cArr2[i7] = '\\';
                        cArr2[i7 + 1] = (char) b6;
                        i7 += 2;
                        eVar.f2138b = i7;
                    }
                }
                eVar.f(i7, 1);
                ((char[]) eVar.f2139c)[i7] = '\"';
                eVar.f2138b = i7 + 1;
                return;
            }
            i7++;
        }
        cArr[i6] = '\"';
        eVar.f2138b = i6 + 1;
    }

    public void j() {
    }

    public void k() {
    }

    public void l(v1 v1Var) {
        if (this.f4438a) {
            int i = AbstractC0602x.f8015a;
            Log.isLoggable("BillingLogger", 5);
        } else {
            try {
                ((C0031p0) this.f4439b).r(new I2.a(v1Var));
            } catch (Throwable unused) {
                int i3 = AbstractC0602x.f8015a;
                Log.isLoggable("BillingLogger", 5);
            }
        }
    }

    public B(K3.e eVar) {
        this.f4439b = eVar;
        this.f4438a = true;
    }
}

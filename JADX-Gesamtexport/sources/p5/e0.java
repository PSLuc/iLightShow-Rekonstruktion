package p5;

import B.AbstractC0013g0;
import java.util.Arrays;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.b f11048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f11049b;

    public e0(String str, byte[] bArr) {
        this.f11049b = new d0(str);
        Logger logger = t5.c.f12598a;
        this.f11048a = new t5.b(0, bArr.length, "PSK", bArr);
    }

    public t5.b a(d0 d0Var) {
        d0 d0Var2 = this.f11049b;
        if (!d0Var2.equals(d0Var)) {
            return null;
        }
        if (!d0Var2.f11038e) {
            String str = d0Var2.f11039f;
            d0Var.getClass();
            if (str == null) {
                throw new NullPointerException("public information must not be null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("public information must not be empty");
            }
            d0Var.f11039f = str;
            d0Var.f11038e = Arrays.equals(d0Var.f10440a, str.getBytes(m5.r.f10490a));
        }
        return t5.c.a(this.f11048a);
    }

    public e0(C0855u c0855u, d0 d0Var, t5.b bVar) {
        if (c0855u == null) {
            throw new NullPointerException("cid must not be null!");
        }
        if (d0Var != null) {
            if (bVar != null) {
                String str = bVar.i;
                if (!"MAC".equals(str) && !"PSK".equals(str)) {
                    throw new IllegalArgumentException(AbstractC0013g0.i("Secret must be either MAC for master secret, or PSK for secret key, but not ", str, "!"));
                }
            }
            this.f11049b = d0Var;
            this.f11048a = bVar;
            return;
        }
        throw new NullPointerException("PSK identity must not be null!");
    }
}

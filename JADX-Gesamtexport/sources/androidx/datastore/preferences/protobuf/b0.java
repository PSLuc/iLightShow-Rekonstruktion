package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public abstract c0 a(Object obj);

    public final boolean b(int i, C0426k c0426k, Object obj) throws InvalidProtocolBufferException {
        int i3 = c0426k.f6885b;
        int i6 = i3 >>> 3;
        int i7 = i3 & 7;
        if (i7 == 0) {
            c0426k.w(0);
            ((c0) obj).c(i6 << 3, Long.valueOf(c0426k.f6884a.n()));
            return true;
        }
        if (i7 == 1) {
            c0426k.w(1);
            ((c0) obj).c((i6 << 3) | 1, Long.valueOf(c0426k.f6884a.k()));
            return true;
        }
        if (i7 == 2) {
            ((c0) obj).c((i6 << 3) | 2, c0426k.e());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            c0426k.w(5);
            ((c0) obj).c(5 | (i6 << 3), Integer.valueOf(c0426k.f6884a.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        int i10 = i + 1;
        if (i10 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0426k.a() != Integer.MAX_VALUE && b(i10, c0426k, c0Var)) {
        }
        if (i9 != c0426k.f6885b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f6849e) {
            c0Var.f6849e = false;
        }
        ((c0) obj).c(i8 | 3, c0Var);
        return true;
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6882b;

    public AbstractC0425j(int i) {
        this.f6881a = i;
        this.f6882b = new byte[i];
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract C0422g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public void y() {
        boolean zX;
        do {
            int iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.f6881a;
            if (i >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f6881a = i + 1;
            zX = x(iU);
            this.f6881a--;
        } while (zX);
    }
}

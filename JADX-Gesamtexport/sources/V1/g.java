package V1;

import java.io.IOException;
import java.io.Writer;
import p009b2.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Writer implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5503h;
    public final Object i;

    public g(p009b2.a aVar) {
        this.f5503h = 0;
        this.i = new m(aVar);
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f5503h) {
            case 0:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5503h) {
            case 0:
                break;
            default:
                k();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f5503h) {
            case 0:
                break;
            default:
                k();
                break;
        }
    }

    public void k() {
        StringBuilder sb = (StringBuilder) this.i;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i3) {
        switch (this.f5503h) {
            case 0:
                ((m) this.i).b(cArr, i, i3);
                break;
            default:
                for (int i6 = 0; i6 < i3; i6++) {
                    char c6 = cArr[i + i6];
                    if (c6 == '\n') {
                        k();
                    } else {
                        ((StringBuilder) this.i).append(c6);
                    }
                }
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i3) {
        switch (this.f5503h) {
            case 0:
                append(charSequence, i, i3);
                return this;
            default:
                return super.append(charSequence, i, i3);
        }
    }

    public g() {
        this.f5503h = 1;
        this.i = new StringBuilder(128);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c6) throws IOException {
        switch (this.f5503h) {
            case 0:
                write(c6);
                return this;
            default:
                return super.append(c6);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(char c6) throws IOException {
        switch (this.f5503h) {
            case 0:
                write(c6);
                return this;
            default:
                return super.append(c6);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f5503h) {
            case 0:
                String string = charSequence.toString();
                ((m) this.i).a(0, string, string.length());
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        switch (this.f5503h) {
            case 0:
                ((m) this.i).b(cArr, 0, cArr.length);
                break;
            default:
                super.write(cArr);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        switch (this.f5503h) {
            case 0:
                ((m) this.i).a(0, str, str.length());
                break;
            default:
                super.write(str);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i3) {
        switch (this.f5503h) {
            case 0:
                String string = charSequence.subSequence(i, i3).toString();
                ((m) this.i).a(0, string, string.length());
                return this;
            default:
                return super.append(charSequence, i, i3);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i3) throws IOException {
        switch (this.f5503h) {
            case 0:
                ((m) this.i).a(i, str, i3);
                break;
            default:
                super.write(str, i, i3);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.f5503h) {
            case 0:
                char c6 = (char) i;
                m mVar = (m) this.i;
                if (mVar.f7085c >= 0) {
                    mVar.p(16);
                }
                mVar.f7091j = null;
                mVar.f7092k = null;
                char[] cArr = mVar.f7090h;
                if (mVar.i >= cArr.length) {
                    mVar.i();
                    cArr = mVar.f7090h;
                }
                int i3 = mVar.i;
                mVar.i = i3 + 1;
                cArr[i3] = c6;
                break;
            default:
                super.write(i);
                break;
        }
    }
}

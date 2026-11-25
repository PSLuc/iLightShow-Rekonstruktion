package h5;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: h5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0734l extends M, ReadableByteChannel {
    long F();

    String H(long j4);

    short I();

    int K(B b6);

    void N(long j4);

    long R();

    String S(Charset charset);

    InputStream U();

    byte W();

    C0732j a();

    boolean e(long j4);

    boolean f(long j4, C0735m c0735m);

    void g(byte[] bArr);

    C0735m i();

    C0735m j(long j4);

    void l(long j4);

    int p();

    G peek();

    long u();

    String w();

    byte[] x();

    void y(C0732j c0732j, long j4);

    boolean z();
}

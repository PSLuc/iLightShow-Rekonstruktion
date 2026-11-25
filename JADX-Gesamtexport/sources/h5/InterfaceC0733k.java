package h5;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: h5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0733k extends K, WritableByteChannel {
    InterfaceC0733k A(int i);

    InterfaceC0733k B(byte[] bArr);

    InterfaceC0733k E();

    InterfaceC0733k O(String str);

    InterfaceC0733k P(long j4);

    C0732j a();

    InterfaceC0733k d(byte[] bArr, int i, int i3);

    @Override // h5.K, java.io.Flushable
    void flush();

    InterfaceC0733k h(long j4);

    InterfaceC0733k m();

    InterfaceC0733k n(int i);

    InterfaceC0733k q(int i);

    long r(M m6);

    InterfaceC0733k t(C0735m c0735m);
}

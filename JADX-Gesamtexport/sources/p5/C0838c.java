package p5;

import java.io.Serializable;
import java.net.InetSocketAddress;

/* JADX INFO: renamed from: p5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0838c implements B, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InetSocketAddress f11033h;
    public final EnumC0837b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EnumC0835a f11034j;

    public C0838c(EnumC0837b enumC0837b, EnumC0835a enumC0835a, InetSocketAddress inetSocketAddress) {
        if (enumC0837b == null) {
            throw new NullPointerException("Level must not be null");
        }
        if (enumC0835a == null) {
            throw new NullPointerException("Description must not be null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        this.f11033h = inetSocketAddress;
        this.i = enumC0837b;
        this.f11034j = enumC0835a;
    }

    @Override // p5.B
    public final InetSocketAddress c() {
        return this.f11033h;
    }

    @Override // p5.B
    public final byte[] d() {
        m5.j jVar = new m5.j(false);
        jVar.b(this.i.f11031h, 8);
        jVar.b(this.f11034j.f11027h, 8);
        return jVar.a();
    }

    @Override // p5.B
    public final EnumC0857w g() {
        return EnumC0857w.ALERT;
    }

    @Override // p5.B
    public final int size() {
        return 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\tAlert Protocol");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tLevel: ");
        sb.append(this.i);
        sb.append(str);
        sb.append("\tDescription: ");
        sb.append(this.f11034j);
        sb.append(str);
        return sb.toString();
    }
}

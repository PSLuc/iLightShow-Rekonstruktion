package B2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p126x2.InterfaceC1118a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC1118a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f514b;

    public j(e eVar) {
        this.f514b = eVar;
        this.f513a = eVar.c();
    }

    @Override // p126x2.InterfaceC1118a
    public final boolean a() {
        return this.f514b.a();
    }

    @Override // p126x2.InterfaceC1118a
    public final long b(OutputStream outputStream) throws IllegalAccessException, IOException, InvocationTargetException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f514b.e());
        long jB = this.f514b.b(outputStream);
        f fVar = new f(byteArrayInputStream, 1);
        i iVar = new i(0, jB);
        Charset charset = M4.a.f3520a;
        E4.k.f("charset", charset);
        this.f514b = new e(fVar, iVar, charset);
        return jB;
    }

    @Override // p126x2.InterfaceC1118a
    public final Long c() {
        return this.f513a;
    }

    @Override // p126x2.InterfaceC1118a
    public final String d(String str) {
        return this.f514b.d(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && this.f514b.equals(((j) obj).f514b);
        }
        return true;
    }

    public final int hashCode() {
        return this.f514b.hashCode();
    }

    @Override // p126x2.InterfaceC1118a
    public final boolean isEmpty() {
        return this.f514b.isEmpty();
    }

    public final String toString() {
        return "RepeatableBody(body=" + this.f514b + ")";
    }
}

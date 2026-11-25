package n5;

import java.net.InetSocketAddress;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Mac;
import p5.C0850o;
import p5.EnumC0852q;
import q5.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f10566g = TimeUnit.MINUTES.toNanos(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t5.b f10568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t5.b f10569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantReadWriteLock f10570d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecureRandom f10571e = new SecureRandom();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f10572f = new byte[32];

    public static byte[] b(C0850o c0850o, t5.b bVar) throws InvalidKeyException {
        Mac macA = i.f11285q.f11292k.a();
        macA.init(bVar);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) c0850o.f603h;
        macA.update(inetSocketAddress.getAddress().getAddress());
        int port = inetSocketAddress.getPort();
        macA.update((byte) (port >>> 8));
        macA.update((byte) port);
        macA.update((byte) c0850o.f11121n.i);
        macA.update((byte) c0850o.f11121n.f11036h);
        macA.update(c0850o.f11122o.f10440a);
        macA.update(c0850o.f11123p.f10440a);
        macA.update(i.h(Collections.unmodifiableList(c0850o.f11125r)));
        macA.update(EnumC0852q.a(Collections.unmodifiableList(c0850o.f11126s)));
        return macA.doFinal();
    }

    public final byte[] a(C0850o c0850o) {
        byte[] bArr = this.f10572f;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f10570d;
        reentrantReadWriteLock.readLock().lock();
        long jNanoTime = System.nanoTime();
        try {
            t5.b bVar = this.f10568b;
            if (bVar == null || jNanoTime - this.f10567a >= 0) {
                reentrantReadWriteLock.readLock().unlock();
                reentrantReadWriteLock.writeLock().lock();
                try {
                    this.f10571e.nextBytes(bArr);
                    this.f10567a = jNanoTime + f10566g;
                    t5.c.b(this.f10569c);
                    this.f10569c = this.f10568b;
                    bVar = new t5.b(0, bArr == null ? 0 : bArr.length, "MAC", bArr);
                    this.f10568b = bVar;
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                reentrantReadWriteLock.readLock().unlock();
            }
            return b(c0850o, bVar);
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }
}

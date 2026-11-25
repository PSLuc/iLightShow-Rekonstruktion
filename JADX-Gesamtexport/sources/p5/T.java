package p5;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f11001b = LoggerFactory.getLogger((Class<?>) T.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11002a;

    public T() {
        this.f11002a = new ArrayList();
    }

    public static T b(m5.h hVar, InetSocketAddress inetSocketAddress) throws HandshakeException {
        try {
            ArrayList arrayList = new ArrayList();
            m5.h hVarD = hVar.d(hVar.e(16));
            while (hVarD.b()) {
                int iE = hVarD.e(16);
                m5.h hVarD2 = hVarD.d(hVarD.e(16));
                S sB = S.b(iE, hVarD2, inetSocketAddress);
                if (hVarD2.b()) {
                    throw new HandshakeException(String.format("Too many bytes, %d left, hello extension not completely parsed! hello extension type %d", Integer.valueOf(hVarD2.f(-1).length), Integer.valueOf(iE)), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                }
                if (sB != null) {
                    int i = sB.f11000a;
                    if (c(i, arrayList) != null) {
                        throw new HandshakeException("Hello message contains extension " + p012c.k.C(i) + " more than once!", new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                    }
                    arrayList.add(sB);
                } else {
                    f11001b.debug("Peer included an unknown extension type code [{}] in its Hello message", Integer.valueOf(iE));
                }
            }
            return new T(arrayList);
        } catch (IllegalArgumentException e6) {
            throw new HandshakeException("Hello message contained malformed extensions, " + e6.getMessage(), new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
        }
    }

    public static S c(int i, List list) {
        if (i == 0) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s6 = (S) it.next();
            if (AbstractC0916i.b(i, s6.f11000a)) {
                return s6;
            }
        }
        return null;
    }

    public final void a(S s6) {
        if (s6 != null) {
            ArrayList arrayList = this.f11002a;
            int i = s6.f11000a;
            if (c(i, arrayList) == null) {
                arrayList.add(s6);
                return;
            }
            throw new IllegalArgumentException("Hello Extension of type " + p012c.k.C(i) + " already added!");
        }
    }

    public final int d() {
        ArrayList arrayList = this.f11002a;
        int size = arrayList.size();
        int iC = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iC += ((S) obj).c();
        }
        return iC;
    }

    public final byte[] e() {
        ArrayList arrayList = this.f11002a;
        if (arrayList.isEmpty()) {
            return new byte[0];
        }
        m5.j jVar = new m5.j(false);
        jVar.b(d(), 16);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            S s6 = (S) obj;
            s6.getClass();
            m5.j jVar2 = new m5.j(false);
            jVar2.b(p012c.k.f(s6.f11000a), 16);
            s6.a(jVar2);
            jVar.c(jVar2.a());
        }
        return jVar.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\t\tExtensions Length: ");
        sb.append(d());
        ArrayList arrayList = this.f11002a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(m5.s.f10493b);
            sb.append((S) obj);
        }
        return sb.toString();
    }

    public T(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f11002a = arrayList2;
        arrayList2.addAll(arrayList);
    }
}

package q5;

import java.security.cert.CertificateFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p124x0.d0;
import w5.K;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p, r, p116v3.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11316h;

    public /* synthetic */ n(int i) {
        this.f11316h = i;
    }

    public static K a(short s6) {
        Object obj = K.f13502j.get(Short.valueOf(s6));
        if (obj == null) {
            obj = K.f13504l;
        }
        return (K) obj;
    }

    @Override // q5.p
    public Object b() {
        return CertificateFactory.getInstance("X.509");
    }

    @Override // q5.r
    public Object f(String str) {
        return new t(str);
    }

    @Override // p116v3.m
    public Object l() {
        switch (this.f11316h) {
            case 3:
                return new TreeSet();
            case 4:
                return new ArrayDeque();
            case 5:
                return new ConcurrentSkipListMap();
            case 6:
                return new TreeMap();
            default:
                return new p116v3.l(true);
        }
    }

    public n() {
        this.f11316h = 14;
        new ArrayList();
        new HashMap();
    }

    public n(d0 d0Var) {
        this.f11316h = 13;
        new CopyOnWriteArrayList();
    }
}

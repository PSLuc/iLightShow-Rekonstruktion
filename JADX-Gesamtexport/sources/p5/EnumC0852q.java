package p5;

import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: p5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0852q {
    NULL(0),
    DEFLATE(1);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f11135k = LoggerFactory.getLogger((Class<?>) EnumC0852q.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11137h;

    EnumC0852q(int i) {
        this.f11137h = i;
    }

    public static byte[] a(List list) {
        m5.j jVar = new m5.j(false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.b(((EnumC0852q) it.next()).f11137h, 8);
        }
        return jVar.a();
    }
}

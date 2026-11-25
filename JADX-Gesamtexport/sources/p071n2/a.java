package p071n2;

import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10536b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10537a;

    public a() {
        HashSet hashSet = new HashSet();
        this.f10537a = hashSet;
        hashSet.add(Object.class.getName());
        hashSet.add(Closeable.class.getName());
        hashSet.add(Serializable.class.getName());
        hashSet.add(AutoCloseable.class.getName());
        hashSet.add(Cloneable.class.getName());
        hashSet.add("java.util.logging.Handler");
        hashSet.add("javax.naming.Referenceable");
        hashSet.add("javax.sql.DataSource");
    }
}

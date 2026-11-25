package a5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f6343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6346g;

    public a(String str) {
        E4.k.f("serialName", str);
        this.f6340a = str;
        this.f6341b = u.f11237h;
        this.f6342c = new ArrayList();
        this.f6343d = new HashSet();
        this.f6344e = new ArrayList();
        this.f6345f = new ArrayList();
        this.f6346g = new ArrayList();
    }

    public static void a(a aVar, String str, g gVar) {
        u uVar = u.f11237h;
        aVar.getClass();
        E4.k.f("descriptor", gVar);
        if (!aVar.f6343d.add(str)) {
            StringBuilder sbW = p012c.k.w("Element with name '", str, "' is already registered in ");
            sbW.append(aVar.f6340a);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        aVar.f6342c.add(str);
        aVar.f6344e.add(gVar);
        aVar.f6345f.add(uVar);
        aVar.f6346g.add(false);
    }
}

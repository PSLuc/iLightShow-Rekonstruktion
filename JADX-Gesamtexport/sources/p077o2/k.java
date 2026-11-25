package p077o2;

import T1.r;
import p015c2.f;
import p015c2.h;
import p104t2.n;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10646e;

    public k(h hVar, n nVar, r rVar) {
        super(hVar, nVar, rVar);
        String name = hVar.f7281k.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f10645d = "";
            this.f10646e = ".";
        } else {
            this.f10646e = name.substring(0, iLastIndexOf + 1);
            this.f10645d = name.substring(0, iLastIndexOf);
        }
    }

    @Override // p077o2.i, p077o2.o
    public final String b(Object obj) {
        String name = obj.getClass().getName();
        String str = this.f10646e;
        return name.startsWith(str) ? name.substring(str.length() - 1) : name;
    }

    @Override // p077o2.i
    public final h f(f fVar, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.f10645d;
            StringBuilder sb = new StringBuilder(str2.length() + length);
            if (str2.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(str2);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.f(fVar, str);
    }
}

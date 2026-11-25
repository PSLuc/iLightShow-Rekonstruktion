package H0;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class p implements u {
    @Override // H0.u
    public StaticLayout a(v vVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(vVar.f1713a, 0, vVar.f1714b, vVar.f1715c, vVar.f1716d);
        builderObtain.setTextDirection(vVar.f1717e);
        builderObtain.setAlignment(vVar.f1718f);
        builderObtain.setMaxLines(vVar.f1719g);
        builderObtain.setEllipsize(vVar.f1720h);
        builderObtain.setEllipsizedWidth(vVar.i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(vVar.f1722k);
        builderObtain.setBreakStrategy(vVar.f1723l);
        builderObtain.setHyphenationFrequency(vVar.f1726o);
        builderObtain.setIndents(null, null);
        int i = Build.VERSION.SDK_INT;
        q.a(builderObtain, vVar.f1721j);
        r.a(builderObtain, true);
        if (i >= 33) {
            s.b(builderObtain, vVar.f1724m, vVar.f1725n);
        }
        return builderObtain.build();
    }
}

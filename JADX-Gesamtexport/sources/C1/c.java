package C1;

import E4.k;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public /* synthetic */ c() {
        this(a.i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        k.f("initialExtras", bVar);
        ((LinkedHashMap) this.f603h).putAll((LinkedHashMap) bVar.f603h);
    }
}

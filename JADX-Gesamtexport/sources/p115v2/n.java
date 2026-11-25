package p115v2;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractMap.SimpleEntry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f13235h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, l lVar) {
        super(lVar.f13231h, lVar.a());
        this.f13235h = oVar;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13235h.g(getKey(), obj, false);
        return super.setValue(obj);
    }
}

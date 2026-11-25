package p037g2;

import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.deser.std.g0;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import p015c2.f;
import p015c2.h;

/* JADX INFO: loaded from: classes.dex */
public final class D extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f9104h;
    public final String i;

    public D(h hVar, String str) {
        super(hVar);
        this.f9104h = hVar;
        this.i = str;
    }

    @Override // p015c2.j
    public final Object deserialize(i iVar, f fVar) throws InvalidDefinitionException {
        Object objX;
        if (iVar.s() == k.VALUE_EMBEDDED_OBJECT && ((objX = iVar.X()) == null || this.f9104h.f7281k.isAssignableFrom(objX.getClass()))) {
            return objX;
        }
        fVar.O(this.i);
        throw null;
    }
}

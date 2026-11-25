package p037g2;

import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.lang.reflect.Constructor;
import p015c2.f;
import p032f2.q;
import p032f2.r;
import p071n2.d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Constructor f9142u;

    public j(r rVar, Constructor constructor) {
        super(rVar);
        this.f9142u = constructor;
    }

    @Override // p032f2.q
    public final r F(r rVar) {
        return rVar == this.f8931t ? this : new j(rVar, this.f9142u);
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        Object objDeserializeWithType;
        Constructor constructor = this.f9142u;
        k kVarS = iVar.s();
        k kVar = k.VALUE_NULL;
        p015c2.j jVar = this.f8935l;
        if (kVarS == kVar) {
            objDeserializeWithType = jVar.getNullValue(fVar);
        } else {
            d dVar = this.f8936m;
            if (dVar != null) {
                objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
            } else {
                try {
                    Object objNewInstance = constructor.newInstance(obj);
                    jVar.deserialize(iVar, fVar, objNewInstance);
                    objDeserializeWithType = objNewInstance;
                } catch (Exception e6) {
                    String strS = p012c.k.s("Failed to instantiate class ", constructor.getDeclaringClass().getName(), ", problem: ", e6.getMessage());
                    Throwable thQ = p109u2.i.q(e6);
                    p109u2.i.E(thQ);
                    p109u2.i.C(thQ);
                    throw new IllegalArgumentException(strS, thQ);
                }
            }
        }
        z(obj, objDeserializeWithType);
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) {
        return this.f8931t.A(obj, i(iVar, fVar));
    }
}

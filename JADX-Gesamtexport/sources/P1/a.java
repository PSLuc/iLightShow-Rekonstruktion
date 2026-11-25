package P1;

import D.x;
import R1.b;
import R1.c;
import R1.d;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.LinkedHashMap;
import p015c2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p055k2.a f4596c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4598b;

    static {
        p2.a aVar = new p2.a();
        aVar.a(d.class, new c(1));
        aVar.a(b.class, new c(0));
        p055k2.a aVar2 = new p055k2.a();
        aVar2.h(r.SORT_PROPERTIES_ALPHABETICALLY, true);
        aVar2.l(aVar);
        f4596c = aVar2;
    }

    public a(x xVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        try {
            p055k2.a aVar = f4596c;
            this.f4597a = aVar.m(new b(linkedHashMap));
            this.f4598b = aVar.m(new d(linkedHashMap2));
        } catch (JsonProcessingException e6) {
            throw new JWTCreationException("Some of the Claims couldn't be converted to a valid JSON format.", e6);
        }
    }
}

package p087q2;

import T1.e;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.Serializable;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends JsonNode implements Serializable {
    @Override // p015c2.m
    public abstract void c(e eVar, E e6);

    public String toString() {
        try {
            return l.f11221a.d(new k(this));
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }
}

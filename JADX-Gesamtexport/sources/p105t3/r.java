package p105t3;

import com.google.gson.internal.bind.N;
import com.google.gson.internal.bind.Z;
import java.io.IOException;
import java.io.StringWriter;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public int c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final o d() {
        if (this instanceof o) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final t g() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final u i() {
        if (this instanceof u) {
            return (u) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f14654o = 1;
            Z.f8079z.getClass();
            N.d(this, cVar);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}

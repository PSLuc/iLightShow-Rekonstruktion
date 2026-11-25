package d5;

import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class o extends JsonPrimitive {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8622h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, boolean z5) {
        super(null);
        E4.k.f("body", str);
        this.f8622h = z5;
        this.i = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f8622h == oVar.f8622h && E4.k.a(this.i, oVar.i);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (Boolean.hashCode(this.f8622h) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean isString() {
        return this.f8622h;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z5 = this.f8622h;
        String str = this.i;
        if (!z5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        e5.p.a(sb, str);
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }
}

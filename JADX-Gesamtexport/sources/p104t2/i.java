package p104t2;

import p015c2.h;
import p015c2.j;

/* JADX INFO: loaded from: classes.dex */
public class i extends j {
    public i(Class cls, m mVar, h hVar, h[] hVarArr) {
        super(cls, mVar, hVar, hVarArr, 0, null, null, false);
    }

    public static i z0(Class cls) {
        return new i(cls, null, null, null, 0, null, null, false);
    }

    @Override // p015c2.h
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public i s0(j jVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // p015c2.h
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public i u0() {
        return this.f7285o ? this : new i(this.f7281k, this.f12515r, this.f12513p, this.f12514q, 0, this.f7283m, this.f7284n, true);
    }

    @Override // p015c2.h
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public i v0(Object obj) {
        return this.f7284n == obj ? this : new i(this.f7281k, this.f12515r, this.f12513p, this.f12514q, 0, this.f7283m, obj, this.f7285o);
    }

    @Override // p015c2.h
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public i w0(Object obj) {
        return obj == this.f7283m ? this : new i(this.f7281k, this.f12515r, this.f12513p, this.f12514q, 0, obj, this.f7284n, this.f7285o);
    }

    @Override // p015c2.h
    public StringBuilder Z(StringBuilder sb) {
        j.x0(this.f7281k, sb, true);
        return sb;
    }

    @Override // p015c2.h
    public StringBuilder a0(StringBuilder sb) {
        j.x0(this.f7281k, sb, false);
        m mVar = this.f12515r;
        int length = mVar.i.length;
        if (length > 0) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                sb = mVar.d(i).a0(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // p015c2.h
    public boolean e0() {
        return this instanceof g;
    }

    @Override // p015c2.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f7281k != this.f7281k) {
            return false;
        }
        return this.f12515r.equals(iVar.f12515r);
    }

    @Override // p015c2.h
    public final boolean k0() {
        return false;
    }

    @Override // p015c2.h
    public h p0(Class cls, m mVar, h hVar, h[] hVarArr) {
        return null;
    }

    @Override // p015c2.h
    public h q0(h hVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // p015c2.h
    public h r0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // p015c2.h
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(y0());
        sb.append(']');
        return sb.toString();
    }

    @Override // p104t2.j
    public String y0() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7281k;
        sb.append(cls.getName());
        m mVar = this.f12515r;
        int length = mVar.i.length;
        if (length > 0 && cls.getTypeParameters().length == length) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                h hVarD = mVar.d(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(((j) hVarD).y0());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public i(Class cls) {
        this(cls, m.f12529n, null, null);
    }
}

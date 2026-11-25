package D3;

import E0.o;
import E0.r;
import N.M;
import java.util.Comparator;
import p124x0.D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f809a;

    public /* synthetic */ k(int i) {
        this.f809a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f809a) {
            case 0:
                j jVar = (j) obj;
                j jVar2 = (j) obj2;
                String str = jVar != null ? jVar.f800b : null;
                String str2 = jVar2 != null ? jVar2.f800b : null;
                if (str == null || str2 == null) {
                    return 0;
                }
                return str.compareTo(str2) < 0 ? -1 : 1;
            case 1:
                p084p4.h hVar = (p084p4.h) obj;
                p084p4.h hVar2 = (p084p4.h) obj2;
                return (((Number) hVar.i).intValue() - ((Number) hVar.f10849h).intValue()) - (((Number) hVar2.i).intValue() - ((Number) hVar2.f10849h).intValue());
            case 2:
                return E4.k.h(((M) obj).f3628b, ((M) obj2).f3628b);
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b6 = bArr[i];
                    byte b7 = bArr2[i];
                    if (b6 != b7) {
                        return b6 - b7;
                    }
                }
                return 0;
            case 4:
                D d6 = (D) obj;
                D d7 = (D) obj2;
                float f6 = d6.f13829D.f13923r.f13889F;
                float f7 = d7.f13829D.f13923r.f13889F;
                return f6 == f7 ? E4.k.h(d6.s(), d7.s()) : Float.compare(f6, f7);
            default:
                E0.l lVar = (E0.l) obj2;
                E0.h hVar3 = ((E0.l) obj).f947d;
                r rVar = o.f983n;
                Object objValueOf = hVar3.f939h.get(rVar);
                if (objValueOf == null) {
                    objValueOf = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objValueOf).floatValue();
                Object objValueOf2 = lVar.f947d.f939h.get(rVar);
                if (objValueOf2 == null) {
                    objValueOf2 = Float.valueOf(0.0f);
                }
                return Float.compare(fFloatValue, ((Number) objValueOf2).floatValue());
        }
    }
}

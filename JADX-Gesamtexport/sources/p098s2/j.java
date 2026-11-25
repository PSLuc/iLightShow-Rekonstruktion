package p098s2;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.Arrays;
import p015c2.o;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l[] f12181k;

    public j(AbstractC0599v0 abstractC0599v0, l[] lVarArr) {
        this.f12181k = lVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final AbstractC0599v0 G(Class cls, o oVar) {
        l[] lVarArr = this.f12181k;
        int length = lVarArr.length;
        if (length == 8) {
            return this;
        }
        l[] lVarArr2 = (l[]) Arrays.copyOf(lVarArr, length + 1);
        lVarArr2[length] = new l(cls, oVar);
        return new j(this, lVarArr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final o I(Class cls) {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l[] lVarArr = this.f12181k;
        l lVar5 = lVarArr[0];
        if (lVar5.f12184a == cls) {
            return lVar5.f12185b;
        }
        l lVar6 = lVarArr[1];
        if (lVar6.f12184a == cls) {
            return lVar6.f12185b;
        }
        l lVar7 = lVarArr[2];
        if (lVar7.f12184a == cls) {
            return lVar7.f12185b;
        }
        switch (lVarArr.length) {
            case 4:
                lVar = lVarArr[3];
                if (lVar.f12184a == cls) {
                    return lVar.f12185b;
                }
                return null;
            case 5:
                lVar2 = lVarArr[4];
                if (lVar2.f12184a == cls) {
                    return lVar2.f12185b;
                }
                lVar = lVarArr[3];
                if (lVar.f12184a == cls) {
                    return lVar.f12185b;
                }
                return null;
            case 6:
                lVar3 = lVarArr[5];
                if (lVar3.f12184a == cls) {
                    return lVar3.f12185b;
                }
                lVar2 = lVarArr[4];
                if (lVar2.f12184a == cls) {
                    return lVar2.f12185b;
                }
                lVar = lVarArr[3];
                if (lVar.f12184a == cls) {
                    return lVar.f12185b;
                }
                return null;
            case 7:
                lVar4 = lVarArr[6];
                if (lVar4.f12184a == cls) {
                    return lVar4.f12185b;
                }
                lVar3 = lVarArr[5];
                if (lVar3.f12184a == cls) {
                    return lVar3.f12185b;
                }
                lVar2 = lVarArr[4];
                if (lVar2.f12184a == cls) {
                    return lVar2.f12185b;
                }
                lVar = lVarArr[3];
                if (lVar.f12184a == cls) {
                    return lVar.f12185b;
                }
                return null;
            case 8:
                l lVar8 = lVarArr[7];
                if (lVar8.f12184a == cls) {
                    return lVar8.f12185b;
                }
                lVar4 = lVarArr[6];
                if (lVar4.f12184a == cls) {
                    return lVar4.f12185b;
                }
                lVar3 = lVarArr[5];
                if (lVar3.f12184a == cls) {
                    return lVar3.f12185b;
                }
                lVar2 = lVarArr[4];
                if (lVar2.f12184a == cls) {
                    return lVar2.f12185b;
                }
                lVar = lVarArr[3];
                if (lVar.f12184a == cls) {
                    return lVar.f12185b;
                }
                return null;
            default:
                return null;
        }
    }
}

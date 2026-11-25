package q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p096s.AbstractC0916i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f11284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f11285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f11286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f11287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f11288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i[] f11289u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11290h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f11291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f11292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f11293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11296o;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        f fVar = f.f11267j;
        e eVar = e.AES_128_GCM;
        g gVar = g.NULL;
        i iVar = new i("TLS_ECDHE_PSK_WITH_AES_128_GCM_SHA256", 0, 53249, 1, fVar, eVar, gVar, true);
        e eVar2 = e.AES_256_GCM;
        h hVar = h.TLS_PRF_SHA384;
        i iVar2 = new i("TLS_ECDHE_PSK_WITH_AES_256_GCM_SHA378", 1, 53250, 1, fVar, eVar2, gVar, true, hVar);
        e eVar3 = e.AES_128_CCM_8;
        i iVar3 = new i("TLS_ECDHE_PSK_WITH_AES_128_CCM_8_SHA256", 2, 53251, 1, fVar, eVar3, gVar, true);
        e eVar4 = e.AES_128_CCM;
        i iVar4 = new i("TLS_ECDHE_PSK_WITH_AES_128_CCM_SHA256", 3, 53253, 1, fVar, eVar4, gVar, true);
        f fVar2 = f.i;
        i iVar5 = new i("TLS_PSK_WITH_AES_128_GCM_SHA256", 4, 168, 1, fVar2, eVar, gVar, true);
        f11284p = iVar5;
        i iVar6 = new i("TLS_PSK_WITH_AES_256_GCM_SHA378", 5, 169, 1, fVar2, eVar2, gVar, true, hVar);
        i iVar7 = new i("TLS_PSK_WITH_AES_128_CCM_8", 6, 49320, 1, fVar2, eVar3, gVar, true);
        e eVar5 = e.AES_256_CCM_8;
        i iVar8 = new i("TLS_PSK_WITH_AES_256_CCM_8", 7, 49321, 1, fVar2, eVar5, gVar, true);
        i iVar9 = new i("TLS_PSK_WITH_AES_128_CCM", 8, 49316, 1, fVar2, eVar4, gVar, true);
        e eVar6 = e.AES_256_CCM;
        i iVar10 = new i("TLS_PSK_WITH_AES_256_CCM", 9, 49317, 1, fVar2, eVar6, gVar, true);
        e eVar7 = e.AES_128_CBC;
        g gVar2 = g.HMAC_SHA256;
        i iVar11 = new i("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256", 10, 49207, 1, fVar, eVar7, gVar2, false);
        i iVar12 = new i("TLS_PSK_WITH_AES_128_CBC_SHA256", 11, 174, 1, fVar2, eVar7, gVar2, false);
        f11285q = iVar12;
        f fVar3 = f.f11268k;
        i iVar13 = new i("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 12, 49195, 4, fVar3, eVar, gVar, true);
        i iVar14 = new i("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 13, 49196, 4, fVar3, eVar2, gVar, true, hVar);
        i iVar15 = new i("TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8", 14, 49326, 4, fVar3, eVar3, gVar, true);
        i iVar16 = new i("TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8", 15, 49327, 4, fVar3, eVar5, gVar, true);
        i iVar17 = new i("TLS_ECDHE_ECDSA_WITH_AES_128_CCM", 16, 49324, 4, fVar3, eVar4, gVar, true);
        i iVar18 = new i("TLS_ECDHE_ECDSA_WITH_AES_256_CCM", 17, 49325, 4, fVar3, eVar6, gVar, true);
        e eVar8 = e.AES_256_CBC;
        i iVar19 = new i("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 18, 49162, 4, fVar3, eVar8, g.HMAC_SHA1, false);
        i iVar20 = new i("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 19, 49187, 4, fVar3, eVar7, gVar2, false);
        i iVar21 = new i("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 20, 49188, 4, fVar3, eVar8, g.HMAC_SHA384, false, hVar);
        i iVar22 = new i("TLS_NULL_WITH_NULL_NULL", 21, 0, 1, f.f11266h, e.NULL, gVar, false);
        f11286r = iVar22;
        f11289u = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22};
        f11287s = LoggerFactory.getLogger((Class<?>) i.class);
        f11288t = 0;
    }

    public i(String str, int i, int i3, int i6, f fVar, e eVar, g gVar, boolean z5) {
        this(str, i, i3, i6, fVar, eVar, gVar, z5, h.TLS_PRF_SHA256);
    }

    public static ArrayList a(boolean z5, f... fVarArr) {
        if (fVarArr.length == 0) {
            throw new IllegalArgumentException("KeyExchangeAlgorithms must not be empty!");
        }
        List listAsList = Arrays.asList(fVarArr);
        if (listAsList == null) {
            throw new NullPointerException("KeyExchangeAlgorithms must not be null!");
        }
        if (listAsList.isEmpty()) {
            throw new IllegalArgumentException("KeyExchangeAlgorithms must not be empty!");
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : values()) {
            if ((!z5 || iVar.f11295n) && iVar.g() && listAsList.contains(iVar.i)) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public static i e(int i) {
        for (i iVar : values()) {
            if (iVar.f11290h == i) {
                return iVar;
            }
        }
        Logger logger = f11287s;
        if (!logger.isTraceEnabled()) {
            return null;
        }
        logger.trace("Cannot resolve cipher suite code [{}]", Integer.toHexString(i));
        return null;
    }

    public static byte[] h(List list) {
        m5.j jVar = new m5.j(false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.b(((i) it.next()).f11290h, 16);
        }
        return jVar.a();
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f11289u.clone();
    }

    public final int b() {
        g gVar = g.NULL;
        g gVar2 = this.f11292k;
        return gVar2 == gVar ? this.f11291j.f11263m : gVar2.i;
    }

    public final Cipher c() {
        o oVar = this.f11291j.f11265o;
        if (oVar == null) {
            return null;
        }
        return (Cipher) oVar.a();
    }

    public final Mac d() {
        return this.f11293l.f11283h.a();
    }

    public final boolean f() {
        if (AbstractC0916i.b(4, this.f11296o)) {
            return true;
        }
        f fVar = f.f11267j;
        f fVar2 = this.i;
        return fVar.equals(fVar2) || f.f11268k.equals(fVar2);
    }

    public final boolean g() {
        return this.f11293l.f11283h.f11278l && this.f11292k.f11278l && this.f11291j.f11264n;
    }

    public final boolean i() {
        return !AbstractC0916i.b(1, this.f11296o);
    }

    public i(String str, int i, int i3, int i6, f fVar, e eVar, g gVar, boolean z5, h hVar) {
        super(str, i);
        this.f11290h = i3;
        this.f11296o = i6;
        this.i = fVar;
        this.f11291j = eVar;
        this.f11292k = gVar;
        this.f11295n = z5;
        this.f11293l = hVar;
        int iD = AbstractC0916i.d(eVar.i);
        int i7 = eVar.f11262l;
        if (iD == 2) {
            this.f11294m = gVar.i + i7 + i7 + 1;
        } else if (iD != 3) {
            this.f11294m = 0;
        } else {
            this.f11294m = i7 + eVar.f11263m;
        }
    }
}

package p5;

import B.AbstractC0013g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p015c2.AbstractC0473d;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: p5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0844i extends S {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f11069d = LoggerFactory.getLogger((Class<?>) AbstractC0844i.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11071c;

    public AbstractC0844i(int i, m5.h hVar) {
        ArrayList arrayList;
        EnumC0843h enumC0843h;
        super(i);
        if (!hVar.b()) {
            throw new IllegalArgumentException("extension data must not be empty!");
        }
        boolean z5 = hVar.a() > 8;
        this.f11070b = z5;
        EnumC0843h enumC0843h2 = EnumC0843h.X_509;
        EnumC0843h enumC0843h3 = EnumC0843h.OPEN_PGP;
        EnumC0843h enumC0843h4 = EnumC0843h.RAW_PUBLIC_KEY;
        Logger logger = f11069d;
        if (z5) {
            int iE = hVar.e(8);
            arrayList = new ArrayList(iE);
            m5.h hVarD = hVar.d(iE);
            while (hVarD.b()) {
                int iE2 = hVarD.e(8);
                if (iE2 == 0) {
                    enumC0843h = enumC0843h2;
                } else if (iE2 != 1) {
                    enumC0843h = iE2 != 2 ? null : enumC0843h4;
                } else {
                    enumC0843h = enumC0843h3;
                }
                if (enumC0843h != null) {
                    arrayList.add(enumC0843h);
                } else {
                    logger.debug("Client indicated preference for unknown {} certificate type code [{}]", AbstractC0916i.b(this.f11000a, 20) ? "client" : "server", Integer.valueOf(iE2));
                }
            }
        } else {
            int iE3 = hVar.e(8);
            if (iE3 != 0) {
                if (iE3 != 1) {
                    enumC0843h2 = iE3 != 2 ? null : enumC0843h4;
                } else {
                    enumC0843h2 = enumC0843h3;
                }
            }
            if (enumC0843h2 == null) {
                logger.debug("Server selected an unknown {} certificate type code [{}]", AbstractC0916i.b(i, 20) ? "client" : "server", Integer.valueOf(iE3));
                throw new IllegalArgumentException(AbstractC0013g0.f(iE3, "unknown certificate type code ", "!"));
            }
            arrayList = new ArrayList(1);
            arrayList.add(enumC0843h2);
        }
        this.f11071c = AbstractC0473d.E(arrayList);
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        boolean z5 = this.f11070b;
        List list = this.f11071c;
        if (!z5) {
            jVar.b(1, 16);
            jVar.b(((EnumC0843h) list.get(0)).f11065h, 8);
            return;
        }
        int size = list.size();
        jVar.b(size + 1, 16);
        jVar.b(size, 8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.b(((EnumC0843h) it.next()).f11065h, 8);
        }
    }

    @Override // p5.S
    public final int c() {
        if (this.f11070b) {
            return this.f11071c.size() + 5;
        }
        return 5;
    }

    public AbstractC0844i(int i, List list) {
        super(i);
        if (list != null) {
            if (!list.isEmpty()) {
                this.f11070b = true;
                this.f11071c = list;
                return;
            }
            throw new IllegalArgumentException("certificate types data must not be empty!");
        }
        throw new NullPointerException("certificate types must not be null!");
    }

    public AbstractC0844i(int i, EnumC0843h enumC0843h) {
        super(i);
        if (enumC0843h != null) {
            this.f11070b = false;
            ArrayList arrayList = new ArrayList(1);
            this.f11071c = arrayList;
            arrayList.add(enumC0843h);
            return;
        }
        throw new NullPointerException("certificate type must not be null!");
    }
}

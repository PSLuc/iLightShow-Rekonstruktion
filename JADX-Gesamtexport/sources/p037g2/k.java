package p037g2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p015c2.f;
import p032f2.s;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f9143j = new k(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f9144k = new k(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f9145l = new k(2);
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i) {
        super(ArrayList.class);
        this.i = i;
        switch (i) {
            case 1:
                super(HashMap.class);
                break;
            case 2:
                super(LinkedHashMap.class);
                break;
            default:
                break;
        }
    }

    @Override // p032f2.t
    public final boolean j() {
        switch (this.i) {
        }
        return true;
    }

    @Override // p032f2.t
    public final boolean l() {
        switch (this.i) {
        }
        return true;
    }

    @Override // p032f2.t
    public final Object v(f fVar) {
        switch (this.i) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }
}

package E0;

import java.util.ArrayList;
import java.util.List;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class n extends E4.l implements D4.e {
    public static final n i = new n(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f953j = new n(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f954k = new n(2, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f955l = new n(2, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f956m = new n(2, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f957n = new n(2, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f958o = new n(2, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n f959p = new n(2, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f960q = new n(2, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f961r = new n(2, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n f962s = new n(2, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f963t = new n(2, 11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i3, int i6) {
        super(i3);
        this.f964h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        String str;
        p084p4.e eVar;
        switch (this.f964h) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListU0 = p089q4.l.u0(list);
                arrayListU0.addAll(list2);
                return arrayListU0;
            case 1:
                return (x) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                e eVar2 = (e) obj;
                int i3 = ((e) obj2).f911a;
                return eVar2;
            case 6:
                return (String) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListU1 = p089q4.l.u0(list3);
                arrayListU1.addAll(list4);
                return arrayListU1;
            case 8:
                Float f6 = (Float) obj;
                ((Number) obj2).floatValue();
                return f6;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f902a) == null) {
                    str = aVar2.f902a;
                }
                if (aVar == null || (eVar = aVar.f903b) == null) {
                    eVar = aVar2.f903b;
                }
                return new a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}

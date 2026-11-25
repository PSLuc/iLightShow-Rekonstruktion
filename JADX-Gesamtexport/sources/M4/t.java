package M4;

import N.C0230o;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class t extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3547h = 0;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3548j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List list, boolean z5) {
        super(2);
        this.f3548j = list;
        this.i = z5;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[LOOP:0: B:31:0x0091->B:42:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0104 A[SYNTHETIC] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i;
        Object next;
        p084p4.h hVar;
        Object next2;
        String str;
        String str2;
        switch (this.f3547h) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                E4.k.f("$this$$receiver", charSequence);
                List list = (List) this.f3548j;
                boolean z5 = this.i;
                if (z5 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    J4.d dVar = new J4.d(iIntValue, charSequence.length(), 1);
                    boolean z6 = charSequence instanceof String;
                    int i3 = dVar.f1942j;
                    int i6 = dVar.i;
                    if (z6) {
                        if ((i3 <= 0 || iIntValue > i6) && (i3 >= 0 || i6 > iIntValue)) {
                            hVar = null;
                        } else {
                            int i7 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        hVar = new p084p4.h(Integer.valueOf(i7), str);
                                    } else if (i7 != i6) {
                                        i7 += i3;
                                    } else {
                                        hVar = null;
                                    }
                                } while (!s.S(0, i7, str2.length(), str2, (String) charSequence, z5));
                                str = (String) next2;
                                if (str != null) {
                                    hVar = new p084p4.h(Integer.valueOf(i7), str);
                                } else if (i7 != i6) {
                                    i7 += i3;
                                } else {
                                    hVar = null;
                                }
                            }
                        }
                    } else if ((i3 <= 0 || iIntValue > i6) && (i3 >= 0 || i6 > iIntValue)) {
                        hVar = null;
                    } else {
                        int i8 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str3 = (String) next;
                                    i = i6;
                                    if (!l.o0(str3, 0, charSequence, i8, str3.length(), z5)) {
                                        i6 = i;
                                    }
                                } else {
                                    i = i6;
                                    next = null;
                                }
                            }
                            String str4 = (String) next;
                            if (str4 != null) {
                                hVar = new p084p4.h(Integer.valueOf(i8), str4);
                            } else if (i8 != i) {
                                i8 += i3;
                                i6 = i;
                            } else {
                                hVar = null;
                            }
                        }
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iG0 = l.g0(charSequence, str5, iIntValue, 4);
                    if (iG0 < 0) {
                        hVar = null;
                    } else {
                        hVar = new p084p4.h(Integer.valueOf(iG0), str5);
                    }
                }
                if (hVar == null) {
                    return null;
                }
                return new p084p4.h(hVar.f10849h, Integer.valueOf(((String) hVar.i).length()));
            default:
                ((Number) obj2).intValue();
                p006b.a.d(this.i, (D4.e) this.f3548j, (C0230o) obj, 1);
                return x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z5, D4.e eVar, int i) {
        super(2);
        this.i = z5;
        this.f3548j = eVar;
    }
}

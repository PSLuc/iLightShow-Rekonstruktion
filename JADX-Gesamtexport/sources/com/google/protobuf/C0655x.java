package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655x extends AbstractC0657z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f8226c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.protobuf.AbstractC0657z
    public final void a(long j4, Object obj) {
        Object objUnmodifiableList;
        List list = (List) e0.f8204c.i(j4, obj);
        if (list instanceof InterfaceC0654w) {
            objUnmodifiableList = ((InterfaceC0654w) list).h();
        } else {
            if (f8226c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof N) && (list instanceof InterfaceC0651t)) {
                AbstractC0634b abstractC0634b = (AbstractC0634b) ((InterfaceC0651t) list);
                boolean z5 = abstractC0634b.f8196h;
                if (z5 && z5) {
                    abstractC0634b.f8196h = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        e0.n(j4, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC0657z
    public final void b(long j4, Object obj, Object obj2) {
        List list;
        List list2;
        List listE;
        d0 d0Var = e0.f8204c;
        List list3 = (List) d0Var.i(j4, obj2);
        int size = list3.size();
        List list4 = (List) d0Var.i(j4, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof InterfaceC0654w) {
                listE = new C0653v(size);
            } else {
                listE = ((list4 instanceof N) && (list4 instanceof InterfaceC0651t)) ? ((InterfaceC0651t) list4).e(size) : new ArrayList(size);
            }
            e0.n(j4, obj, listE);
            list2 = listE;
        } else {
            if (f8226c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                e0.n(j4, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof Z) {
                C0653v c0653v = new C0653v(list4.size() + size);
                c0653v.addAll((Z) list4);
                e0.n(j4, obj, c0653v);
                list = c0653v;
            } else {
                boolean z5 = list4 instanceof N;
                list2 = list4;
                if (z5) {
                    boolean z6 = list4 instanceof InterfaceC0651t;
                    list2 = list4;
                    if (z6) {
                        InterfaceC0651t interfaceC0651t = (InterfaceC0651t) list4;
                        list2 = list4;
                        if (!((AbstractC0634b) interfaceC0651t).f8196h) {
                            InterfaceC0651t interfaceC0651tE = interfaceC0651t.e(list4.size() + size);
                            e0.n(j4, obj, interfaceC0651tE);
                            list2 = interfaceC0651tE;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        e0.n(j4, obj, list3);
    }
}

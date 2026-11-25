package p116v3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractSet {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13269h;
    public final /* synthetic */ l i;

    public /* synthetic */ j(l lVar, int i) {
        this.f13269h = i;
        this.i = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13269h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        k kVarA;
        switch (this.f13269h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = this.i;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f13276o, entry.getValue())) {
                    kVar = kVarA;
                }
                return kVar != null;
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13269h) {
            case 0:
                return new i(this.i, 0);
            default:
                return new i(this.i, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        k kVarA;
        switch (this.f13269h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                l lVar = this.i;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f13276o, entry.getValue())) {
                    kVar = kVarA;
                }
                if (kVar == null) {
                    return false;
                }
                lVar.c(kVar, true);
                return true;
            default:
                l lVar2 = this.i;
                k kVarA2 = null;
                if (obj != null) {
                    try {
                        kVarA2 = lVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVarA2 != null) {
                    lVar2.c(kVarA2, true);
                }
                return kVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f13269h) {
            case 0:
                break;
        }
        return this.i.f13281k;
    }
}

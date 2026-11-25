package c5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: c5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479c extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L f7432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479c(Y4.a aVar, int i) {
        super(aVar);
        this.f7431b = i;
        switch (i) {
            case 1:
                E4.k.f("eSerializer", aVar);
                super(aVar);
                a5.g descriptor = aVar.getDescriptor();
                E4.k.f("elementDesc", descriptor);
                this.f7432c = new C0477b(descriptor, 2);
                break;
            case 2:
                E4.k.f("eSerializer", aVar);
                super(aVar);
                a5.g descriptor2 = aVar.getDescriptor();
                E4.k.f("elementDesc", descriptor2);
                this.f7432c = new C0477b(descriptor2, 3);
                break;
            default:
                E4.k.f("element", aVar);
                a5.g descriptor3 = aVar.getDescriptor();
                E4.k.f("elementDesc", descriptor3);
                this.f7432c = new C0477b(descriptor3, 1);
                break;
        }
    }

    @Override // c5.AbstractC0475a
    public final Object a() {
        switch (this.f7431b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // c5.AbstractC0475a
    public final int b(Object obj) {
        switch (this.f7431b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                E4.k.f("<this>", arrayList);
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                E4.k.f("<this>", hashSet);
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                E4.k.f("<this>", linkedHashSet);
                return linkedHashSet.size();
        }
    }

    @Override // c5.AbstractC0475a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        E4.k.f("<this>", collection);
        return collection.iterator();
    }

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        E4.k.f("<this>", collection);
        return collection.size();
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        switch (this.f7431b) {
            case 0:
                E4.k.f("<this>", null);
                return new ArrayList((Collection) null);
            case 1:
                E4.k.f("<this>", null);
                return new HashSet((Collection) null);
            default:
                E4.k.f("<this>", null);
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        switch (this.f7431b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (C0477b) this.f7432c;
    }

    @Override // c5.AbstractC0475a
    public final Object h(Object obj) {
        switch (this.f7431b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                E4.k.f("<this>", arrayList);
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                E4.k.f("<this>", hashSet);
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                E4.k.f("<this>", linkedHashSet);
                return linkedHashSet;
        }
    }

    @Override // c5.r
    public final void i(Object obj, int i, Object obj2) {
        switch (this.f7431b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                E4.k.f("<this>", arrayList);
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                E4.k.f("<this>", hashSet);
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                E4.k.f("<this>", linkedHashSet);
                linkedHashSet.add(obj2);
                break;
        }
    }
}

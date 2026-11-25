package p046i2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: i2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0775k implements Iterable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinkedHashMap f9554h;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        LinkedHashMap linkedHashMap = this.f9554h;
        return linkedHashMap == null ? Collections.emptyIterator() : linkedHashMap.values().iterator();
    }
}

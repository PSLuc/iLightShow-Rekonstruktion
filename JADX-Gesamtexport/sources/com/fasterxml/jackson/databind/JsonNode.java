package com.fasterxml.jackson.databind;

import java.util.Iterator;
import p015c2.l;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonNode extends l implements Iterable {
    public int g() {
        return i();
    }

    public int i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return k();
    }

    public abstract String j();

    public Iterator k() {
        return i.f12699c;
    }

    public Iterator l() {
        return i.f12699c;
    }

    public abstract JsonNode m(int i);

    public abstract JsonNode n(String str);

    public abstract int o();

    public abstract int size();
}

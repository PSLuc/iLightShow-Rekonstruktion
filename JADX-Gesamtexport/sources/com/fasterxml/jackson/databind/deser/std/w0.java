package com.fasterxml.jackson.databind.deser.std;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f7676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f7680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f7681f;

    public w0(w0 w0Var) {
        this.f7676a = w0Var;
        this.f7677b = false;
        this.f7678c = false;
    }

    public final void a(String str, Object obj) {
        LinkedHashMap linkedHashMap = this.f7680e;
        if (linkedHashMap == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            this.f7680e = linkedHashMap2;
            linkedHashMap2.put(str, obj);
            return;
        }
        Object objPut = linkedHashMap.put(str, obj);
        if (objPut != null) {
            if (objPut instanceof List) {
                ((List) objPut).add(obj);
                this.f7680e.put(str, objPut);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(objPut);
                arrayList.add(obj);
                this.f7680e.put(str, arrayList);
            }
        }
    }

    public final void b(Object obj) {
        if (this.f7681f == null) {
            this.f7681f = new ArrayList();
        }
        this.f7681f.add(obj);
    }

    public final void c(Object obj) {
        String str = this.f7679d;
        Objects.requireNonNull(str);
        this.f7679d = null;
        if (this.f7678c) {
            a(str, obj);
            return;
        }
        if (this.f7680e == null) {
            this.f7680e = new LinkedHashMap();
        }
        this.f7680e.put(str, obj);
    }

    public w0(w0 w0Var, boolean z5) {
        this.f7676a = w0Var;
        this.f7677b = true;
        this.f7678c = z5;
    }
}

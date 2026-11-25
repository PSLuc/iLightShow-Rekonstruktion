package com.fasterxml.jackson.databind.deser.std;

import java.util.HashSet;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0518n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f7617a;

    static {
        HashSet hashSet = new HashSet();
        f7617a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }
}

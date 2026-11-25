package com.fasterxml.jackson.databind.deser.std;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0517m extends AbstractC0516l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0517m f7616j = new C0517m(Date.class);

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0516l
    public final AbstractC0516l d(DateFormat dateFormat, String str) {
        return new C0517m(this, dateFormat, str);
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new Date(0L);
    }
}

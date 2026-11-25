package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Status f7774h;

    public ApiException(Status status) {
        int i = status.f7777h;
        String str = status.i;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f7774h = status;
    }
}

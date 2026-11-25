package com.fasterxml.jackson.databind.ser.std;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f7692a;

    static {
        HashMap map = new HashMap();
        f7692a = map;
        map.put(boolean[].class.getName(), new z(boolean[].class));
        map.put(byte[].class.getName(), new C0545p(2));
        map.put(char[].class.getName(), new C0545p(4));
        map.put(short[].class.getName(), new E(short[].class));
        map.put(int[].class.getName(), new C(int[].class));
        map.put(long[].class.getName(), new D(long[].class));
        map.put(float[].class.getName(), new B(float[].class));
        map.put(double[].class.getName(), new A(double[].class));
    }
}

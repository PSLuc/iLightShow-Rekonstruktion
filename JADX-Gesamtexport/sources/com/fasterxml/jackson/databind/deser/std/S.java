package com.fasterxml.jackson.databind.deser.std;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f7574a = new HashSet();

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            f7574a.add(clsArr[i].getName());
        }
    }
}

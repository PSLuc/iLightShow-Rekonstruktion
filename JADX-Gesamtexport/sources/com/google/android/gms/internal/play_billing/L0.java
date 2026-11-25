package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7869a;

    static {
        char[] cArr = new char[80];
        f7869a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0588p0 c0588p0 = AbstractC0586o0.i;
            sb.append(S1.h0.B(new C0588p0(((String) obj).getBytes(D0.f7817a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0586o0) {
            sb.append(": \"");
            sb.append(S1.h0.B((AbstractC0586o0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0605y0) {
            sb.append(" {");
            c((AbstractC0605y0) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i3 = 80;
            if (i <= 80) {
                i3 = i;
            }
            sb.append(f7869a, 0, i3);
            i -= i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0204  */
    public static void c(AbstractC0605y0 abstractC0605y0, StringBuilder sb, int i) {
        int i3;
        int i6;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0605y0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i3 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i6 = i3;
            } else {
                i6 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0605y0.l(method2, abstractC0605y0, new Object[0]));
                }
                i3 = i6;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0605y0.l(method, abstractC0605y0, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objL = AbstractC0605y0.l(method4, abstractC0605y0, new Object[0]);
                    if (method5 == null) {
                        if (objL instanceof Boolean) {
                            if (((Boolean) objL).booleanValue()) {
                                a(sb, i, strSubstring, objL);
                            }
                        } else if (objL instanceof Integer) {
                            if (((Integer) objL).intValue() != 0) {
                                a(sb, i, strSubstring, objL);
                            }
                        } else if (objL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objL).floatValue()) != 0) {
                                a(sb, i, strSubstring, objL);
                            }
                        } else if (!(objL instanceof Double)) {
                            if (objL instanceof String) {
                                zEquals = objL.equals("");
                            } else if (objL instanceof AbstractC0586o0) {
                                zEquals = objL.equals(AbstractC0586o0.i);
                            } else if (objL instanceof AbstractC0573i0) {
                                if (objL != ((AbstractC0605y0) ((AbstractC0605y0) ((AbstractC0573i0) objL)).h(6))) {
                                    a(sb, i, strSubstring, objL);
                                }
                            } else if (!(objL instanceof Enum) || ((Enum) objL).ordinal() != 0) {
                                a(sb, i, strSubstring, objL);
                            }
                            if (!zEquals) {
                                a(sb, i, strSubstring, objL);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) != 0) {
                            a(sb, i, strSubstring, objL);
                        }
                    } else if (((Boolean) AbstractC0605y0.l(method5, abstractC0605y0, new Object[0])).booleanValue()) {
                        a(sb, i, strSubstring, objL);
                    }
                }
            }
            i3 = i6;
        }
        V0 v6 = abstractC0605y0.zzc;
        if (v6 != null) {
            for (int i8 = 0; i8 < v6.f7919a; i8++) {
                a(sb, i, String.valueOf(v6.f7920b[i8] >>> 3), v6.f7921c[i8]);
            }
        }
    }
}

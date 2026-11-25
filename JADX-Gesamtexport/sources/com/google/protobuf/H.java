package com.google.protobuf;

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
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8157a;

    static {
        char[] cArr = new char[80];
        f8157a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i3 = 80;
            if (i <= 80) {
                i3 = i;
            }
            sb.append(f8157a, 0, i3);
            i -= i3;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
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
            C0639g c0639g = AbstractC0640h.i;
            sb.append(p027e3.a.Z(new C0639g(((String) obj).getBytes(AbstractC0652u.f8224a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0640h) {
            sb.append(": \"");
            sb.append(p027e3.a.Z((AbstractC0640h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof r) {
            sb.append(" {");
            c((r) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i + 2;
        b(sb, i6, "key", entry.getKey());
        b(sb, i6, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01de  */
    public static void c(r rVar, StringBuilder sb, int i) {
        int i3;
        int i6;
        Method method;
        Method method2;
        Object objC;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = rVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i3 = 3;
            if (i7 >= length) {
                break;
            }
            Method method5 = declaredMethods[i7];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i3);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i6 = i3;
            } else {
                i6 = i3;
                if (method4.getReturnType().equals(List.class)) {
                    b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), r.c(method4, rVar, new Object[0]));
                }
                i3 = i6;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), r.c(method3, rVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objC = r.c(method, rVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objC instanceof Boolean) {
                                    zEquals = !((Boolean) objC).booleanValue();
                                } else if (objC instanceof Integer) {
                                    if (((Integer) objC).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objC instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objC).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objC instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objC).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objC instanceof String) {
                                    zEquals = objC.equals("");
                                } else if (objC instanceof AbstractC0640h) {
                                    zEquals = objC.equals(AbstractC0640h.i);
                                } else if ((objC instanceof AbstractC0633a) ? !((objC instanceof Enum) && ((Enum) objC).ordinal() == 0) : objC != ((r) ((r) ((AbstractC0633a) objC)).a(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) r.c(method2, rVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i, strSubstring, objC);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objC = r.c(method, rVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objC instanceof Boolean) {
                                zEquals = !((Boolean) objC).booleanValue();
                            } else if (objC instanceof Integer) {
                                if (((Integer) objC).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objC instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objC).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objC instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objC).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objC instanceof String) {
                                zEquals = objC.equals("");
                            } else if (objC instanceof AbstractC0640h) {
                                zEquals = objC.equals(AbstractC0640h.i);
                            } else if (objC instanceof AbstractC0633a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) r.c(method2, rVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i, strSubstring, objC);
                        }
                    }
                }
            }
            i3 = i6;
        }
        V v6 = rVar.unknownFields;
        if (v6 != null) {
            for (int i8 = 0; i8 < v6.f8189a; i8++) {
                b(sb, i, String.valueOf(v6.f8190b[i8] >>> 3), v6.f8191c[i8]);
            }
        }
    }
}

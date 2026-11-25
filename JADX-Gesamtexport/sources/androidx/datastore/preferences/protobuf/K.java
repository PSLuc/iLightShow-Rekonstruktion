package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6798a;

    static {
        char[] cArr = new char[80];
        f6798a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i3 = 80;
            if (i <= 80) {
                i3 = i;
            }
            sb.append(f6798a, 0, i3);
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
            C0422g c0422g = C0422g.f6857j;
            sb.append(AbstractC0473d.r(new C0422g(((String) obj).getBytes(AbstractC0438x.f6926a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0422g) {
            sb.append(": \"");
            sb.append(AbstractC0473d.r((C0422g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0436v) {
            sb.append(" {");
            c((AbstractC0436v) obj, sb, i + 2);
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
    public static void c(AbstractC0436v abstractC0436v, StringBuilder sb, int i) {
        int i3;
        int i6;
        Method method;
        Method method2;
        Object objE;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0436v.getClass().getDeclaredMethods();
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
                    b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0436v.e(method4, abstractC0436v, new Object[0]));
                }
                i3 = i6;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0436v.e(method3, abstractC0436v, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objE = AbstractC0436v.e(method, abstractC0436v, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objE instanceof Boolean) {
                                    zEquals = !((Boolean) objE).booleanValue();
                                } else if (objE instanceof Integer) {
                                    if (((Integer) objE).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof String) {
                                    zEquals = objE.equals("");
                                } else if (objE instanceof C0422g) {
                                    zEquals = objE.equals(C0422g.f6857j);
                                } else if ((objE instanceof AbstractC0416a) ? !((objE instanceof Enum) && ((Enum) objE).ordinal() == 0) : objE != ((AbstractC0436v) ((AbstractC0436v) ((AbstractC0416a) objE)).c(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0436v.e(method2, abstractC0436v, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i, strSubstring, objE);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objE = AbstractC0436v.e(method, abstractC0436v, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objE instanceof Boolean) {
                                zEquals = !((Boolean) objE).booleanValue();
                            } else if (objE instanceof Integer) {
                                if (((Integer) objE).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof String) {
                                zEquals = objE.equals("");
                            } else if (objE instanceof C0422g) {
                                zEquals = objE.equals(C0422g.f6857j);
                            } else if (objE instanceof AbstractC0416a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0436v.e(method2, abstractC0436v, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i, strSubstring, objE);
                        }
                    }
                }
            }
            i3 = i6;
        }
        c0 c0Var = abstractC0436v.unknownFields;
        if (c0Var != null) {
            for (int i8 = 0; i8 < c0Var.f6845a; i8++) {
                b(sb, i, String.valueOf(c0Var.f6846b[i8] >>> 3), c0Var.f6847c[i8]);
            }
        }
    }
}

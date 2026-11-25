package p105t3;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0958a f12559h;
    public static final /* synthetic */ h[] i;

    static {
        C0958a c0958a = new C0958a();
        f12559h = c0958a;
        i = new h[]{c0958a, new h() { // from class: t3.b
            @Override // p105t3.h
            public final String b(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: t3.c
            @Override // p105t3.h
            public final String b(Field field) {
                return h.c(h.a(field.getName(), ' '));
            }
        }, new h() { // from class: t3.d
            @Override // p105t3.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: t3.e
            @Override // p105t3.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: t3.f
            @Override // p105t3.h
            public final String b(Field field) {
                return h.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: t3.g
            @Override // p105t3.h
            public final String b(Field field) {
                return h.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c6) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c6);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i3 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i3) + upperCase + str.substring(i3 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) i.clone();
    }

    public abstract String b(Field field);
}

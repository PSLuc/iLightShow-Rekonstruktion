package p138z3;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static ClassCastException a(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}

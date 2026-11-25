package p041h2;

import com.fasterxml.jackson.databind.ser.std.C0538i;
import java.io.Serializable;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import p012c.k;
import p015c2.h;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class f9289j = Node.class;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Class f9290k = Document.class;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f9291l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f9292h;
    public final HashMap i;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        try {
            int i = a.f9287a;
        } catch (Throwable unused) {
        }
        f9291l = new c();
    }

    public c() {
        HashMap map = new HashMap();
        this.f9292h = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.i = map2;
        map2.put("java.sql.Timestamp", C0538i.f7726l);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object a(h hVar, Class cls) {
        try {
            return i.h(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + i.r(hVar) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public static Object b(h hVar, String str) {
        try {
            return a(hVar, Class.forName(str));
        } catch (Throwable th) {
            StringBuilder sbW = k.w("Failed to find class `", str, "` for handling values of type ");
            sbW.append(i.r(hVar));
            sbW.append(", problem: (");
            sbW.append(th.getClass().getName());
            sbW.append(") ");
            sbW.append(th.getMessage());
            throw new IllegalStateException(sbW.toString());
        }
    }
}

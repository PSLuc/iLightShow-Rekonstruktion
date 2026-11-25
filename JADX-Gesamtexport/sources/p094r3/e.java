package p094r3;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p083p3.b;
import p083p3.c;
import p083p3.d;
import p083p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11771a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f11772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f11775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11776f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z5) {
        this.f11772b = new JsonWriter(bufferedWriter);
        this.f11773c = map;
        this.f11774d = map2;
        this.f11775e = aVar;
        this.f11776f = z5;
    }

    @Override // p083p3.d
    public final d a(b bVar, long j4) throws IOException {
        String str = bVar.f10841a;
        g();
        JsonWriter jsonWriter = this.f11772b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j4);
        return this;
    }

    @Override // p083p3.f
    public final f b(String str) throws IOException {
        g();
        this.f11772b.value(str);
        return this;
    }

    @Override // p083p3.f
    public final f c(boolean z5) throws IOException {
        g();
        this.f11772b.value(z5);
        return this;
    }

    @Override // p083p3.d
    public final d d(b bVar, Object obj) throws IOException {
        f(bVar.f10841a, obj);
        return this;
    }

    public final e e(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f11772b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f((String) key, entry.getValue());
                    } catch (ClassCastException e6) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            c cVar = (c) this.f11773c.get(obj.getClass());
            if (cVar != null) {
                jsonWriter.beginObject();
                cVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            p083p3.e eVar = (p083p3.e) this.f11774d.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f11775e.a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j4 = jArr[i];
                g();
                jsonWriter.value(j4);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                e(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                e(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(String str, Object obj) throws IOException {
        boolean z5 = this.f11776f;
        JsonWriter jsonWriter = this.f11772b;
        if (z5) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f11771a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}

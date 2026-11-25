package p099s3;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p083p3.b;
import p083p3.c;
import p083p3.d;
import p094r3.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f12199f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f12200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f12201h;
    public static final a i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f12202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f12204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f12205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f12206e = new g(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        f12200g = new b("key", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f12201h = new b("value", Collections.unmodifiableMap(new HashMap(map2)));
        i = new a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, a aVar) {
        this.f12202a = byteArrayOutputStream;
        this.f12203b = map;
        this.f12204c = map2;
        this.f12205d = aVar;
    }

    public static int f(b bVar) {
        d dVar = (d) ((Annotation) bVar.f10842b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f12196a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p083p3.d
    public final d a(b bVar, long j4) throws IOException {
        if (j4 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) bVar.f10842b.get(d.class));
        if (dVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        g(((a) dVar).f12196a << 3);
        h(j4);
        return this;
    }

    public final void b(b bVar, int i3, boolean z5) {
        if (z5 && i3 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) bVar.f10842b.get(d.class));
        if (dVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        g(((a) dVar).f12196a << 3);
        g(i3);
    }

    public final void c(b bVar, Object obj, boolean z5) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z5 && charSequence.length() == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12199f);
            g(bytes.length);
            this.f12202a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z5 && dDoubleValue == 0.0d) {
                return;
            }
            g((f(bVar) << 3) | 1);
            this.f12202a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z5 && fFloatValue == 0.0f) {
                return;
            }
            g((f(bVar) << 3) | 5);
            this.f12202a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z5 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) bVar.f10842b.get(d.class));
            if (dVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            g(((a) dVar).f12196a << 3);
            h(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z5);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z5 && bArr.length == 0) {
                return;
            }
            g((f(bVar) << 3) | 2);
            g(bArr.length);
            this.f12202a.write(bArr);
            return;
        }
        c cVar = (c) this.f12203b.get(obj.getClass());
        if (cVar != null) {
            e(cVar, bVar, obj, z5);
            return;
        }
        p083p3.e eVar = (p083p3.e) this.f12204c.get(obj.getClass());
        if (eVar != null) {
            g gVar = this.f12206e;
            gVar.f12208a = false;
            gVar.f12210c = bVar;
            gVar.f12209b = z5;
            eVar.a(obj, gVar);
            return;
        }
        if (obj instanceof O2.c) {
            b(bVar, ((O2.c) obj).f4557h, true);
        } else if (obj instanceof Enum) {
            b(bVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f12205d, bVar, obj, z5);
        }
    }

    @Override // p083p3.d
    public final d d(b bVar, Object obj) {
        c(bVar, obj, true);
        return this;
    }

    public final void e(c cVar, b bVar, Object obj, boolean z5) throws IOException {
        b bVar2 = new b();
        bVar2.f12197h = 0L;
        try {
            OutputStream outputStream = this.f12202a;
            this.f12202a = bVar2;
            try {
                cVar.a(obj, this);
                this.f12202a = outputStream;
                long j4 = bVar2.f12197h;
                bVar2.close();
                if (z5 && j4 == 0) {
                    return;
                }
                g((f(bVar) << 3) | 2);
                h(j4);
                cVar.a(obj, this);
            } catch (Throwable th) {
                this.f12202a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            this.f12202a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f12202a.write(i3 & 127);
    }

    public final void h(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f12202a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f12202a.write(((int) j4) & 127);
    }
}

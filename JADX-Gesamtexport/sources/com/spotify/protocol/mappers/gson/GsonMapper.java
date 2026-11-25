package com.spotify.protocol.mappers.gson;

import B.C0025m0;
import android.util.Base64;
import com.google.gson.internal.bind.C0615h;
import com.google.gson.internal.bind.C0625s;
import com.spotify.protocol.mappers.JsonArray;
import com.spotify.protocol.mappers.JsonMapper;
import com.spotify.protocol.mappers.JsonMappingException;
import com.spotify.protocol.mappers.JsonObject;
import com.spotify.protocol.types.ImageUri;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.annotation.Nullable;
import p105t3.m;
import p105t3.n;
import p105t3.o;
import p105t3.p;
import p105t3.q;
import p105t3.r;
import p105t3.s;
import p105t3.u;
import p105t3.v;
import p105t3.w;

/* JADX INFO: loaded from: classes.dex */
public class GsonMapper implements JsonMapper {
    private final m mGson;

    public static class ByteArrayToBase64TypeAdapter implements w, q {
        private ByteArrayToBase64TypeAdapter() {
        }

        @Override // p105t3.q
        public byte[] deserialize(r rVar, Type type, p pVar) {
            return Base64.decode(rVar.i().k(), 2);
        }

        @Override // p105t3.w
        public r serialize(byte[] bArr, Type type, v vVar) {
            return new u(Base64.encodeToString(bArr, 2));
        }
    }

    public static class GsonJsonArray implements JsonArray {
        private final m mGson;
        private final o mJsonArray;

        public GsonJsonArray(m mVar, r rVar) {
            this.mGson = mVar;
            this.mJsonArray = rVar.d();
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        public int getIntAt(int i) {
            try {
                return ((r) this.mJsonArray.f12590h.get(i)).c();
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        @Nullable
        public JsonObject getObjectAt(int i) {
            try {
                return new GsonJsonObject(this.mGson, (r) this.mJsonArray.f12590h.get(i));
            } catch (RuntimeException unused) {
                return null;
            }
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        @Nullable
        public String getStringAt(int i) {
            try {
                return ((r) this.mJsonArray.f12590h.get(i)).k();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    public static class GsonJsonObject implements JsonObject {
        private final m mGson;
        private final r mJsonElement;

        public GsonJsonObject(m mVar, r rVar) {
            this.mGson = mVar;
            this.mJsonElement = rVar;
        }

        @Override // com.spotify.protocol.mappers.JsonObject
        public <T> T getAs(Class<T> cls) throws JsonMappingException {
            try {
                return (T) this.mGson.e(this.mJsonElement, cls);
            } catch (RuntimeException e6) {
                throw new JsonMappingException(e6);
            }
        }

        @Override // com.spotify.protocol.mappers.JsonObject
        public String toJson() {
            return this.mGson.l(this.mJsonElement);
        }
    }

    public static class ImageUriGson implements q, w {
        private ImageUriGson() {
        }

        @Override // p105t3.q
        public ImageUri deserialize(r rVar, Type type, p pVar) {
            return new ImageUri(rVar.k());
        }

        @Override // p105t3.w
        public r serialize(ImageUri imageUri, Type type, v vVar) {
            String str = imageUri.raw;
            m mVar = ((C0625s) ((C0025m0) vVar).i).f8128c;
            mVar.getClass();
            if (str == null) {
                return s.f12591h;
            }
            Class<?> cls = str.getClass();
            C0615h c0615h = new C0615h();
            mVar.m(str, cls, c0615h);
            ArrayList arrayList = c0615h.f8096v;
            if (arrayList.isEmpty()) {
                return c0615h.f8098x;
            }
            throw new IllegalStateException("Expected one JSON element but was " + arrayList);
        }
    }

    private GsonMapper(m mVar) {
        this.mGson = mVar;
    }

    public static GsonMapper create() {
        n nVar = new n();
        nVar.b(ImageUri.class, new ImageUriGson());
        nVar.b(byte[].class, new ByteArrayToBase64TypeAdapter());
        return new GsonMapper(nVar.a());
    }

    @Override // com.spotify.protocol.mappers.JsonMapper
    public String toJson(Object obj) {
        return this.mGson.j(obj);
    }

    @Override // com.spotify.protocol.mappers.JsonMapper
    public JsonArray toJsonArray(String str) throws JsonMappingException {
        try {
            return new GsonJsonArray(this.mGson, (r) this.mGson.d(str, r.class));
        } catch (RuntimeException e6) {
            throw new JsonMappingException(e6);
        }
    }
}

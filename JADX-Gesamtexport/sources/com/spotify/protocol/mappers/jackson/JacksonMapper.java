package com.spotify.protocol.mappers.jackson;

import android.annotation.SuppressLint;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.protocol.mappers.JsonArray;
import com.spotify.protocol.mappers.JsonMapper;
import com.spotify.protocol.mappers.JsonObject;
import java.io.IOException;
import javax.annotation.Nullable;
import p015c2.C0474e;
import p015c2.D;
import p015c2.g;
import p015c2.u;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ConfiguringObjectMapper", "ConstructingObjectMapper"})
public class JacksonMapper implements JsonMapper {
    private final u mObjectMapper;

    public class JacksonJsonArray implements JsonArray {
        private final JsonNode mJsonNode;

        public JacksonJsonArray(String str) throws JsonProcessingException {
            u uVar = JacksonMapper.this.mObjectMapper;
            uVar.getClass();
            u.b("content", str);
            try {
                this.mJsonNode = uVar.d(uVar.f7319h.d(str));
            } catch (JsonProcessingException e6) {
                throw e6;
            } catch (IOException e7) {
                throw JsonMappingException.g(e7);
            }
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        public int getIntAt(int i) {
            JsonNode jsonNodeM = this.mJsonNode.m(i);
            if (jsonNodeM != null) {
                return jsonNodeM.g();
            }
            return 0;
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        public JsonObject getObjectAt(int i) {
            return JacksonMapper.this.new JacksonJsonObject(this.mJsonNode.m(i));
        }

        @Override // com.spotify.protocol.mappers.JsonArray
        @Nullable
        public String getStringAt(int i) {
            JsonNode jsonNodeM = this.mJsonNode.m(i);
            if (jsonNodeM != null) {
                return jsonNodeM.j();
            }
            return null;
        }
    }

    public class JacksonJsonObject implements JsonObject {
        private final JsonNode mJsonNode;

        public JacksonJsonObject(JsonNode jsonNode) {
            this.mJsonNode = jsonNode;
        }

        @Override // com.spotify.protocol.mappers.JsonObject
        @Nullable
        public <T> T getAs(Class<T> cls) throws com.spotify.protocol.mappers.JsonMappingException {
            try {
                return (T) JacksonMapper.this.mObjectMapper.j(cls, this.mJsonNode);
            } catch (IllegalArgumentException e6) {
                throw new com.spotify.protocol.mappers.JsonMappingException(e6);
            }
        }

        @Override // com.spotify.protocol.mappers.JsonObject
        public String toJson() throws com.spotify.protocol.mappers.JsonMappingException {
            try {
                return JacksonMapper.this.mObjectMapper.m(this.mJsonNode);
            } catch (JsonProcessingException e6) {
                throw new com.spotify.protocol.mappers.JsonMappingException(e6);
            }
        }
    }

    private JacksonMapper(u uVar) {
        this.mObjectMapper = uVar;
    }

    public static JacksonMapper create() {
        u uVar = new u();
        g gVar = g.FAIL_ON_UNKNOWN_PROPERTIES;
        C0474e c0474e = uVar.f7323m;
        c0474e.getClass();
        int i = ~gVar.i;
        int i3 = c0474e.f7246t;
        int i6 = i & i3;
        if (i6 != i3) {
            c0474e = new C0474e(c0474e, c0474e.f8717h, i6);
        }
        uVar.f7323m = c0474e;
        uVar.i(D.FAIL_ON_EMPTY_BEANS, false);
        return new JacksonMapper(uVar);
    }

    @Override // com.spotify.protocol.mappers.JsonMapper
    public String toJson(Object obj) throws com.spotify.protocol.mappers.JsonMappingException {
        try {
            return this.mObjectMapper.m(obj);
        } catch (JsonProcessingException e6) {
            throw new com.spotify.protocol.mappers.JsonMappingException(e6);
        }
    }

    @Override // com.spotify.protocol.mappers.JsonMapper
    public JsonArray toJsonArray(String str) throws com.spotify.protocol.mappers.JsonMappingException {
        try {
            return new JacksonJsonArray(str);
        } catch (IOException e6) {
            throw new com.spotify.protocol.mappers.JsonMappingException(e6);
        }
    }
}

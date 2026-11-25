package com.spotify.protocol.mappers.jackson;

import T1.e;
import T1.i;
import com.fasterxml.jackson.databind.deser.std.g0;
import com.fasterxml.jackson.databind.ser.std.P;
import com.spotify.protocol.types.ImageUri;
import p015c2.E;
import p015c2.f;

/* JADX INFO: loaded from: classes.dex */
public class ImageUriJson {

    public static class Deserializer extends g0 {
        private static final long serialVersionUID = 1;

        public Deserializer() {
            super(ImageUri.class);
        }

        @Override // p015c2.j
        public ImageUri deserialize(i iVar, f fVar) {
            return new ImageUri(iVar.q0());
        }
    }

    public static class Serializer extends P {
        private static final long serialVersionUID = 1;

        public Serializer() {
            super(ImageUri.class);
        }

        @Override // p015c2.o
        public void serialize(ImageUri imageUri, e eVar, E e6) {
            eVar.s0(imageUri.raw);
        }
    }
}

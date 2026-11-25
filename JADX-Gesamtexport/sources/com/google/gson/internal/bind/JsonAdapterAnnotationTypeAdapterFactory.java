package com.google.gson.internal.bind;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements p105t3.D {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p105t3.D f8030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p105t3.D f8031k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.L f8032h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public static class DummyTypeAdapterFactory implements p105t3.D {
        private DummyTypeAdapterFactory() {
        }

        @Override // p105t3.D
        public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }

    static {
        int i = 0;
        f8030j = new DummyTypeAdapterFactory(i);
        f8031k = new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(F.L l6) {
        this.f8032h = l6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        p110u3.b bVar = (p110u3.b) aVar.getRawType().getAnnotation(p110u3.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f8032h, mVar, aVar, bVar, true);
    }

    public final p105t3.C b(F.L l6, p105t3.m mVar, p132y3.a aVar, p110u3.b bVar, boolean z5) {
        p105t3.C cA;
        Object objL = l6.f(p132y3.a.get(bVar.value())).l();
        boolean zNullSafe = bVar.nullSafe();
        if (objL instanceof p105t3.C) {
            cA = (p105t3.C) objL;
        } else if (objL instanceof p105t3.D) {
            p105t3.D d6 = (p105t3.D) objL;
            if (z5) {
                p105t3.D d7 = (p105t3.D) this.i.putIfAbsent(aVar.getRawType(), d6);
                if (d7 != null) {
                    d6 = d7;
                }
            }
            cA = d6.a(mVar, aVar);
        } else {
            boolean z6 = objL instanceof p105t3.w;
            if (!z6 && !(objL instanceof p105t3.q)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objL.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            C0625s c0625s = new C0625s(z6 ? (p105t3.w) objL : null, objL instanceof p105t3.q ? (p105t3.q) objL : null, mVar, aVar, z5 ? f8030j : f8031k, zNullSafe);
            zNullSafe = false;
            cA = c0625s;
        }
        return (cA == null || !zNullSafe) ? cA : new p105t3.k(cA, 2);
    }
}

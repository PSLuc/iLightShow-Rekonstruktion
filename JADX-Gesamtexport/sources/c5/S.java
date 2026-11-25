package c5;

import java.util.Map;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f7412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.a f7413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.h f7415d;

    public S(Y4.a aVar, Y4.a aVar2, byte b6) {
        this.f7412a = aVar;
        this.f7413b = aVar2;
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        Object q6;
        a5.g descriptor = getDescriptor();
        b5.a aVarA = cVar.a(descriptor);
        Object obj = AbstractC0476a0.f7428c;
        Object objB = obj;
        Object objB2 = objB;
        while (true) {
            int iK = aVarA.k(getDescriptor());
            if (iK == -1) {
                if (objB == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objB2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.f7414c) {
                    case 0:
                        q6 = new Q(objB, objB2);
                        break;
                    default:
                        q6 = new p084p4.h(objB, objB2);
                        break;
                }
                aVarA.b(descriptor);
                return q6;
            }
            if (iK == 0) {
                objB = aVarA.B(getDescriptor(), 0, this.f7412a, null);
            } else {
                if (iK != 1) {
                    throw new SerializationException(p012c.k.r(iK, "Invalid index: "));
                }
                objB2 = aVarA.B(getDescriptor(), 1, this.f7413b, null);
            }
        }
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        switch (this.f7414c) {
            case 0:
                break;
        }
        return this.f7415d;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        Object key;
        Object value;
        b5.b bVarA = dVar.a(getDescriptor());
        a5.g descriptor = getDescriptor();
        switch (this.f7414c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                E4.k.f("<this>", entry);
                key = entry.getKey();
                break;
            default:
                p084p4.h hVar = (p084p4.h) obj;
                E4.k.f("<this>", hVar);
                key = hVar.f10849h;
                break;
        }
        p081p0.c cVar = (p081p0.c) bVarA;
        cVar.f0(descriptor, 0, this.f7412a, key);
        a5.g descriptor2 = getDescriptor();
        Y4.a aVar = this.f7413b;
        switch (this.f7414c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                E4.k.f("<this>", entry2);
                value = entry2.getValue();
                break;
            default:
                p084p4.h hVar2 = (p084p4.h) obj;
                E4.k.f("<this>", hVar2);
                value = hVar2.i;
                break;
        }
        cVar.f0(descriptor2, 1, aVar, value);
        cVar.b(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(final Y4.a aVar, final Y4.a aVar2, int i) {
        this(aVar, aVar2, (byte) 0);
        this.f7414c = i;
        switch (i) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                final int i3 = 1;
                this.f7415d = S1.V.q("kotlin.Pair", new a5.g[0], new D4.c() { // from class: c5.P
                    @Override // D4.c
                    public final Object invoke(Object obj) {
                        a5.a aVar3 = (a5.a) obj;
                        switch (i3) {
                            case 0:
                                E4.k.f("$this$buildSerialDescriptor", aVar3);
                                a5.a.a(aVar3, "key", aVar.getDescriptor());
                                a5.a.a(aVar3, "value", aVar2.getDescriptor());
                                break;
                            default:
                                E4.k.f("$this$buildClassSerialDescriptor", aVar3);
                                a5.a.a(aVar3, "first", aVar.getDescriptor());
                                a5.a.a(aVar3, "second", aVar2.getDescriptor());
                                break;
                        }
                        return p084p4.x.f10867a;
                    }
                });
                break;
            default:
                final int i6 = 0;
                this.f7415d = S1.V.r("kotlin.collections.Map.Entry", a5.j.f6376l, new a5.g[0], new D4.c() { // from class: c5.P
                    @Override // D4.c
                    public final Object invoke(Object obj) {
                        a5.a aVar3 = (a5.a) obj;
                        switch (i6) {
                            case 0:
                                E4.k.f("$this$buildSerialDescriptor", aVar3);
                                a5.a.a(aVar3, "key", aVar.getDescriptor());
                                a5.a.a(aVar3, "value", aVar2.getDescriptor());
                                break;
                            default:
                                E4.k.f("$this$buildClassSerialDescriptor", aVar3);
                                a5.a.a(aVar3, "first", aVar.getDescriptor());
                                a5.a.a(aVar3, "second", aVar2.getDescriptor());
                                break;
                        }
                        return p084p4.x.f10867a;
                    }
                });
                break;
        }
    }
}

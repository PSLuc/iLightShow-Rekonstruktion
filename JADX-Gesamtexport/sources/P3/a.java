package P3;

import com.nanjoran.ilightshow.utils.LowercaseEnumTypeAdapterFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p105t3.C;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LowercaseEnumTypeAdapterFactory f4600b;

    public a(LowercaseEnumTypeAdapterFactory lowercaseEnumTypeAdapterFactory, HashMap map) {
        this.f4600b = lowercaseEnumTypeAdapterFactory;
        this.f4599a = map;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() != 9) {
            return this.f4599a.get(aVar.d0());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
        } else {
            this.f4600b.getClass();
            cVar.Z(obj.toString().toLowerCase(Locale.US));
        }
    }
}

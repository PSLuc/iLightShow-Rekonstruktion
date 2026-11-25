package p037g2;

import java.io.IOException;
import p032f2.p;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f9165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9166d;

    public w(y yVar, Object obj, p pVar, String str) {
        super(yVar, obj);
        this.f9165c = pVar;
        this.f9166d = str;
    }

    @Override // p037g2.y
    public final void a(Object obj) throws IOException {
        this.f9165c.d(obj, this.f9166d, this.f9170b);
    }
}

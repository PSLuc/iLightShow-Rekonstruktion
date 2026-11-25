package p099s3;

import com.google.firebase.encoders.EncodingException;
import p083p3.b;
import p083p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12208a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12209b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f12210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f12211d;

    public g(e eVar) {
        this.f12211d = eVar;
    }

    @Override // p083p3.f
    public final f b(String str) {
        if (this.f12208a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12208a = true;
        this.f12211d.c(this.f12210c, str, this.f12209b);
        return this;
    }

    @Override // p083p3.f
    public final f c(boolean z5) {
        if (this.f12208a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12208a = true;
        this.f12211d.b(this.f12210c, z5 ? 1 : 0, this.f12209b);
        return this;
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class G extends Throwable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7849h;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f7849h) {
            case 0:
            case 1:
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(String str, int i) {
        super(str);
        this.f7849h = i;
    }
}

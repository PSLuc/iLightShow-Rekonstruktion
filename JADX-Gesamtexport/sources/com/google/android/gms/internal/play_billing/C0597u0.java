package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597u0 extends Throwable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8007h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0597u0(String str, int i) {
        super(str);
        this.f8007h = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f8007h) {
            case 0:
                synchronized (this) {
                    break;
                }
                break;
            default:
                synchronized (this) {
                    break;
                }
                break;
        }
        return this;
    }
}

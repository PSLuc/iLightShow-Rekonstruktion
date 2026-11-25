package p131y1;

import android.text.Editable;
import p119w1.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14575a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f14577c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f14577c;
        return cls != null ? new r(cls, charSequence) : super.newEditable(charSequence);
    }
}

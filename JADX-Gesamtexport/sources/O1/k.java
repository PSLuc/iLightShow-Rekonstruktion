package O1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4511b;

    public l a() {
        String str = this.f4511b;
        if ("first_party".equals(str)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f4510a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (str != null) {
            return new l(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}

package d5;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f8617g;

    public i(boolean z5, boolean z6, boolean z7, String str, String str2, boolean z8, a aVar) {
        E4.k.f("prettyPrintIndent", str);
        E4.k.f("classDiscriminator", str2);
        E4.k.f("classDiscriminatorMode", aVar);
        this.f8611a = z5;
        this.f8612b = z6;
        this.f8613c = z7;
        this.f8614d = str;
        this.f8615e = str2;
        this.f8616f = z8;
        this.f8617g = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f8611a + ", ignoreUnknownKeys=" + this.f8612b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f8613c + ", prettyPrintIndent='" + this.f8614d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f8615e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f8616f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f8617g + ')';
    }
}

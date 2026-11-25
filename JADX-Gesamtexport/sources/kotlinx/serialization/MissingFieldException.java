package kotlinx.serialization;

import E4.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(ArrayList arrayList, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        k.f("missingFields", arrayList);
        this.f9955h = arrayList;
    }
}

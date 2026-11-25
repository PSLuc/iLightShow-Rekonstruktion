package p032f2;

import p015c2.f;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    default Object getAbsentValue(f fVar) {
        return getNullValue(fVar);
    }

    Object getNullValue(f fVar);
}

package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: S1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0357t {
    Class generator();

    String property() default "@id";

    Class resolver() default h0.class;

    Class scope() default Object.class;
}

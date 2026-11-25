package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface I {
    H access() default H.f4910h;

    String defaultValue() default "";

    int index() default -1;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}

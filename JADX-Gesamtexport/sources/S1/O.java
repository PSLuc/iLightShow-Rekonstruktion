package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface O {
    b0 contentNulls() default b0.f4930k;

    b0 nulls() default b0.f4930k;

    String value() default "";
}

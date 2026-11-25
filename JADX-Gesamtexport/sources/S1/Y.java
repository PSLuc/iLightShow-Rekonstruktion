package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface Y {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}

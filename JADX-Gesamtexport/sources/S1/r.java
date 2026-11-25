package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface r {
    g0 lenient() default g0.i;

    String locale() default "##default";

    String pattern() default "";

    EnumC0354p shape() default EnumC0354p.f4961h;

    String timezone() default "##default";

    EnumC0352n[] with() default {};

    EnumC0352n[] without() default {};
}

package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface B {
    EnumC0363z content() default EnumC0363z.f4983h;

    Class contentFilter() default Void.class;

    EnumC0363z value() default EnumC0363z.f4983h;

    Class valueFilter() default Void.class;
}

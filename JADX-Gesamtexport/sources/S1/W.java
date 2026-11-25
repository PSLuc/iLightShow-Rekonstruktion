package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface W {
    Class defaultImpl() default W.class;

    T include() default T.f4913h;

    String property() default "";

    U use();

    boolean visible() default false;
}

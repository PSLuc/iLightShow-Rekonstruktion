package p020d2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p015c2.i;
import p015c2.p;
import p109u2.k;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    Class as() default Void.class;

    Class builder() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default k.class;

    Class contentUsing() default i.class;

    Class converter() default k.class;

    Class keyAs() default Void.class;

    Class keyUsing() default p.class;

    Class using() default i.class;
}

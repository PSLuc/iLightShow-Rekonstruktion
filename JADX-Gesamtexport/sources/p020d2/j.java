package p020d2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p015c2.n;
import p109u2.k;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface j {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default k.class;

    Class contentUsing() default n.class;

    Class converter() default k.class;

    h include() default h.f8581h;

    Class keyAs() default Void.class;

    Class keyUsing() default n.class;

    Class nullsUsing() default n.class;

    i typing() default i.f8583j;

    Class using() default n.class;
}

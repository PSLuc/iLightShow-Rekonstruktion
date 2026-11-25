package p020d2;

import S1.EnumC0363z;

/* JADX INFO: loaded from: classes.dex */
public @interface c {
    EnumC0363z include() default EnumC0363z.i;

    String name() default "";

    String namespace() default "";

    boolean required() default false;

    Class type() default Object.class;

    Class value();
}

package p020d2;

import S1.EnumC0363z;

/* JADX INFO: loaded from: classes.dex */
public @interface b {
    EnumC0363z include() default EnumC0363z.i;

    String propName() default "";

    String propNamespace() default "";

    boolean required() default false;

    String value();
}

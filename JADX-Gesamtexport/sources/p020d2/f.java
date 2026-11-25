package p020d2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p015c2.B;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    Class value() default B.class;
}

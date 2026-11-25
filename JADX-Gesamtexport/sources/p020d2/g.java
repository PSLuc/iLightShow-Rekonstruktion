package p020d2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    String buildMethodName() default "build";

    String withPrefix() default "with";
}

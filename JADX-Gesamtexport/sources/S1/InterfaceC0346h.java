package S1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: S1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC0346h {
    EnumC0345g creatorVisibility() default EnumC0345g.f4938k;

    EnumC0345g fieldVisibility() default EnumC0345g.f4938k;

    EnumC0345g getterVisibility() default EnumC0345g.f4938k;

    EnumC0345g isGetterVisibility() default EnumC0345g.f4938k;

    EnumC0345g setterVisibility() default EnumC0345g.f4938k;
}

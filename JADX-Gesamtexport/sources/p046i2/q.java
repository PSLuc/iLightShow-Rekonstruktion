package p046i2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import p009b2.l;
import p015c2.h;
import p035g0.C0715p;
import p104t2.m;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f9560h = new l();

    public static ParameterizedType j(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return j(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable k(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return k(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean l(C0766b c0766b, h hVar, Type type) {
        if (hVar.n0(c0766b.c(type).f7281k)) {
            ParameterizedType parameterizedTypeJ = j(type);
            if (parameterizedTypeJ == null) {
                return true;
            }
            if (!Objects.equals(hVar.f7281k, parameterizedTypeJ.getRawType())) {
                return true;
            }
            Type[] actualTypeArguments = parameterizedTypeJ.getActualTypeArguments();
            m mVarX = hVar.X();
            if (mVarX.i.length == actualTypeArguments.length) {
                for (int i = 0; i < mVarX.i.length; i++) {
                    if (l(c0766b, mVarX.d(i), actualTypeArguments[i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public abstract q a(Annotation annotation);

    public abstract C0715p b();

    public abstract InterfaceC0963b d();

    public abstract AnnotatedElement e();

    public abstract Annotation f(Class cls);

    public abstract Class g();

    public abstract String getName();

    public abstract h h();

    public abstract boolean i(Annotation annotation);
}

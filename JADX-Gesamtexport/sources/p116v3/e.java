package p116v3;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13256h;
    public final /* synthetic */ Type i;

    public /* synthetic */ e(Type type, int i) {
        this.f13256h = i;
        this.i = type;
    }

    @Override // p116v3.m
    public final Object l() {
        switch (this.f13256h) {
            case 0:
                Type type = this.i;
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.i;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new JsonIOException("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new JsonIOException("Invalid EnumMap type: " + type3.toString());
        }
    }
}

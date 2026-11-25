package E4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f1067a = new Object[0];

    public static final Object[] a(Collection collection) {
        k.f("collection", collection);
        int size = collection.size();
        Object[] objArr = f1067a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i3 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i6 = ((i3 * 3) + 1) >>> 1;
                if (i6 <= i3) {
                    i6 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                k.e("copyOf(...)", objArrCopyOf);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                k.e("copyOf(...)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i = i3;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        k.f("collection", collection);
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    k.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i6 = ((i3 * 3) + 1) >>> 1;
                        if (i6 <= i3) {
                            i6 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                        k.e("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        k.e("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}

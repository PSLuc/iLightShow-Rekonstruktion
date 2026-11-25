package p131y1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import p057l.A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f14584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14586c = true;

    public e(A a6) {
        this.f14584a = a6;
        this.f14585b = new c(a6);
    }

    @Override // p131y1.f
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f14586c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof c) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i6];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            c cVar = this.f14585b;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = cVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == cVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // p131y1.f
    public final void d(boolean z5) {
        if (z5) {
            f();
        }
    }

    @Override // p131y1.f
    public final void e(boolean z5) {
        this.f14586c = z5;
        f();
        A a6 = this.f14584a;
        a6.setFilters(a(a6.getFilters()));
    }

    public final void f() {
        A a6 = this.f14584a;
        TransformationMethod transformationMethod = a6.getTransformationMethod();
        if (this.f14586c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f14591a;
        }
        a6.setTransformationMethod(transformationMethod);
    }
}

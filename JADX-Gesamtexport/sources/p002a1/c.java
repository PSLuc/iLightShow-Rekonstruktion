package p002a1;

import X0.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.nanjoran.ilightshow.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6128a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f6;
        int i;
        int iC;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r6 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i3 = 0;
        int i6 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r6 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = a.f5755a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f6128a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r6);
                    int i7 = typedValue.type;
                    if (i7 < 28 || i7 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i3, -65281);
                }
                if (ObtainAttributes.hasValue(r6)) {
                    f6 = ObtainAttributes.getFloat(r6, 1.0f);
                } else {
                    f6 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r6;
                float f7 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i8 = i3;
                int i9 = i8;
                while (i8 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i10 = i9 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i9] = attributeNameResource;
                        i9 = i10;
                    }
                    i8++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i9);
                float f8 = 100.0f;
                boolean z5 = (f7 < 0.0f || f7 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f6 != 1.0f || z5) {
                    int iAlpha = (int) ((Color.alpha(color) * f6) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = 255;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z5) {
                        a aVarA = a.a(color);
                        m mVar = m.f6147k;
                        float f9 = aVarA.f6119b;
                        if (f9 >= 1.0d && Math.round(f7) > 0.0d && Math.round(f7) < 100.0d) {
                            float f10 = aVarA.f6118a;
                            float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
                            float f11 = 0.0f;
                            float f12 = f9;
                            boolean z6 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f11 - f9) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iC = aVar.c(mVar);
                                        break;
                                    }
                                    iC = b.c(f7);
                                    break;
                                }
                                float f13 = 1000.0f;
                                float f14 = f8;
                                float f15 = 0.0f;
                                float f16 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f15 - f14) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f8 = f8;
                                        break;
                                    }
                                    f8 = f8;
                                    float f17 = ((f14 - f15) / 2.0f) + f15;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC2 = a.b(f17, f12, fMin).c(m.f6147k);
                                    float fD = b.d(Color.red(iC2));
                                    float fD2 = b.d(Color.green(iC2));
                                    float fD3 = b.d(Color.blue(iC2));
                                    float[] fArr = b.f6127d[r16 == true ? 1 : 0];
                                    float f18 = ((fD3 * fArr[2]) + ((fD2 * fArr[r16 == true ? 1 : 0]) + (fD * fArr[0]))) / f8;
                                    float fCbrt = f18 <= 0.008856452f ? f18 * 903.2963f : (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f7 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC2);
                                        a aVarB = a.b(aVarA2.f6120c, aVarA2.f6119b, fMin);
                                        float f19 = aVarA2.f6121d - aVarB.f6121d;
                                        float f20 = aVarA2.f6122e - aVarB.f6122e;
                                        float f21 = aVarA2.f6123f - aVarB.f6123f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f16 = fPow;
                                            f13 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f13 == 0.0f && f16 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f7) {
                                        f15 = f17;
                                    } else {
                                        f14 = f17;
                                    }
                                    f8 = f8;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z6) {
                                    if (aVar3 == null) {
                                        f9 = f12;
                                    } else {
                                        aVar = aVar3;
                                        f11 = f12;
                                    }
                                    f12 = ((f9 - f11) / 2.0f) + f11;
                                } else {
                                    if (aVar3 != null) {
                                        iC = aVar3.c(mVar);
                                        break;
                                    }
                                    f12 = ((f9 - f11) / 2.0f) + f11;
                                    z6 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iC = b.c(f7);
                        }
                        color = iC;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i11 = i6 + 1;
                if (i11 > iArr.length) {
                    int[] iArr4 = new int[i6 <= 4 ? 8 : i6 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i6);
                    iArr = iArr4;
                }
                iArr[i6] = color;
                if (i11 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6 > 4 ? i6 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i6);
                    objArr = objArr2;
                }
                objArr[i6] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i6 = i11;
                r6 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i3 = 0;
            } else {
                int i12 = depth2;
                r6 = r6 == true ? 1 : 0;
                depth2 = i12;
                i3 = 0;
            }
        }
        int[] iArr5 = new int[i6];
        int[][] iArr6 = new int[i6][];
        System.arraycopy(iArr, 0, iArr5, 0, i6);
        System.arraycopy(objArr, 0, iArr6, 0, i6);
        return new ColorStateList(iArr6, iArr5);
    }
}

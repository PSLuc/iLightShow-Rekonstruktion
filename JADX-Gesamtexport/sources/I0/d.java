package I0;

import B.AbstractC0013g0;
import F.C0071m;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Locale;
import p012c.k;
import p015c2.AbstractC0473d;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.AbstractC0815x;
import p057l.C0816y;
import p057l.RunnableC0811t;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1809e;

    public /* synthetic */ d() {
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new I3.a(this, i));
    }

    public void b(int i) {
        int i3 = this.f1806b;
        int i6 = this.f1807c;
        if (i > i6 || i3 > i) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i);
            sb.append(". Valid range is [");
            sb.append(i3);
            sb.append(" , ");
            throw new IllegalArgumentException(AbstractC0013g0.k(sb, i6, ']').toString());
        }
    }

    public int c() {
        C0071m c0071m = (C0071m) this.f1809e;
        if (c0071m == null) {
            return ((String) this.f1808d).length();
        }
        return (c0071m.f1189b - c0071m.c()) + (((String) this.f1808d).length() - (this.f1807c - this.f1806b));
    }

    public boolean d(int i) {
        return i <= this.f1807c && this.f1806b + 1 <= i && Character.isLetterOrDigit(Character.codePointBefore((CharSequence) this.f1808d, i));
    }

    public boolean e(int i) {
        int i3 = this.f1806b + 1;
        if (i > this.f1807c || i3 > i) {
            return false;
        }
        return AbstractC0473d.H(Character.codePointBefore((CharSequence) this.f1808d, i));
    }

    public boolean f(int i) {
        return i < this.f1807c && this.f1806b <= i && Character.isLetterOrDigit(Character.codePointAt((CharSequence) this.f1808d, i));
    }

    public boolean g(int i) {
        if (i >= this.f1807c || this.f1806b > i) {
            return false;
        }
        return AbstractC0473d.H(Character.codePointAt((CharSequence) this.f1808d, i));
    }

    public void h(Typeface typeface) {
        int i = this.f1806b;
        if (i != -1) {
            typeface = AbstractC0815x.a(typeface, i, (this.f1807c & 2) != 0);
        }
        C0816y c0816y = (C0816y) this.f1809e;
        if (c0816y.f10167m) {
            c0816y.f10166l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f1808d).get();
            if (textView != null) {
                ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0811t(textView, typeface, c0816y.f10164j));
                } else {
                    textView.setTypeface(typeface, c0816y.f10164j);
                }
            }
        }
    }

    public void i(int i, String str, int i3) {
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC0013g0.g("start index must be less than or equal to end index: ", i, i3, " > ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(k.r(i, "start must be non-negative, but was ").toString());
        }
        C0071m c0071m = (C0071m) this.f1809e;
        if (c0071m == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f1808d).length() - i3, 64);
            String str2 = (String) this.f1808d;
            int i6 = i - iMin;
            E4.k.d("null cannot be cast to non-null type java.lang.String", str2);
            str2.getChars(i6, i, cArr, 0);
            String str3 = (String) this.f1808d;
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i3;
            E4.k.d("null cannot be cast to non-null type java.lang.String", str3);
            str3.getChars(i3, i8, cArr, i7);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0071m c0071m2 = new C0071m(1);
            c0071m2.f1189b = iMax;
            c0071m2.f1192e = cArr;
            c0071m2.f1190c = length;
            c0071m2.f1191d = i7;
            this.f1809e = c0071m2;
            this.f1806b = i6;
            this.f1807c = i8;
            return;
        }
        int i9 = this.f1806b;
        int i10 = i - i9;
        int i11 = i3 - i9;
        if (i10 < 0 || i11 > c0071m.f1189b - c0071m.c()) {
            this.f1808d = toString();
            this.f1809e = null;
            this.f1806b = -1;
            this.f1807c = -1;
            i(i, str, i3);
            return;
        }
        int length2 = str.length() - (i11 - i10);
        if (length2 > c0071m.c()) {
            int iC = length2 - c0071m.c();
            int i12 = c0071m.f1189b;
            do {
                i12 *= 2;
            } while (i12 - c0071m.f1189b < iC);
            char[] cArr2 = new char[i12];
            p089q4.k.d0((char[]) c0071m.f1192e, cArr2, 0, 0, c0071m.f1190c);
            int i13 = c0071m.f1189b;
            int i14 = c0071m.f1191d;
            int i15 = i13 - i14;
            int i16 = i12 - i15;
            p089q4.k.d0((char[]) c0071m.f1192e, cArr2, i16, i14, i15 + i14);
            c0071m.f1192e = cArr2;
            c0071m.f1189b = i12;
            c0071m.f1191d = i16;
        }
        int i17 = c0071m.f1190c;
        if (i10 < i17 && i11 <= i17) {
            int i18 = i17 - i11;
            char[] cArr3 = (char[]) c0071m.f1192e;
            p089q4.k.d0(cArr3, cArr3, c0071m.f1191d - i18, i11, i17);
            c0071m.f1190c = i10;
            c0071m.f1191d -= i18;
        } else if (i10 >= i17 || i11 < i17) {
            int iC2 = c0071m.c() + i10;
            int iC3 = c0071m.c() + i11;
            int i19 = c0071m.f1191d;
            char[] cArr4 = (char[]) c0071m.f1192e;
            p089q4.k.d0(cArr4, cArr4, c0071m.f1190c, i19, iC2);
            c0071m.f1190c += iC2 - i19;
            c0071m.f1191d = iC3;
        } else {
            c0071m.f1191d = c0071m.c() + i11;
            c0071m.f1190c = i10;
        }
        str.getChars(0, str.length(), (char[]) c0071m.f1192e, c0071m.f1190c);
        c0071m.f1190c = str.length() + c0071m.f1190c;
    }

    public String toString() {
        switch (this.f1805a) {
            case 1:
                C0071m c0071m = (C0071m) this.f1809e;
                if (c0071m == null) {
                    return (String) this.f1808d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f1808d, 0, this.f1806b);
                sb.append((char[]) c0071m.f1192e, 0, c0071m.f1190c);
                char[] cArr = (char[]) c0071m.f1192e;
                int i = c0071m.f1191d;
                sb.append(cArr, i, c0071m.f1189b - i);
                String str = (String) this.f1808d;
                sb.append((CharSequence) str, this.f1807c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(CharSequence charSequence, int i, Locale locale) {
        this.f1808d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1809e = wordInstance;
        this.f1806b = Math.max(0, -50);
        this.f1807c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new H0.k(charSequence, i));
    }

    public d(C0816y c0816y, int i, int i3, WeakReference weakReference) {
        this.f1809e = c0816y;
        this.f1806b = i;
        this.f1807c = i3;
        this.f1808d = weakReference;
    }
}

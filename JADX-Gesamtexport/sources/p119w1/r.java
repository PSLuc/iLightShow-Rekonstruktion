package p119w1;

import G4.a;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends SpannableStringBuilder {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f13445h;
    public final ArrayList i;

    public r(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.i = new ArrayList();
        a.n("watcherClass cannot be null", cls);
        this.f13445h = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i)).i.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final q c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return null;
            }
            q qVar = (q) arrayList.get(i);
            if (qVar.f13444h == obj) {
                return qVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f13445h == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i3) {
        super.delete(i, i3);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i)).i.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i3, Class cls) {
        if (this.f13445h != cls) {
            return super.getSpans(i, i3, cls);
        }
        q[] qVarArr = (q[]) super.getSpans(i, i3, q.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, qVarArr.length);
        for (int i6 = 0; i6 < qVarArr.length; i6++) {
            objArr[i6] = qVarArr[i6].f13444h;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i3, Class cls) {
        if (cls == null || this.f13445h == cls) {
            cls = q.class;
        }
        return super.nextSpanTransition(i, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        q qVarC;
        if (d(obj)) {
            qVarC = c(obj);
            if (qVarC != null) {
                obj = qVarC;
            }
        } else {
            qVarC = null;
        }
        super.removeSpan(obj);
        if (qVarC != null) {
            this.i.remove(qVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i3, CharSequence charSequence) {
        replace(i, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i3, int i6) {
        if (d(obj)) {
            q qVar = new q(obj);
            this.i.add(qVar);
            obj = qVar;
        }
        super.setSpan(obj, i, i3, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return new r(this.f13445h, this, i, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i3) {
        super.delete(i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i3, CharSequence charSequence, int i6, int i7) {
        replace(i, i3, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i3, int i6) {
        super.insert(i, charSequence, i3, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i3, CharSequence charSequence) {
        a();
        super.replace(i, i3, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i3, int i6) {
        super.insert(i, charSequence, i3, i6);
        return this;
    }

    public r(Class cls, r rVar, int i, int i3) {
        super(rVar, i, i3);
        this.i = new ArrayList();
        a.n("watcherClass cannot be null", cls);
        this.f13445h = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i3, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i, i3, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}

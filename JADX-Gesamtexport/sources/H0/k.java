package H0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements CharacterIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f1699h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1700j = 0;

    public k(CharSequence charSequence, int i) {
        this.f1699h = charSequence;
        this.i = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f1700j;
        if (i == this.i) {
            return (char) 65535;
        }
        return this.f1699h.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f1700j = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.i;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f1700j;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.i;
        if (i == 0) {
            this.f1700j = i;
            return (char) 65535;
        }
        int i3 = i - 1;
        this.f1700j = i3;
        return this.f1699h.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f1700j + 1;
        this.f1700j = i;
        int i3 = this.i;
        if (i < i3) {
            return this.f1699h.charAt(i);
        }
        this.f1700j = i3;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f1700j;
        if (i <= 0) {
            return (char) 65535;
        }
        int i3 = i - 1;
        this.f1700j = i3;
        return this.f1699h.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.i || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f1700j = i;
        return current();
    }
}

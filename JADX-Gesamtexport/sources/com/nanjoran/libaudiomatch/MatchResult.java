package com.nanjoran.libaudiomatch;

import Q3.a;
import Q3.b;
import Y4.d;
import a5.g;
import c5.AbstractC0476a0;
import c5.k0;
import p012c.k;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
@d
public final class MatchResult {
    public static final int $stable = 8;
    public static final b Companion = new b();
    private final long count;
    private final long score;
    private double time;

    public /* synthetic */ MatchResult(int i, double d6, long j4, long j6, k0 k0Var) {
        if (7 != (i & 7)) {
            AbstractC0476a0.j(i, 7, a.f4700a.getDescriptor());
            throw null;
        }
        this.time = d6;
        this.count = j4;
        this.score = j6;
    }

    public static /* synthetic */ MatchResult copy$default(MatchResult matchResult, double d6, long j4, long j6, int i, Object obj) {
        if ((i & 1) != 0) {
            d6 = matchResult.time;
        }
        double d7 = d6;
        if ((i & 2) != 0) {
            j4 = matchResult.count;
        }
        long j7 = j4;
        if ((i & 4) != 0) {
            j6 = matchResult.score;
        }
        return matchResult.copy(d7, j7, j6);
    }

    public static final /* synthetic */ void write$Self$app_release(MatchResult matchResult, b5.b bVar, g gVar) {
        c cVar = (c) bVar;
        cVar.Z(gVar, 0, matchResult.time);
        cVar.e0(gVar, 1, matchResult.count);
        cVar.e0(gVar, 2, matchResult.score);
    }

    public final double component1() {
        return this.time;
    }

    public final long component2() {
        return this.count;
    }

    public final long component3() {
        return this.score;
    }

    public final MatchResult copy(double d6, long j4, long j6) {
        return new MatchResult(d6, j4, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchResult)) {
            return false;
        }
        MatchResult matchResult = (MatchResult) obj;
        return Double.compare(this.time, matchResult.time) == 0 && this.count == matchResult.count && this.score == matchResult.score;
    }

    public final long getCount() {
        return this.count;
    }

    public final long getScore() {
        return this.score;
    }

    public final double getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.score) + k.l(Double.hashCode(this.time) * 31, 31, this.count);
    }

    public final void setTime(double d6) {
        this.time = d6;
    }

    public String toString() {
        return "MatchResult(time=" + this.time + ", count=" + this.count + ", score=" + this.score + ")";
    }

    public MatchResult(double d6, long j4, long j6) {
        this.time = d6;
        this.count = j4;
        this.score = j6;
    }
}

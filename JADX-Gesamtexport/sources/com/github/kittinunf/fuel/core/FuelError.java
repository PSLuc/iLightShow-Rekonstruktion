package com.github.kittinunf.fuel.core;

import E4.k;
import M4.u;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public class FuelError extends Exception {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f7771h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuelError(Throwable th, z zVar) {
        StackTraceElement stackTraceElement;
        super(th.getMessage(), th);
        k.f("exception", th);
        k.f(LoginActivity.RESPONSE_KEY, zVar);
        this.f7771h = zVar;
        StackTraceElement[] stackTrace = getStackTrace();
        k.e("this.stackTrace", stackTrace);
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        k.e("exception.stackTrace", stackTrace2);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement2 : stackTrace) {
            int length = stackTrace2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTrace2[i3];
                if (k.a(stackTraceElement, stackTraceElement2)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (stackTraceElement != null) {
                break;
            }
            arrayList.add(stackTraceElement2);
        }
        Object[] array = arrayList.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        setStackTrace((StackTraceElement[]) array);
    }

    public final boolean a() {
        return (b() instanceof InterruptedException) || (b() instanceof InterruptedIOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final Throwable b() {
        ?? r6 = this;
        while ((r6 instanceof FuelError) && r6.getCause() != null) {
            Throwable cause = r6.getCause();
            k.c(cause);
            r6 = cause;
        }
        return r6;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String message = b().getMessage();
        if (message == null) {
            message = b().getClass().getCanonicalName();
        }
        String strU = p012c.k.u(sb, message, "\r\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strU);
        StringBuilder sb3 = new StringBuilder();
        StackTraceElement[] stackTrace = getStackTrace();
        k.e("stackTrace", stackTrace);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb3.append("\t" + stackTraceElement);
            sb3.append(u.f3549a);
        }
        Throwable cause = getCause();
        if (cause != null) {
            sb3.append("Caused by: ");
            sb3.append(cause.toString());
            sb3.append(u.f3549a);
            if (!(cause instanceof FuelError)) {
                StackTraceElement[] stackTrace2 = cause.getStackTrace();
                k.e("it.stackTrace", stackTrace2);
                for (StackTraceElement stackTraceElement2 : stackTrace2) {
                    sb3.append("\t" + stackTraceElement2);
                    sb3.append(u.f3549a);
                }
            }
        }
        String string = sb3.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        sb2.append(string);
        return sb2.toString();
    }
}

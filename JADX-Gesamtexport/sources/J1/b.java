package J1;

import B.AbstractC0013g0;
import E4.k;
import android.os.Bundle;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0448h;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p012c.i;
import p012c.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0457q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1896h;
    public final Object i;

    public /* synthetic */ b(int i, Object obj) {
        this.f1896h = i;
        this.i = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0457q
    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
        switch (this.f1896h) {
            case 0:
                if (enumC0453m != EnumC0453m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0458s.f().f(this);
                f fVar = (f) this.i;
                Bundle bundleB = fVar.b().b("androidx.savedstate.Restarter");
                if (bundleB == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        k.e("{\n                Class.…class.java)\n            }", clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                k.e("{\n                constr…wInstance()\n            }", objNewInstance);
                                if (!(fVar instanceof V)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                U uE = ((V) fVar).e();
                                e eVarB = fVar.b();
                                uE.getClass();
                                LinkedHashMap linkedHashMap = uE.f6977a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    k.f("key", str3);
                                    O o6 = (O) linkedHashMap.get(str3);
                                    k.c(o6);
                                    J.a(o6, eVarB, fVar.f());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    eVarB.e();
                                }
                            } catch (Exception e6) {
                                throw new RuntimeException("Failed to instantiate " + str2, e6);
                            }
                        } catch (NoSuchMethodException e7) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new RuntimeException(AbstractC0013g0.i("Class ", str2, " wasn't found"), e8);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0448h[] interfaceC0448hArr = (InterfaceC0448h[]) this.i;
                if (interfaceC0448hArr.length > 0) {
                    InterfaceC0448h interfaceC0448h = interfaceC0448hArr[0];
                    throw null;
                }
                if (interfaceC0448hArr.length <= 0) {
                    return;
                }
                InterfaceC0448h interfaceC0448h2 = interfaceC0448hArr[0];
                throw null;
            case 2:
                if (enumC0453m != EnumC0453m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0453m).toString());
                }
                interfaceC0458s.f().f(this);
                ((K) this.i).b();
                return;
            default:
                n nVar = (n) this.i;
                if (nVar.f7159l == null) {
                    i iVar = (i) nVar.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        nVar.f7159l = iVar.f7142a;
                    }
                    if (nVar.f7159l == null) {
                        nVar.f7159l = new U();
                    }
                }
                nVar.f7156h.f(this);
                return;
        }
    }
}

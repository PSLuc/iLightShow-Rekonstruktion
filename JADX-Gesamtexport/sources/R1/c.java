package R1;

import T1.e;
import com.fasterxml.jackson.databind.ser.std.Q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Q {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i) {
        super(b.class, 1, (byte) 0);
        this.i = i;
        switch (i) {
            case 1:
                super(d.class, 1, (byte) 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // com.fasterxml.jackson.databind.ser.std.Q
    public void e(Map.Entry entry, e eVar) {
        switch (this.i) {
            case 1:
                if (!"aud".equals(entry.getKey())) {
                    super.e(entry, eVar);
                } else if (entry.getValue() instanceof String) {
                    eVar.T((String) entry.getKey());
                    eVar.s0((String) entry.getValue());
                } else {
                    ?? arrayList = new ArrayList();
                    if (entry.getValue() instanceof String[]) {
                        arrayList = Arrays.asList((String[]) entry.getValue());
                    } else if (entry.getValue() instanceof List) {
                        for (Object obj : (List) entry.getValue()) {
                            if (obj instanceof String) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                    if (arrayList.size() == 1) {
                        eVar.T((String) entry.getKey());
                        eVar.s0((String) arrayList.get(0));
                    } else if (arrayList.size() > 1) {
                        eVar.T((String) entry.getKey());
                        eVar.l0();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            eVar.s0((String) it.next());
                        }
                        eVar.L();
                    }
                }
                break;
            default:
                super.e(entry, eVar);
                break;
        }
    }
}

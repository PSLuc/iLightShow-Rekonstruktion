package go;

import B.AbstractC0013g0;
import android.content.Context;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.logging.Logger;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class Seq {
    static final RefTracker tracker;
    private static Logger log = Logger.getLogger("GoSeq");
    private static final int NULL_REFNUM = 41;
    public static final Ref nullRef = new Ref(NULL_REFNUM, null);
    private static final GoRefQueue goRefQueue = new GoRefQueue();

    public interface GoObject {
        int incRefnum();
    }

    public static class GoRef extends PhantomReference<GoObject> {
        final int refnum;

        public GoRef(int i, GoObject goObject, GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i > 0) {
                throw new RuntimeException(k.r(i, "GoRef instantiated with a Java refnum "));
            }
            this.refnum = i;
        }
    }

    public static class GoRefQueue extends ReferenceQueue<GoObject> {
        private final Collection<GoRef> refs = Collections.synchronizedCollection(new HashSet());

        public GoRefQueue() {
            Thread thread = new Thread(new Runnable() { // from class: go.Seq.GoRefQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            GoRef goRef = (GoRef) GoRefQueue.this.remove();
                            GoRefQueue.this.refs.remove(goRef);
                            Seq.destroyRef(goRef.refnum);
                            goRef.clear();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }

        public void track(int i, GoObject goObject) {
            this.refs.add(new GoRef(i, goObject, this));
        }
    }

    public interface Proxy extends GoObject {
    }

    public static final class Ref {
        public final Object obj;
        private int refcnt;
        public final int refnum;

        public Ref(int i, Object obj) {
            if (i < 0) {
                throw new RuntimeException(k.r(i, "Ref instantiated with a Go refnum "));
            }
            this.refnum = i;
            this.refcnt = 0;
            this.obj = obj;
        }

        public static /* synthetic */ int access$110(Ref ref) {
            int i = ref.refcnt;
            ref.refcnt = i - 1;
            return i;
        }

        public void inc() {
            int i = this.refcnt;
            if (i == Integer.MAX_VALUE) {
                throw new RuntimeException(AbstractC0013g0.l(new StringBuilder("refnum "), this.refnum, " overflow"));
            }
            this.refcnt = i + 1;
        }
    }

    public static final class RefMap {
        private int next = 0;
        private int live = 0;
        private int[] keys = new int[16];
        private Ref[] objs = new Ref[16];

        private void grow() {
            Ref[] refArr;
            int iRoundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (iRoundPow2 > iArr.length) {
                iArr = new int[iArr.length * 2];
                refArr = new Ref[this.objs.length * 2];
            } else {
                refArr = this.objs;
            }
            int i = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i >= iArr2.length) {
                    break;
                }
                Ref ref = this.objs[i];
                if (ref != null) {
                    iArr[i3] = iArr2[i];
                    refArr[i3] = ref;
                    i3++;
                }
                i++;
            }
            for (int i6 = i3; i6 < iArr.length; i6++) {
                iArr[i6] = 0;
                refArr[i6] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i3;
            if (this.live == i3) {
                return;
            }
            throw new RuntimeException("bad state: live=" + this.live + ", next=" + this.next);
        }

        private static int roundPow2(int i) {
            int i3 = 1;
            while (i3 < i) {
                i3 *= 2;
            }
            return i3;
        }

        public Ref get(int i) {
            int iBinarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                return this.objs[iBinarySearch];
            }
            return null;
        }

        public void put(int i, Ref ref) {
            if (ref == null) {
                throw new RuntimeException(AbstractC0013g0.f(i, "put a null ref (with key ", ")"));
            }
            int iBinarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] == null) {
                    refArr[iBinarySearch] = ref;
                    this.live++;
                }
                if (refArr[iBinarySearch] != ref) {
                    throw new RuntimeException(AbstractC0013g0.f(i, "replacing an existing ref (with key ", ")"));
                }
                return;
            }
            if (this.next >= this.keys.length) {
                grow();
                iBinarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            }
            int i3 = ~iBinarySearch;
            int i6 = this.next;
            if (i3 < i6) {
                int[] iArr = this.keys;
                int i7 = i3 + 1;
                System.arraycopy(iArr, i3, iArr, i7, i6 - i3);
                Ref[] refArr2 = this.objs;
                System.arraycopy(refArr2, i3, refArr2, i7, this.next - i3);
            }
            this.keys[i3] = i;
            this.objs[i3] = ref;
            this.live++;
            this.next++;
        }

        public void remove(int i) {
            int iBinarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] != null) {
                    refArr[iBinarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    public static final class RefTracker {
        private static final int REF_OFFSET = 42;
        private int next = REF_OFFSET;
        private final RefMap javaObjs = new RefMap();
        private final IdentityHashMap<Object, Integer> javaRefs = new IdentityHashMap<>();

        public synchronized void dec(int i) {
            try {
                if (i <= 0) {
                    Seq.log.severe("dec request for Go object " + i);
                    return;
                }
                if (i == Seq.nullRef.refnum) {
                    return;
                }
                Ref ref = this.javaObjs.get(i);
                if (ref == null) {
                    throw new RuntimeException("referenced Java object is not found: refnum=" + i);
                }
                Ref.access$110(ref);
                if (ref.refcnt <= 0) {
                    this.javaObjs.remove(i);
                    this.javaRefs.remove(ref.obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized Ref get(int i) {
            try {
                if (i < 0) {
                    throw new RuntimeException("ref called with Go refnum " + i);
                }
                if (i == Seq.NULL_REFNUM) {
                    return Seq.nullRef;
                }
                Ref ref = this.javaObjs.get(i);
                if (ref != null) {
                    return ref;
                }
                throw new RuntimeException("unknown java Ref: " + i);
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized int inc(Object obj) {
            if (obj == null) {
                return Seq.NULL_REFNUM;
            }
            if (obj instanceof Proxy) {
                return ((Proxy) obj).incRefnum();
            }
            Integer numValueOf = this.javaRefs.get(obj);
            if (numValueOf == null) {
                int i = this.next;
                if (i == Integer.MAX_VALUE) {
                    throw new RuntimeException("createRef overflow for " + obj);
                }
                this.next = i + 1;
                numValueOf = Integer.valueOf(i);
                this.javaRefs.put(obj, numValueOf);
            }
            int iIntValue = numValueOf.intValue();
            Ref ref = this.javaObjs.get(iIntValue);
            if (ref == null) {
                ref = new Ref(iIntValue, obj);
                this.javaObjs.put(iIntValue, ref);
            }
            ref.inc();
            return iIntValue;
        }

        public synchronized void incRefnum(int i) {
            Ref ref = this.javaObjs.get(i);
            if (ref == null) {
                throw new RuntimeException("referenced Java object is not found: refnum=" + i);
            }
            ref.inc();
        }
    }

    static {
        System.loadLibrary("gojni");
        init();
        Universe.touch();
        tracker = new RefTracker();
    }

    private Seq() {
    }

    public static void decRef(int i) {
        tracker.dec(i);
    }

    public static native void destroyRef(int i);

    public static Ref getRef(int i) {
        return tracker.get(i);
    }

    public static int incGoObjectRef(GoObject goObject) {
        return goObject.incRefnum();
    }

    public static native void incGoRef(int i, GoObject goObject);

    public static int incRef(Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i) {
        tracker.incRefnum(i);
    }

    private static native void init();

    public static void setContext(Context context) {
        setContext((Object) context);
    }

    public static native void setContext(Object obj);

    public static void touch() {
    }

    public static void trackGoRef(int i, GoObject goObject) {
        if (i > 0) {
            throw new RuntimeException(k.r(i, "trackGoRef called with Java refnum "));
        }
        goRefQueue.track(i, goObject);
    }
}

package okhttp3.internal.platform;

import E4.g;
import E4.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            k.f("protocols", list);
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            k.f("proxy", obj);
            k.f("method", method);
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.a(name, "supports") && k.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (k.a(name, "unsupported") && k.a(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (k.a(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((k.a(name, "selectProtocol") || k.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            int i3 = i + 1;
                            Object obj3 = list.get(i);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (this.protocols.contains(str)) {
                                this.selected = str;
                                return str;
                            }
                            if (i != size) {
                                i = i3;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!k.a(name, "protocolSelected") && !k.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.selected = (String) obj4;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z5) {
            this.unsupported = z5;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                k.e("jvmVersion", property);
                if (Integer.parseInt(property) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName(k.l("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> cls3 = Class.forName(k.l("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> cls4 = Class.forName(k.l("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                        Method method2 = cls.getMethod("get", SSLSocket.class);
                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                        k.e("putMethod", method);
                        k.e("getMethod", method2);
                        k.e("removeMethod", method3);
                        k.e("clientProviderClass", cls3);
                        k.e("serverProviderClass", cls4);
                        return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                }
                return null;
            } catch (NumberFormatException unused2) {
            }
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        k.f("putMethod", method);
        k.f("getMethod", method2);
        k.f("removeMethod", method3);
        k.f("clientProviderClass", cls);
        k.f("serverProviderClass", cls2);
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        k.f("sslSocket", sSLSocket);
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        k.f("sslSocket", sSLSocket);
        k.f("protocols", list);
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        k.f("sslSocket", sSLSocket);
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}

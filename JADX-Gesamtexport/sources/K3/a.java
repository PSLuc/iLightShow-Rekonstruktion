package K3;

import D3.j;
import E4.k;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final int $stable = 8;

    @p110u3.a(serialize = false)
    public c delegate;

    @p110u3.c(AuthorizationClient.PlayStoreParams.ID)
    @p110u3.a
    public String id;

    @p110u3.c("ip")
    @p110u3.a
    public String ip;
    private Integer maxStreamingLights;

    @p110u3.c("name")
    @p110u3.a
    public String name;

    @p110u3.c("port")
    @p110u3.a
    public Integer port;

    @p110u3.c("token")
    @p110u3.a
    public String token;

    @p110u3.c("type")
    @p110u3.a
    public d type;

    @p110u3.c("customInfo")
    @p110u3.a
    public Map<String, String> customInfo = new LinkedHashMap();
    private List<? extends j> enabledStreamingLights = u.f11237h;

    public void disconnect() {
    }

    public synchronized ArrayList getLights() {
        return new ArrayList();
    }

    public Integer getMaxStreamingLights() {
        return this.maxStreamingLights;
    }

    public b getState() {
        return b.i;
    }

    public final void notifyDelegate() {
        c cVar = this.delegate;
        if (cVar != null) {
            ((J3.e) cVar).b();
        }
    }

    public void setEnabledStreamingLights(List list) {
        k.f("<set-?>", list);
        this.enabledStreamingLights = list;
    }

    public void signup() {
    }

    public void updateFromDiscoveredDevice(a aVar) {
        k.f(ClipAttribute.Sensor.Configuration.Device, aVar);
    }
}

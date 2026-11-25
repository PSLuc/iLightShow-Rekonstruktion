package Y0;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}

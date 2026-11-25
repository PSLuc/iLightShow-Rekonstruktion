package W2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AlertDialog f5573h;
    public DialogInterface.OnCancelListener i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f5574j;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f5573h;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f5574j == null) {
            Activity activity = getActivity();
            Z2.n.b(activity);
            this.f5574j = new AlertDialog.Builder(activity).create();
        }
        return this.f5574j;
    }
}

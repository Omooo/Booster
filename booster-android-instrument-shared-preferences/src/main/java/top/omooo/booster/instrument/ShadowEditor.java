package top.omooo.booster.instrument;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Looper;
import android.util.Log;

public class ShadowEditor {
    public static void apply(final SharedPreferences.Editor editor) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.i("ShadowEditor", "apply: ");
            AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() {
                @Override
                public void run() {
                    editor.commit();
                }
            });
        } else {
            editor.commit();
        }
    }
}

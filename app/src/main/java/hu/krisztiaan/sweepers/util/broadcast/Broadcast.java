package hu.krisztiaan.sweepers.util.broadcast;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by krisz on 2015. 10. 22..
 */
public class Broadcast {

    private static final String TAG = Broadcast.class.getSimpleName();

    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    private static List<Object> listenersUi = new LinkedList<>();
    private static List<Object> listenersControl = new LinkedList<>();

    private static final Bus mUiBus = new Bus(ThreadEnforcer.MAIN);

    private static final Bus mControlBus = new Bus(ThreadEnforcer.ANY);

    public static void registerUi(Object listener) {
        if(listenersUi.contains(listener)) return;
        mUiBus.register(listener);
        listenersUi.add(listener);
    }

    public static void unregisterUi(Object listener) {
        if(!listenersUi.contains(listener)) return;
        mUiBus.unregister(listener);
        listenersUi.remove(listener);
    }

    public static void registerControl(Object listener) {
        if(listenersControl.contains(listener)) return;
        mControlBus.register(listener);
        listenersControl.add(listener);
    }

    public static void unregisterControl(Object listener) {
        if(!listenersControl.contains(listener)) return;
        mControlBus.unregister(listener);
        listenersControl.remove(listener);
    }

    public static void postUiEvent(@NonNull final Object event) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            try {
                mUiBus.post(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HANDLER.post(new Runnable() {
                public void run() {
                    try {
                        Broadcast.mUiBus.post(event);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            });
        }

    }
}

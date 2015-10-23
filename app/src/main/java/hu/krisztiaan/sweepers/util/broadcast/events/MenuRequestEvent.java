package hu.krisztiaan.sweepers.util.broadcast.events;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by krisz on 2015. 10. 23..
 */
public class MenuRequestEvent {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({QUICK_GAME, FRIEND_GAME})
    public @interface MenuRequest {}
    public static final int QUICK_GAME = 501;
    public static final int FRIEND_GAME = 502;

    public @MenuRequest int request;

    public MenuRequestEvent(@MenuRequest int request) {
        this.request = request;
    }
}

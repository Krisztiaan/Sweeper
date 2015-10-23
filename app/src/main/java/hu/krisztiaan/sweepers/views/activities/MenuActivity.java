package hu.krisztiaan.sweepers.views.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;

import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import hu.krisztiaan.sweepers.R;
import hu.krisztiaan.sweepers.util.broadcast.Broadcast;
import hu.krisztiaan.sweepers.util.broadcast.events.MenuRequestEvent;
import hu.krisztiaan.sweepers.views.fragments.menu.MenuFragment_;

@EActivity(R.layout.activity_menu)
public class MenuActivity extends Activity {

    FragmentPagerAdapter pagerAdapter;

    @AfterViews
    protected void init() {
        getFragmentManager().beginTransaction().add(R.id.menuContainer, MenuFragment_.builder().build()).commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Broadcast.registerUi(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Broadcast.unregisterUi(this);
    }

    private void startGameActivity(Bundle gameStartBundle) {
        GameActivity_.intent(this).gameStartBundle(gameStartBundle).start();
    }

    @Subscribe
    public void onMenuRequestEvent(MenuRequestEvent request) {
        switch (request.request) {
            case MenuRequestEvent.QUICK_GAME:
                startQuickGame();
                break;
            case MenuRequestEvent.FRIEND_GAME:
                startFriendGame();
                break;
        }
    }

    private void startQuickGame() {

    }

    private void startFriendGame() {

    }
}

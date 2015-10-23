package hu.krisztiaan.sweepers.views.fragments.menu;

import android.app.Fragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

import hu.krisztiaan.sweepers.R;
import hu.krisztiaan.sweepers.util.broadcast.Broadcast;
import hu.krisztiaan.sweepers.util.broadcast.events.MenuRequestEvent;

@EFragment(R.layout.fragment_menu)
public class MenuFragment extends Fragment {

    @Click(R.id.txtQuickMatch)
    protected void onQuickMatchClick() {
        Broadcast.postUiEvent(new MenuRequestEvent(MenuRequestEvent.QUICK_GAME));
    }

    @Click(R.id.txtChallengeFriend)
    protected void onChallengeFriendClick() {
        Broadcast.postUiEvent(new MenuRequestEvent(MenuRequestEvent.FRIEND_GAME));
    }
}

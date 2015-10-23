package hu.krisztiaan.sweepers.data.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MenuFragmentsAdapter extends FragmentPagerAdapter {

    public int pos = 0;

    private List<Fragment> myFragments;

    public MenuFragmentsAdapter(FragmentManager fm, List<Fragment> menuFragments) {
        super(fm);
        myFragments = menuFragments;
    }

    @Override
    public Fragment getItem(int position) {

        return myFragments.get(position);

    }

    @Override
    public int getCount() {

        return myFragments.size();
    }

    public int getPosition() {
        return pos;
    }

    public void setPosition(int pos) {
        this.pos = pos;
    }

}

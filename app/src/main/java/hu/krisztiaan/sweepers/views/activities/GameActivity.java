package hu.krisztiaan.sweepers.views.activities;

import android.app.Activity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

import hu.krisztiaan.sweepers.R;

@EActivity(R.layout.activity_game)
public class GameActivity extends Activity {

    @Extra
    Bundle gameStartBundle;

}

package com.pete.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Pete on 9/14/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}

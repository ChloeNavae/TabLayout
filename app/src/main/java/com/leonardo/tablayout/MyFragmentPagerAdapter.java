package com.leonardo.tablayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private com.leonardo.tablayout.BeritaFragment _beritaFragment = new BeritaFragment();
    private Context _context;
    private com.leonardo.tablayout.ECommerceFragment _eCommerceFragment = new ECommerceFragment();
    private int _tabCount;
    private com.leonardo.tablayout.KampusFragment _kampusFragment = new KampusFragment();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount){
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return _eCommerceFragment;
            case 1:
                return _beritaFragment;
            default:
                return _kampusFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}

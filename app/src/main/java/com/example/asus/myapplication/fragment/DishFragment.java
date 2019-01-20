package com.example.asus.myapplication.fragment;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.base.BaseFragment;

public class DishFragment extends BaseFragment {
    @Override
    public int setIdResource() {
        BaseFragment baseFragment=new AnimalFragment();
        return R.layout.diah_fragment;
    }


    @Override
    public void loadData() {

    }
}

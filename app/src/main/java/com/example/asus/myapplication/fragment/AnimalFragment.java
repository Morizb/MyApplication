package com.example.asus.myapplication.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.adapater.AnimalAdapter;
import com.example.asus.myapplication.base.BaseFragment;
import com.example.asus.myapplication.bean.Animal;


public class AnimalFragment extends BaseFragment {

    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public int setIdResource() {
        return R.layout.animal_fragment;
    }

    @Override
    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Animal animal=new Animal(R.drawable.ic_rabbit,"我是一只兔子");
            animals.add(animal);
        }
    }

    @Override
    public void initView() {
        recyclerView = getView().findViewById(R.id.animal_recycler_view);
        adapter = new AnimalAdapter(animals, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }
}

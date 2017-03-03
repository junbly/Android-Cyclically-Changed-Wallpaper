package com.boostcamp.hyeon.wallpaper.setting.presenter;

import com.boostcamp.hyeon.wallpaper.base.adapter.RealmListAdapterContract;
import com.boostcamp.hyeon.wallpaper.base.domain.Image;
import com.boostcamp.hyeon.wallpaper.base.listener.OnItemClickListener;

/**
 * Created by hyeon on 2017. 2. 22..
 */

public class SettingPresenterImpl implements SettingPresenter.Presenter, OnItemClickListener {
    private SettingPresenter.View mView;
    private RealmListAdapterContract.Model<Image> mAdapterModel;
    private RealmListAdapterContract.View mAdapterView;

    @Override
    public void attachView(SettingPresenter.View view) {
        this.mView = view;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void setListAdapterModel(RealmListAdapterContract.Model<Image> adapterModel) {
        this.mAdapterModel = adapterModel;
    }

    @Override
    public void setListAdapterView(RealmListAdapterContract.View adapterView) {
        this.mAdapterView = adapterView;
        this.mAdapterView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onItemLongClick(int position) {

    }
}
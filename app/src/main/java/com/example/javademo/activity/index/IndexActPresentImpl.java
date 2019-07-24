package com.example.javademo.activity.index;

import com.example.javademo.base.BasePresentImpl;

/**
 *
 */
public class IndexActPresentImpl extends BasePresentImpl implements IndexActImpl {

    private IndexActView indexActView;


    public IndexActPresentImpl(IndexActView mineActView) {
        super(mineActView);
        init(false);
    }


    protected void init(boolean isRefresh) {
        indexActView = (IndexActView) baseView;
        update();
    }


    @Override
    public void update() {

    }
}

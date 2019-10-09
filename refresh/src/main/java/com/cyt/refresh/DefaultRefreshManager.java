package com.cyt.refresh;

import android.content.Context;
import android.view.View;

public class DefaultRefreshManager extends BaseRefreshManager{

    public DefaultRefreshManager(Context context) {
        super(context);
    }

    @Override
    public View getHeaderView() {
        return mLayoutInflater.inflate(R.layout.ulti_header_layout,null,false);
    }
}

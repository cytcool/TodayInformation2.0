package com.news.today.todayinformation.main.hangzhou.view;

import com.cyt.refresh.GodRefreshLayout;
import com.news.today.todayinformation.R;
import com.news.today.todayinformation.base.BaseFragment;
import com.news.today.todayinformation.base.ViewInject;

import butterknife.BindView;

@ViewInject(mainlayoutid = R.layout.fragment_refresh)
public class RefreshFragment extends BaseFragment {

    @BindView(R.id.god_refresh)
    GodRefreshLayout godRefresh;

    @Override
    public void afterBindView() {
        godRefresh.setRefreshManager();
        godRefresh.refreshOver();
    }
}

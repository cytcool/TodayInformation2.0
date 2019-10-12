package com.news.today.todayinformation.main.hangzhou.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cyt.refresh.GodRefreshLayout;
import com.news.today.todayinformation.R;
import com.news.today.todayinformation.base.BaseFragment;
import com.news.today.todayinformation.base.ViewInject;
import com.news.today.todayinformation.main.hangzhou.adpter.ZhiHuAdapter;
import com.news.today.todayinformation.main.shanghai.dto.ShangHaiDetailBean;
import com.news.today.todayinformation.main.shanghai.lf.IShanghaiDetailContract;
import com.news.today.todayinformation.main.shanghai.presenter.ShanghaiDetailPresenter;

import butterknife.BindView;

@ViewInject(mainlayoutid = R.layout.fragment_refresh)
public class RefreshFragment extends BaseFragment implements IShanghaiDetailContract.Iview {

    @BindView(R.id.god_refresh)
    GodRefreshLayout godRefresh;
    @BindView(R.id.refresh_recyclerview)
    RecyclerView mRecyclerView;

    IShanghaiDetailContract.IPresenter mPresenter = new ShanghaiDetailPresenter(this);

    @Override
    public void afterBindView() {
        initRecyclerView();
        initRefreshLayout();
    }

    private void initRefreshLayout() {
        godRefresh.setRefreshManager();
        godRefresh.setRefreshListener(new GodRefreshLayout.RefreshingListenter() {
            @Override
            public void onRefreshing() {
                mPresenter.getNetData(20);
            }
        });
    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mPresenter.getNetData(20);
    }

    @Override
    public void showData(ShangHaiDetailBean data) {
        if (mRecyclerView.getAdapter() == null) {
            ZhiHuAdapter adapter = new ZhiHuAdapter(data.result.data);
            mRecyclerView.setAdapter(adapter);
        }
        godRefresh.refreshOver();
    }
}

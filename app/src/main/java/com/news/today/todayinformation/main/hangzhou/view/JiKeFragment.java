package com.news.today.todayinformation.main.hangzhou.view;


import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.AppBarLayout;
import com.news.today.todayinformation.R;
import com.news.today.todayinformation.base.BaseFragment;
import com.news.today.todayinformation.base.ViewInject;
import com.news.today.todayinformation.main.hangzhou.adpter.ZhiHuAdapter;
import com.news.today.todayinformation.main.shanghai.dto.ShangHaiDetailBean;
import com.news.today.todayinformation.main.shanghai.lf.IShanghaiDetailContract;
import com.news.today.todayinformation.main.shanghai.presenter.ShanghaiDetailPresenter;

import butterknife.BindView;

/**
 * Created by anson on 2019/3/10.
 */
@ViewInject(mainlayoutid = R.layout.fragment_jike)
public class JiKeFragment extends BaseFragment{


    @Override
    public void afterBindView() {

    }

}

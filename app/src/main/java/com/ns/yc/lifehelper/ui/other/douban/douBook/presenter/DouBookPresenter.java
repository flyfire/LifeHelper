package com.ns.yc.lifehelper.ui.other.douban.douBook.presenter;

import android.support.annotation.NonNull;

import com.blankj.utilcode.util.NetworkUtils;
import com.ns.yc.lifehelper.api.http.zhihu.ZhiHuModel;
import com.ns.yc.lifehelper.ui.other.douban.douBook.contract.DouBookContract;
import com.ns.yc.lifehelper.ui.other.zhihu.contract.ZhiHuCommentContract;
import com.ns.yc.lifehelper.ui.other.zhihu.model.bean.ZhiHuCommentBean;
import com.ns.yc.lifehelper.utils.rx.RxUtil;

import rx.Subscriber;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/12/1
 * 描    述：知乎评论
 * 修订历史：
 * ================================================
 */
public class DouBookPresenter implements DouBookContract.Presenter {

    private DouBookContract.View mView;
    @NonNull
    private CompositeSubscription mSubscriptions;


    public DouBookPresenter(DouBookContract.View homeView) {
        this.mView = homeView;
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {
        mSubscriptions.clear();
    }


}

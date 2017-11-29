package com.heyi.yungeng.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxy on 2017/8/4.
 * github:https://github.com/zxyaust
 */
public abstract class BasePagerAdapter<T> extends PagerAdapter implements View.OnClickListener {
    List<View> views = new ArrayList<>();
    List<T> mTs;
    public OnItemClickListener mOnItemClickListener;

    public BasePagerAdapter( List<T> list) {
        mTs = list;
        for (T bean : list) {
            View view = bindView(bean);
            view.setOnClickListener(this);
            views.add(view);
        }
    }

    public abstract View bindView(T bean);

    @Override
    public int getCount() {
        return views.size();
    }

    /**
     * 判断 是 view 是否来自对象
     */
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    /**
     * 实例化 一个 页卡
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position));
        return views.get(position);
    }

    /**
     * 销毁 一个 页卡
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(views.get(position));
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null && views.contains(v)) {
            int indexOf = views.indexOf(v);
            mOnItemClickListener.onItemClick(v, indexOf);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }

}

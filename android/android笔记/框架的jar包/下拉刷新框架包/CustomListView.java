package com.tarena.customlistview1604;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CustomListView extends ListView {
	View view;
	int height;

	TextView tvState;
	ImageView ivArrow;
	ProgressBar progressBar;

	private final static int STATE_DONE = 1;
	private final static int STATE_PULL = 2;
	private final static int STATE_RELEASE = 3;
	private final static int STATE_REFRESHING = 4;
	int currentState;
	int downY;

	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		view = View.inflate(getContext(), R.layout.listview_header, null);
		tvState = (TextView) view.findViewById(R.id.tv_state);
		ivArrow = (ImageView) view.findViewById(R.id.iv_arrow);
		progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
		// 设置初始状态
		currentState = STATE_DONE;

		addHeaderView(view);
		// getHeight控件已经显示出来了
		// getMeasuredHeight控件没有显示出来
		// height=view.getHeight();
		// Measure测量
		// 0是一种测量方式，不指定大小
		view.measure(0, 0);
		// 用getMeasuredHeight必须先测量
		height = view.getMeasuredHeight();
		view.setPadding(0, -height, 0, 0);
		// addFooterView(v);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		int action = ev.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:// 按下
			if (currentState == STATE_DONE) {
				downY = (int) ev.getY();
				currentState = STATE_PULL;
			}
			break;
		case MotionEvent.ACTION_MOVE:// 移动
			if (currentState == STATE_PULL) {
				int currentY = (int) ev.getY();
				int top = currentY - downY - height;
				Log.i("下拉", "currentY=" + currentY + ",downY=" + downY
						+ ",top=" + top);

				view.setPadding(0, top, 0, 0);
				if (currentY - downY > height) {
					currentState = STATE_RELEASE;
					tvState.setText("松开刷新");
				}
			}
			break;
		case MotionEvent.ACTION_UP:// 抬起
			if (currentState == STATE_RELEASE) {
				currentState = STATE_REFRESHING;
				tvState.setText("刷新中");
				ivArrow.setVisibility(View.GONE);
				progressBar.setVisibility(View.VISIBLE);

				// 4,调实现类
				if (this.onRefreshListener != null) {
					// 面向接口编程：调接口，接口可以指向不同的实现类
					this.onRefreshListener.onRefrsh(this);
				}

			}
			break;

		}
		return super.onTouchEvent(ev);
	}

	// 1,定义接口
	interface OnRefreshListener {
		public void onRefrsh(CustomListView customListView);
	}

	// 2,申明接中对象
	OnRefreshListener onRefreshListener;

	// 3,写一个方法接收实现类
	public void setOnRefreshListener(OnRefreshListener refresh) {
		this.onRefreshListener = refresh;
	}

	// 刷新完成，隐藏header
	public void refreshComplete() {
		view.setPadding(0, -height, 0, 0);
		currentState = STATE_DONE;
		tvState.setText("下拉刷新");
		progressBar.setVisibility(view.GONE);
		ivArrow.setVisibility(View.VISIBLE);
	}

}

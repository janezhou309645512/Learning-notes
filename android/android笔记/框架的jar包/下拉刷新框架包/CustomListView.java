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
		// ���ó�ʼ״̬
		currentState = STATE_DONE;

		addHeaderView(view);
		// getHeight�ؼ��Ѿ���ʾ������
		// getMeasuredHeight�ؼ�û����ʾ����
		// height=view.getHeight();
		// Measure����
		// 0��һ�ֲ�����ʽ����ָ����С
		view.measure(0, 0);
		// ��getMeasuredHeight�����Ȳ���
		height = view.getMeasuredHeight();
		view.setPadding(0, -height, 0, 0);
		// addFooterView(v);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		int action = ev.getAction();
		switch (action) {
		case MotionEvent.ACTION_DOWN:// ����
			if (currentState == STATE_DONE) {
				downY = (int) ev.getY();
				currentState = STATE_PULL;
			}
			break;
		case MotionEvent.ACTION_MOVE:// �ƶ�
			if (currentState == STATE_PULL) {
				int currentY = (int) ev.getY();
				int top = currentY - downY - height;
				Log.i("����", "currentY=" + currentY + ",downY=" + downY
						+ ",top=" + top);

				view.setPadding(0, top, 0, 0);
				if (currentY - downY > height) {
					currentState = STATE_RELEASE;
					tvState.setText("�ɿ�ˢ��");
				}
			}
			break;
		case MotionEvent.ACTION_UP:// ̧��
			if (currentState == STATE_RELEASE) {
				currentState = STATE_REFRESHING;
				tvState.setText("ˢ����");
				ivArrow.setVisibility(View.GONE);
				progressBar.setVisibility(View.VISIBLE);

				// 4,��ʵ����
				if (this.onRefreshListener != null) {
					// ����ӿڱ�̣����ӿڣ��ӿڿ���ָ��ͬ��ʵ����
					this.onRefreshListener.onRefrsh(this);
				}

			}
			break;

		}
		return super.onTouchEvent(ev);
	}

	// 1,����ӿ�
	interface OnRefreshListener {
		public void onRefrsh(CustomListView customListView);
	}

	// 2,�������ж���
	OnRefreshListener onRefreshListener;

	// 3,дһ����������ʵ����
	public void setOnRefreshListener(OnRefreshListener refresh) {
		this.onRefreshListener = refresh;
	}

	// ˢ����ɣ�����header
	public void refreshComplete() {
		view.setPadding(0, -height, 0, 0);
		currentState = STATE_DONE;
		tvState.setText("����ˢ��");
		progressBar.setVisibility(view.GONE);
		ivArrow.setVisibility(View.VISIBLE);
	}

}

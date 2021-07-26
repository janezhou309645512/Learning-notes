package com.jane.foryou.activity;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;

import com.jane.foryou.R;
import com.mob.tools.utils.UIHandler;

public class LoginActivity extends Activity  implements Callback, 
 PlatformActionListener {
	private static final int MSG_USERID_FOUND = 1;
	private static final int MSG_LOGIN = 2;
	private static final int MSG_AUTH_CANCEL = 3;
	private static final int MSG_AUTH_ERROR= 4;
	private static final int MSG_AUTH_COMPLETE = 5;
	


	private Button login;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		sp=getSharedPreferences("username",MODE_PRIVATE);
		ShareSDK.initSDK(this);
		login=(Button)findViewById(R.id.signin_button);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(LoginActivity.this,MainActivity.class));
				
			}
		});
		
		
	}
      
      private void authorize(Platform plat) {	
  		if(plat.isValid()) {
  			plat.removeAccount();
  			
  			}
  		/*
  		else{String userId = plat.getDb().getUserId();
  			if (!TextUtils.isEmpty(userId)) {
  				UIHandler.sendEmptyMessage(MSG_USERID_FOUND, this);
  				login(plat.getName(), userId, null);
  				return;}
  		}*/
  		//执行登录，登录后在回调里获取用户资料
  		plat.setPlatformActionListener(this);
  		plat.SSOSetting(true);
  		plat.showUser(null);
  	}
  	
  	public void onComplete(Platform platform, int action,
  			HashMap<String, Object> res) {
  		
  		//登录成功后获取用户信息
  		if (action == Platform.ACTION_USER_INFOR) {
  			UIHandler.sendEmptyMessage(MSG_AUTH_COMPLETE, this);
  			login(platform.getName(), platform.getDb().getUserId(), res);
  			Editor ed=sp.edit();
  			ed.putString("username", platform.getDb().getUserName());
  		}
  		System.out.println(res);
  		System.out.println("------User Name ---------" + platform.getDb().getUserName());
  		System.out.println("------User ID ---------" + platform.getDb().getUserId());
  		System.out.println("------User icon ---------" + platform.getDb().getUserIcon());
  	
  	}
  	
  	public void onError(Platform platform, int action, Throwable t) {
  		if (action == Platform.ACTION_USER_INFOR) {
  			UIHandler.sendEmptyMessage(MSG_AUTH_ERROR, this);
  		}
  		t.printStackTrace();
  	}
  	
  	public void onCancel(Platform platform, int action) {
  		if (action == Platform.ACTION_USER_INFOR) {
  			UIHandler.sendEmptyMessage(MSG_AUTH_CANCEL, this);
  		}
  	}
  	
  	private void login(String plat, String userId, HashMap<String, Object> userInfo) {
  		Message msg = new Message();
  		msg.what = MSG_LOGIN;
  		msg.obj = plat;
  		UIHandler.sendMessage(msg, this);
  	}
  	
  	public boolean handleMessage(Message msg) {
  		switch(msg.what) {
  			case MSG_USERID_FOUND: {
  				Toast.makeText(this, "用户信息已存在，正在跳转登录操作", Toast.LENGTH_SHORT).show();
  			}
  			break;
  			case MSG_LOGIN: {
  				
  				
  				Toast.makeText(this,"使用%s帐号登录中…", Toast.LENGTH_SHORT).show();
  				System.out.println("---------------");
  				
//  				Builder builder = new Builder(this);
//  				builder.setTitle(R.string.if_register_needed);
//  				builder.setMessage(R.string.after_auth);
//  				builder.setPositiveButton(R.string.ok, null);
//  				builder.create().show();
  			}
  			break;
  			case MSG_AUTH_CANCEL: {
  				Toast.makeText(this,"授权操作已取消", Toast.LENGTH_SHORT).show();
  				System.out.println("-------MSG_AUTH_CANCEL--------");
  			}
  			break;
  			case MSG_AUTH_ERROR: {
  				Toast.makeText(this,"授权操作遇到错误，请阅读Logcat输出", Toast.LENGTH_SHORT).show();
  				System.out.println("-------MSG_AUTH_ERROR--------");
  			}
  			break;
  			case MSG_AUTH_COMPLETE: {
  				Toast.makeText(this, "授权成功，正在跳转登录操作…", Toast.LENGTH_SHORT).show();
  				System.out.println("--------MSG_AUTH_COMPLETE-------");
  				startActivity(new Intent(this,MainActivity.class));
  				
  			}
  			break;
  		}
  		return false;
  	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void doClick(View v) {
		  switch (v.getId()) {
			case R.id.qq:
				 authorize(new QQ(this));
				
				break;

	      case R.id.weibo: 
	    	  authorize(new SinaWeibo(this));
				break;
	       case R.id.weixin:
	    	   authorize(new Wechat(this));
				
				break;
	       case R.id.renren:
	    	 
				break;
			}
	    	  
		
	}
@Override
protected void onDestroy() {
	
		ShareSDK.stopSDK(this);
	
	
	

	super.onDestroy();
}
}

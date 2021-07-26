package com.jane.book_shopping.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import com.jane.book_shopping.app.MyApplication;
import com.jane.book_shopping.entity.Book;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

/**
 * �����Լ�����ͼƬ
 * @author tarena
 *
 */

public class BitmapUtils {
	private static HashMap<String,SoftReference<Bitmap>> cache=
			new HashMap();
	static int i=0;
	
	
	
	
	//ͨ��·������������ͼƬ
 public static void getBitmapByGet(final String path,final BitmapCallBack bcb){
	
			AsyncTask<String,String,Bitmap> task=new AsyncTask<String, String, Bitmap>(){

				@Override
				protected Bitmap doInBackground(String... params) {
					Bitmap bm=null;
					
					try {
					 URL url= new URL(path);
				    HttpURLConnection conn=(HttpURLConnection) url.openConnection();
					InputStream is=conn.getInputStream();
					ByteArrayOutputStream bos=new ByteArrayOutputStream();
					byte[] buffer=new byte[1024*10];
					int len;
					while((len=is.read(buffer))!=-1){
						bos.write(buffer,0,len);
						bos.flush();
					}
					byte[] imageInfo=bos.toByteArray();//���ͼƬ��������Ϣ
					Log.d("jane", "ͼ����Ϣ"+imageInfo.toString());
					Options ops=new Options();//���ڴ��ͼƬ�����ĸ��ֲ���
					ops.inJustDecodeBounds=true;
					BitmapFactory.decodeByteArray(imageInfo,0,imageInfo.length, ops);
					//�����ͼƬû������ڴ��У���ops���Ž����ĳߴ���Ϣ
					int w=ops.outWidth/50;
					int h=ops.outHeight/50;
					ops.inSampleSize=w>h?w:h;
					//��������ͼƬ��Ϣ���н���
					ops.inJustDecodeBounds=false;
					 bm=BitmapFactory.decodeByteArray(imageInfo, 0,imageInfo.length,ops);
					
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					return bm;
				}
				@Override
				protected void onPostExecute(Bitmap bm) {
					bcb.setBitmap(bm);
					
					}
				};
			    task.execute();
			}
 //�ص��ķ���û�з���ֵ
 /**public static Bitmap getBitmap(final String path){
	   final Bitmap bitmap;
		//��ȡͼƬ,1.���ж�ͼƬ�����ڴ���
		 SoftReference<Bitmap> ref=cache.get(path);
		 if(ref!=null){
			 bitmap=ref.get();
			 if(bitmap!=null){
				return bitmap;
			 }
			 }
		 
		 //�����û����ȥ�ļ�����
	    String filename=path.substring(path.lastIndexOf("/")+1);
		final File file=new File(MyApplication.getApp().getCacheDir(),"image/"+filename);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		String filepath=file.getAbsolutePath();
		bitmap=BitmapFactory.decodeFile(filepath);
		if(bitmap!=null){
		//��ȡ��ͼƬ�ڴ���ڴ�
		cache.put(path, new SoftReference<Bitmap>(bitmap));
		return bitmap;}
		//�������������ڣ���Ҫȥ������ȥ����
		BitmapUtils.getBitmapByGet(path,new BitmapCallBack() {
			@Override
			public void setBitmap(Bitmap bm) {
				
				//��ѹ����ͼƬ����
				cache.put(path, new SoftReference<Bitmap>(bm));
				//��ͼƬ�������ļ���
				FileOutputStream fos=null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				bm.compress(CompressFormat.JPEG, 100,fos);
				bitmap=bm;
				
			Log.d("jane",(++i)+"��������"+bm.toString());
			  
			 Log.d("jane", "�����");
			 
				
			}
		});
		return bitmap;
		
 	  
 	  
	 
	 
	 
 }*/
 
 
 
 
  public static void displayImage(final ImageView imageView,final String path){
	   Bitmap bm=null;
		//��ȡͼƬ,1.���ж�ͼƬ�����ڴ���
		 SoftReference<Bitmap> ref=cache.get(path);
		 if(ref!=null){
			 bm=ref.get();
			 if(bm!=null){
				imageView.setImageBitmap(bm); 
				return;
			 }
			 }
		 
		 //�����û����ȥ�ļ�����
	    String filename=path.substring(path.lastIndexOf("/")+1);
		final File file=new File(MyApplication.getApp().getCacheDir(),"image/"+filename);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		String filepath=file.getAbsolutePath();
		bm=BitmapFactory.decodeFile(filepath);
		if(bm!=null){
		//��ȡ��ͼƬ�ڴ���ڴ�
		cache.put(path, new SoftReference<Bitmap>(bm));
	    imageView.setImageBitmap(bm); 
		return;}
		//�������������ڣ���Ҫȥ������ȥ����
		BitmapUtils.getBitmapByGet(path,new BitmapCallBack() {
			@Override
			public void setBitmap(Bitmap bm) {
				//��ѹ����ͼƬ����
				cache.put(path, new SoftReference<Bitmap>(bm));
				//��ͼƬ�������ļ���
				FileOutputStream fos=null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				bm.compress(CompressFormat.JPEG, 100,fos);
				
				
			Log.d("jane",(++i)+"��������"+bm.toString());
			 imageView.setImageBitmap(bm);
			 Log.d("jane", "�����");
			 
				
			}
		});
	}

}

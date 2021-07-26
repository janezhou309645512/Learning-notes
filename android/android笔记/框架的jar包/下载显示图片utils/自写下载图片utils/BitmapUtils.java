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
 * 下载以及保存图片
 * @author tarena
 *
 */

public class BitmapUtils {
	private static HashMap<String,SoftReference<Bitmap>> cache=
			new HashMap();
	static int i=0;
	
	
	
	
	//通过路径发送请求获得图片
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
					byte[] imageInfo=bos.toByteArray();//获得图片的完整信息
					Log.d("jane", "图像信息"+imageInfo.toString());
					Options ops=new Options();//用于存放图片解码后的各种参数
					ops.inJustDecodeBounds=true;
					BitmapFactory.decodeByteArray(imageInfo,0,imageInfo.length, ops);
					//解码后图片没存放在内存中，但ops里存放解码后的尺寸信息
					int w=ops.outWidth/50;
					int h=ops.outHeight/50;
					ops.inSampleSize=w>h?w:h;
					//加载完整图片信息进行解码
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
 //回调的方法没有返回值
 /**public static Bitmap getBitmap(final String path){
	   final Bitmap bitmap;
		//获取图片,1.先判断图片存在内存中
		 SoftReference<Bitmap> ref=cache.get(path);
		 if(ref!=null){
			 bitmap=ref.get();
			 if(bitmap!=null){
				return bitmap;
			 }
			 }
		 
		 //如果上没有则去文件中找
	    String filename=path.substring(path.lastIndexOf("/")+1);
		final File file=new File(MyApplication.getApp().getCacheDir(),"image/"+filename);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		String filepath=file.getAbsolutePath();
		bitmap=BitmapFactory.decodeFile(filepath);
		if(bitmap!=null){
		//获取的图片在存进内存
		cache.put(path, new SoftReference<Bitmap>(bitmap));
		return bitmap;}
		//最后如果都不存在，则要去发请求去下载
		BitmapUtils.getBitmapByGet(path,new BitmapCallBack() {
			@Override
			public void setBitmap(Bitmap bm) {
				
				//将压缩的图片保存
				cache.put(path, new SoftReference<Bitmap>(bm));
				//将图片保存在文件中
				FileOutputStream fos=null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				bm.compress(CompressFormat.JPEG, 100,fos);
				bitmap=bm;
				
			Log.d("jane",(++i)+"适配器中"+bm.toString());
			  
			 Log.d("jane", "完结中");
			 
				
			}
		});
		return bitmap;
		
 	  
 	  
	 
	 
	 
 }*/
 
 
 
 
  public static void displayImage(final ImageView imageView,final String path){
	   Bitmap bm=null;
		//获取图片,1.先判断图片存在内存中
		 SoftReference<Bitmap> ref=cache.get(path);
		 if(ref!=null){
			 bm=ref.get();
			 if(bm!=null){
				imageView.setImageBitmap(bm); 
				return;
			 }
			 }
		 
		 //如果上没有则去文件中找
	    String filename=path.substring(path.lastIndexOf("/")+1);
		final File file=new File(MyApplication.getApp().getCacheDir(),"image/"+filename);
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		String filepath=file.getAbsolutePath();
		bm=BitmapFactory.decodeFile(filepath);
		if(bm!=null){
		//获取的图片在存进内存
		cache.put(path, new SoftReference<Bitmap>(bm));
	    imageView.setImageBitmap(bm); 
		return;}
		//最后如果都不存在，则要去发请求去下载
		BitmapUtils.getBitmapByGet(path,new BitmapCallBack() {
			@Override
			public void setBitmap(Bitmap bm) {
				//将压缩的图片保存
				cache.put(path, new SoftReference<Bitmap>(bm));
				//将图片保存在文件中
				FileOutputStream fos=null;
				try {
					fos = new FileOutputStream(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				bm.compress(CompressFormat.JPEG, 100,fos);
				
				
			Log.d("jane",(++i)+"适配器中"+bm.toString());
			 imageView.setImageBitmap(bm);
			 Log.d("jane", "完结中");
			 
				
			}
		});
	}

}

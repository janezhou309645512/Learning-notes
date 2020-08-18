package com.bootdo.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * jane.zhou1
 * 用于客户端发送的get与post的请求
 */
public class HtUtils{
	/**
	 * 根据流得到服务端发送过来的字符串
	 * @return
	 */
    public static String isToString(InputStream is) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = "";
		while((line = reader.readLine()) != null){
			sb.append(line);
		}
		return sb.toString();
	}
	/**
	 * 根据路径发送post请求
	 * @param path
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String postInputStream(String path, Map<String, String> params){
        URL url;
        String json=null;
		try {
	    url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//conn.setConnectTimeout(5000);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setDoOutput(true);
		OutputStream os = conn.getOutputStream();
		StringBuilder sb = new StringBuilder();
		Set<String> keys = params.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
		String key = ite.next();
		String val = params.get(key);
		sb.append(key+"="+URLEncoder.encode(val.toString(),"UTF-8")+"&");
		}
	    sb.deleteCharAt(sb.length()-1);
		String param = sb.toString();
		os.write(param.getBytes("utf-8"));
		os.flush();
		//做个网络判断，是否连接得上 
	    InputStream is = conn.getInputStream();
		json=isToString(is);
		return json;
	 } 
		catch (Exception e) {
			return "404";
		//网络发上异常
		}
	}
	
	/**
	 * 根据路径发送get请求
	 * 
	 * @param path  
	 * @return 
	 */
	public static String getInputStream(String path){
		//1. URL
		URL url;
		String json=null;
		try {
			url = new URL(path);
		//2. HttpURLConenction
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//3. getInputStream
		// conn.setConnectTimeout(5000);
		conn.setRequestMethod("GET");
		//获取流之前，要判断网络是否连接得上
		//做个网络判断，是否连接得上 
	   //网络正常
	   InputStream is = conn.getInputStream();	
			json=isToString(is);
			return json;
		//网络异常
		} catch (Exception e) {
			 return   "404";
		}
		
	}
	
}





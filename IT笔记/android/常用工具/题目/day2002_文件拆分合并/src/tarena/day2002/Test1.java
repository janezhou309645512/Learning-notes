package tarena.day2002;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("要拆分的文件路径：");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println(
			 "请输入正确的“文件”路径");
			return;
		}
		System.out.println("拆分文件大小(Kb):");
		long size = 
		 1024*new Scanner(System.in).nextLong();
		try {
			split(file, size);
			System.out.println("拆分完成");
		} catch (Exception e) {
			System.out.println("拆分失败");
			e.printStackTrace();
		}
	}

	private static void split(
			File file, long size) throws Exception {
		//文件名
		String name = file.getName();
		//准备目录
		File dir = new File(
		 file.getAbsolutePath()+"_split");
		//目录是否存在
		if(dir.exists()) {
			//清空目录
			File[] files = dir.listFiles();
			for (File f : files) {
				f.delete();
			}
		} else {
			dir.mkdirs();
		}
		// name   dir
		
		//定义字节计数和文件计数变量
		long byteCount = 0;
		int fileCount = 0;
		
		BufferedInputStream in = 
		 new BufferedInputStream(
		 new FileInputStream(file));
		
		BufferedOutputStream out = null;
		
		int b;
		while((b = in.read()) != -1) {
			//创建输出流
			//不存在输出流或前面的文件满了
			if(out==null || byteCount==size) {
				//如果存在上一个输出流
				if(out != null) {
					out.close();//先关闭上一个流
				}
				//dir目录下“原文件名.xxx”
				out = 
				      new BufferedOutputStream(
					  new FileOutputStream(
					  new File(dir, name+"."+(++fileCount))));
				byteCount=0;//重置字节计数变量
			}
			
			out.write(b);
			byteCount++;
		}
		
		in.close();
		out.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}

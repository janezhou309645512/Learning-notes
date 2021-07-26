package tarena.day2002;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Ҫ��ֵ��ļ�·����");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if(! file.isFile()) {
			System.out.println(
			 "��������ȷ�ġ��ļ���·��");
			return;
		}
		System.out.println("����ļ���С(Kb):");
		long size = 
		 1024*new Scanner(System.in).nextLong();
		try {
			split(file, size);
			System.out.println("������");
		} catch (Exception e) {
			System.out.println("���ʧ��");
			e.printStackTrace();
		}
	}

	private static void split(
			File file, long size) throws Exception {
		//�ļ���
		String name = file.getName();
		//׼��Ŀ¼
		File dir = new File(
		 file.getAbsolutePath()+"_split");
		//Ŀ¼�Ƿ����
		if(dir.exists()) {
			//���Ŀ¼
			File[] files = dir.listFiles();
			for (File f : files) {
				f.delete();
			}
		} else {
			dir.mkdirs();
		}
		// name   dir
		
		//�����ֽڼ������ļ���������
		long byteCount = 0;
		int fileCount = 0;
		
		BufferedInputStream in = 
		 new BufferedInputStream(
		 new FileInputStream(file));
		
		BufferedOutputStream out = null;
		
		int b;
		while((b = in.read()) != -1) {
			//���������
			//�������������ǰ����ļ�����
			if(out==null || byteCount==size) {
				//���������һ�������
				if(out != null) {
					out.close();//�ȹر���һ����
				}
				//dirĿ¼�¡�ԭ�ļ���.xxx��
				out = 
				      new BufferedOutputStream(
					  new FileOutputStream(
					  new File(dir, name+"."+(++fileCount))));
				byteCount=0;//�����ֽڼ�������
			}
			
			out.write(b);
			byteCount++;
		}
		
		in.close();
		out.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}

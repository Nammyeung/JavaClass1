package java20200325;

import java.io.*;

public class P2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\test\\bbb.dat");
		//일반적으로 descript만들고
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//파일 쓰기...코드...로직에 따라 적절히 넣고....
		
		
		
		dos.close();
		
		
	}

}

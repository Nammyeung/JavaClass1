package java20200325;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/*		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos); 

*/
// ********************��� API���� try catch���� ����ϴ� ���
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\test\\ccc.ccc");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			BufferedOutputStream bos =
					new BufferedOutputStream(fos); // ���߿��� �� �ܺη� ������ ������...
			// �����ͺ��̽��� �����Ҷ�,,, connection, statement ��� �ݾƾ�...
			DataOutputStream dos =
					new DataOutputStream(bos); // bos�� ����
			
		// ������ ���� ó��....	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fos.close(); // Block, ���������鼭 fos�� �Ҹ�ǹǷ� ����.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
		
		
	}

}

package java20200325;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/*		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos); 

*/
// ********************모든 API들이 try catch문을 사용하는 경우
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\test\\ccc.ccc");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			BufferedOutputStream bos =
					new BufferedOutputStream(fos); // 나중에는 다 외부로 보내야 하지만...
			// 데이터베이스에 연결할때,,, connection, statement 모두 닫아야...
			DataOutputStream dos =
					new DataOutputStream(bos); // bos를 연결
			
		// 나머지 로직 처리....	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fos.close(); // Block, 빠져나오면서 fos가 소멸되므로 없음.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
		
		
	}

}

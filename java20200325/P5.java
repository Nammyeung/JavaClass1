package java20200325;
//https://ko.wikipedia.org/wiki/BMP_%ED%8C%8C%EC%9D%BC_%ED%8F%AC%EB%A7%B7
//���������� ������ ����
//���� ������� API�� ����� ������
//���� ���踦 �ϴ� ���� ��ƴ�.
//����
//(1) ���� ������ (2) ��Ÿ ������
//���� �����͸� ��� �������....
//**********************************Hexdump Ȯ�� ���(with Visual Studio Code)
//https://tttsss77.tistory.com/71
import java.io.*;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//��Ʈ�� �������� �����.....
				try {
					File file = new File("C:\\test\\aa.bmp");
					FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					DataOutputStream dos = new DataOutputStream(bos);
//					*****************************************************�׻� �̷��� ����
					dos.writeByte('B');
					dos.writeByte('M');
//					��� ����					
					//dos.writeInt(360054);
					dos.writeByte(360054 >> 0); // �������� �迭�� �Ųٷ� ����� ����.
					dos.writeByte(360054 >> 8); // ��Ʈ������ ���ؼ� �о���� ������.
					dos.writeByte(360054 >> 16);
					dos.writeByte(360054 >> 24);
					
					dos.writeShort(0);
					dos.writeShort(0);
					
					dos.writeByte(54 >> 0);
					dos.writeByte(54 >> 8);
					dos.writeByte(54 >> 16);
					dos.writeByte(54 >> 24);
					
					dos.writeByte(40 >> 0);
					dos.writeByte(40 >> 8);
					dos.writeByte(40 >> 16);
					dos.writeByte(40 >> 24);
					
					dos.writeByte(400 >> 0);
					dos.writeByte(400 >> 8);
					dos.writeByte(400 >> 16);
					dos.writeByte(400 >> 24);
					
					dos.writeByte(300 >> 0);
					dos.writeByte(300 >> 8);
					dos.writeByte(300 >> 16);
					dos.writeByte(300 >> 24);
					
					dos.writeByte(1 >> 0);
					dos.writeByte(1 >> 8); 
					
					dos.writeByte(24 >> 0);
					dos.writeByte(24 >> 8);
					
					dos.writeByte(0 >> 0);
					dos.writeByte(0 >> 8);
					dos.writeByte(0 >> 16);
					dos.writeByte(0 >> 24);
					
					
					dos.writeByte(360000 >> 0);
					dos.writeByte(360000 >> 8);
					dos.writeByte(360000 >> 16);
					dos.writeByte(360000 >> 24);
					
					
					dos.writeInt(0);
					dos.writeInt(0);
					dos.writeInt(0);
					dos.writeInt(0);
					
					
					//���� ������.... ��Ÿ�������ϰ� �� �¾ƾߵ�...
					for(int x = 0 ; x < 300 ; x++) {
						for(int y = 0 ; y < 400 ; y++) {
							
//							dos.writeByte(255);
//							dos.writeByte(0);
//							dos.writeByte(0);
//							// �Ķ���
							
							
							
							
							if(x == 20) {
								dos.writeByte(0);
								dos.writeByte(0);
								dos.writeByte(255);
								
							}else {
								dos.writeByte(x);
								dos.writeByte(y);
								dos.writeByte(x);
							}
						}
					}
					
					dos.close();
					System.out.println("������ ���� �Ǿ����ϴ�."); //�ܼ� â�� ���� ����.
//					������#	ũ��	����
//					0	2	BMP ������ �ĺ��ϴ� �� ���̴� ���� �ѹ�: 0x42 0x4D (B�� M�� ���� ASCII �ڵ� ����Ʈ)
//					2	4	BMP ���� ũ�� (����Ʈ ����)
//					6	2	�غ�. �������� �׸��� ���� �� ���� ���� ���α׷��� ���� �޶�����.
//					8	2	�غ�. �������� �׸��� ���� �� ���� ���� ���α׷��� ���� �޶�����.
//					10	4	��Ʈ�� �����͸� ã�� �� �ִ� ���� ������ (����Ʈ ����)
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
	}

}

//Hex dump
//��Ű���, �츮 ����� �������.
//�ѷ������ ����˻��Ϸ� ����
//
//318����Ʈ Wikipedia �ĺ����� hex dump
//hex dump�� �� �Ǵ� �����̳� ������ġ�� �ִ� ��ǻ�� �������� ������������ ���ӻ��̴�. 
//�������� hex dump�� ���� ���� �ַ� ������̳� ������ �����Ͼ�� �� �κ��̴�.
//
//hex dump����, �� ����Ʈ�� 2 ������ 16���� ���� ǥ���ȴ�. 
//Hex dumps�� �ַ� 8 �Ǵ� 16����Ʈ�� ������ �����Ǹ�, ������ �� �������� �и��ȴ�. 
//��� hex dump���� ���ۿ����� ������ ������ üũ�� ����Ʈ���� 16������ �޸� �ּҸ� ���´�.

//���н� ���α׷����� ������ hex dump ������ �� �κ�.
//
//00105e0 e6b0 343b 9c74 0804 e7bc 0804 e7d5 0804
//00105f0 e7e4 0804 e6b0 0804 e7f0 0804 e7ff 0804
//0010600 e80b 0804 e81a 0804 e6b0 0804 e6b0 0804
//�׷��� ���� ���ô� ����Ʈ ������ ��Ȯ���ϱ� ������ hex dump�� ��ȣ�� ���¸� ��ǥ�Ѵ�. 
//�̷��� hex dump���� �� �˷��� ǥ���� ���ƿ����� ����. 
//�Ǵ� �Ʒ� ó�� ������ �ǵ������� ��ü ���°� �־��� ���.

//���� �����ϴ� �ƽ�Ű �ڵ带 ��ȯ�ؼ� �����ִ� �߰����� ���� ���� �� �ִ�. (���� ��� hexdump -C �Ǵ� hd):
//
//0000: 57 69 6B 69 70 65 64 69 61 2C 20 74 68 65 20 66  Wikipedia, the f
//0010: 72 65 65 20 65 6E 63 79 63 6C 6F 70 65 64 69 61  ree encyclopedia
//0020: 20 74 68 61 74 20 61 6E 79 6F 6E 65 20 63 61 6E   that anyone can
//0030: 20 65 64 69 74 00 00 00 00 00 00 00 00 00 00 00   edit...........

//�ȵ���̵��� Bitmap�� �⺻������ 16Bit(RGB_565)�� �����ϸ�, 32Bit(ARGB_8888)�� �����Ѵ�.
//�׷��� �̹��� ó���� ���ؼ� Bitmap�� 24Bit(RGB_888)�� ������ �ؾ��ϴ� ��쵵 �ִ�.
//�̷� ���� �⺻ Android Platform������ ������ ���� �ʰ� �ִ�. 
//������ �ʿ��ϴٸ� �ҽ��ڵ忡�� ���� ������ ���� ���� �۾����� ������ �ؾ� �ϴ� �� ����.
//
//�⺻������ 24Bit�� ��� ������ �����Ͼ� �ϸ�, 
//16Bit �Ǵ� 32Bit Bitmap�� �������� ������ 24Bit�� �����ϴ� �۾��� �����ؾ� �Ѵ�.
//
//16Bit Bitmap : #RRRRRGGGGGGBBBBB (RGB_565)
//24Bit Bitmap : #RRRRRRRRGGGGGGGGBBBBBBBB (RGB_888)
//32Bit Bitmap : #AAAAAAAARRRRRRRRGGGGGGGGBBBBBBBB (ARGB_8888)
//
//16Bit�� 24Bit �Ǵ� 32Bit���� ��ȯ�� ��������� �����ϸ�, 
//Android���� pixel ���� int ������ �����ϹǷ� �����ϰ� ó���� �� �� �ִ�. 
//���� int ���� �ƴ� �� byte[]�� ������ �������� ���� ó�� �ӵ��鿡���� ������, 
//byte�� ���� ���������� ���̿� ������ ���� ���ŷο� int ���� �ȼ������� ó���� �Ѵ�.
//
//* Bitmap ��� ���� ����

//��ó: https://thinkwarehouse.tistory.com/entry/Bitmap-16bit24bit32bit [Think Ware House]

//***************************************** BMP ���� ���� ***************************************

//BMP ���� ������ ��Ʈ�� ������ �׸��� �����ϴ� �� ���̴� �׸� ���� �����̴�. Ư��, ����ũ�μ���Ʈ ����, OS/2 � ü���� �θ� ���δ�. �ٿ��� ��Ʈ��, �� ��ġ ���� ��Ʈ���� ��� DIB ���� �����̶�� �Ѵ�.

//������ �׷��� ����� �������̽��� ��ü ���� �׷��� �Ϻ� �ý��ۿ��� ��Ʈ���� ����Ѵ�.
//[1] �̸��׸�, ����ũ�μ���Ʈ ������ OS/2 �÷����� GDI �Ϻ� �ý����� .BMP, .DIB�� ���� Ȯ���� �̸��� ������.
//
//�⺻������ 1~24��Ʈ�� ���� ǥ���� �� �ִ�. 
//1��Ʈ�� 2���� ���̸� 24��Ʈ�� 16777216���� ���̴�. 
//���� ä���� ������ 32��Ʈ ������ ���� XP���� ��ǥ�Ǿ���. 
//�Ϲ������� �����͸� �������� �ʰ� ��������, RLE ���� ��ĵ� �����Ѵ�.



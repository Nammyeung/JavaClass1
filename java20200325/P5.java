package java20200325;
//https://ko.wikipedia.org/wiki/BMP_%ED%8C%8C%EC%9D%BC_%ED%8F%AC%EB%A7%B7
//영구적으로 데이터 저장
//파일 입출력이 API는 어렵지 않지만
//파일 설계를 하는 것이 어렵다.
//파일
//(1) 순수 데이터 (2) 메타 데이터
//순수 데이터를 어떻게 만드는지....
//**********************************Hexdump 확인 방법(with Visual Studio Code)
//https://tttsss77.tistory.com/71
import java.io.*;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//비트맵 논리적으로 만들기.....
				try {
					File file = new File("C:\\test\\aa.bmp");
					FileOutputStream fos = new FileOutputStream(file);
					BufferedOutputStream bos = new BufferedOutputStream(fos);
					DataOutputStream dos = new DataOutputStream(bos);
//					*****************************************************항상 이렇게 시작
					dos.writeByte('B');
					dos.writeByte('M');
//					헤더 구성					
					//dos.writeInt(360054);
					dos.writeByte(360054 >> 0); // 윈도우즈 계열은 거꾸로 뒤집어서 들어간다.
					dos.writeByte(360054 >> 8); // 비트연산을 통해서 밀어놓고 빼야함.
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
					
					
					//실제 데이터.... 메타데이터하고 잘 맞아야됨...
					for(int x = 0 ; x < 300 ; x++) {
						for(int y = 0 ; y < 400 ; y++) {
							
//							dos.writeByte(255);
//							dos.writeByte(0);
//							dos.writeByte(0);
//							// 파란색
							
							
							
							
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
					System.out.println("파일이 생성 되었습니다."); //콘솔 창에 띄우기 위함.
//					오프셋#	크기	목적
//					0	2	BMP 파일을 식별하는 데 쓰이는 매직 넘버: 0x42 0x4D (B와 M에 대한 ASCII 코드 포인트)
//					2	4	BMP 파일 크기 (바이트 단위)
//					6	2	준비. 실제값은 그림을 만든 데 쓰인 응용 프로그램에 따라 달라진다.
//					8	2	준비. 실제값은 그림을 만든 데 쓰인 응용 프로그램에 따라 달라진다.
//					10	4	비트맵 데이터를 찾을 수 있는 시작 오프셋 (바이트 단위)
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
	}

}

//Hex dump
//위키백과, 우리 모두의 백과사전.
//둘러보기로 가기검색하러 가기
//
//318바이트 Wikipedia 파비콘의 hex dump
//hex dump는 램 또는 파일이나 저장장치에 있는 컴퓨터 데이터의 십육진법적인 보임새이다. 
//데이터의 hex dump를 보는 것은 주로 디버깅이나 리버스 엔지니어링의 한 부분이다.
//
//hex dump에서, 각 바이트는 2 숫자의 16진법 수로 표현된다. 
//Hex dumps는 주로 8 또는 16바이트의 행으로 조직되며, 가끔은 흰 공간으로 분리된다. 
//몇몇 hex dump들은 시작에서나 마지막 라인의 체크섬 바이트에서 16진법의 메모리 주소를 갖는다.

//유닉스 프로그램에서 생성된 hex dump 샘플의 한 부분.
//
//00105e0 e6b0 343b 9c74 0804 e7bc 0804 e7d5 0804
//00105f0 e7e4 0804 e6b0 0804 e7f0 0804 e7ff 0804
//0010600 e80b 0804 e81a 0804 e6b0 0804 e6b0 0804
//그러나 위의 예시는 바이트 순서가 불확실하기 때문에 hex dump의 모호한 형태를 대표한다. 
//이러한 hex dump들은 잘 알려진 표준의 문맥에서만 좋다. 
//또는 아래 처럼 값들이 의도적으로 전체 형태가 주어진 경우.

//종종 상응하는 아스키 코드를 변환해서 보여주는 추가적인 열이 보일 수 있다. (예를 들어 hexdump -C 또는 hd):
//
//0000: 57 69 6B 69 70 65 64 69 61 2C 20 74 68 65 20 66  Wikipedia, the f
//0010: 72 65 65 20 65 6E 63 79 63 6C 6F 70 65 64 69 61  ree encyclopedia
//0020: 20 74 68 61 74 20 61 6E 79 6F 6E 65 20 63 61 6E   that anyone can
//0030: 20 65 64 69 74 00 00 00 00 00 00 00 00 00 00 00   edit...........

//안드로이드의 Bitmap은 기본적으로 16Bit(RGB_565)를 제공하며, 32Bit(ARGB_8888)을 지원한다.
//그러나 이미지 처리를 위해서 Bitmap을 24Bit(RGB_888)로 변경을 해야하는 경우도 있다.
//이런 경우는 기본 Android Platform에서는 지원을 하지 않고 있다. 
//변경이 필요하다면 소스코드에서 실제 데이터 값의 변경 작업으로 수행을 해야 하는 것 같다.
//
//기본적으로 24Bit의 헤더 정보를 생성하야 하며, 
//16Bit 또는 32Bit Bitmap의 색상데이터 값에서 24Bit로 변경하는 작업을 수행해야 한다.
//
//16Bit Bitmap : #RRRRRGGGGGGBBBBB (RGB_565)
//24Bit Bitmap : #RRRRRRRRGGGGGGGGBBBBBBBB (RGB_888)
//32Bit Bitmap : #AAAAAAAARRRRRRRRGGGGGGGGBBBBBBBB (ARGB_8888)
//
//16Bit를 24Bit 또는 32Bit로의 변환은 헤더정보가 동일하며, 
//Android에서 pixel 값을 int 형으로 추출하므로 동일하게 처리를 할 수 있다. 
//물론 int 형이 아닌 실 byte[]의 값으로 가져오는 것이 처리 속도면에서는 좋으나, 
//byte에 대한 데이터형의 차이에 때문에 조금 번거로워 int 형의 픽셀값으로 처리를 한다.
//
//* Bitmap 헤더 정보 생성

//출처: https://thinkwarehouse.tistory.com/entry/Bitmap-16bit24bit32bit [Think Ware House]

//***************************************** BMP 파일 포맷 ***************************************

//BMP 파일 포맷은 비트맵 디지털 그림을 저장하는 데 쓰이는 그림 파일 포맷이다. 특히, 마이크로소프트 윈도, OS/2 운영 체제에 널리 쓰인다. 줄여서 비트맵, 또 장치 독립 비트맵의 경우 DIB 파일 포맷이라고 한다.

//수많은 그래픽 사용자 인터페이스는 자체 내장 그래픽 하부 시스템에서 비트맵을 사용한다.
//[1] 이를테면, 마이크로소프트 윈도와 OS/2 플랫폼의 GDI 하부 시스템은 .BMP, .DIB의 파일 확장자 이름을 가진다.
//
//기본적으로 1~24비트의 색을 표현할 수 있다. 
//1비트는 2가지 색이며 24비트는 16777216가지 색이다. 
//알파 채널을 포함한 32비트 포맷이 윈도 XP에서 발표되었다. 
//일반적으로 데이터를 압축하지 않고 사용되지만, RLE 압축 방식도 지원한다.



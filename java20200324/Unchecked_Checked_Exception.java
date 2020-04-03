package java20200324;

import java.io.*; // io : INPUT/OUTPUT
import java.io.File;
import java.io.FileOutputStream;

public class Unchecked_Checked_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0; //  java.lang.ArithmeticException: / by zero
		int result = a/b;
		
		System.out.println(result);
		
		
		File file = new File("C:\\aaa.txt"); //aaa.txt를 쓸 수 있게 함.
//		FileOutputStream fos = new FileOutputStream(file); // try,catch문을 작성을 하지 않음.
	}

}

// Unchecked Exception (예 - 0으로 나눌때 arithmetic exception)
// 명시적인 예외 처리를 강제하지 않는 특징이 있기 때문에 Unchecked Exception이라 하며, 
// catch로 잡거나 throw로 호출한 메서드로 예외를 던지지 않아도 상관이 없습니다.
//
// Checked Exception
// 반드시 명시적으로 처리해야 하기 때문에 Checked Exception이라고 하며, 
// try catch를 해서 에러를 잡든 throws를 통해서 호출한 메서드로 예외를 던져야 합니다.

//				        |		Checked Exception    |	Unchecked Exception
//처리 여부			    |		반드시 예외 처리 해야함         |	예외 처리 하지 않아도됨
//트랜잭션 Rollback 여부       |			Rollback 안됨	     |		Rollback 진행
//대표 Exception	        |IOException, SQLException   |	NullPointerException, IllegalArgumentException


//참조 https://dololak.tistory.com/53
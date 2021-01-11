package ch10;

public class MultiCatchExceptionMain {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법] java MultiCatchExceptionMain num1 num2" );
		}
		
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
		}
		
		catch(Exception e) {
//			ArrayIndextionOutOfBoundsException이나 NumberFormatException보다 
//			범위가 넣ㅂ으므로 마지막에 Exception 부분을 넣어야함
			e.printStackTrace();
		}
		
		finally {
			System.out.println("다시 실행하세요");
		}

	}

}

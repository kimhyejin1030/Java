package chapter_02;

public class Veriable {

	public static void main(String[] args) {
		// 02-2 변수란 무엇일까?
		
		/* [ 변수(Variable) ]
		 * - 데이터를 저장하는 메모리 공간
		 * - 변수 공간에는 한 번에 하나의 데이터만 저장 가능하며, 새로운 데이터를 저장하면 기존의 데이터는 제거됨
		 * - 변수를 사용하기 위해서는 반드시 변수를 선언한 후에 저장 가능
		 * - 데이터를 저장하는 작업을 변수의 초기화라고 함
		 * ( ※ 변수 초기화 작업 없이 변수 사용 불가능 ※ )
		 * - 변수명을 작성할 때는 특별자 작성 규칙을 따름
		 */
		
		/* [ 변수 선언하고 값 대입하기 ]
		 * < 변수 선언 기본 문법 >
		 * 데이터타입 변수명;
		 * 
		 * ex) int level;  정수형 변수 level 선언
		 * 	   level = 10; 값 10을 level 변수에 대입
		 * 
		 * 위 코드에서 int는 정수를 나타내는 자료형이고, level은 게임 레빌을 의미하는 변수 이름
		 * = 기호는 수학에서 오른쪽과 왼쪽이 같다는 의미이지만 프로그램에서는 '오른쪽 값을 왼쪽에 대입한다'는 의미로 사용
		 * 그러므로 해석하면 'level이라는 이름의 변수를 정수 자료형으로 선언한다. 선언한 level 변수에 값 10을 넣는다(대입한다)'이다.
		 * 
		 * 변수를 선언하면 변수에 값을 넣을수도 있고, 변수 이름을 사용하여 변수에 들어 있는 값을 가져올 수도 있다.
		 */
		
		// 변수 선언하여 사용하기
		// 나이를 뜻하는 age로 변수 이름을 설정하고 나의 나이를 대입해보기
//		int age;
//		age = 23;
//		System.out.println(age);
		
		/* [ 변수 초기화하기 ]
		 * < 변수 초기화 기본 문법 >
		 * 변수명 = 데이터;
		 * 
		 * ex ) int level = 10;
		 * 
		 * level 변수를 선언함과 동시에 값 10을 넣었는데 이처럼 변수를 선언할 때 변수 값을 바로 대입할 수도 있는데 이것을 '초기화'라고 한다.
		 */
		
//		int a;
//		a = 10;
//		a = 99;
//		System.out.println(a); -> 정수 99 출력
		// 변수에 새로운 값(데이터)를 저장하면, 기존의 값(데이터)은 제거 된다.
		
		/* [ 변수 이름 정하기 ]
		 * < 식별자 작성 규칙 >
		 * < 필수 >
		 * 1. 첫 글자는 숫자 사용 불가
		 * 2. 특수문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		 * 3. 대소문자 구별
		 * 4. 키워드(예약어) 사용 불가
		 * 5. 공백 사용 불가
		 * ------------------------------------------------------
		 * < 권장사항 > 
		 * 6. 의미가 있는 단어 사용
		 * 7. 변수명의 첫단어는 소문자로 작성하고, 두번째 단어부터는
		 *    첫글자를 모두 대문자로 작성
		 *    ==> Camel-case 표기법 사용
		 *    ex) studentNameAndNumber
		 *    참고 클래스 명은 첫 단어의 첫글자를 대문자 표기
		 *    => Pascal-case 표기법
		 * 8. 길이 제한 없음
		 * 9. 한글 사용이 가능하지만 사용하지 않음.
		 */
		
		// 1. 첫 글자는 숫자 사용 불가
//		int 7eleven; // 사용 불가
		int sevenEleven; // 사용 가능
		
		// 2. 특수문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		int System; // 사용 가능
		int my_name; // 사용 가능
//		int Channel#5; // 사용 불가능($ 또는 _ 만 사용가능)
		// => Syntax error on token "Invalid Character", = expected
		
		// 3. 대소문자 구별
		int age; // 소문자 age와
		int AGE; // 대문자 AGE는 다른 식별자로 취급됨
		
		// 4. 키워드(예약어) 사용 불가
//		int int; // 키워드 int 사용 불가
//		int switch; // 키워드 switch 사용 불가
//		int char; // 키워드 char 사용 불가
		
		// 5. 공백 사용 불가
//		int my name; // 사용 불가
//		int my, name; // int형 변수 my와 int형 변수 name을 동시에 선언
		
		// 6. 한글 사용 가능(하지만 변수명으로 사용하지 않음)
		int 나이;

	}

}

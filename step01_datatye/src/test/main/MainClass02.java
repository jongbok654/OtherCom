package test.main;
//정수끼리 연산은 정수밖에 안나옴 => 소수 안나옴
//정수와 실수를 연산하면 결과는 실수 나옴
public class MainClass02 {
public static void main(String[] args) {
	System.out.println("main 메소드가 시작됨");
	//2.국어 점수 95를 kor 이라는 변수에 할당
	float kor=95;
	//3.ㅇ여어점수 100을 eng라는 변수에 할당
	float eng=100;
	//4.만들어진 변수를 이용하여 국어 점수와 영어 점수의 평균을 구한다음(연산자 활용) avg라는 변수에 할당
	int kor2=95; int eng2=100;
	float avg;
	double avg2;
	avg = (kor + eng) / 2;
	avg2=(kor2+eng2)/2d;

	
	//5. 콘솔창에 avg 변수 안에 담긴 내용을 출력
	System.out.println(avg);
	System.out.println(avg2);
	//원하는 foramt의 문자열 만들기
	
	String info ="평균:"+avg;
	String info2="국어:"+kor+" 영어:"+eng+" 평균:"+avg;
	System.out.println(info);
	System.out.println(info2);
}
}

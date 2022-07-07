package study;

public class getterSetterCar {

	public static void main(String[] args) {
		getterSetter Car= new getterSetter(); //객체 생성
		
		Car.setSpeed(100);		//setter메소드 호출 (speed변수에 100을 대입한다)
		
		
		System.out.println("Car의 속도는"+Car.getSpeed()+"이다"); //getter메소드 호출

	}

}

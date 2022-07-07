package study;

public class getterSetter {
	
	int speed;			//변수 선언
	
	public int getSpeed(){	//getter메소드 선언
		return speed;		//return값으로 speed를 내보낸다.
	}
	
	public void setSpeed(int speed) {	//setter메소드 선언
		if(speed<0) {					//speed가 음수일경우, 0으로 셋팅, 양수면 그대로 나옴
			this.speed=0;
		}else{
			this.speed=speed;
		}
	}

}

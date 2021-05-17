package common;

public class Triangle {
	
	//Where is my Triangle?
	
	//This class needs to be implemented
	
	public int getAngle(int i) {
		int angle = 0;
		if(i==0) {
			angle = 1;
		} else if(i==1) {
			angle = 2;
		} else {
			angle = 0;
		}
		
		return 30*angle;
	}

}

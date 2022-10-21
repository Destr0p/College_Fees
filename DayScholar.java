 public class DayScholar extends Student{
         private int busNumber;
         private float distance;
    	public DayScholar(int studentId,String studentName,String department, String gender,String category,double collegeFee, int busNumber,float distance){
    	super(studentId,studentName,department,gender,category,collegeFee);
     	this.busNumber=busNumber;
     	this.distance=distance;
     	}
    	public int getBusNumber(){
    	    return busNumber;
    	}
    	public void setBusNumber(int busNumber){
    	    this.busNumber=busNumber;
    	}
    	public float getDistance(){
    	    return distance;
    	}
    	public void setDistance(float distance){
    	    this.distance=distance;
    	}
        	
    	public double calculateTotalFee() {
    		
    	float distance=getDistance();
    	double collegeFee=getCollegeFee();
    	int busfee=0;
    	if(distance>30&&distance<=40){
    	    busfee=28000;
   	  }else if(distance>20&&distance<=30){
    	    busfee=20000;
     	}else if(distance>10&&distance<=20){
    	    busfee=12000;
    	}else if(distance<=10){
    	    busfee=6000;
    	}
    		
    		return collegeFee+busfee;
    	}
    
    }

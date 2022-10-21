 import java.util.Scanner;
     
     public class UserInterface {
     
     	public static void main(String[] args) {
     		
     		Scanner sc = new Scanner(System.in);
     		System.out.println("Enter Student Id");
     		int Student_id=sc.nextInt();
    		System.out.println("Enter Student name");
    		String name=sc.next();
    		System.out.println("Enter Department name");
    		String department=sc.next();
    		System.out.println("Enter gender");
    		String gender=sc.next();
    		System.out.println("Enter category");
    		String category=sc.next();
   		if(category.equals("DayScholar")){
    		    System.out.println("Enter College fee");
    		    double collegefee=sc.nextDouble();
    		    System.out.println("Enter Bus number");
    		    int busNumber=sc.nextInt();
   		    System.out.println("Enter the distance");
    		    float distance=sc.nextFloat();
    		    DayScholar d=new DayScholar(Student_id,name,department,gender,category,collegefee,busNumber,distance);
    		    System.out.println("Total College fee is "+d.calculateTotalFee());
    		}else{
    		    System.out.println("Enter College fee");
    		    double collegefee=sc.nextDouble();
    		    System.out.println("Enter the room number");
    		    int room = sc.nextInt();
    		    System.out.println("Enter the Block name");
    		    char block=sc.next().charAt(0);
   		    System.out.println("Enter the room type");
    		    String roomType=sc.next();
    		    Hosteller h =new Hosteller(Student_id,name,department,gender,category,collegefee,room,block,roomType);
    		    System.out.println("Total college fee is "+h.calculateTotalFee());
    		}
    	}
    
    }
    

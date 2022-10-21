public class Hosteller extends Student {
     private int roomNumber;
     private char blockName;
     private String roomType;
     
     public Hosteller(int studentId,String studentName,String department,String gender,String category,double collegeFee,int roomNumber,char blockName,String roomType)
     {    super(studentId,studentName,department,gender,category,collegeFee);
       this.roomType=roomType;
        this.blockName=blockName;
        this.roomNumber=roomNumber;
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    public char getBlockName(){
        return this.blockName;
    }
    public void setBlockName(char blockName){
        this.blockName=blockName;
    }
    public String getRoomType(){
        return this.roomType;
    }
    public void setRoomType(String roomType){
        this.roomType=roomType;
    }
    public double calculateTotalFee(){
        int hostelFee=0;
        int roomTypeAmount=0;
        switch(this.blockName){
            case 'A':
            hostelFee=60000;
            if(this.roomType.equals("AC")){
                roomTypeAmount=8000;
            }
            break;
            case 'B':
                hostelFee=50000;
                if(this.roomType.equals("AC")){
                    roomTypeAmount=5000;
                }
                break;
            case 'C':
                hostelFee=40000;
                if(this.roomType.equals("AC")){
                    roomTypeAmount=2500;
                }break;
        }
        if(this.roomType.equals("AC")){
            return
            (double)(this.collegeFee+hostelFee+roomTypeAmount);
        }else if (!this.roomType.equals("AC")){
           return (double)(this.collegeFee+hostelFee);
       }
    return 0.0;
        }
    }

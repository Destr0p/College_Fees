 public abstract class Student {
         protected int studentId;
         protected String studentName;
         protected String department;
         protected String gender;
         protected String category;
         protected double collegeFee;
         
        public Student(int studentId,String studentName,String department,String gender,String category,double collegeFee){
            this.studentId=studentId;
            this.studentName=studentName;
            this.department=department;
            this.gender=gender;
            this.category=category;
            this.collegeFee=collegeFee;
        }
        public String getCategory(){
            return this.category;
        }
        public void setCategory(String category){
            this.category=category;
        }
        public int getStudentId(){
            return this.studentId;
        }
        public void setStudentId(int studentId){
            this.studentId=studentId;
        }
        public String getStudentName(){
            return this.studentName;
        }
        public void setStudentName(String studentName){
            this.studentName=studentName;
        }
        public String getDepartment(){
            return this.department;
        }
        public void setDepartment(String department){
            this.department=department;
        }
        public String getGender(){
            return this.gender;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public double getCollegeFee(){
            return this.collegeFee;
        }
        public void setCollegeFee(double collegeFee){
            this.collegeFee=collegeFee;
        }
    }

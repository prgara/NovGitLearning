class Student{
    String name;
<<<<<<< HEAD
    String rollNumber;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNumber = rollNo;
=======
    String roolNo;
    String ID;


    String majorSub;
    String subject;
    String dob;

   public Student(String name, String roolNo, String subject, String dob) {
        this.name = name;
        this.roolNo = roolNo;
        this.subject = subject;
        this.dob = dob;
>>>>>>> 9e187aef935de8c244059eb255910dcc02d5c1f6
    }

    public String getName() {

        return name;
    }
// Shikha Method
    public void setName(String name) {
        this.name = name+" ";
    }

    public String getRollNo() {
        return rollNumber;
    }

    public void setRollNo(String rollNo) {
        this.rollNumber = rollNo;
    }

    public String getSubject() {
        return subject;
    }
//Shikha Comments
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
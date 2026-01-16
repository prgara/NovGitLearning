class Student{
    String name;
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
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name+" ";
    }

    public String getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(String roolNo) {
        this.roolNo = roolNo;
    }

    public String getSubject() {
        return subject;
    }

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
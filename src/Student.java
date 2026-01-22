class Student {
    String name;
    String rollNumber;
    String dob;
    String address;
    String subject;


    public Student(String name, String rollNo, String subject, String dob, String address) {
        this.name = name;
        this.rollNumber = rollNo;
        this.subject = subject;
        this.dob = dob;
        this.address = address;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name + " ";
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

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
    public String getAddress() {
        return Address;
    }

}
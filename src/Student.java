class Student{
    String name;
    String roolNo;
String majorSubject;
String dob;
//h
    public Student(String name, String roolNo, String majorSubject, String dob) {
        this.name = name;
        this.roolNo = roolNo;
        this.majorSubject = majorSubject;
        this.dob = dob;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(String roolNo) {
        this.roolNo = roolNo;
    }
}
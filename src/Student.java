class Student{
    String name;
    String rollNumber;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNumber = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNumber;
    }

    public void setRollNo(String rollNo) {
        this.rollNumber = rollNo;
    }
}
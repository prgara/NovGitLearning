class Student{
    String name;
    String roolNo;
    String ID;


    public Student(String name, String roolNo) {
        this.name = name;
        this.roolNo = roolNo;
    }

    public Student(String name, String roolNo, String ID) {
        this.name = name;
        this.roolNo = roolNo;
        this.ID = ID;
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
package domain;

//多端Student
//一端Teacher
public class Student {

    private Integer sid;
    private String sname;
    private Integer sage;
    private String gender;
    private Integer tid;
    private Teacher teacer;

    public Student() {}

    public Student(Integer sid, String sname, Integer sage, String gender, Integer tid, Teacher teacer) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.gender = gender;
        this.tid = tid;
        this.teacer = teacer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", gender='" + gender + '\'' +
                ", tid=" + tid +
                ", teacer=" + teacer +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Teacher getTeacer() {
        return teacer;
    }

    public void setTeacer(Teacher teacer) {
        this.teacer = teacer;
    }
}

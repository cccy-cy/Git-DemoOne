package domain;

import java.util.List;

//一端Teacher
//多段Student
public class Teacher {

    private Integer tid;
    private String tname;
    private Integer tage;
    private String subject;
    private List<Student> studentList;

    public Teacher() {}

    public Teacher(Integer tid, String tname, Integer tage, String subject, List<Student> studentList) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
        this.subject = subject;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tage=" + tage +
                ", subject='" + subject + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

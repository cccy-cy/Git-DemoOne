package domain;

import java.util.List;

public class ManyTeacher {

    private Integer tid;
    private String tname;
    private String tgender;
    private String subject;
    private List<ManyStudent> manyStudentList;

    public ManyTeacher() {}

    public ManyTeacher(Integer tid, String tname, String tgender, String subject, List<ManyStudent> manyStudentList) {
        this.tid = tid;
        this.tname = tname;
        this.tgender = tgender;
        this.subject = subject;
        this.manyStudentList = manyStudentList;
    }

    @Override
    public String toString() {
        return "ManyTeacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tgender='" + tgender + '\'' +
                ", subject='" + subject + '\'' +
                ", manyStudentList=" + manyStudentList +
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

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<ManyStudent> getManyStudentList() {
        return manyStudentList;
    }

    public void setManyStudentList(List<ManyStudent> manyStudentList) {
        this.manyStudentList = manyStudentList;
    }
}

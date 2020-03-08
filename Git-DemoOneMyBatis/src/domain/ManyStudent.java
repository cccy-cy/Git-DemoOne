package domain;

import java.util.List;

public class ManyStudent {
    private Integer sid;
    private String sname;
    private String sgender;
    private List<ManyTeacher> manyTeacherList;

    public ManyStudent() {}

    public ManyStudent(Integer sid, String sname, String sgender, List<ManyTeacher> manyTeacherList) {
        this.sid = sid;
        this.sname = sname;
        this.sgender = sgender;
        this.manyTeacherList = manyTeacherList;
    }

    @Override
    public String toString() {
        return "ManyStudent{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sgender='" + sgender + '\'' +
                ", manyTeacherList=" + manyTeacherList +
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

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public List<ManyTeacher> getManyTeacherList() {
        return manyTeacherList;
    }

    public void setManyTeacherList(List<ManyTeacher> manyTeacherList) {
        this.manyTeacherList = manyTeacherList;
    }
}

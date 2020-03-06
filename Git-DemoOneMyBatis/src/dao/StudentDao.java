package dao;

import domain.Student;
import domain.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

//一对多的dao
// 一端是Teacher
// 多端是student
public interface StudentDao {

    @Results(
            id = "selectTeacherOne",
            value = {
                    @Result(property = "tid", column = "tid", id = true),
                    @Result(property = "tname", column = "tname"),
                    @Result(property = "tage", column = "tage"),
                    @Result(property = "subject", column = "subject"),
                    @Result(property = "studentList", column = "tid" , many = @Many(select = "teacherForStudent", fetchType = FetchType.LAZY)),
            }
    )
    @Select("select tid, tname, tage, subject from teacher where tid = #{tid}")
    public Teacher selectTeacherOne(@Param("tid") Integer tid);

    @Select("select sid, sname, sage, gender, tid from student where tid = #{tid}")
    public Student teacherForStudent(@Param("tid") Integer tid);
}

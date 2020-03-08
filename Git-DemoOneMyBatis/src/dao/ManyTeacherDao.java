package dao;

import domain.ManyStudent;
import domain.ManyTeacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

//多对多的dao 多：manyteacher 多：manystudent
public interface ManyTeacherDao {

//    第一种方式
    @Results(
            id = "selectOne",
            value = {
                    @Result(property = "tid", column = "tid"),
                    @Result(property = "tname", column = "tname"),
                    @Result(property = "tgender", column = "tgender"),
                    @Result(property = "manyStudentList", column = "tid", javaType = List.class, many = @Many(select = "selectManyStudent", fetchType = FetchType.LAZY))
            }
    )
    @Select("select tid, tname, tgender, subject from manyteacher where tid = #{tid}")
    public ManyTeacher selectOneManyTeacher(Integer tid);

//    第一种方法注解形式的辅助方法
    @Select("select s.sid, s.sname, s.sgender from manystudent s inner join teacherandstudent ts on s.sid = ts.sid where ts.tid = #{tid}")
    public ManyStudent selectManyStudent(@Param("tid")Integer tid);


//    第二种方式
    public ManyTeacher selectOneManyTeacherTwo(@Param("tid")Integer tid);
}

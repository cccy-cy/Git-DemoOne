package dao;

import domain.Idcard;
import domain.Person;
import dynamic.PersonDynamic;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

//一对一的dao  两端分别是idcard and person
public interface IdcardDao {


    @Select("select cid, number, city, pid from idcard where cid = #{cid}")
    @Results(
            id = "selectOne",
            value = {
                @Result(property = "cid", column = "cid", id = true),
                @Result(property = "number", column = "number"),
                @Result(property = "city", column = "city"),
                @Result(property = "person", column = "pid", javaType = Person.class, one = @One(select = "idcardForPerson", fetchType = FetchType.LAZY))
            }
    )
    public Idcard selectOneIdcard(@Param("cid") Integer cid);

    @Select("select pid, name, gender, age from person where pid = #{pid}")
    public Person idcardForPerson(@Param("pid") Integer pid);

//    =======================================================

//    动态sql
    @SelectProvider(type = PersonDynamic.class, method = "dynamic")
    public Person selectPerson(@Param("pid") Integer pid, @Param("name")String name);

//    动态sql in(pid,pid,pid);
    @SelectProvider(type = PersonDynamic.class, method = "dynamicTwo")
    public List<Person> selectPersonTwo(@Param("pids")Integer...pids);
}

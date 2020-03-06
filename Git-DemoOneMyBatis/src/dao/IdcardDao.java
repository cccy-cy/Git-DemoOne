package dao;

import domain.Idcard;
import domain.Person;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
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
    public Idcard selectOne(@Param("cid") Integer cid);

    @Select("select pid, name, gender, age from person where pid = #{pid}")
    public Person idcardForPerson(@Param("pid") Integer pid);
}

package service;

import dao.IdcardDao;
import dao.ManyTeacherDao;
import dao.StudentDao;
import domain.Idcard;
import domain.ManyTeacher;
import domain.Person;
import domain.Teacher;
import util.MyFactory;
import util.MySpring;

import java.util.List;

public class ListService {

    private static MyFactory myFactory = MySpring.getBean("util.MyFactory");

//    一对一
    private static IdcardDao dao1 = myFactory.getMapper(IdcardDao.class, true);
//    一对多
    private static StudentDao dao2 = myFactory.getMapper(StudentDao.class, true);
//    多对多
    private static ManyTeacherDao dao3 = myFactory.getMapper(ManyTeacherDao.class, true);


//    一对一
    public static Idcard selectOneIdcard(Integer cid) {
        return dao1.selectOneIdcard(cid);
    }

//    一对一的动态sql
    public static Person selectPerson(Integer pid, String name) {
        return dao1.selectPerson(pid, name);
    }

    public static List<Person> selectPersonTwo(Integer...pids) {
        return dao1.selectPersonTwo(pids);
    }
//-----------------------------------------------------------
//    一对多
    public Teacher selectOneTeacher(Integer tid) {
        return dao2.selectOneTeacher(tid);
    }

//-----------------------------------------------------------
//    多对多
//    第一种方式
    public static ManyTeacher selectOneManyTeacher(Integer tid) {
        return dao3.selectOneManyTeacher(tid);
    }

//    第二种方式
    public static ManyTeacher selectOneManyTeacherTwo(Integer tid) {
        return dao3.selectOneManyTeacherTwo(tid);
    }
}

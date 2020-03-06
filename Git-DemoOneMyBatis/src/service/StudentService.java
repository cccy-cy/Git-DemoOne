package service;

import dao.StudentDao;
import domain.Teacher;
import util.MyFactory;
import util.MySpring;

//一对多的service
// 一端是Teacher
// 多端是student
public class StudentService {

    private static MyFactory myFactory = MySpring.getBean("util.MyFactory");
    private static StudentDao dao = myFactory.getMapper(StudentDao.class);

    public Teacher selectTeacherOne(Integer tid) {
        return dao.selectTeacherOne(tid);
    }

}

package test;

//import domain.Idcard;
import domain.Teacher;
//import service.IdcardService;
import service.StudentService;
import util.MySpring;

public class Demo {

//    private static IdcardService idcardService = MySpring.getBean("service.IdcardService");
    private static StudentService studentService = MySpring.getBean("service.StudentService");

    public static void main(String[] args) {
//        一对一 （idcard - person）
//        Idcard idcard = idcardService.selectOne(1);
//        System.out.println(idcard);

//        一对多 （一：teacher 多：student）
        Teacher teacher = studentService.selectTeacherOne(1);
        System.out.println(teacher);
    }
}

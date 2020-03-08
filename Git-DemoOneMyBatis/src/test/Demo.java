package test;

//import domain.Idcard;
import domain.Idcard;
import domain.ManyTeacher;
//import service.IdcardService;
import domain.Person;
import domain.Teacher;
import service.ListService;
import util.MySpring;

import java.util.List;

public class Demo {


    private static ListService listService = MySpring.getBean("service.ListService");

    public static void main(String[] args) {
//        一对一 （idcard - person）
//        Idcard idcard = listService.selectOneIdcard(1);
//        System.out.println(idcard);

//        一对一的动态sql
//        Person person = listService.selectPerson(1,"");
//        System.out.println(person);

//        一对一的动态sql in(pid, pid, pid)
//        List<Person> person = listService.selectPersonTwo(1,2);
//        for(Person p : person) {
//            System.out.println(p);
//        }

//        ==================================================
//        一对多 （一：teacher 多：student）
//        Teacher teacher = listService.selectOneTeacher(1);
//        System.out.println(teacher);
//
//        ==================================================
//        多对多（多：manyTeacher 多：manyStudent）
//        ManyTeacher manyTeacher = listService.selectOneManyTeacher(1);//第一种方式
//        ManyTeacher manyTeacher = listService.selectOneManyTeacherTwo(1);//第二种方式
//        System.out.println(manyTeacher);
    }
}

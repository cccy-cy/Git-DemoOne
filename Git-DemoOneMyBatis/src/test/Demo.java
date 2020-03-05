package test;

import domain.Idcard;
import service.IdcardService;
import util.MySpring;

public class Demo {

    private static IdcardService service = MySpring.getBean("service.IdcardService");

    public static void main(String[] args) {
        Idcard idcard = service.selectOne(1);
        System.out.println(idcard);
    }
}

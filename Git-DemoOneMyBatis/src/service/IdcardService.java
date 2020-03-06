package service;

import dao.IdcardDao;
import domain.Idcard;
import util.MyFactory;
import util.MySpring;
//一对一的service person - idcard
public class IdcardService {

    private static MyFactory myFactory = MySpring.getBean("util.MyFactory");
    private static IdcardDao dao = myFactory.getMapper(IdcardDao.class, true);

    public static Idcard selectOne(Integer cid) {
        return dao.selectOne(cid);
    }
}

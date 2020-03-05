package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyFactory {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml"));
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static SqlSession getSqlSession(boolean flag) {
        return sqlSessionFactory.openSession(flag);
    }

    public static <T>T getMapper(Class clazz) {
        return (T) getSqlSession().getMapper(clazz);
    }

    public static <T>T getMapper(Class clazz, boolean flag) {
        return (T) getSqlSession(flag).getMapper(clazz);
    }
}

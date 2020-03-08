package dynamic;

import org.apache.ibatis.annotations.Param;

public class PersonDynamic {

    public static String dynamic(@Param("pid")Integer pid, @Param("name")String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from person where 1 = 1");
        if(pid != null && !"".equals(pid)) {
            sb.append(" and pid = #{pid}");
        }
        if(name != null && !"".equals(name)) {
            sb.append(" and name = #{name}");
        }
        return sb.toString();
    }

    public static String dynamicTwo(@Param("pids")Integer...pids) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from person where pid in (");
        for(int i = 0; i < pids.length; i++) {
            if(pids[i] != null && !"".equals(pids[i])) {
                sb.append(pids[i]);
                sb.append(",");
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        return sb.toString();
    }
}

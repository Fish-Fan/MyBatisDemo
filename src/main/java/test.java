import com.fanyank.mapper.UserMapper;
import com.fanyank.pojo.User;
import com.fanyank.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by yanfeng-mac on 2017/4/18.
 */
public class test {
    public static void main(String[] args) {
        SqlSession sqlSession = null;

        sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //查询
//        User user = userMapper.getUser(3);
//        System.out.println(user);
        //添加
//        User user1 = new User();
//        user1.setId(6);
//        user1.setUsername("rose");
//        user1.setPassword("111111");
//        userMapper.insertUser(user1);
        //删除
//        userMapper.deleteUser(6);
        //修改
//        User user = userMapper.getUser(4);
//        user.setUsername("fanyank");
//        user.setPassword("123qwe");
//        userMapper.updateUser(user);
//        sqlSession.commit();



        sqlSession.close();
    }
}

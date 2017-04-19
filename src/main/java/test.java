import com.fanyank.mapper.ProductMapper;
import com.fanyank.mapper.Product_TypeMapper;
import com.fanyank.mapper.UserMapper;
import com.fanyank.param.ProductBeanParam;
import com.fanyank.pojo.Product;
import com.fanyank.pojo.Product_Type;
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

        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        //注解方式传参
//        Product product = productMapper.findByAnnotation(1,10);
        //JavaBean方式传参
        //构造JavaBean
//        ProductBeanParam productBeanParam = new ProductBeanParam();
//        productBeanParam.setId(1);
//        productBeanParam.setNum(10);
//        //传入JavaBean
//        Product product = productMapper.findByJavaBean(productBeanParam);
//        System.out.println(product);
//        int count = productMapper.getProductCountByType(1);
//        System.out.println("图书类商品总量是 " + count);

//        Product_TypeMapper product_typeMapper = sqlSession.getMapper(Product_TypeMapper.class);
//        Product_Type product_type = product_typeMapper.getProduct_Type(1);
//        System.out.println(product_type);

        //插入数据并返回主键
        User user = new User();
        user.setUsername("jackson");
        user.setPassword("zhizhang");
        userMapper.saveUser(user);
        System.out.println("返回的主键为 " + user.getId());

        sqlSession.commit();
        sqlSession.close();
    }
}

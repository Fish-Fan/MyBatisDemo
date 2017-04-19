package com.fanyank.mapper;

import com.fanyank.param.ProductBeanParam;
import com.fanyank.pojo.Product;
import com.fanyank.pojo.Product_Type;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yanfeng-mac on 2017/4/19.
 */
public interface ProductMapper {
    public Product getProduct(Integer id);

    public int getProductCountByType(Integer type_id);

    //使用注解方式传参
    public Product findByAnnotation(@Param("id") Integer id,@Param("num") Integer num);

    //使用JavaBean的方式传参
    public Product findByJavaBean(ProductBeanParam productBeanParam);
}

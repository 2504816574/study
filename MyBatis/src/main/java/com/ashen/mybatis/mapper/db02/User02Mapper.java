package com.ashen.mybatis.mapper.db02;

import com.ashen.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author 董升
 * @Date 2021/10/9
 * @Version V1.0
 * @Description:
 **/
@Mapper
public interface User02Mapper {
    /**
     * 查询全部
     *
     * @return 查询结果
     */
    List<User> getAllUser();

}

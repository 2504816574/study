package com.ashen.mybatis.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author 董升
 * @Date 2021/10/10
 * @Version V1.0
 * @Description:
 **/
public interface UserJdbcService {
    /**
     * 查询全部
     *
     * @return 查询结果
     */
    List<Map<String, Object>> getAllUser();
}

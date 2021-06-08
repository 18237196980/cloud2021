package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    Payment getById(@Param("id") Long id);

    int create(Payment payment);
}

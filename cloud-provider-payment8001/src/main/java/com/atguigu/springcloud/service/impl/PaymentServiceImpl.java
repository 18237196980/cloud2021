package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.common.Result;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.model.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public Payment getById(Long id) {
        return paymentMapper.getById(id);
    }

    @Override
    @Transactional
    public Result create(Payment payment) {
        int count = paymentMapper.create(payment);
        int aa=10/0;
        if (count > 0) {
            return Result.success("添加成功");
        } else {
            return Result.error("添加失败");
        }
    }
}

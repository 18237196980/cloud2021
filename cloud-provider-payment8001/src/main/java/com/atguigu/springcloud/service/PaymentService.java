package com.atguigu.springcloud.service;

import com.atguigu.springcloud.common.Result;
import com.atguigu.springcloud.model.Payment;

public interface PaymentService {
    Payment getById(Long id);

    Result create(Payment payment);
}

package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.common.Result;
import com.atguigu.springcloud.model.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("getById")
    public Result getById(@RequestParam Long id) {
        log.info("id:" + id);
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return Result.success(payment);
        } else {
            return Result.error("查询结果为空");
        }
    }

    @PostMapping("create")
    public Result create(@RequestBody Payment payment) {
        log.info("payment:" + payment);
        return paymentService.create(payment);
    }
}

package com.example.cloudpay8001.conntroller;

import com.example.cloudpay8001.entity.CommonResult;
import com.example.cloudpay8001.entity.Payment;
import com.example.cloudpay8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @RequestMapping("findAll")
    public CommonResult<?> findAll(){
        log.info("FindAll");
        CommonResult<List<Payment>> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage("Success");
        commonResult.setData(paymentService.findAll());
        return commonResult;
    }

}

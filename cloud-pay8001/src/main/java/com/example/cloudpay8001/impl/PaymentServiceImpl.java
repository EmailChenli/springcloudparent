package com.example.cloudpay8001.impl;

import com.example.cloudpay8001.entity.Payment;
import com.example.cloudpay8001.mapper.PaymentMapper;
import com.example.cloudpay8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;
    @Override
    public List<Payment> findAll() {
        return paymentMapper.findAll();
    }
}

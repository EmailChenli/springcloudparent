package com.example.cloudpay8001.service;

import com.example.cloudpay8001.entity.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();
}

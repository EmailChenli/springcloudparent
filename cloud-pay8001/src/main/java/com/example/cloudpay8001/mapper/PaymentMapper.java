package com.example.cloudpay8001.mapper;

import com.example.cloudpay8001.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {
    List<Payment> findAll();
}

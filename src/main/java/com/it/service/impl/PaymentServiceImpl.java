package com.it.service.impl;

import com.it.mapper.PaymentMapper;
import com.it.pojo.Payment;
import com.it.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gxp
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Payment selectById(int id) {
        return paymentMapper.selectById(id);
    }
}

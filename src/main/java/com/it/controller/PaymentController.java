package com.it.controller;

import com.it.pojo.Payment;
import com.it.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gxp
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/find")
    public void find(int id){
        Payment payment = paymentService.selectById(id);
        System.out.println(payment);
    }

}

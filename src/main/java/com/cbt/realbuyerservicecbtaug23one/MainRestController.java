package com.cbt.realbuyerservicecbtaug23one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainRestController
{
    @Autowired
    PaymentService paymentService;

    @GetMapping("get/payment/buyerwise/{buyername}")
    public List<FullPaymentStatus> getPaymentStatusBuyerwise(@PathVariable String buyername)
    {
        return paymentService.getOrdersDuePayment(buyername);
    }
}

package com.emazon.TransactionMicroservice.adapters.driving.http.controller;

import com.emazon.TransactionMicroservice.adapters.util.AdapConstants;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AdapConstants.PURCHASE_ROUTE)
public class PurchaseRestControllerAdapter {
    @PutMapping(AdapConstants.ACCEPT_PURCHASE_ROUTE)
    public String doPurchase(){
        return AdapConstants.PURCHASE_HAS_BEEN_MADE;
    }
}

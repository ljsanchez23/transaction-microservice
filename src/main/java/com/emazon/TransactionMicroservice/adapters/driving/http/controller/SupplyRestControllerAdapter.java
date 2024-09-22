package com.emazon.TransactionMicroservice.adapters.driving.http.controller;

import com.emazon.TransactionMicroservice.adapters.util.AdapConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(AdapConstants.SUPPLY_ROUTE)
public class SupplyRestControllerAdapter {
    @PostMapping(AdapConstants.ADD_SUPPLY_ROUTE)
    public ResponseEntity<Map<String, Object>> addSupply(){
        Map<String, Object> response = new HashMap<>();
        response.put(AdapConstants.MESSAGE, AdapConstants.SUPPLY_HAS_BEEN_ADDED);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

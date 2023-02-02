package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PRECIO_COMBUSTIBLE;
import com.example.demo.services.PRECIO_COMBUSTIBLEService;

@RestController
@RequestMapping("/precio_combustible")
public class PRECIO_COMBUSTIBLEController {
    @Autowired
    PRECIO_COMBUSTIBLEService precio_COMBUSTIBLEService;

    @GetMapping()
    public ArrayList<PRECIO_COMBUSTIBLE> getPRECIO_COMBUSTIBLEs(){
        return precio_COMBUSTIBLEService.getPRECIO_COMBUSTIBLEs();
    }
}
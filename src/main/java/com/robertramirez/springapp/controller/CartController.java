package com.robertramirez.springapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {

    @Value("${default.currency}")
    private String defaultController;
}

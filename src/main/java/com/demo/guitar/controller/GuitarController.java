package com.demo.guitar.controller;

import com.demo.guitar.po.guitar.Guitar;
import com.demo.guitar.po.guitar.GuitarSpec;
import com.demo.guitar.service.GuitarService;

import com.demo.guitar.service.GuitarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class GuitarController {

    @Autowired
    GuitarService guitarService;

    @RequestMapping(value = "/search")
    public String search(Model model,GuitarSpec guitarSpec){
//        guitarService = new GuitarServiceImpl();
        List<Guitar> guitars = guitarService.search(guitarSpec);
        model.addAttribute("guitars",guitars);
        return "index";
    }


}

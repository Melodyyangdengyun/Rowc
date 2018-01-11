package com.ydy.controller;

import com.google.common.collect.Lists;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ydy
 * @version 2018/1/11  19:50
 */
@Controller
@RequestMapping(value="/user/")
public class UserController {

    @RequestMapping(value = "go")
    public String test(String name, Model model) {
        List<String> list = Lists.newArrayList();
        list.add("hahh");
        list.add("hdaw");
        list.add("hdwada");
        model.addAttribute("list", list);
        model.addAttribute("ceshi", "18926725435");
        model.addAttribute("name", name);
         return "index2";
    }
}

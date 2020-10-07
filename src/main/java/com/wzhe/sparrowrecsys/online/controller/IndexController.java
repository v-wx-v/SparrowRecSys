package com.wzhe.sparrowrecsys.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * Index Controller
 *  @author wxx
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/static/index.html";
    }

}

package com.so6b.dict.controllers;

import com.so6b.common.controllers.BaseContoller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author wzw
 */
@Controller
public class HomeController extends BaseContoller{

    @RequestMapping("msg")
    @ResponseBody
    public String msg() {
        return "88888888888888888888";
    }
    
     @RequestMapping(value = "index.htm", method = RequestMethod.GET)
     public ModelAndView index() {
        return new ModelAndView("index");
    }
}
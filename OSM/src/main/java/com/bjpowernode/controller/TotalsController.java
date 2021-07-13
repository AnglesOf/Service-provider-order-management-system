package com.bjpowernode.controller;

import com.bjpowernode.service.TotalsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TotalsController {
    @Autowired
    @Qualifier(value = "totalsServices")
    public TotalsServices totalsServices;

    @RequestMapping("/total")
    public ModelAndView findAllServers(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("totalsList", totalsServices.findAllServers());
        mv.setViewName("forward:/WEB-INF/views/ListTotals.jsp");
        return mv;
    }
}

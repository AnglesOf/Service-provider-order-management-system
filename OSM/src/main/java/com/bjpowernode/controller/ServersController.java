package com.bjpowernode.controller;

import com.bjpowernode.domain.Servers;
import com.bjpowernode.service.ServersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/servers")
public class ServersController {
    @Autowired
    @Qualifier(value = "serversService")
    public ServersService serversService;

    @RequestMapping("/findServers")
    public ModelAndView findServices(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("servicesList", serversService.findAllServers());
        mv.setViewName("forward:/WEB-INF/views/ListServices.jsp");
        return mv;
    }

    @RequestMapping("/searchBySid")
    private ModelAndView findServicesById(int s_id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("servicesList", serversService.findServersById(s_id));
        mv.setViewName("forward:/WEB-INF/views/ListServices.jsp");
        return mv;
    }

    @RequestMapping("/addServers")
    public ModelAndView addServices(Servers servers){
        ModelAndView mv = new ModelAndView();
        serversService.addServers(servers);
        mv.addObject("servicesList", serversService.findAllServers());
        mv.setViewName("forward:/WEB-INF/views/ListServices.jsp");
        return mv;
    }

    @RequestMapping("/removeServers")
    public ModelAndView removeServices(int s_id){
        ModelAndView mv = new ModelAndView();
        serversService.deleteServers(s_id);
        mv.addObject("servicesList", serversService.findAllServers());
        mv.setViewName("forward:/WEB-INF/views/ListServices.jsp");
        return mv;
    }
}

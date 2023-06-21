package com.paul;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("x")int i, @RequestParam("y")int j, HttpServletRequest request, HttpServletResponse response) {

//        int i = Integer.parseInt(request.getParameter("x"));
//        int j = Integer.parseInt(request.getParameter("y"));

        /**
         * Do all calculation in service method not in a controller
         */
        AddService addService = new AddService();
        int k = addService.add(i, j);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result", k);

        return modelAndView;
    }
}

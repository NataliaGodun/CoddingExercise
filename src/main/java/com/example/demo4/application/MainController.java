package com.example.demo4.application;

import com.example.demo4.domain.AdvertiserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo4.domain.Advertiser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    private AdvertiserService service;

   public MainController(AdvertiserService service){
        this.service = service;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(Model model) {

        model.addAttribute("newAdvertiser", new Advertiser());
        model.addAttribute("deleteAdvertiser", new Advertiser());
        model.addAttribute("advertiser", service.getAll());
        return "page";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String create(@ModelAttribute(name = "newAdvertiser") Advertiser advertiser) {
        service.create(advertiser);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@ModelAttribute(name = "deleteAdvertiser") Advertiser advertiser) {
        service.delete(advertiser);
        return "redirect:/";
    }

}


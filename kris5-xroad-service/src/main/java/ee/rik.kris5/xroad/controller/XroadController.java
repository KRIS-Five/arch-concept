package ee.rik.kris5.xroad.controller;

import ee.rik.kris5.xroad.model.soap.ParinglihtV3Vastus;
import ee.rik.kris5.xroad.service.XroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XroadController {

    @Autowired
    private XroadService xroadService;

    @RequestMapping("/xroad-lihtparing-v3")
    @ResponseBody
    public ParinglihtV3Vastus getXroadResponse(){

        return xroadService.getXroadLihtparingV3();

    }
}

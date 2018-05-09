package ee.rik.kris5.application.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ee.rik.kris5.application.model.request.CreateDecreeRequest;
import ee.rik.kris5.application.model.Decree;
import ee.rik.kris5.application.service.DecreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DecreeController {

    @Autowired
    private DecreeService decreeService;

    @HystrixCommand
    @ResponseBody
    @RequestMapping(value = "/decree", method = GET)
    public List<Decree> getDecrees(){
        return decreeService.getDecrees();
    }

    @HystrixCommand
    @ResponseBody
    @RequestMapping(value = "/decree", method = POST)
    public ResponseEntity saveDecree(@RequestBody CreateDecreeRequest request){

        decreeService.saveDecree(request.getNumberToGenerate());
        return new ResponseEntity(HttpStatus.CREATED);
    }

}

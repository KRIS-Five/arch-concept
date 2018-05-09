package ee.rik.kris5.application.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ee.rik.kris5.application.model.GeneratedDataAmount;
import ee.rik.kris5.application.model.request.GenerationRequest;
import ee.rik.kris5.application.model.response.GenerationResponse;
import ee.rik.kris5.application.service.GenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class GenerationController {

    @Autowired
    private GenerationService generationService;

    @HystrixCommand
    @RequestMapping(value = "/generate-persons", method = POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity generatePersons(@RequestBody GenerationRequest request) {
        generationService.generatePersons(request.getNumberToGenerate());
        return new ResponseEntity(new GenerationResponse(true),HttpStatus.CREATED);
    }

    @HystrixCommand
    @RequestMapping(value = "/generate-reg-parts", method = POST, consumes = "application/json")
    @ResponseBody
    public ResponseEntity generateRegistryParts(@RequestBody GenerationRequest request) {
        generationService.generateRegistryParts(request.getNumberToGenerate());
        return new ResponseEntity(new GenerationResponse(true),HttpStatus.CREATED);
    }

    @HystrixCommand
    @RequestMapping(value = "/generated-data-amount", method = GET)
    @ResponseBody
    public GeneratedDataAmount getGeneratedDataAmount(){
        return generationService.getGeneratedDataAmount();
    }

}

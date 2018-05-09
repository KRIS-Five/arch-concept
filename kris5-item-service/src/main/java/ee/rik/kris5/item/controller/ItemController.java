package ee.rik.kris5.item.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ee.rik.kris5.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @HystrixCommand
    @RequestMapping(value = "/item-processing/{itemId}", method = PUT)
    public ResponseEntity processItem(@PathVariable("itemId") Long itemId){

        itemService.processItem(itemId);

        return new ResponseEntity(HttpStatus.OK);
    }

}

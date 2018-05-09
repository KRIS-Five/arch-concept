package ee.rik.kris5.application.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "kris5-item-service")
public interface ItemServiceClient {

    @HystrixCommand
    @RequestMapping(method = RequestMethod.PUT, value = "/item-service/item-processing/{itemId}")
    void processItem(@PathVariable("itemId") Long itemId);

}

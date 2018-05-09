package ee.rik.kris5.xroad.service;

import ee.rik.kris5.xroad.client.XroadClient;
import ee.rik.kris5.xroad.model.soap.ParinglihtV3Vastus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XroadService {

    @Autowired
    private XroadClient xroadClient;

    public ParinglihtV3Vastus getXroadLihtparingV3() {

        return xroadClient.getResponse();
    }

}

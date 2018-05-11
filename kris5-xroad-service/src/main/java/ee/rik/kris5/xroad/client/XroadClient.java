package ee.rik.kris5.xroad.client;

import ee.rik.kris5.xroad.model.Keha;
import ee.rik.kris5.xroad.model.soap.ParinglihtV3Ettevotted;
import ee.rik.kris5.xroad.model.soap.ParinglihtV3Paring;
import ee.rik.kris5.xroad.model.soap.ParinglihtV3Vastus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigInteger;

@Component
public class XroadClient extends WebServiceGatewaySupport {

    @Value("${xroad.host}")
    private String xroadHost;

    public ParinglihtV3Vastus getResponse() {

        ParinglihtV3Vastus vastus = new ParinglihtV3Vastus();
        ParinglihtV3Ettevotted ettevotted = new  ParinglihtV3Ettevotted();
        vastus.setEttevotjad(ettevotted);
        vastus.setLeitudEttevotjateArv(BigInteger.valueOf(1L));

        System.out.println(jaxbObjectToXML(vastus));

        ParinglihtV3Paring request = new ParinglihtV3Paring();
        Keha keha = new Keha();
        keha.setAriregistriKood(BigInteger.valueOf(10095846));
        request.setKeha(keha);

        String url = "http://" + xroadHost + ":8088/cgi-bin/consumer_proxy/paringlihtV3Paring";

        ParinglihtV3Vastus response = (ParinglihtV3Vastus) getWebServiceTemplate()
                .marshalSendAndReceive(url, request);

        return response;
    }

    private static String jaxbObjectToXML(ParinglihtV3Vastus vastus) {
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(ParinglihtV3Vastus.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();
            m.marshal(vastus, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }

}

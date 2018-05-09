package ee.rik.kris5.xroad.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class XroadMarshaller {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ee.rik.kris5.xroad.model.soap");
        return marshaller;
    }

    @Bean
    public XroadClient xroadClient(Jaxb2Marshaller marshaller) {
        XroadClient client = new XroadClient();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
package hip.cda.hipcda.kafka;

import hip.cda.hipcda.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private static final String MY_TOPIC = "mpiAsyncData1";

    @Autowired
    KafkaTemplate kafkaTemplate;

    public void produce(){
        TestEntity message = new TestEntity();
        message.setId("1");
        message.setKey("2");
        message.setValue("3");
        kafkaTemplate.send(MY_TOPIC,message);
    }
}

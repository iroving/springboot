package hip.cda.hipcda.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "mpiAsyncData1")
    public void consumer(ConsumerRecord consumerRecord){
        Object kafkaMassage = consumerRecord.value();
        System.out.println(kafkaMassage);
    }
}
package com.firmino.strconsumer.listeners;

import com.firmino.strconsumer.custom.StringConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StringConsumerListener {
    @StringConsumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info("CREATE ::: Receive message: {}", message);
    }

    @StringConsumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Receive message: {}", message);
    }

    @KafkaListener(topics = "str-topic", groupId = "group-2", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Receive message: {}", message);
    }
}

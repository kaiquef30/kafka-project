package com.kafk.strconsumer.listeners;

import com.kafk.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class STRConsumerListeners {

    @SneakyThrows
    @StrConsumerCustomListener(groupId = "group-one", containerFactory = "validMessageContainerFactory")
    public void create(String message) {
        log.info("CREATE:: Receive message {}", message);
        throw new IllegalArgumentException("erooooooooooorrrrrrrrrr");
    }

    @StrConsumerCustomListener(groupId = "group-one", containerFactory = "strContainerFactory")
    public void log(String message) {
        log.info("LOG:: Receive message {}", message);
    }
}

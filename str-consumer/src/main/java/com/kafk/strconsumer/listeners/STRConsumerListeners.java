package com.kafk.strconsumer.listeners;

import com.kafk.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class STRConsumerListeners {

    @StrConsumerCustomListener(groupId = "group-one")
    public void create(String message) {
        log.info("CREATE:: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-one")
    public void log(String message) {
        log.info("LOG:: Receive message {}", message);
    }
}

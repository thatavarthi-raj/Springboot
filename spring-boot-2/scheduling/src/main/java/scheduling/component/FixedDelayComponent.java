package scheduling.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class FixedDelayComponent {

    @Scheduled(fixedDelay = 2000, initialDelay = 2000)
    public void fixedDelayScheduler(){
        log.info("Inside fixedDelayScheduler(), time={}", new Date());
    }

}

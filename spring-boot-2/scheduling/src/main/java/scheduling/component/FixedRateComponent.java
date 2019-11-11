package scheduling.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class FixedRateComponent {

    @Scheduled(fixedRate = 1000)
    public void fixedRateScheduler(){
        log.info("Inside fixedRateScheduler(), time={}", new Date());
    }
}

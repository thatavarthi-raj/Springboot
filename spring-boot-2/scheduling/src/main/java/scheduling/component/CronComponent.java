package scheduling.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import scheduling.util.Constants;

import java.util.Date;

@Slf4j
@Component
public class CronComponent {

    @Scheduled(cron = Constants.TWO_MINUTES_CRON)
    public void twoMinutesScheduler(){
        log.info("inside twoMinutesScheduler={}", new Date());
    }
}

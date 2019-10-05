package spring.boot.actuator.custom.actuators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AppHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        if(!isServiceRunning()){
            return Health.down().withDetail("down", "App is down, restart").build();
        }
        return Health.down().withDetail("up", "App is up, all good").build();
    }

    private Boolean isServiceRunning(){
        // actual business logic here and return true/false
        return Boolean.FALSE;
    }
}

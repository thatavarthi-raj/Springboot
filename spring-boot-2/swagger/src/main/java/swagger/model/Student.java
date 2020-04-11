package swagger.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@Builder
public class Student {

    private String id;
    private String name;
}

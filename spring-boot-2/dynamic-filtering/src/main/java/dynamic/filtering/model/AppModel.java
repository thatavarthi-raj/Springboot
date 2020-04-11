package dynamic.filtering.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Builder;
import lombok.Data;

@Data
@Builder


public class AppModel {

    private String field1;
    private String field2;
    private String field3;
}

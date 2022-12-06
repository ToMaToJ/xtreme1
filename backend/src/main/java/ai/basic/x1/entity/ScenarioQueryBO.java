package ai.basic.x1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScenarioQueryBO {

    private Long datasetId;

    private List<Long> dataIds;

    private List<Long> classIds;

    private String attributeId;

    private String optionName;
}

package flowyun;

import com.test.Employee;
import com.test.MyEmployee;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Test4 {

    @Test
    public void test1(){
        String json = "{\n" +
                "  \"reqTemplateIds\": [\n" +
                "    \"1701067156532113409\",\n" +
                "    \"1701068642666295297\"\n" +
                "  ],\n" +
                "  \"relationMap\": {\n" +
                "    \"1701067156532113409\": {\n" +
                "      \"itemKey\": \"e44ff230\",\n" +
                "      \"sourceType\": null,\n" +
                "      \"sourceSubType\": null,\n" +
                "      \"formDataType\": null,\n" +
                "      \"sourceValue\": \"1701067288342310913\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    },\n" +
                "    \"1701068642666295297\": {\n" +
                "      \"itemKey\": \"48a20172\",\n" +
                "      \"sourceType\": null,\n" +
                "      \"sourceSubType\": null,\n" +
                "      \"formDataType\": null,\n" +
                "      \"sourceValue\": \"1701068702418350081\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    }\n" +
                "  },\n" +
                "  \"datasetIds\": [\n" +
                "    \n" +
                "  ],\n" +
                "  \"datasetRelationMap\": {\n" +
                "    \n" +
                "  },\n" +
                "  \"dataFlowId\": null,\n" +
                "  \"displayColumns\": [\n" +
                "    {\n" +
                "      \"itemKey\": \"9ca0dec4\",\n" +
                "      \"sourceType\": 2,\n" +
                "      \"sourceSubType\": 1,\n" +
                "      \"formDataType\": 1,\n" +
                "      \"sourceValue\": \"INIT_USER\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"发起人-1\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"1701067156532113409\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    },\n" +
                "    {\n" +
                "      \"itemKey\": \"378ed3ae\",\n" +
                "      \"sourceType\": 1,\n" +
                "      \"sourceSubType\": null,\n" +
                "      \"formDataType\": 1,\n" +
                "      \"sourceValue\": \"1701067288342310913\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"单行输入框-1\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"1701067156532113409\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    },\n" +
                "    {\n" +
                "      \"itemKey\": \"3d15f67a\",\n" +
                "      \"sourceType\": 2,\n" +
                "      \"sourceSubType\": 1,\n" +
                "      \"formDataType\": 1,\n" +
                "      \"sourceValue\": \"INIT_USER\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"发起人-2\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"1701068642666295297\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    },\n" +
                "    {\n" +
                "      \"itemKey\": \"1f81d635\",\n" +
                "      \"sourceType\": 1,\n" +
                "      \"sourceSubType\": null,\n" +
                "      \"formDataType\": 1,\n" +
                "      \"sourceValue\": \"1701068702418350081\",\n" +
                "      \"formulas\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"displayName\": \"单行输入框-2\",\n" +
                "      \"sortType\": 1,\n" +
                "      \"summaryType\": 0,\n" +
                "      \"advancedCalculateType\": 3,\n" +
                "      \"formatType\": null,\n" +
                "      \"formatDetail\": null,\n" +
                "      \"order\": null,\n" +
                "      \"reqTemplateId\": \"1701068642666295297\",\n" +
                "      \"sortList\": [\n" +
                "        \n" +
                "      ],\n" +
                "      \"lastSortType\": 1,\n" +
                "      \"fixValueFlag\": false\n" +
                "    }\n" +
                "  ],\n" +
                "  \"filterRules\": [\n" +
                "    \n" +
                "  ],\n" +
                "  \"customFormulaList\": [\n" +
                "    \n" +
                "  ]\n" +
                "}";


    }

    @Test
    public void test2(){
        Employee employee = new MyEmployee("asdasda");
        MyEmployee myEmployee = new MyEmployee("ihuhfiu");
    }
}

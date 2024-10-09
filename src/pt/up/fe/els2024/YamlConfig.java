package pt.up.fe.els2024;

import java.util.Map;

public class YamlConfig {

Map<String, pt.up.fe.els2024.DecisionTreeConfig> decisionTreeConfigMap;

    public Map<String, pt.up.fe.els2024.DecisionTreeConfig> getDecisionTreeConfigMap() {
        return decisionTreeConfigMap;
    }

    public void setDecisionTreeConfigMap(Map<String, pt.up.fe.els2024.DecisionTreeConfig> decisionTreeConfigMap) {
        this.decisionTreeConfigMap = decisionTreeConfigMap;
    }

    @Override public String toString() {
        return "YamlConfig{" +
                "decisionTree=" + decisionTreeConfigMap +
                '}';
    }

}

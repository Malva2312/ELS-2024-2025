package pt.up.fe.els2024;

import java.util.Map;

public class DecisionTreeConfig {

    private Integer classes;
    private Integer feature_importances;
    private Integer max_features;
    private String meta;
    private Integer n_classes;
    private Integer n_outputs;

    // params
    private Integer ccp_alpha;
    private Integer class_weight;
    private String criterion;
    private Integer max_depth;
    //private Integer max_features;
    private Integer max_leaf_nodes;
    private Integer min_impurity_decrease;
    private Integer min_impurity_split;
    private Integer min_samples_leaf;
    private Integer min_samples_split;
    private Integer min_weight_fraction_leaf;
    private Integer random_state;
    private String splitter;

    //tree
    //private Integer max_depth;
    private Integer node_count;

    //nodes
    //nodes_dtype
    //values

    public void setFeature_importances(Integer feature_importances) {
        this.feature_importances = feature_importances;
    }

    public void setMax_features(Integer max_features) {
        this.max_features = max_features;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void setN_classes(Integer n_classes) {
        this.n_classes = n_classes;
    }

    public void setN_outputs(Integer n_outputs) {
        this.n_outputs = n_outputs;
    }

    public void setCcp_alpha(Integer ccp_alpha) {
        this.ccp_alpha = ccp_alpha;
    }

    public void setClass_weight(Integer class_weight) {
        this.class_weight = class_weight;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    public void setMax_depth(Integer max_depth) {
        this.max_depth = max_depth;
    }

    public void setMax_leaf_nodes(Integer max_leaf_nodes) {
        this.max_leaf_nodes = max_leaf_nodes;
    }

    public void setMin_impurity_decrease(Integer min_impurity_decrease) {
        this.min_impurity_decrease = min_impurity_decrease;
    }

    public void setMin_impurity_split(Integer min_impurity_split) {
        this.min_impurity_split = min_impurity_split;
    }

    public void setMin_samples_leaf(Integer min_samples_leaf) {
        this.min_samples_leaf = min_samples_leaf;
    }

    public void setMin_samples_split(Integer min_samples_split) {
        this.min_samples_split = min_samples_split;
    }

    public void setMin_weight_fraction_leaf(Integer min_weight_fraction_leaf) {
        this.min_weight_fraction_leaf = min_weight_fraction_leaf;
    }

    public void setRandom_state(Integer random_state) {
        this.random_state = random_state;
    }

    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    public void setNode_count(Integer node_count) {
        this.node_count = node_count;
    }

    public Integer getFeature_importances() {
        return feature_importances;
    }

    public Integer getMax_features() {
        return max_features;
    }

    public String getMeta() {
        return meta;
    }

    public Integer getN_classes() {
        return n_classes;
    }

    public Integer getN_outputs() {
        return n_outputs;
    }

    public Integer getCcp_alpha() {
        return ccp_alpha;
    }

    public Integer getClass_weight() {
        return class_weight;
    }

    public String getCriterion() {
        return criterion;
    }

    public Integer getMax_depth() {
        return max_depth;
    }

    public Integer getMax_leaf_nodes() {
        return max_leaf_nodes;
    }

    public Integer getMin_impurity_decrease() {
        return min_impurity_decrease;
    }

    public Integer getMin_impurity_split() {
        return min_impurity_split;
    }

    public Integer getMin_samples_leaf() {
        return min_samples_leaf;
    }

    public Integer getMin_samples_split() {
        return min_samples_split;
    }

    public Integer getMin_weight_fraction_leaf() {
        return min_weight_fraction_leaf;
    }

    public Integer getRandom_state() {
        return random_state;
    }

    public String getSplitter() {
        return splitter;
    }

    public Integer getNode_count() {
        return node_count;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }


}
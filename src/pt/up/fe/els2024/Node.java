package pt.up.fe.els2024;

public class Node {

    private int left; //index of left child, -1 if leaf
    private int right; //index of right child, -1 if leaf
    private int feature; //index of the feature used for split, -2 if leaf

    private double threshold; //threshold for split
    private double impurity; //impurity of the node
    private long n_node_samples; //number of samples in the node
    private double weighted_n_node_samples; //weighted number of samples in the node

    public Node(int left, int right, int feature, double threshold, double impurity, long n_node_samples, double weighted_n_node_samples) {
        this.left = left;
        this.right = right;
        this.feature = feature;
        this.threshold = threshold;
        this.impurity = impurity;
        this.n_node_samples = n_node_samples;
        this.weighted_n_node_samples = weighted_n_node_samples;
    }
}
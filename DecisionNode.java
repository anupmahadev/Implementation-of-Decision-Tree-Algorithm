import java.util.List;

import javax.xml.soap.Node;

public class DecisionNode {

	
	
	private int attribute = -1;// -1 for leaf node
	private double threshold = -1;
	private double informationGain = -1;
	private List<Double> classDistribution = null;
	private DecisionNode leftNode = null;
	private DecisionNode rightNode = null;

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public double getThreshold() {
		return threshold;

	}
	
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public double getInformationGain() {
		return informationGain;
	}

	public void setInformationGain(double informationGain) {
		this.informationGain = informationGain;
	}

	public List<Double> getClassDistribution() {
		return classDistribution;
	}

	public void setClassDistribution(List<Double> classDistribution) {
		this.classDistribution = classDistribution;
	}

	public DecisionNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(DecisionNode leftNode) {
		this.leftNode = leftNode;
	}

	public DecisionNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(DecisionNode rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "Node \n[attribute=" + attribute + ", \nthreshold=" + threshold + ", \ninformationGain=" + informationGain
				+ ", \nclassDistribution=" + classDistribution + ", \nleftNode=" + leftNode + ", \nrightNode=" + rightNode +"]" ;
						
	}						

}

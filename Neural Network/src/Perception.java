
public class Perceptron 
{
	private int threshold;
	private double learningRate;
	private double bias;
	private double [] weight;
	public Perceptron(int numberOfInputs, int threshold, double learningRate)
	{
		this.threshold = threshold;
		this.learningRate = learningRate;
		this.bias = 0;
		weight = new double[numberOfInputs];
	}
	
	public int predict(double [] inputs)
	{
		int activation = 0;
		double z = dot(inputs, weight) + bias;
		System.out.println("z = " + inputs[0] + " * " + weight[0] + " + " + inputs[1] + " * " + weight[1] + " = " + z);
		if(z > 0)
		{
			activation = 1;
		}
		else
		{
			activation = 0;
		}
		return activation;
	}
	
	public double dot(double[] q, double[]p){

	    double scalarproduct = 0.0;

	    if (q.length == p.length){

	        for(int i = 0; i < q.length; i++){
	            scalarproduct = scalarproduct + q[i] * p[i];
	        }
	    }
	    return scalarproduct;
	}
	
	public void train(double [][] trainingInputs, double [] labels)
	{
		for(int i = 0; i < threshold; i++)
		{
			System.out.println("---------" + "Number of Iterations " +  i + "----------");
			for(int j = 0; j < labels.length; j++)
			{
				double [] inputs = trainingInputs[j];
				double label = labels[j];
				System.out.println("Current Inputs " + arrayToString(inputs) + " " + " Weight " + arrayToString(weight) + 
				" Bias " + bias);
				double yhat = predict(inputs);
				System.out.println("Yhat: "+ yhat);
				double error = label - yhat;
				System.out.println("Error = " + label + " - " + yhat + " = "+ error);
				for(int k = 0; k < inputs.length; k++)
				{
					weight[k] += learningRate * error * inputs[k];
				}
				bias += learningRate * error;
				System.out.println("Updated Weight " + arrayToString(weight));
				System.out.println("Updated Bias " + bias + "\n");
			}
		}
	}
	
	public static String arrayToString(double [] arr)
	{
		String result = "[";
		for(int i = 0; i < arr.length; i++)
		{
			if(i > 0)
			{
				result = result + ", ";
			}
			result += arr[i];
		}
		return result + "]";
	}
	
	public static void main(String[] args)
	{
		double [] labels = new double[]{1,0,0,0};
		double [][] matrix = new double[][] 
				{
					new double[] {1,1},
					new double[] {1,0},
					new double[] {0,1},
					new double[] {0,0}
				};
		Perceptron perceptron = new Perceptron(2, 10, 1);
		perceptron.train(matrix, labels);
		int a = 1;
		int b = 0;
		double [] inputs = new double[] {a,b};
		System.out.println("---------" + "Input" + "----------" + arrayToString(inputs));
		int output = perceptron.predict(inputs);
		System.out.println("---------" + "outut" + "----------" + " " + output);
	}
}

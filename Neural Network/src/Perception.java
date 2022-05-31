
public class Perception 
{
	private int threshold;
	private int learningRate;
	private int bias;
	private int [] weight;
	public Perception(int threshold, int learningRate, int [] arr)
	{
		this.threshold = threshold;
		this.learningRate = learningRate;
		bias = 0;
		weight = new int[5];
	}
	
	public int Predict(int [] inputs)
	{
		int activation = 0;
		int z = dot(inputs, weight) + bias;
		System.out.println(inputs[0] + " * " + weight[0] + " + " + inputs[1] + " * " + weight[1] + " = " + z);
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
	
	public int dot(int [] input, int[] weight)
	{
		int result = 0;
		for(int i = 0; i < input.length; i++)
		{
			result = input[i] * weight[i];
		}
		return result;
	}
	
	public void Train(int [][] trainingInputs, int epoch)
	{
		for(int i = 0; i < threshold; i++)
		{
			for(int j = 0; j < trainingInputs.length; j++)
			{
				for(int k = 0; k < trainingInputs[0].length; k++)
				{
					
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}

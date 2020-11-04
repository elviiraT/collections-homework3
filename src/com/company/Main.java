package com.company;
import ibadts.IBCollection;
import static ibio.Helpers.*;

public class Main
{

    public static void main(String[] args)
    {
	IBCollection <Integer> numbers = new IBCollection <> ();
	boolean addnumber = true;
	int number = -1;
	while (addnumber)
	{
			number = inputInt("enter a number: ");
		if (number > 0)
			numbers.addItem(number);
		else
			addnumber = false;
	}
		int sum = 0;
		int count = 0;
		numbers.resetNext();
		while (numbers.hasNext())
		{
			sum = sum + numbers.getNext();
			count = count + 1;
		}
		double mean = (double)sum / count;
		double difference = mean * 0.5;
		numbers.resetNext();
		while (numbers.hasNext())
		{
			int v = numbers.getNext();
			if (v < mean-difference || v > mean+difference)
				System.out.println (v);
		}
    }
}

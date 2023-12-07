package DAY1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Part2
{
	private int calibrationSum;
	private BufferedReader br;

	public Part2()
	{
		calibrationSum = 0;
		try
		{
			br = new BufferedReader(new FileReader("src/DAY1/Input.txt"));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		readFile();
		System.out.println("Part 2 Solution: " + calibrationSum);
	}

	private void readFile()
	{
		int calibrationValue;
		String line;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		try
		{
			while ((line = br.readLine()) != null)
			{
				int firstDigit = -1;
				int lastDigit = -1;
				int indexOfLastDigit = 0;
				for (int i = 0; i < line.length(); i++)
				{
					if (firstDigit == -1)
					{
						if (line.indexOf("one") <= i && line.contains("one"))
						{
							firstDigit = 1;
						}
						else if (line.indexOf("two") <= i && line.contains("two"))
						{
							firstDigit = 2;
						}
						else if (line.indexOf("three") <= i && line.contains("three"))
						{
							firstDigit = 3;
						}
						else if (line.indexOf("four") <= i && line.contains("four"))
						{
							firstDigit = 4;
						}
						else if (line.indexOf("five") <= i && line.contains("five"))
						{
							firstDigit = 5;
						}
						else if (line.indexOf("six") <= i && line.contains("six"))
						{
							firstDigit = 6;
						}
						else if (line.indexOf("seven") <= i && line.contains("seven"))
						{
							firstDigit = 7;
						}
						else if (line.indexOf("eight") <= i && line.contains("eight"))
						{
							firstDigit = 8;
						}
						else if (line.indexOf("nine") <= i && line.contains("nine"))
						{
							firstDigit = 9;
						}
						lastDigit = firstDigit;
					}
					if (Character.isDigit(line.charAt(i)))
					{
						int digitAtI = Integer.parseInt(String.valueOf(line.charAt(i)));
						if (firstDigit == -1)
						{
							firstDigit = digitAtI;
						}
						lastDigit = digitAtI;
						indexOfLastDigit = i;
					}
				}

				if (line.lastIndexOf("one") > indexOfLastDigit)
				{
					lastDigit = 1;
					indexOfLastDigit = line.lastIndexOf("one");
				}
				if (line.lastIndexOf("two") > indexOfLastDigit)
				{
					lastDigit = 2;
					indexOfLastDigit = line.lastIndexOf("two");
				}
				if (line.lastIndexOf("three") > indexOfLastDigit)
				{
					lastDigit = 3;
					indexOfLastDigit = line.lastIndexOf("three");
				}
				if (line.lastIndexOf("four") > indexOfLastDigit)
				{
					lastDigit = 4;
					indexOfLastDigit = line.lastIndexOf("four");
				}
				if (line.lastIndexOf("five") > indexOfLastDigit)
				{
					lastDigit = 5;
					indexOfLastDigit = line.lastIndexOf("five");
				}
				if (line.lastIndexOf("six") > indexOfLastDigit)
				{
					lastDigit = 6;
					indexOfLastDigit = line.lastIndexOf("six");
				}
				if (line.lastIndexOf("seven") > indexOfLastDigit)
				{
					lastDigit = 7;
					indexOfLastDigit = line.lastIndexOf("seven");
				}
				if (line.lastIndexOf("eight") > indexOfLastDigit)
				{
					lastDigit = 8;
					indexOfLastDigit = line.lastIndexOf("eight");
				}
				if (line.lastIndexOf("nine") > indexOfLastDigit)
				{
					lastDigit = 9;
				}

				calibrationSum += firstDigit * 10 + lastDigit;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
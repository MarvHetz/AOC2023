package DAY1;

import java.io.*;

public class Part1
{
	private int calibrationSum;
	private BufferedReader br;

	public Part1()
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
		System.out.println("Part 1 Solution: " + calibrationSum);
	}

	private void readFile()
	{
		int calibrationValue;
		String line;

		try
		{
			while ((line = br.readLine()) != null)
			{
				line = line.replaceAll("[^0-9.]", "");
				calibrationValue = Integer.valueOf((new StringBuilder()).append(line.charAt(0)).append(line.charAt(line.length()-1)).toString());
				calibrationSum += calibrationValue;
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

public class GradeBook
{
	//creates an array to hold the student's names 
	private String[] name = new String[5];
	//creates an array to hold the student's grades
	private char[] grade = new char[5];
	//creates an array to hold the student's scores
	private double[] score = new double[5];
	
	public GradeBook()
	{
	}
	//method to set each student's name
	public void setName(String n, int i)
	{
		name[i] = n;
	}
	//method to return a specific student's name
	public String getName(int i)
	{
		return name[i];
	}
	
	//method to set a specific student's score
	public void setScore(double val, int i)
	{
		score[i] = val;
	}
	//method to return a specific student's score
	public double getScore(int i)
	{
		return score[i];
	}
	//method that calculates a student's letter grade corresponding to average score
	public void findGrade(int i)
	{
		if (score[i] >=90.0)
			grade[i] = 'A';
		else if (score[i] >=80.0)
			grade[i] = 'B';
		else if (score[i] >= 70.0)
			grade[i] = 'C';
		else if (score[i] >= 60.0)
			grade[i] = 'D';
		else 
			grade[i] = 'F';
	}
	//method that returns a student's letter grade
	public char getGrade(int i)
	{
		return grade[i];
	}
		
}


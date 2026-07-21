class Student
{
	public static void main(String args[])
	{
		Student student = new Student();
		String stdScoreStr = args[0];
		int stdScore = Integer.parseInt(stdScoreStr);
		student.validateStudent(stdScore);
	}
	
	public void validateStudent(int score)
	{
		if(score > 0 && score > 60){
			System.out.println("Student is Allowed");
		}else{
			System.out.println("Student is not Allowed must required score 60.");
		}
	}
}
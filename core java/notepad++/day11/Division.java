class Division
{
	public static void main(String args[])
	{
		Division division = new Division();
		String stdScoreStr = args[0];
		int score = Integer.parseInt(stdScoreStr);
		division.studentDivision(score);
	}
	
	public void studentDivision(int score)
	{
		if(score > 75){
			System.out.println("Student scored 1st Division");
		}else if(score < 75 && score > 60){
			System.out.println("Student scored 2nd Division");
		}else if(score < 60 && score > 35){
			System.out.println("Student scored 3rd Division");
		}else{
			System.out.println("Student is failed");
		}
	}
}
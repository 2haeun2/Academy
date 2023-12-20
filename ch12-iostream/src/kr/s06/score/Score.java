package kr.s06.score;

public class Score {
	/*
	 * [실습]이름(name),국어(korean),영어(english),수학(math) 
	 * 총점구하기(int makeSum),평균구하기(double makeAvg),
	 * 등급구하기(String makeGrade) 
	 */
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public int makeSum() {
		return korean + english + math;
	}
	public double makeAvg() {
		return makeSum()/3.0;
	}
	
	public String makeGrade() {
		String grade;
		switch((int)(makeAvg()/10)) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";
		}
		return grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
}







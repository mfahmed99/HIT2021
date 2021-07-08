package hit.day29;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo5 {

	public static void main(String[] args) {
		ColDemo5 obj=new ColDemo5();
		Set<Question> qset=obj.getQuestionSet();
		
		System.out.println(qset);

	}
	
	public Set<Question> getQuestionSet() {
		//Set<Question> questionSet=new TreeSet<>(new MyQuestionComparator());// Outer class
		Set<Question> questionSet=new TreeSet<>((q1,q2)->{return q2.qid.compareTo(q1.qid);});// in LAMBDA
		//Set<Question> questionSet1=new TreeSet<>(new Comparator<Question>() {
		//		@Override
		//		public int compare(Question o1, Question o2) {
		//			// TODO Auto-generated method stub
		//			return o1.compareTo(o2);
		//		}
	//	});//Anonymous inner class
//	}
		Question q1=new Question("1", "Who is CM?", "chief member", "chief minister", "chief major", "2");
		Question q2=new Question("2", "Who is PM?", "prime member", "prime minister", "prime major", "2");
		Question q3=new Question("3", "Who is DM?", "district member", "district minister", "district major", "2");
		Question q4=new Question("4", "Who is HM?", "head member", "head minister", "head major", "2");
		Question q5=new Question("5", "Who is CM?", "chief member", "chief minister", "chief major", "2");
	
		questionSet.add(q1);
		questionSet.add(q2);
		questionSet.add(q3);
		questionSet.add(q4);
		questionSet.add(q5);
		
		return questionSet;
	
	}
}

class MyQuestionComparator implements Comparator<Question>{
	@Override
	public int compare(Question o1, Question o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}


class Question implements Comparable<Question> {// without comparable, TreeSet wont take, but Has Set will take 
	String qid,question,option1,option2,option3,answer;
	
	public Question(String qid, String question, String option1, String option2, String option3, String answer) {
		this.qid=qid;
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.answer=answer;
	}
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2+ ", option3=" + option3 + ", answer=" + answer + "]\n";
	}
	@Override
		public int compareTo(Question o) {
			return this.qid.compareTo(o.qid);
			//return o.qid.compareTo(this.qid);
		}
	
	
}
	
	

package com.opennity.gof.str.Composite;

public class Test {

	public static void main(String[] args) {

		SOFEntry question = new Questions("what is java");
		SOFEntry ans1 = new Answers("java is programmig language and fun");
		SOFEntry ans2 = new Answers("java is cool, secure");
		SOFEntry com1 = new Comments("oops programming");
		SOFEntry com2 = new Comments("hot secure");
		SOFEntry com3 = new Comments("just google it");
		SOFEntry com4 = new Comments("both are correct answers");


		question.add(ans1);
		question.add(ans2);
		ans1.add(com1);
		ans2.add(com2);
		question.add(com3);
		question.add(com4);

		System.out.println(question.publish());
	}

}

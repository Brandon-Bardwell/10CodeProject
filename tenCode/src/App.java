import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//QUESTIONS AND AVAILABLE ANSWERS
		
		String q1 = "10-1?\n" + "(a)Receiving Poorly\n(b)Out of Service\n(c)Weather Conditions\n(d)Correct Time\n";
		
		String q2 = "10-2?\n" + "(a)NCIC Check For Stolen\n(b)Receiving Well\n(c)Coffee Break\n(d)Operator on Duty\n";
		
		String q3 = "10-4?\n" + "(a)Traffic Stop\n(b)Officer Welfare Check\n(c)Trouble at Station\n(d)O.K. On Transmission\n";
		
		String q4 = "10-5?\n" + "(a)Reckless Driver\n(b)Arrived at Scene\n(c)Relay Message\n(d)No Traffic Your Unit or Station\n";
		
		String q5 = "10-6?\n" + "(a)Visitor Present\n(b)Cancel\n(c)Package or Parcel\n(d)Busy\n";
		
		String q6 = "10-7?\n" + "(a)Out of Service\n(b)Had any Calls This Unit\n(c)Clear and Prepare to Copy\n(d)Drivers License Check-Status Only\n";
		
		String q7 = "10-8?\n" + "(a)In Service\n(b)Convoy or Escort\n(c)Receiving Poorly\n(d)Vehicle Registration\n";
		
		String q8 = "10-9?\n" + "(a)Subject or Vehicle in Question Possibly Wanted\n(b)NCIC Check for Wanted Person\n(c)Please Repeat Traffic\n(d)Net Clear, Resume Normal traffic\n";
		
		String q9 = "10-10?\n" + "(a)Assignment Complete, Now 10-8\n(b)Meal Break\n(c)Transmission Does Not Conform to FCC Regulation\n(d)Out of Service, Subject to Call\n";
		
		String q10 = "10-12?\n" + "(a)Stalled Vehicle\n(b)Visitor Present\n(c)Relay Message\n(d)Traffic Stop\n";
		
		String q11 = "10-13?\n" + "(a)Weather Conditions\n(b)Public Service This Station Or_____\n(c)Vehicle Registration\n(d)Stalled Vehicle\n";
		
		String q12 = "10-14?\n" + "(a)Confidential Information\n(b)Receiving Poorly\n(c)Out of Service\n(d)Convoy or Escort\n";
		
		String q13 = "10-15?\n" + "(a)Cancel\n(b)Had any Calls This Unit\n(c)Prisoner in Custody\n(d)Assignment Complete, Now 10-8\n";
		
		String q14 = "10-17?\n" + "(a)Package or Parcel\n(b)Meal Break\n(c)Officer Welfare Check\n(d)Emergency Traffic this Station\n";
		
		String q15 = "10-19?\n" + "(a)NCIC Check for Stolen\n(b)Return to Station\n(c)Out of Service, Subject to Call\n(d)Coffee Break\n";
		
		String q16 = "10-20?\n" + "(a)Net Direct, Emergency Traffic Only\n(b)Traffic Stop\n(c)No Traffic Your Unit or Station\n(d)Location\n";
		
		String q17 = "10-21?\n" + "(a)Operator on Duty\n(b)Visitor Present\n(c)Public Service This Station Or_____\n(d)Confidential Information\n";
		
		String q18 = "10-22?\n" + "(a)No Traffic Your Unit or Station\n(b)Transmission Does Not Conform to FCC Regulation\n(c)Package or Parcel\n(d)Cancel\n";
		
		String q19 = "10-24?\n" + "(a)Trouble at Station\n(b)Clear and Prepare to Copy\n(c)Relay Message\n(d)O.K. on Transmission\n";
		
		String q20 = "10-26?\n" + "(a)Stalled Vehicle\n(b)NCIC Check for Wanted Person\n(c)Arrived at Scene\n(d)Prisoner in Custody\n";
		
		String q21 = "10-28?\n" + "(a)Prisoner in Custody\n(b)Return to Station\n(c)O.K. on Transmission\n(d)Vehicle Registration\n";
		
		String q22 = "10-29?\n" + "(a)Clear and Prepare to Copy\n(b)O.K. on Transmission\n(c)Receiving Poorly\n(d)NCIC Check for Stolen\n";
		
		String q23 = "10-30?\n" + "(a)Return to Station\n(b)Confidential Information\n(c)Transmission Does Not Conform to FCC Regulation\n(d)Drivers License Check-Status Only\n";
		
		String q24 = "10-33?\n" + "(a)Had any Calls This Unit\n(b)Emergency Traffic this Station\n(c)Please Repeat Traffic\n(d)Prisoner in Custody\n";
		
		String q25 = "10-35?\n" + "(a)Cancel\n(b)Out of Service\n(c)Confidential Information\n(d)Package or Parcel\n";
		
		String q26 = "10-36?\n" + "(a)Correct Time\n(b)In Service\n(c)Convoy or Escort\n(d)Relay Message\n";
		
		String q27 = "10-37?\n" + "(a)Busy\n(b)Visitor Present\n(c)Please Repeat Traffic\n(d)Operator on Duty\n";
		
		String q28 = "10-42?\n" + "(a)Emergency Traffic this Station\n(b)Drivers License Check-Complete\n(c)Out of Service, Subject to Call\n(d)Traffic Stop\n";
		
		String q29 = "10-43?\n" + "(a)Drivers License Check-Status Only\n(b)Vehicle Registration\n(c)Location\n(d)Busy\n";
		
		String q30 = "10-44?\n" + "(a)Receiving Poorly\n(b)Visitor Present\n(c)NCIC Check for Wanted Person\n(d)Clear and Prepare to Copy\n";
		
		String q31 = "10-45?\n" + "(a)Coffee Break\n(b)Weather Conditions\n(c)Transmission Does Not Conform to FCC Regulation\n(d)Prisoner in Custody\n";
		
		String q32 = "10-46?\n" + "(a)In Service\n(b)O.K. on Transmission\n(c)Meal Break\n(d)Return to Station\n";
		
		String q33 = "10-47?\n" + "(a)Correct Time\n(b)Subject or Vehicle in Question Possibly Wanted\n(c)Receiving Well\n(d)Out of Service\n";
		
		String q34 = "10-50?\n" + "(a)No Traffic Your Unit or Station\n(b)NCIC Check for Stolen\n(c)Trouble at Station\n(d)Assignment Complete, Now 10-8\n";
		
		String q35 = "10-52?\n" + "(a)Visitor Present\n(b)O.K. on Transmission\n(c)NCIC Check for Stolen\n(d)Reckless Driver\n";
		
		String q36 = "10-54?\n" + "(a)Traffic Stop\n(b)Officer Welfare Check\n(c)Emergency Traffic this Station\n(d)In Service\n";
		
		String q37 = "10-63?\n" + "(a)NCIC Check for Wanted Person\n(b)Net Direct, Emergency Traffic Only\n(c)Emergency Traffic this Station\n(d)Visitor Present\n";
		
		String q38 = "10-64?\n" + "(a)Net Clear, Resume Normal traffic\n(b)Out of Service, Subject to Call\n(c)Return to Station\n(d)Had any Calls This Unit\n";
		
		String q39 = "10-65?\n" + "(a)Assignment Complete, Now 10-8\n(b)Coffee Break\n(c)Clear and Prepare to Copy\n(d)Operator on Duty\n";
		
		String q40 = "10-69?\n" + "(a)Prisoner in Custody\n(b)Had any Calls This Unit\n(c)Convoy or Escort\n(d)Cancel\n";
		
		String q41 = "10-90?\n" + "(a)Officer Welfare Check\n(b)Receiving Poorly\n(c)Busy\n(d)Out of Service\n";
		
		String q42 = "10-97?\n" + "(a)Clear and Prepare to Copy\n(b)Meal Break\n(c)Traffic Stop\n(d)Arrived at Scene\n";
		
		String q43 = "10-98?\n" + "(a)Please Repeat Traffic\n(b)Prisoner in Custody\n(c)Assignment Complete, Now 10-8\n(d)O.K. on Transmission\n";
		
		
		
		
					
				
		
		
		//ANSWERS TO THE QUESTIONS
		
		Question [] questions = {
				new Question(q1, "a"),
				new Question(q2, "b"),
				new Question(q3, "d"),
				new Question(q4, "c"),
				new Question(q5, "d"),
				new Question(q6, "a"),
				new Question(q7, "a"),
				new Question(q8, "c"),
				new Question(q9, "d"),
				new Question(q10, "b"),
				new Question(q11, "a"),
				new Question(q12, "d"),
				new Question(q13, "c"),
				new Question(q14, "a"),
				new Question(q15, "b"),
				new Question(q16, "d"),
				new Question(q17, "c"),
				new Question(q18, "d"),
				new Question(q19, "a"),
				new Question(q20, "a"),
				new Question(q21, "d"),
				new Question(q22, "d"),
				new Question(q23, "c"),
				new Question(q24, "b"),
				new Question(q25, "c"),
				new Question(q26, "a"),
				new Question(q27, "d"),
				new Question(q28, "b"),
				new Question(q29, "a"),
				new Question(q30, "c"),
				new Question(q31, "a"),
				new Question(q32, "c"),
				new Question(q33, "b"),
				new Question(q34, "a"),
				new Question(q35, "d"),
				new Question(q36, "a"),
				new Question(q37, "b"),
				new Question(q38, "a"),
				new Question(q39, "c"),
				new Question(q40, "b"),
				new Question(q41, "a"),
				new Question(q42, "d"),
				new Question(q43, "c"),
				
		};
		takeTest(questions);
		
		

	}

	public static void takeTest(Question [] questions) {
		int score = 0; 
		Scanner keyboardInput = new Scanner(System.in);
		for(int i = 0; i< questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.contentEquals(questions[i].answer)) {
					score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}
	
	
}

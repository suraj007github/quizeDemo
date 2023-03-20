package questionInterface;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

public class Main {
	
	
		public static void main(String[] args) {
			Quiz quiz = new Quiz();
			quiz.logic();
		}
		
		public static String question;
		public static String option1;
		public static String option3;
		public static String option4;
		public static class Quiz{
			Scanner sc = new Scanner(System.in);
			int correctAnsCount=0;
			int wrongAnsCount=0;
			private String option2;
			public void logic() {
				Questions q1 = new Questions("Question: Who invented Java Programming?","option1: A.Guido van Rossum", "option2: B.James Gosling", "option3: C.Dennis Ritchie", "option4: D. Bjarne Stroustrup");
				Questions q2 = new Questions("Question:  Which statement is true about Java?", "option1: A.Java is a sequence-dependent programming language", "option2: B.Java is a code dependent programming language", "option3: C.Java is a platform-dependent programming language", "option4: D.Java is a platform-independent programming language");
				Questions q3 = new Questions("Question: What is the extension of java code files?", "option1: A.js", "option2: B..txt", "option3: C..class", "option4: D..java");
				Questions q4 = new Questions("Question: Which component is used to compile, debug and execute the java programs?", "option1: A.JRE", "option2: B.JIT", "option3: C.JDK", "option4: D.JVM");
				Questions q5 = new Questions("Question: Which one of the following is not a Java feature?", "option1: A.Object-oriented", "option2: B.Use of pointers", "option3: C.Portable", "option4: D.Dynamic and Extensible");
				Questions q6 = new Questions("Question: Which environment variable is used to set the java path?","option1: A. MAVEN_Path", "option2: B. JavaPATH", "option3: C. JAVA", "option4: D. JAVA_HOME");
				Questions q7 = new Questions("Question: Which of these cannot be used for a variable name in Java?", "option1: A. identifier & keyword", "option2: B. identifier", "option3: C. keyword", "option4: D. none of the mentioned");
				Questions q8 = new Questions("Question: Which of the following is a type of polymorphism in Java Programming?", "option1: A. Multiple polymorphism", "option2: B. Compile time polymorphism", "option3: C. Multilevel polymorphism", "option4:D. Execution time polymorphism");
				Questions q9 = new Questions("Question: Which exception is thrown when java is out of memory?", "option1: A. MemoryError", "option2: B. OutOfMemoryError", "option3: C. MemoryOutOfBoundsException", "option4: D. MemoryFullException");
				Questions q10 = new Questions("Question: Which of these are selection statements in Java?", "option1: A. break", "option2: B. continue", "option3: C. for()", "option4: D. if()");   

				Map<Questions,Character>hmap=new HashMap<>();
				hmap.put(q1,'B');
				hmap.put(q2,'D');
				hmap.put(q3,'D');
				hmap.put(q4,'C');
				hmap.put(q5,'B');
				hmap.put(q6,'D');
				hmap.put(q7,'C');
				hmap.put(q8,'B');
				hmap.put(q9,'B');
				hmap.put(q10,'D'); 

				for(Map.Entry<Questions, Character> map:hmap.entrySet()) {
					System.out.println(map.getKey().getQuestion());
					System.out.println(map.getKey().getOption1());
					System.out.println(map.getKey().getOption2());
					System.out.println(map.getKey().getOption3());
					System.out.println(map.getKey().getOption4());
					
					System.out.println("Enter your Answer: ");
					Character ans=sc.next().charAt(0);
					
					int cans=Character.compare(ans,map.getValue());
					if(cans==0) {
						System.out.println("Correct");
						correctAnsCount++;
						}
					else {
						System.out.println("Wrong");
						wrongAnsCount++;
					}	
				}	
				System.out.println();
				System.out.println("----------Result----------");
				System.out.println("Total Questions Are: "+hmap.size());
				System.out.println("Correct Answers Are: "+correctAnsCount);
				System.out.println("Wrong Answers Are: "+wrongAnsCount);
				int percentage=(100*correctAnsCount)/hmap.size();
				System.out.println("Percentage: "+percentage);
				if(percentage>95) {
					System.out.println("Grade :A");
				}
				else if(percentage<35) {
					System.out.println("Grade : C");
				}
				else {
					System.out.println("Grade : B");
				}
				
				
			}
		}
	}



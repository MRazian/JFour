public class DigikalaJob {
	public static void main(String[] args){
		 int age;
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Please Enter you Age: ");
		 age = sc.nextInt();
		 if (age < 18) {
			 System.out.println("You are Minor.");
			 System.out.println("You are Not Eligible to Work");
		 }
		 else {
			 if (age <= 60 ) {
			 System.out.println("You are Eligible to Work");
			 System.out.println("Please fill in your details
			and apply");
			 }
			 else {
			 System.out.println("You are too old to work for
				Digikala");
			 }
		 }
	}
}

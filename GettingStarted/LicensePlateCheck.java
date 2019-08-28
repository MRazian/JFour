public static void main(String[] args){
	 Scanner myInput = new Scanner(System.in);
	 int g = myInput.nextInt();
	 myInput.nextLine();
	 String day = myInput.nextLine();
	 if (day.equals("جمعه")){
	 System.out.println("مجاز");
	 }
	 else if (g % 2 == 0){
		 if (day.equals("شنبه") || ("day.equals("دوشنبه")|| day.equals("چهارشنبه")){
			 System.out.println("مجاز");
		 } else {
		 	System.out.println("غیرمجاز");
		 }
	 } else {
		 if (day.equals("یکشنبه") || ("day.equals("سهشنبه") || day.equals("پنجشنبه")){
		 	System.out.println("مجاز");
		 } else {
			System.out.println("غیرمجاز");
		 }
	 }
 }

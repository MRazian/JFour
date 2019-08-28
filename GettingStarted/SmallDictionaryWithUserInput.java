Scanner myInput = new Scanner(System.in);
String word;
do {
	 word = myInput.nextLine();

	switch (word){
	 case "future":
	 System.out.println("آینده");
	 break;
	 case "mobile":
	 System.out.println("موبایل");
	 break;
	 case "here":
	 System.out.println("اینجا");
	 break;
	 case "key":
	 System.out.println("کلید");
	 break;
	 case "pen":
	 System.out.println("خودکار");
	 break;
	 case "bag":
	 System.out.println("کیف");
	 break;
	 case "university":
	 System.out.println("دانشگاه");
	 break;
	 case "book":
	 System.out.println("کتاب");
	 break;
	 case "programming":
	 System.out.println("برنامهنویسی");
	 break;
	 case "development":
	 System.out.println("توسعه");
	 break;
	 default:
	 System.out.println("کلمه ناشناس است.");
	}
} while (!word.equalsIgnoreCase("exit"));

public static void main(String[] args) {
 double velocity = 355.3674198;
 System.out.println(twoDecimalDouble(velocity));
}
public static double twoDecimalDouble(double input){
 input *= 100;
 double twoDecimal = (int) input / 100d;
 return twoDecimal;
}

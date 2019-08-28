public static void main(String[] args) {
 checkForUpdates(27);
}
public static boolean checkForUpdates(int latestVersion) {
 try{
 FileInputStream fileInput = new FileInputStream
 ("root/Android/os/currentVersion.txt");
 int version = 0;
 byte[] bv = fileInput.readAllBytes();
 for (int i = 0; i < bv.length; i++){
 version +=
 (bv[i] - '0') *
 Math.pow(10, bv.length - 1 - i);
 }
 fileInput.close();
 if (version < latestVersion) {
 update(latestVersion);
 return true;
 }
 }catch(Exception e){
 System.out.println(e);
 }
 return false;
}
static void update(int latestVersion){
 System.out.println("Updating...");
 try{
 FileOutputStream fout = new FileOutputStream
 ("root/Android/os/currentVersion.txt");
 String lv = Integer.toString(latestVersion);
 for (int i = 0; i < lv.length(); i++){
 fout.write(lv.charAt(i));
 }
 fout.close();
 }catch(Exception e){System.out.println(e);}
}

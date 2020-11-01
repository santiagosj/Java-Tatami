public class Variables {
    public static void main(String[] args) {
        String myName = "Santi";
        int myAge = 33;
        double myDoubleNum = 8.9;
        boolean myBoolean = true;
        char myChar = 'S'; // single quote must required
        
        
        System.out.println("Y mi edad es: " + myAge + " años");
        System.out.println("Este es un numero decimal(type double): " + myDoubleNum);
        System.out.println(myChar);

        if(myBoolean){
            sayHi(myName);
        }
        
    }
    public static void sayHi(String name) {
      String x = name;
      System.out.println("Hola mi nombre es: " + x);
    }
}
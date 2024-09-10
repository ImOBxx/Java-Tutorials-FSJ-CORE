
public class CharD {

    public static void main(String[] args) {
      
        char ch = 'd';
        
       
        int newAsciiValue = (int)ch + 3;
        

        char newChar = (char)newAsciiValue;
        
        
        System.out.println("Original character: '" + ch + "'");
        System.out.println("ASCII value of '" + ch + "': " + (int)ch);
        System.out.println("New ASCII value after adding 3: " + newAsciiValue);
        System.out.println("New character after adding 3: '" + newChar + "'");
    }

}

import java.util.Random;
import java.util.Scanner;

public class GSLC1_2540127774 {
    
    public static String randomizer(String[] arr){
    	
        Random character = new Random();
        int index = character.nextInt(arr.length);
        
        return arr[index];
        
    }
    
    public static String generator(){
        
        String letters = randomizer(lowercase);
        String numbers = randomizer(number);
        String symbol = randomizer(symbols);
        
        String pass = symbol + letters + numbers;
        
        pass = ordershuffle(pass);
        
        return pass;
        
    }
    
    public static String generator1(){
        
        String letters = randomizer(uppercase);
        String numbers = randomizer(number);
        String symbol = randomizer(symbols);
        
        String pass = symbol + letters + numbers;
        
        pass = ordershuffle(pass);
        
        return pass;
        
    }
    
    
    public static String ordershuffle(String string){
    	
        String[] arr = string.split("");
        
        Random character = new Random();
        
        for (int i = arr.length - 1; i > 0; i--){
        	
            int index = character.nextInt(i + 1);
            
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            
        }
        
        return String.join("", arr);
        
    }
    
    public static void main(String[] args){
        
    	int flag = 0;
    	
        String pass = generator();
        String pass1 = generator1();
        
        System.out.println("6-digit Password: " + pass + pass1);
        System.out.println("Generate another? Input Y or N");
        
        Scanner option = new Scanner(System.in);
        String choice = option.nextLine();
        System.out.println();
        
        do{
        	if(choice.equals("Y")){
        		
        		pass = generator();
        		pass1 = generator1();
        		
        		System.out.println("6-digit Password: " + pass + pass1);
        		System.out.println("Generate another? Input Y or N");
        		
        		choice = option.nextLine();
        		System.out.println();
        		
        	} 
        	
        	else if(choice.equals("N")){
        		
        		System.out.println("Goodbye!");
        		System.out.println();
        		
        		flag++;
        		
        	}
        	
        	else{
        		
        		System.out.println("Generate another? Input Y or N");
        		choice = option.nextLine();
        		
        		System.out.println();
        		
        	}
        	
        }while(flag == 0);
    }
    
    
//  Array Declarations
    
    private static final String[] lowercase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", 
    		"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    private static final String[] uppercase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
    		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    private static final String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    
    private static final String[] symbols = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};

}

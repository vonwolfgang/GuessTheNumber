package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Random rand = new Random();
        int number = rand.nextInt(100);
        // bu Random sınıfından nextInt fonksiyonunu kullanarak bir int sayı üretebiliriz rastgele içine 100 yazınca 0 ile 100 arasında üretiyor

        Scanner inp = new Scanner(System.in);
        
        int right = 0;
        int guess;
        int right2 = 5;
        int[] wrongArr = new int[5];
        
        System.out.println("you have 5 right to guess the number truly");
        while(right<5){

            System.out.println("please login you guess number which is between 0-100: ");
            guess = inp.nextInt();
            if (guess<0 || guess>100) {
            
                System.out.println("You typed in wrong number");
                continue;    
            }
            
            if(guess == number){
                
                System.out.println("weldone you knew the number");
                break;
            }
            
            else if(guess != number){
                
                if((guess-number)>0){
                    
                    System.out.println("you need to guess a lower number");
                    wrongArr[right] = guess;
                    right++;
                    System.out.println("you have " + (right2-right)+ " rights");

                }
                
                else if((guess-number)<0){
                    
                    System.out.println("you need to guess a bigger number");
                    wrongArr[right] = guess;
                    right++;
                    System.out.println("you have " + (right2-right)+ " rights");
                }
                
                else if(right==1){
                    System.out.println("secret number is: " + number);
                }
            }
            
        }
        if(right2 == 5){
            
            System.out.println("screet number is: " + number);
            System.out.println("Your wrong guess are:  ");

            for(int i : wrongArr){
                System.out.print(i+ ",");
            }
        }
    }
}

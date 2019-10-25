import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
	    String[] welcome = new String[]{"w", "e", "l", "c","o", "m", "e"};
	    for (int i = welcome.length - 1;i >= 0; i-- ){
            System.out.print(welcome[i]);
        }
	    //2
        String str;
	    int i = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter String ");
        str = keyboard.nextLine();
        char ch[]=str.toCharArray();
	    for(char c: ch ){
            i++;
	    }
        System.out.println("Length: " + i);

        //3
        int[] valuesArray = new int[10];
        for(i = 0; i < valuesArray.length;i++) {
            System.out.println("Enter Number " +(i + 1) + ":");
            valuesArray[i] = keyboard.nextInt();
        }
        for( i = 0; i < valuesArray.length;i++){
            System.out.print(valuesArray[i]);
        }




    }



}

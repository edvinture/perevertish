/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perevertish;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("--перевертыш--");
        System.out.println("Введите строку");
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        char[] chStr = str.toCharArray();
        
        char[] rChStr = new char [str.length()];
        
        for (int i = 0; i< rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length - 1) - i ];
        }
        
        String rStr = new String (rChStr);
        System.out.println("перевертыш: "+rStr);
        //string builder
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("перевертыш 2: "+sbStr.reverse().toString());
        //1 находим index пробела в строке 
        //2 если в строке нет  пробелов то нет второго слова
        //3 если один символ пробела в строке, то выводим с индекса
        //  первого пробела до конца строки
        //4 если в строке два пробела, то выводим подстроку от первого 
        //  пробела  до второго
        
        int firstSpace = str.indexOf(" ");
        int secondSpace = str.indexOf(" ", firstSpace +1);
        if (firstSpace < 0) {
            System.out.println("Второго слова нет");
        
        }else if (secondSpace < 0) {
            System.out.println("второе слово:" + str.substring((firstSpace)));
        }else{
            System.out.println("второе слово:" + str.substring(firstSpace+1));
        }
        // второе решение
        System.out.println("второй способ решения: ");
        String[] arrWords = str.split(" ");
        if (arrWords[1] != null) {
            System.out.println("второе слово:" + arrWords[1]);
        }else{
            System.out.println("нет второго слова");
        }
    
    }
}

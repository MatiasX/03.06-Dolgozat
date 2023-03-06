import java.util.Scanner;

/*
* File: MainConsole.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023.03.06
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/

public class MainConsole {
    private Scanner scanner;
    private Calc calculator;

    public MainConsole(){
        scanner = new Scanner(System.in);
        calculator = new Calc();
    }
    public void run(){
        System.out.println("Kérem adja meg az ötszög oldalhosszát: ");
        double sideLength = scanner.nextDouble();
        double area = calculator.calculateArea(sideLength);
        System.out.println("Az ötszög területe "+area);
    }
}

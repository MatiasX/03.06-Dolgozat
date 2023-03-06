/*
* File: Calc.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023.03.06
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/

public class Calc {
    public double calculateArea(double sideLength) {
      double apothem = sideLength / (2 * Math.tan(Math.PI / 5));
      double area = (5 * sideLength * apothem) / 2;
      return area;
    }
  }
  

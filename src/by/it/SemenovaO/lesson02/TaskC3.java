package by.it.SemenovaO.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3

{
    public static final double GR_MARS = 3.86;
    public static final double GR_EARTH = 9.81;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double weight_mars = getWeight(weight);
        System.out.println(weight_mars);
    }

    //вычисляем вес на Марсе
    public static double getWeight(int  weight) {
        double w= weight*GR_MARS/GR_EARTH;
        w=Math.round(w*100);
        w=w/100;

        return w;
    }


}






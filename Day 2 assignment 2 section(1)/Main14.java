/*
public class Main14 {

public static void main(String[] args) {

int num1 = 10;

double num2 = 5.5;

int result = num1 + num2;

System.out.println(result);
}
}
*/



 //incompatible types: possible lossy conversion from double to int




public class Main14 {

public static void main(String[] args) {

int num1 = 10;
double num3 = num1;
double num2 =5.5;

double result = num3 + num2;

System.out.println(result);
}
}

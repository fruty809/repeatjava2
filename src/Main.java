import java.util.Random;

public class Main {
    public static void main(String[] args) {
        test(generateRandomAge(), 10);
        test(generateRandomAge(), 25);
        test(generateRandomAge(), 23);
        test(generateRandomAge(), 20);
        test(generateRandomAge(), 15);
    }

    public static String canGoOut(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "You can go out";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "You can go out";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "You can go out";
        }else {
            return "Stay at home!";
        }
    }



    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);
    }
    public static void test(int age,int temperature){
        String result = canGoOut(age,temperature);
        System.out.println("Возраст: " + age + ", Температура: " + temperature + " -> " + result);
    }
}
//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
package DZ01J;

public class N1 {

    public static void main(String... args) {
        final int min = -1000; // Минимальное число для диапазона
        final int max = 1000; // Максимальное число для диапазона
        final int rnd = rnd(min, max);// Скажу честно, я не знаю как его сохранить в i

        System.out.println("Cлучайное целое число получилось такое: " + rnd);
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;

    }
}
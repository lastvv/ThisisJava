package Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class J1 {
    public static void main(String[] args) {
    //1. Выбросил случайное целое число в диапазоне от -1000 до 1000 и сохранил в i
        int i = (int)(Math.random()*(1000-(-1000)))+(-1000);
        System.out.println("вот рандомное число i: " + i);

    //2. Посчитал и сохранил в n номер старшего значащего бита выпавшего числа
        String temp = Integer.toBinaryString(i);
        System.out.println("вот оно же в двоичной системе: " + temp);
        int n = temp.length();
        System.out.println("старший значащий бит n стоит на позиции " + n);

    //3. Нашёл все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранил в массив m1
        ArrayList<Integer> arrayListDivisible = new ArrayList<>();
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                arrayListDivisible.add(j);
            }
        }
        int[] m1 = new int[arrayListDivisible.size()];
        for (int j = 0; j < arrayListDivisible.size(); j++) {
            m1[j] = arrayListDivisible.get(j);
        }
    //4. Нашёл все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранил в массив m2
        ArrayList<Integer>arrayListNonDivisible = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                arrayListNonDivisible.add(j);
            }
        }

        int[] m2 = new int[arrayListNonDivisible.size()];
        for (int j = 0; j < arrayListNonDivisible.size(); j++) {
            m2[j] = arrayListNonDivisible.get(j);
        }
    //5. Сохранил оба массива в файлы с именами m1 и m2 соответственно.
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("m1 is here: " + Arrays.toString(m1));
            fw.append("\n");
            fw.write("m2 is here: " + Arrays.toString(m2));
            fw.flush();
            fw.close();
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

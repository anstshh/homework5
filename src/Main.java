public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        array2[0] = 1.57;
        array2[1] = 7.654;
        array2[2] = 9.986;
        long[] array3 = new long[2];
        array3[0] = 1;
        array3[1] = 2;

        //Задача 2

        int[] array4 = {1, 2, 3};
        for (int i = 1; i <= 3; i++)
            array4[0] = 1;
        {
            System.out.print(array4[0] + "," + array4[1] + "," + array[2]); //есть способ написать корое?
        }
        {
            System.out.println(); //я тут это поставила, чтобы разделить строки, хотя возможно это какая то фигня
        }
        double[] array5 = {1.57, 7.654, 9.986};

        for (double a = 1.57; a < 9.986; a++) {
            array5[0] = 1.57;
        }
        {
            System.out.print(array5[0] + "," + array5[1] + "," + array5[2]);
        }
        {
            System.out.println(); // меня дико бесят скобочки, я вообще не понимаю где их ставить, ставлю интуитивно
        }

        long[] array6 = new long[2];
        array6[0] = 1;
        array6[1] = 2;
        for (int i = 0; i < 2; i++) {

        }
        {
            System.out.print(array6[0] + "," + array6[1]);
        }
        // Задача 3

        {
            System.out.println();
        }

        {
            int[] array7 = {1, 2, 3};
            for (int i = 3; i >= 1; i--)
                array7[0] = 1;
            {
                System.out.print(array7[2] + "," + array7[1] + "," + array7[0]);
            }
            {
                System.out.println();
            }
            double[] array8 = {1.57, 7.654, 9.986};

            for (double a = 9.986; a > 1.57; a--) {
                array8[0] = 1.57;
            }
            {
                System.out.print(array8[2] + "," + array8[1] + "," + array8[0]);
            }
            {
                System.out.println();
            }

            long[] array9 = new long[2];
            array9[0] = 1;
            array9[1] = 2;
            for (long i = 0; i > 1; i--) {

            }
            {
                System.out.print(array9[1] + "," + array9[0]); // хотя вот тут и без for работает
            }


        }

        {
            System.out.println();
        }

        // Задача 4

        int[] array10 = {1, 2, 3};
        for (int i = 0; i <3; i++) {
            if (array10[i] % 2 !=0);
            array10[i] = array[i] +1;
        }
        {
            System.out.print(array10[0] + "," + array10[1] + "," + array10[2]); //нечетные то стали четными, но четное стало нечетным. Нужно ли тут второе условие запускать, чтобы четное число не менялось?
        }
        




    }
}




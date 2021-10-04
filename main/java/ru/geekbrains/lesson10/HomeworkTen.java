package ru.geekbrains.lesson10;

public class HomeworkTen {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 10 + 1);
        System.out.println("\nThe basic value for the calculation = " + x + "\n");
        int aa = x + 2;
        int ab = (int) Math.sqrt(x);
        int ac = (int) Math.pow(x, 2);
        int ad = (int) Math.cbrt(x);
        int ba = (int) Math.exp(x);
        int bb = Math.round(x);
        int bc = Math.abs(x);
        int bd = x * 3;
        int ca = x / 5;
        int cb = x - 10;
        int cc = x;
        int cd = x;
        int da = x;
        int db = x;
        int dc = x;
        int dd = x;

        // Вот тут ниже надо убирать значения или ставить их в кавычки! Сейчас отсутствуют данные элемента матрицы DD(4;4)

        String[][] arr = new String[][]{
                {String.valueOf(aa), String.valueOf(ab), String.valueOf(ac), String.valueOf(ad)},
                {String.valueOf(ba), String.valueOf(bb), String.valueOf(bc), String.valueOf(bd)},
                {String.valueOf(ca), String.valueOf(cb), String.valueOf(cc), String.valueOf(cd)},
                {String.valueOf(da), String.valueOf(db), String.valueOf(dc), }
        };

        try {
            try {
                int result;
                result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("\nThe size of the array is not complete!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("\nInvalid array value!");
            System.out.println("Cell error: " + (e.i+1) + "x" + (e.j+1));
        }
    }

    public static int method(final String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                    System.out.print(arr[i][j] + " ");
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
            System.out.print("\n");
        }
        return count;
    }
}

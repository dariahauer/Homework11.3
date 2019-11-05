public class Array {
    private int a;

    public Array(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public Array() {
    }

    public void setA(int a) {
        this.a = a;
    }

    public void displayMovedArray(int[] array, int N) {
        if (N <= 0) {
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        } else if (N > array.length) {
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
        } else
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i + N]);
            }

    }
}


 //   public int[] tablica(int tab[]) {
//        int wynik[] = new int[tab.length];
//        for (int i = 0, j = wynik.length - 1; i < tab.length; i++, j--)
//            tab[i] = w


//            public void displayMovedArray(int[] array, int N) {
//                int wynik[] = new  int [array.length];
//        if (N <= 0) {
//            for (int i = 0; i < array.length; i++)
//                System.out.println(array[i]);
//        } else if (N > array.length) {
//            for (int i = 0; i < array.length; i++)
//                System.out.println(array[i]);
//        } else for (int i=0,j=wynik.length - 1; i<array.length;i++, j--) {
//        //    int wynik[] = new  int [array.length];
//            System.out.println(array[i + N]);
//        }
//    }
//    public void displayMovedArray(int[] array, int N) {
//        if (N <= 0) {
//            for (int i = 0; i < array.length; i++)
//                System.out.println(array[i]);
//        } else if (N > array.length) {
//            for (int i = 0; i < array.length; i++)
//                System.out.println(array[i]);
//        } else for (int element : array) {
//            System.out.println(array[element + N]);
//        }
//    }




//    }






//
//    Zdefiniuj metodę, która przyjmuje dwa parametry:
//
//        tablicę liczb całkowitych,
//        liczbę N.
//        Metoda powinna zwrócić tablicę, w której elementy będą przesunięte o N pozycji
//        w prawo względem oryginału. Przykładowo dla tablicy [1, 2, 3, 4, 5] i argumentu 3,
//        metoda w wyniku powinna zwrócić tablicę z wartościami [3, 4, 5, 1, 2].
//        W klasie testowej przygotuj co najmniej dwie różne tablice i przetestuj działanie metody wyświetlając tablicę w oryginalnej oraz przesuniętej kolejności.
//
//        Ograniczenia:
//
//        metoda nie powinna modyfikować tablicy przekazanej jako argument (elementy w niej powinny pozostać w oryginalnej kolejności), zwrócona powinna być kopia tablicy.
//        jeżeli zamiast tablicy przekazano wartość null, to metoda powinna zwrócić null.
//        dla N >= długość_tablicy lub N <= 0, metoda powinna zwrócić oryginalną tablicę.

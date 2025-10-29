package ru.netology;

public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      //  1 Создаётся локальная переменная i типа int
                                        // Значение 1 записывается в стековый фрейм метода main
                                        //Это примитив, он не создаёт объект в heap// 1
        Object o = new Object();        // 2 В heap создаётся новый экземпляр java.lang.Object
                                        //В стеке (фрейм main) создаётся ссылка o, указывающая на этот объект в heap
                                        //Класс Object уже загружен → его метаданные в Metaspace
        Integer ii = 2;                 // 3 Создаётся новый стековый фрейм для метода printAll
                                        //В него копируются значения аргументов:
                                        //Ссылка o (копия указателя на тот же Object)
                                        //Значение i = 1 (примитив — копируется по значению)
                                         //Ссылка ii (копия указателя на Integer(2))
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6
    }
}

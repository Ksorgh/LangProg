class VarArgs {
    static void vaTest(int ... v){
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");
        for(int i = 0; i< v.length; i++)
            System.out.println(" аргумент " + i + ": " + v[i]);
        System.out.println();
    }
    static void vaTest2(String msg, int ... v){
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");
        System.out.println(" " + msg);
        for(int i = 0; i< v.length; i++)
            System.out.println(" аргумент " + i + ": " + v[i]);
        System.out.println();
    }
    static void vaTest2(String msg){
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(10);
        vaTest(10,20,30);
        vaTest2("Сообщение",10,20,30);
        vaTest2("Сообщение");
    }
}

//демонстрация перегрузки методов
class Overl {
    int s;
    Overl(){
        System.out.println("Внутри конструктора без параметров");
        s = 0;
    }
    Overl(int i){
        System.out.println("Внутри конструктора с одним целым параметром");
        s = i;
    }
    Overl(double i){
        System.out.println("Внутри конструктора с одним вещественным параметром");
        s = (int)i;
    }
    Overl(int i, int j){
        System.out.println("Внутри конструктора с двумя целыми параметром");
        s = i+j;
    }

    void ovlDemo(){
        System.out.println("Выполнение метода без параметра");
    }
    void ovlDemo(int a){
        System.out.println("Один параметр типа int: " + a);
    }
    int ovlDemo(int a, int b){
        System.out.println("Два параметра a и b типы int | a: "+a+" b: "+b);
        return a+b;
    }
    double ovlDemo(double a, double b){
        System.out.println("Два параметра типы double: "+ a + " " + b);
        return a+b;
    }
    void f(int x){
        System.out.println("Внутри f(int): "+ x);
    }
    void f(double x){
        System.out.println("Внутри f(double): "+ x);
    }
    void f(byte x){
        System.out.println("Внутри f(byte): "+ x);
    }
}

class Summation{
    int sum;
    Summation(int num){
        sum = 0;
        for(int i = 1; i <= num; i++){
            sum+=i;
            System.out.println(i);
        }
    }
    Summation(Summation ob){
        sum = ob.sum;
    }
}

class Overload{
    public static void main(String[] args) {
        Overl ob = new Overl();
        int resI;
        double resD;

        System.out.println();
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(6);
        System.out.println("Результат выполнения ob.ovlDemo(6)");
        ob.ovlDemo(3,7);
        System.out.println("Результат выполнения ob.ovlDemo(3,7)");
        resD = ob.ovlDemo(3.5,8.5);
        System.out.println("Результат выполнения ob.ovlDemo(3.5,8.5): " + resD);

        //автоматическое преобразование типов при перегрузке
        System.out.println();
        int i = 10;
        double d = 99.9;
        byte b = 30;
        short s = 23;
        float f = 11.2F;
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);

        System.out.println();
        
        //демонстрация перегрузки конструкторов
        Overl t1 = new Overl();
        Overl t2 = new Overl(1);
        Overl t3 = new Overl(2.1);
        Overl t4 = new Overl(1,5);
        System.out.println("t1.s: " + t1.s);
        System.out.println("t2.s: " + t2.s);
        System.out.println("t3.s: " + t3.s);
        System.out.println("t4.s: " + t4.s);
        
        //демонстрация инициализации одного обьекта на основе другого

        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
class TwoDShape {
    private double width;
    private double height;
    String name;
    TwoDShape(double w, double h) {
        if(h>29.7)
            height = 29.7;
        else    
            height = h;
        if(w>21.0)
            width = 21.0;
        else
            width = w;
        name = "Двумерная фигура";
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        if(w>21.0)
            width = 21.0;
        else
            width = w;
    }
    void setHeight(double h){
        if(h>29.7)
            height = 29.7;
        else    
            height = h;
    }
    void showDim() {
        System.out.println("Размер фигуры: " + width + " x " + height);
    }
}

class Triangle extends TwoDShape {
    String style;
    Triangle(String s, double w, double h) {
        super(w, h);//вызов конструктора супер класса
        style = s;
        name = "Треугольник";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Стиль: " + style);
    }
    String showSuperName(){
        return super.name;
    }
}

class Rectangle extends TwoDShape {
    String outLine;
    Rectangle(String o, double w, double h) {
        super(w, h);//вызов конструктора супер класса
        outLine = o;
        name = "Прямоугольник";
    }
    double area() {
        return getWidth() * getHeight();
    }
    boolean isSquare() {
        return getWidth() == getHeight();
    }
    String showSuperName(){
        return super.name;
    }
}

class Inheritance {
    public static void main(String[] args) {
        TwoDShape fig1 = new TwoDShape(20.0, 30.0);
        Triangle t1 = new Triangle("Закрашенный", 4.5, 7.0);
        Triangle t2 = new Triangle("Контурный", 3.5, 8.0);
        Rectangle r1 = new Rectangle("Сплошная линия", 5.0, 5.0); 
        Rectangle r2 = new Rectangle("Пунктирная линия", 5.0, 7.0);
        System.out.println("Информация об обьектах");
        System.out.println("fig1: " + fig1.name);
        fig1.showDim();
        System.out.println("t1: " + t1.name);
        t1.showStyle();
        System.out.println("Площадь: " + t1.area()); 
        System.out.println(t1.showSuperName());//вывод name из super
        System.out.println();
        System.out.println("r1: " + r1.name);
        System.out.println("Квадрат: " + r1.isSquare());
        System.out.println("Площадь: " + r1.area());
        //проверка доступности переменных
        /* 
        System.out.println(fig1.width);
        System.out.println(t1.width); //подкласс имеет доступ к переменным и методам суперкласса
        System.out.println(fig1.style);//супер класс не имеет доступа к переменным описаных в подклассе
        */   
    }
}

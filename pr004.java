//передача обьектов в качестве аргументов и возвращение обьектов методами
class Block {
    private int a,b,c;
    private int v;

    public Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        v = a*b*c;
    }

    public boolean sameBlock(Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c))
            return true;
        else    
            return false;
    }

    public boolean sameV(Block ob){
        if(ob.v == v)
            return true;
        else
            return false;
    }
}

class ByValue {
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
    
}

class ByRef {
    int a,b;
    ByRef(int i, int j){
        a = i;
        b = j;
    }
    void  change(ByRef ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
    
}

class ErrorMsg{
    String[] msg = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Переполнение диска",
        "Выход индекса за границы массива"
    };
    //Пример возврата обьекта в виде строки
    String getErrorMsg(int i){
        if(i > 0 & i < msg.length)
            return msg[i];
        else return "Неизвестная ошибка";
    }
}

class Err{
    String msg;
    int severity;
    Err(String m, int s){
        msg = m;
        severity = s;
    }
}
class ErrorInfo{
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Переполнение диска",
        "Выход индекса за границы массива"
    };
    int[] howBad = {3,3,2,4};
    Err getErrorInfo(int i){
        if(i>=0 & i<msgs.length)
            return new Err(msgs[i], howBad[i]);
        else    
            return new Err("Неизвестная ошибка", 0);
    }
}


class pr004 {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(5, 4, 5);
        System.out.println("об1 эквивалентен ob2: " + ob1.sameBlock(ob2));
        System.out.println("об1 эквивалентен ob3: " + ob1.sameBlock(ob3));
        System.out.println("Обьем об1 эквивалентен обьему ob2: " + ob1.sameV(ob3));

        //пример передачи параметров по значению
        ByValue ob4 = new ByValue();
        int a = 15, b = 20;
        System.out.println("a и b перед вызовом методе noChange(): " + a + " " + b);
        ob4.noChange(a, b);
        System.out.println("a и b после вызова метода noChange(): " + a + " " + b);
        //значения a и b после вызова метода не изменяются
        System.out.println();


        //пример передачи параметров по ccылке
        ByRef ob5 = new ByRef(15, 20);
        System.out.println("a и b перед вызовом методе change(): " + ob5.a + " " + ob5.b);
        ob5.change(ob5);
        System.out.println("a и b после вызова метода change(): " + ob5.a + " " + ob5.b);
        //значение a и b внутри ob5 меняются методом change()
        System.out.println();

        //демонстрация строки методом
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(10));
        System.out.println();
        //демонстрация возврата методом обьекта сконструированного из строки и int

        ErrorInfo err2 = new ErrorInfo();
        Err e;
        e = err2.getErrorInfo(2);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity); 
        e = err2.getErrorInfo(10);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity);
    }
    
}

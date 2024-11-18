class AccesDemo{
    private int alpha; //переменная с закрытым доступом
    public int beta; //открытый доступ
    int gamma; //доступ по умолчанию

    //метод доступа к закрытой переменной
    public void setAlpha(int a){
        if(a <= 100)
            alpha = a;
        else
            System.out.println("Значение превышает допустимую границу");
    }
    public int getAlpha(){
        return alpha;
    }
}

class FailSoftArray {
    private int[] a;
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }
    public int get(int index){
        if(indexOK(index)) 
            return a[index];
        return errval;
    }

    public boolean put(int index, int val){
        if(indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index){
        if(index >= 0 & index < length) return true;
        return false;
    }
}

class Modif {
    public static void main(String[] args) {
        AccesDemo ad = new AccesDemo();
        ad.beta = 99;
        ad.gamma = 99;

        ad.setAlpha(199);
        System.out.println(ad.getAlpha());
        ad.setAlpha(99);
        System.out.println(ad.getAlpha());
        
        //использование отказаустойчивого массива
        System.out.println();
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println("Вывод значений без сообщений об ошибках");
        for(int i=0; i < (fs.length * 2); i++)
            fs.put(i, i*10);
        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x!=-1) System.out.println(x + " ");
        }
        System.out.println();

        System.out.println("Вывод значений c сообщениями об ошибках");
        for(int i=0; i < (fs.length * 2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Индекс " + i + " выходит за границы массива");
        for(int i=0; i < (fs.length * 2); i++){
            x = fs.get(i);
            if(x!=-1) System.out.println(x + " ");
            else 
                System.out.println("Индекс " + i + " выходит за границы массива");
        }
        System.out.println();

    }
}

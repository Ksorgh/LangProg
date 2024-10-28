class Cars{
    int pass; //пасажиры
    int volume; //емкость бака
    double fuel; //расход топлива на 100
    void range(){
        System.out.println("Проедет на полном баке: " + (volume/fuel*100) + " км");
    }
    double range2(){
        return volume/fuel*100;
    }
    double range3(int x){
        return x/fuel*100;
    }
}

class pr003{
    public static void main(String[] args){
        double range;
        Cars Honda = new Cars();
        Honda.pass = 2;
        Honda.volume = 55;
        Honda.fuel = 20.0;
        Cars BMW = new Cars();
        BMW.pass = 5; 
        BMW.volume = 40;
        BMW.fuel = 15.5;

        System.out.println("Параметры Хонды:");
        System.out.println("Колличество пассажиоров: " + Honda.pass);
        System.out.println("Обьем бака: " + Honda.volume + " | Расход топлива: " + Honda.fuel);
        Honda.range();
        
        System.out.println("----------------------------------------------------------------");

        System.out.println("Параметры БМВ:");
        System.out.println("Колличество пассажиоров: " + BMW.pass);
        System.out.println("Обьем бака: " + BMW.volume + " | Расход топлива: " + BMW.fuel);
        System.out.println("Проедет на полном баке: " + BMW.range2() + " км");
        System.out.println("Проедет на 13 литров: " + BMW.range3(13) + " км");
    }
}
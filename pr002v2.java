
class pr002v2 {
    public static void main(String[] args) 
        throws java.io.IOException {
        

        boolean bool = false;


        if (!bool)
            System.out.println("bool = true");
        else
            System.out.println("bool = false");       
        System.out.println("\n");
        
        for (int i = 0, j=10; i < j; i++ , j--)
            System.out.println("i and j: " + i + " " + j);
    
        for(int i=0; i<10;) {
            System.out.println("Prohod №" + i);
            i++;
        }

        //бесконечный цикл
        //for(;;);
        int sum=0;
        for(int i=1; i<5; sum += i++);
        System.out.println("\nSumma ravna: " + sum);

        System.out.println("\n");

        char ch1='a';
        while(ch1 <= 'z'){
            System.out.println(ch1 + " ");
            ch1++;
        }



     /*   char ch2;
        do{
            System.out.println("Vvedite simvol i nazmite \"Return\": ");
            ch2 = (char)System.in.read();
        } while (ch2 != 'q'); */

        
        System.out.println();
        for(int i=0; i<100; i++){
            System.out.println("Значение i: " + i);
            if(i == 5)
                break;
            System.out.println("Следующая итерация");
        }

        System.out.println();
        for(int i =0; i<3; i++){
            System.out.println("Счетчик внешнего числа: " + i);
            System.out.print("Счетчик внутреннего числа: ");
            int t = 0;
            while(t<100){
                if(t==10)
                    break;
                System.out.print(t + " ");
                t++;
            }
        }
        System.out.println();
        
        int i2;
        for(i2=1;i2<4;i2++){
one:    { 
two:        {   
three:          {
                    System.out.println("\n i2 равно " + i2);
                    if(i2==1) break one;
                    if(i2==2) break two;
                    if(i2==3) break three;

                    System.out.println("Не выполняется");
                }
                System.out.println("После блока 3");
            }
            System.out.println("После блока 2");
        }
        System.out.println("После блока 1");
        }
        System.out.println("После цикла for");


        System.out.println();
done:
        for(int i=0; i<10; i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    System.out.println(k + " ");
                    if(k == 5) break done;
                }
                System.out.println("После цикла k");
            }
            System.out.println("После цикла j");
        }
        System.out.println("После цикла i");
        System.out.println();

        for(int i=0;i<100;i++){
            if((i%2)!=0)
                continue;
            System.out.println(i);
        }
outerloop:
            for(int i=1;i<10;i++){
                System.out.print("\nПроход внешнего цикла №" + i + ", внутренний цикл: ");
                for(int j=1;j<10;j++){
                    if(j==5) continue outerloop;
                    System.out.println(j);
                }
            }
            System.out.println();
    }   
}

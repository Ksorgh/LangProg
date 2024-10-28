
class Help {
    public static void main(String[] args) 
        throws java.io.IOException {
        
        char choice;
        boolean bool = false;
        System.out.println("Spravocnaya systema po operatoram:");
        System.out.println("  1. if");
        System.out.println("  2. Switch");
        System.out.print("Choose number razdela: ");
        
        choice = (char)System.in.read();
        
        System.out.println("\n");
        switch(choice) {
            case '1':
                System.out.println("Operator \"IF\":\n");
                System.out.println("if(yslovie) operator; ili {blok operatorov}");
                System.out.println("else operator; ili {blok operatorov}");
                break;
            case '2':
                System.out.println("Operator \"Switch\":\n");
                System.out.println("switch(virazhenie) {");
                System.out.println("    case \"Const\":");
                System.out.println("        posledovatelnost operatorov");
                System.out.println("        break;");
                System.out.println("        // ...");
                System.out.println("}");
                break;      
            default:
                System.out.println("Nepravilno ykazan nomer razdela");
        }

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
        System.out.printl("\nSumma ravna: " + sum);

        System.out.println("\n");

        char ch1='a';
        while(ch1 <= 'z'){
            System.out.print(ch1 + " ");
            ch1++;
        }
        System.out.println();
        System.out.println(((int) 'a') + " " + ((int) "z"));


        char ch2;
        do{
            System.out.println("Vvedite simvol i nazmite \"Return\": ");
            ch2 = (char)System.in.read();
        } while (ch2 != 'q');
        int result = func1();
        
    }   
}
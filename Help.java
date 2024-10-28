class Help {
    public static void main(String[] args) 
        throws java.io.IOException {
        
        char choice, ignore;
        boolean bool = false;
        do{
            System.out.println("Spravocnaya systema po operatoram:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. for");
            System.out.println("  4. while");
            System.out.println("  5. do-while");        
            System.out.print("Choose number razdela: ");
            choice = (char)System.in.read();
            do{
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '5');
        


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
            case '3':
                System.out.println("Operator \"for\":\n");
                System.out.println("for(yslovie)");
                System.out.println("operator; ili {blok operatorov}");
                break;  
            case '4':
                System.out.println("Operator \"while\":\n");
                System.out.println("while(yslovie); {operatori}");
                break;  
            case '5':
                System.out.println("Operator \"do-while\":\n");
                System.out.println("do{");
                System.out.println("operatori");
                System.out.println("}while(yslovie)");               
                break;  
        }

         
}}
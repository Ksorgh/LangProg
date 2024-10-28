class H{
    void helpOn(int what){
        switch(what) {
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
            case '6':
                System.out.println("Operator \"break\":\n");
                System.out.println("break; или break метка;");
                break; 
            case '7':
                System.out.println("Operator \"continue\":\n");
                System.out.println("continue; или continue метка;");
                break; 
        }
        System.out.println();
    }
    void ShowMenu(){
        System.out.println("Spravocnaya systema po operatoram:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("  3. for");
        System.out.println("  4. while");
        System.out.println("  5. do-while");    
        System.out.println("  6. do-while");      
        System.out.println("  7. do-while");  
        System.out.print("Choose number razdela или нажмите \"q\" для выхода ");
    }
    boolean isValid(int ch){
        if(ch < '1' | ch > '7' & ch != 'q')
            return false;
        else return true;
    }
}
class Help {
    public static void main(String[] args) 
    throws java.io.IOException {
        
    char choice, ignore;
        H helpObj = new H();
        for(;;){
            do{
                helpObj.ShowMenu();
                choice = (char) System.in.read();
                do{
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            } while (!helpObj.isValid(choice));
            if (choice == 'q') break;
            }
            System.out.println('\n');
            helpObj.helpOn(choice);

        } 
}

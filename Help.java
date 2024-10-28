
class Help {
    public static void main(String[] args) 
        throws java.io.IOException {
        
        char choice;
        
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
        
    }
}
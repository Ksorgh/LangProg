import java.util.Random;
class bits {
    public static void main(String[] args) {
        Random rand = new Random();
        //сброс 6-го бита, изменение регистра латиницы
        char ch;
        System.out.println("Преоброзование букв из нижнего в верхний");
        for(int i = 0;i<26;i++){
            ch = (char)('a' + i);
            System.out.print(ch + " ");
            ch = (char)((int) ch & 65503);
            System.out.println(ch);
        }
        System.out.println();


        //отображение числа в двоичной форме
        int t;
        byte val;
        val = 32;
        for(t=val;t>0;t=t/2){
            if((val&t)!=0) 
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println("\n");

        //Преобразование букв из верхнего регистра в нижний
        System.out.println("Преоброзование букв из верхнего регистра в нижний");
        for(int i = 0;i<26;i++){
            ch = (char)('A' + i);
            System.out.print(ch + " ");
            ch = (char)((int) ch | 32);
            System.out.println(ch);
        }

        System.out.println();
        //Шифрование сообщения при помощи операции "Исключаизее ИЛИ"
        String msg = "Незашифрованная строка";
        String encmsg = "";
        String decmsg = "";
        int key = rand.nextInt(127);
        System.out.println("Ключ: " + key);
        System.out.println("Исодное сообщение: " + msg);

        //шифрование
        for(int i = 0; i<msg.length();i++)
            encmsg = encmsg + (char)(msg.charAt(i)^key);
        System.out.println("Закодированное сообщение: " + encmsg);

        //расшифрование
        for(int i = 0; i<msg.length();i++)
            decmsg = decmsg + (char)(encmsg.charAt(i)^key);
        System.out.println("Декоддированое сообщение: " + decmsg);

        System.out.println();

        //операция "побитовое НЕ"
        byte b = -34;
        for(int t2=128;t2>0;t2=t2/2){
            if((b&t2)!=0) 
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();
        b = (byte) ~b;
        for(int t2=128;t2>0;t2=t2/2){
            if((b&t2)!=0) 
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        //побитовый сдвиг
        int val2 = 1;
        for(int i=0;i<8;i++){
            for(int t2=128;t2>0;t2=t2/2){
                if((val2&t2)!=0) 
                    System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val2 = val2 << 1;//сдвиг влево
        }
        System.out.println();
        for(int i=0;i<8;i++){
            for(int t2=128;t2>0;t2=t2/2){
                if((val2&t2)!=0) 
                    System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val2 = val2 >> 1;//сдвиг влево
        }
        System.out.println();
    }
}

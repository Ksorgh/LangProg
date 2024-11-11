class Strings{
    public static void main(String[] args){
        String str = new String("Строка номер один");
        String str2 = new String(str);
        String str3 = "Строка номер три";

        System.out.println(str + " | " + str2 + " | " + str3);
        System.out.println();
        //методы работающие со строками
        //1. проверка на эквивалентность boolean equals(str)
        boolean eq;
        if(eq = str.equals(str2) == true) 
            System.out.println("Строки str и str2 совпадают");
        else
            System.out.println("Строки str и str2 не совпадают");

        if(eq = str.equals(str3) == true) 
            System.out.println("Строки str и str3 совпадают");
        else
            System.out.println("Строки str и str3 не совпадают");
        System.out.println();

        //2. метод длины строки str.length() 
        System.out.println("Длига строки str: " + str.length());  
        System.out.println("Длига строки str: " + str2.length()); 
        System.out.println("Длига строки str: " + str3.length()); 
        System.out.println();

        //3. Извлечение символа по индексу str.charAt(inted)
        System.out.println("Под индексом 3 в строке str: " + str.charAt(3)); 
        System.out.println("Под индексом 4 в строке str2: " + str2.charAt(4)); 
        System.out.println("Под индексом 5 в строке str3: " + str3.charAt(5)); 
        System.out.println();

        for(int i = 0; i<str.length(); i++)
            System.out.print(str.charAt(i));
        System.out.println();

    }
}
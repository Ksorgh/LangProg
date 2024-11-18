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

        //4. сравнение строк 
        System.out.println("Результат сравнение строк str и str2: " + str.compareTo(str2));
        System.out.println("Результат сравнение строк str и str3: " + str.compareTo(str3));
        System.out.println();

        //5. Поиск подстроки и вывод индекса по первому вхождению
        str3 = "од";
        System.out.println("Первое вхождение подстроки \"од\" в str: " + str.indexOf(str3));

        //6. Поиск подстроки и вывод индекса по первому вхождддению строки

        str3 = "н";
        System.out.println("Последнее вхождение подстроки \"н\" в str: " + str.lastIndexOf(str3));
        str3 = "три";
        System.out.println("Последнее вхождение подстроки \"три\" в str: " + str.lastIndexOf(str3));
        System.out.println();


        //массивы  строк
        String[] strs = {"Разные","элементы","массива","строк","Строка номер один"};
        System.out.println("Исходный массик: ");
        for(String s : strs) 
            System.out.println(s + " ");
        System.out.println("\n");
        strs[1] = "измененные элементы";
        strs[4] = "Новая строка один";
        for(String s : strs) 
            System.out.println(s + " ");
        System.out.println("\n");

        //создание подстроки
        String substr;
        System.out.println("Выделяем подстроку из строки str: ");
        substr = str.substring(13, 17);
        System.out.println("Оригинальная строка: " + str);
        System.out.println("Подстрока: " + substr); 
        System.out.println();
        //управление оператором switch при помощи строк
        String command = "cancel";
        switch (command) {
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неизвестная команда");
                break;
        }
        System.out.println();
        //текстовые блоки
        String strblk = """
        Пример блока с нестандартным 
            форматирование строк. 
                Можно пользоваться переносом строки
                    табуляцией и прочими управляющими символами.
                """;
        System.out.println(strblk);
        System.out.println();
        


        //аргументы командной строки
        System.out.println("Колличество параметров переданных программе: " + args.length);
        if (args.length > 0){
            System.out.println("Список параметров: ");
            for (int i = 0; i < args.length; i++)
                System.out.print("Аргумент["+i+"]:" + args[i] + " ");
        }
        else{
            System.out.println("Параметы небыли переданы");
        }



        String[][] phoneNumbers = {
            {"Авторемонт", "262-25-01"},
            {"Деканат", "262-25-02"},
            {"Поликлиника", "262-25-03"},
            {"Сантехник", "262-25-04"}
        };
        int i2;
        if(args.length != 1)
            System.out.println("Usage java Strings <наименование>");
        else{
            for(i2 =0; i2<phoneNumbers.length; i2++){
                if(phoneNumbers[i2][0].equals(args[0])){
                    System.out.println(phoneNumbers[i2][0] + ": " + phoneNumbers[i2][1]);
                    break;
                }
            }
            if(i2==phoneNumbers.length)
                System.out.println("Ничего не найдено");
        }




    }
}
//работа с массивами
class Arrays {
    public static void main(String[] args){
        int [] nums = new int[10];
        //заполнение массива значениями
        for(int i = 0; i < 10; i++)
           nums[i] = i;
        //вывод
        for(int i = 0; i < 10; i++)
            System.out.println("Элемент nums [" + i + "]: " + nums[i]);
        System.out.println();

        //ввод элементов вручную
        nums[0] = 32;
        nums[1] = -42;
        nums[2] = 1132;
        nums[3] = 320;
        nums[4] = 3212;
        nums[5] = 3421;
        nums[6] = 512;
        nums[7] = -5235;
        nums[8] = -24;
        nums[9] = 97;
        
        //находим максимальное и минимальное значение
        int max,min;
        min = max = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i]<min) min = nums[i];
            if (nums[i]>max) max = nums[i];
        }

        System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
        System.out.println();

        //алтернативная форма инициализации массива
        int x = 10;
        int[] nums1 = {32,-42,1132,53,124,94,x,-522,-10,11};
        
        min = max = nums1[0];
        for(int i = 1; i < 10; i++){
            if(nums1[i]<min) min = nums1[i];
            if (nums1[i]>max) max = nums1[i];
        }
        System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
        System.out.println();

        //двумерные массивы
        int t,j;
        int [][] table = new int[3][4];
        for(t=0;t<3;t++){
            for(j=0;j<4;j++){
                table[t][j] = (t*4) + j + 1;
                System.out.print(table[t][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        //непрямоугольные массивы
        int [][] riders = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        for(int i=0;i<5;i++)
            for(int k=0;k<10;k++)
                riders[i][k]= i + k + 10;
        for(int i = 5; i < 7; i++)
            for(int k=0;k<2;k++)
                riders[i][k]= i + k + 10;

        //вывод массива:
        System.out.println("Перевезено пассажиров в будние дни: ");
        for(int i=0;i<5;i++){
            for(int k=0;k<10;k++)
                System.out.print(riders[i][k] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Перевезено пассажиров в выходные дни: ");
        for(int i = 5; i < 7; i++){
            for(int k=0;k<2;k++)
                System.out.print(riders[i][k] + " ");
            System.out.println();
        }
        System.out.println();

        //Инициализация дввумерного массива
        int [][] sqrs = {
            {1, 1},
            {2, 4},
            {3, 9},
            {4, 16},
            {5, 25},
            {6, 36},
            {7, 49},
            {8, 64},
            {9, 81},
            {10, 100}
        };
        System.out.println("Содержимое двумерного массива sqrs: ");
        for(int i=0;i<10;i++){
            for(int k=0;k<2;k++)
                System.out.print(sqrs[i][k] + "\t");
            System.out.println();
        }
        System.out.println();    


        //Обьявление массива int[] nums = new nums[3]
        //альтернативный способ int nums[] = new nums[3]

        //ссылочные переменные, указывающие на массивы
        int[] nums2 = new int[10]; 
        int[] nums3 = new int[10]; 

        for(int i=0;i<10;i++){
            nums2[i]=i;
            nums3[i]=-i;
        }
        System.out.print("Массив nums2: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums2[i] + "\t");
        System.out.println(); 
        System.out.print("Массив nums3: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums3[i] + "\t");
        System.out.println(); 
       
        nums2[3] = 99;
        System.out.println("Меняется значение только у nums2[]: "); 
        System.out.print("Массив nums2: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums2[i] + "\t");
        System.out.println(); 
        System.out.print("Массив nums3: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums3[i] + "\t");
        System.out.println();
        System.out.println("Выполняем присваивание nums3=nums2");
        nums3=nums2;
        nums3[3] = -99;
        System.out.println("nums2 и nums3 теперь указываюь на один и тот же массив: "); 
        System.out.print("Массив nums2: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums2[i] + "\t");
        System.out.println(); 
        System.out.print("Массив nums3: "); 
        for(int i=0;i<10;i++) 
            System.out.print(nums3[i] + "\t");
        System.out.println();    
        System.out.println();  

        //переменная экземпляра length
        int[] list = new int[10];
        int[] nums4 = {1,2,3};
        int[][] table1 = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        System.out.println("Длина list: " + list.length);
        System.out.println("Длина nums4: " + nums4.length);
        System.out.println("Длина table1: " + table1.length);
        System.out.println("Длина table1[0]: " + table1[0].length);
        System.out.println("Длина table1[1]: " + table1[1].length);
        System.out.println("Длина table1[1]: " + table1[2].length);
        System.out.println();

        //цикл for-each
        System.out.println();
        int[] nums5 = {1,2,3,4,5,6,7,8,9,10,11,12};
        int sum = 0;
        for(int x1 : nums5){
            System.out.println("Значение: " + x1);
            sum += x1;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println();
        //подсчет суммы элементов в дву массиве
        int sum1 = 0;
        int[][] num6 = new int[3][5];

        for(int i = 0; i<num6.length; i++)
            for(int j1=0;j1<num6[i].length;j1++)
                num6[i][j1] = (i+1)*(j1+1);
        
        for(int[] x1 : num6)
            for(int y : x1){
                System.out.println("Значения: " + y);
                sum1+=y;
            }
        System.out.println("Сумма: " + sum1);
        System.out.println();

        //поиск при помощи for-each
        int val = 9;
        boolean found = false;
        
        for(int x1 : nums5){
            if(x1 == val){
                found = true;
            break;
            } 
        }
        if(found)
            System.out.println("Значение " + val + " найдено");
        else
            System.out.println("Значение " + val + " не найдено");
    }
}
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
        for(int i = 1; i < 10; i++){
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

    }

}
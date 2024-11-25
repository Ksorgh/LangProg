import java.util.Random;

class Quicksort {
    static void qsort(char[] items) {
        qs(items, 0 ,items.length-1);
    }

    private static void qs(char[] items, int left, int right){
        int i,j;
        char x,y;
        i = left; j =right;
        x = items[(left+right)/2];
        do{
            while((items[i]<x)&&(i<right)) i++;
            while ((x<items[j])&& (j>left)) j--;
            if(i <= j){
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            } 
                
            
        } while (i<=j);
        if(left<j) qs(items,left,j);
        if(i<right) qs(items,i,right);
    }
}

class QSDemo{
    public static void main(String[] args) {
        char[] a = {'d','a','f','e','z','k','w','f','c','m','w'};
        int i;
        System.out.println("Исходный массив");
        for(i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println("\n");
        Quicksort.qsort(a);
        System.out.println("Отрисованный массив");
        for(i=0;i<a.length;i++)
            System.out.print(a[i]);
        System.out.println();

        char[] b = new char[100000];
        Random rand = new Random();
        for (i=0;i<b.length;i++)
            b[i] = (char)(rand.nextInt(75) + 48);
        System.out.println("Отсортированный массив массив b первые 200");
        Quicksort.qsort(b);
        for(i=0;i<200;i++)
            System.out.print(b[i]);
        System.out.println("\n");

        System.out.println("Отсортированный массив массив b последние 200");
        for(i=98000;i<b.length;i++)
            System.out.print(b[i]);
        System.out.println("\n");

    }
}
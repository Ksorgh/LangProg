class pr001{
	public static void main(String args[]){
		System.out.println("Hello, world");
		//Преоброзование типов
		//Целые типы данныъ:
		byte b; // 8 бит
		b = -128;
		b = 127;
		b = (byte)130;
		short sh; // 16бит
		sh = (short)65536;
		
		int intg; // 32бит
		intg = 2000000;
		
		intg = intg*intg*intg;
		
		long l; //64бит
		l = intg/10;
		l = l*l*l;
		System.out.println(l);
		//Вещественные типы
		float f;  //32 бит
		double dd; //64 бит
		dd = 1.5;
		intg = (int)dd;
		intg = 10/3;
		f = intg;
		System.out.println(intg + " " + dd);

		//Символьный тип данных
		char ch; //16 бит
		ch = 'A';
		ch++;
		System.out.println(ch);
		++ch; System.out.println(ch);
		for (int i=0; i <=65; i++){
			System.out.print(ch++ + " ");
		}
		System.out.println();
		//Логический тип
		boolean bool, bool1 = false; //1 бит
		bool = true;
		System.out.println(!bool);
		System.out.print(bool & bool1);
		System.out.print(bool | bool1);


	}
}

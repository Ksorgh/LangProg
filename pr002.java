class pr002{
	public static void main(String args[])
	throws java.io.IOException{
		int intg = 10, intgr = 20;
		boolean bool;	
		char ch, answer = 'R';
		System.out.print("Choose the latter");
		ch = (char)System.in.read();
		System.out.println();
		if (ch == answer)
			System.out.println("Correct answer!");
		else{
			System.out.println("InCorrect answer! Choose ");
			if (ch < answer) System.out.print("hier, than typed");
			else System.out.print("lower, than typed");
		}

		
		for(int i = 0; i<10 ;i++)
			switch(i){
				case 0:
					System.out.println("i = 0");
					break;                                
                                case 1:
                                        System.out.println("i = 1");
                                        break;
                                case 2:
                                        System.out.println("i = 2");
                                        break;
                                case 3:
                                        System.out.println("i = 3");
                                        break;
                                case 4:
                                        System.out.println("i = 4");
                                        break;
				default:
					System.out.println("i = 5 or more than 5");


			}
	



	}
}


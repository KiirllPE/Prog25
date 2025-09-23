class Pr006 {
	public static void main(String arps[]) {
		//Оператор switch
		System.out.println("\nДемонстарция работы оператора switch()");
		int i = 0;
		for(i=0; i <10; i++)
			switch(i) {
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
					System.out.println("i >=5");


				
			}
		//Вложенные операторы switch
		System.out.println();
		char ch = 'R';
		char ch1 = 'A';
		switch(ch) {
			case 'A': System.out.println("Значение A внешнего оператора switch");
				  switch(ch1) {
					  case 'A': 
						  System.out.println("Значение A внутреннего оператора switch");
						  break;

				  }
				  break;
			case 'R':
				  System.out.println("Значение A внешнего оператора switch");
				     switch(ch1) {      
				      	  case 'A':  
						  System.out.println("Значение A внутреннего оператора switch");
						  break;
				     }
				     break;
			default:
				     System.out.println("Значение по умолчанию для внешнего  switch");
		}

		//Оператор цикла for
		System.out.println();
		double num, sroot, rerr;

		for (num =1.0; num <100.0; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень из " + num + "равен" + sroot);

			//вычисление ошибки округления
			rerr = num - (sroot * sroot);
			System.out.println("Ошибка округления: " + rerr);
			System.out.println();
		}

	}
}


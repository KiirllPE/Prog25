class Pr006 {
	public static void main(String arps[])
	  throws java.io.IOException {

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

		System.out.println();
		int x, j;
		for(x = 100; x > -100; x -= 5)
			System.out.println(x);

		System.out.println("\nПример цикла, тело которого не выполняется ни разу");
		for(x = 100; x > 100; x -= 5)
			 System.out.println(x);
		System.out.println("После цикла for");

		System.out.println();

		for(i=0, j=10; i < j; i++, j--) 
			System.out.println("i =  " + i + "j = " + j);

		char temp=' ';
		System.out.print("Введите символ с клавиатуры: ");
		ch = (char) System.in.read();
		System.out.println("введите символ" + ch);
		for (;temp != '\n';)
			temp = (char) System.in.read();





		//Чтение символов с клавиатуры внутри цикла for
		System.out.println("\nВведите \'s\' для остановки цикла чтения с клавитуры");
		for(i=0; (char) System.in.read() != 'S'; i++) {
			System.out.println("Итерация №" + i);
			System.out.print("Введите символ: ");
			temp = (char) System.in.read();
		}
		System.out.println();
		
		//Пропуск отдельных частей в определении цикла for		
		for(i=0; i<10;) {
			System.out.println("Итерация №" + i);
			i++;
		}

		//Бесконечный цикл
		for(;;) {
			System.out.println("Итерация");
			temp = (char) System.in.read();
			if (temp == 'q')
				break;
		}

		//Циклы без тела
		System.out.println();
		int sum = 0;
		for (i = 1; i <= 5; sum += i++);
		System.out.println("Значение sum: " + sum);

	  	//Объявление параметра цикла внутри цикла
		for(int ii=1; ii <= 10; sum += ii++);
		System.out.println("Значение sum: " + sum);
		//System.out.println("Значние ii:" + ii);
		
	}
}


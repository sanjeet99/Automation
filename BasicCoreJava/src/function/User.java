package function;

public class User {

	public static void main(String[] args) 
	{
		System.out.println(car.wheels);
		car.testdrive();
		
		car.wheels=5;             // in output applicable on other two cars too bcoz its static.
		//call Non static functions and variable
		car Renault= new car();
		Renault.colour="Black";
		Renault.model="Don't know";
		Renault.specification();
		
		car BMW= new car();
		BMW.colour="White";
		BMW.model="X1";
		BMW.specification();
		
		car Jaguar= new car();
		//Jaguar.colour="Wine";
		Jaguar.model="XJ";
		Jaguar.specification();
		
		Renault.specification();

	}

}

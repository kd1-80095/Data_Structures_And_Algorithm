package com;

public class Main {

	public static void sortSalary(Employee emp[],int size)
	{
		for(int i=0;i<(size-1);i++)
		{
			for (int j = i+1;j<size;j++)
			{
				if(emp[i].getSalary() > emp[j].getSalary())
				{
					Employee temp = emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[5];
		
		emp[0]=new Employee(1,"Manas",25360);
		emp[1]=new Employee(2,"Aniket",90600);
		emp[2]=new Employee(3,"Prathamesh",9846);
		emp[3]=new Employee(4,"Anil",47890);
		emp[4]=new Employee(5,"Atish",65820);
		
		for(Employee e :emp)
		{
		System.out.println("Before Sort:"+ e);
		}
		sortSalary(emp,emp.length);	
		System.out.println();
		for(Employee e :emp)
		{
			System.out.println("After Sort:"+ e);
		}
	}

}

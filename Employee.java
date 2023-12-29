package CollectionEx;
  
 class User{
	public int id; //initialization
	public	String Name;
	
	public User(int id,String name) {// parameterized Constructor
		this.id=id;
		this.Name=name;
		System.out.println("id: "+id+" name: "+name);
		
	}
}

class Emp extends User{
	
	double sallary=2000.0;
	public Emp(int id, String name) {
		super(id, name);
		
	}
	
	public void Sallary() { //method 
	     double ss=sallary*12;
	     System.out.println("Annual Sallary : "+ss);
	}
	
}

class Employee{
	public static void main(String[] args) {
		
		Emp e=new Emp(1,"Arpit");
		e.Sallary();
		
		
	}
}
















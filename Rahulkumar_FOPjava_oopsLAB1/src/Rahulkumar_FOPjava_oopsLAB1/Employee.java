package Rahulkumar_FOPjava_oopsLAB1;

public class Employee {
	
		private String firstname;
		private String lastname;
		
		public Employee() {
			
		super();
		}
		

		public Employee(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname  = lastname;
		}
		
		public String getfirstname() {
			return firstname;
		}
		public void setfirstname(String firstname){
			this.firstname=firstname;
			
		}

		public String getlastName() {
			return lastname;
		}
		
		public void setlastname(String lastname) {
			this.lastname=lastname ;
			
		}
}

		
		

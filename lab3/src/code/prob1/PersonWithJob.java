package code.prob1;

public class PersonWithJob {
	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof PersonWithJob)) return false;

		PersonWithJob p = (PersonWithJob)aPerson;
        return this.person.getName().equals(p.person.getName()) &&
                this.getSalary()==p.getSalary();
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);

		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); // true
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); // true


	}


}

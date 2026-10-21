package PassingReturning;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = PersonHelper.createPerson();
		PersonHelper.showPersonDetails(p1);
		System.out.println("------------------");
		
		Person p2 = PersonHelper.createPerson();
		PersonHelper.showPersonDetails(p2);
    }
    
}

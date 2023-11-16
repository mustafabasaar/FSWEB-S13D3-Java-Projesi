public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String email;
    boolean isStudent;


    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String address, String email, boolean isStudent) {
        // Constructor chaining by calling the first constructor
        this(firstName, lastName, age);

        // Setting additional parameters
        this.address = address;
        this.email = email;
        this.isStudent = isStudent;
    }

public String getFirstName(){
        return firstName;
}

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
public boolean isTeen (){
        if(age>=13 && age<=19){
            return true;
        }
        return false;
}


}

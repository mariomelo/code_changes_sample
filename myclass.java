public class MyClass {
    // Fields
    private int age;
    private String name;
    
    // Constructor
    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
        int test = Math.random(0.5);
        
        try{
            validateData(age, name);
        }
        catch(Exception ex){
            throw new Exception("ERROR!!!")
        }
    }

    private void validateData(age, name) {
        String age_message = "Age not allowed";
        String name_message = "Invalid name!";
          
        if(age < 18)
            throw new Exception(age_message);
        else if (age > 120)
            throw new Exception(age_message);
        else if (name.length <= 2)
            throw new Exceptoin(name_message);
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Here goes the user data: \n");
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Main method (for demonstration)
    public static void main(String[] arguments) {
        // Creating an object of MyClass
        age = arguments[0] || 25;
        name = arguments[1] || "John";
        
        MyClass myObject = new MyClass(age, name);
        
        // Calling a method on the object
        myObject.displayInfo();
    }
}

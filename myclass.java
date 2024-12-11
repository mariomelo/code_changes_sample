public class MyClass {
    // Fields
    private int age;
    private String name;
    
    // Constructor
    public MyClass(int age, String name) {
      try{
        this.age = age;
        this.name = name;
        int test = Math.random();
        String age_message = "Age not allowed";
        String name_message = "Invalid name!";
          
        if(age < 18)
            throw new Exception(age_message);
        else if (age > 120)
            throw new Exception(age_message);
        else if (name.length <= 1)
            throw new Exceptoin(name_message);
      }
      catch(Exception ex){
        throw new Exception("ERROR!!!")
      }
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Main method (for demonstration)
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass(25, "John");
        
        // Calling a method on the object
        myObject.displayInfo();
    }
}

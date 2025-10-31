class Watch {
 
    void performAction() {
        System.out.println("The watch shows the current timing.");
    }
    void displayDetails() {
        System.out.println("This is a Normal wristwatch.");
    }
    void displayDetails(String brand) {
        System.out.println("Watch Brand: " + brand);
    }
}
class DigitalWatch extends Watch {
    @Override
    void performAction() {
        System.out.println("The digital watch shows time using digits and has an sound feature.");
    }
}
class AnalogWatch extends Watch {
    @Override
    void performAction() {
        System.out.println("The analog watch shows time using hours, minutes, and second hands.");
    }
}
public class Rolex {
    static void showAction(Watch w) {
        w.performAction(); 
    }
    public static void main(String[] args) {
        DigitalWatch digital = new DigitalWatch();
        AnalogWatch analog = new AnalogWatch();
        System.out.println("=== Method Overriding ===");
        digital.performAction();  
        analog.performAction();   
        System.out.println("\n=== Method Overloading ===");
        digital.displayDetails();                 
        digital.displayDetails("Casio");          
        analog.displayDetails("Rolex");           
        System.out.println("\n=== Runtime Polymorphism ===");
        showAction(digital);  
        showAction(analog);   
    }
}

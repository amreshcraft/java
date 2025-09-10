import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

    public String name;
    public String profile;
    public transient String location;
    Employee(String name,String profile , String location){
        this.name = name;
        this.profile = profile;
        this.location = location;
    }
}

public class SerializationApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e = new Employee("Amresh", "", "Gurugram");
        FileOutputStream fo = new FileOutputStream("serialization.txt");
        ObjectOutputStream obf = new ObjectOutputStream(fo);
        obf.writeObject(e);


        FileInputStream fis = new FileInputStream("serialization.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
            
            Employee emp = (Employee) ois.readObject();
            System.out.println("✅ Deserialized Employee: " + emp.location);
    }
}

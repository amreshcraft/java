class Sport implements Cloneable{
    public boolean isParticipated;
    public String name;

    Sport(String name, boolean isParticipated) {
        this.name = name;
        this.isParticipated = isParticipated;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}

class Student implements Cloneable {
    public String title;
    public String author;
    public float price;
    Sport sport;

    Student(String title, String author, float price, Sport sport) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.sport = sport;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.sport = (Sport) this.sport.clone();
        return clone;
    }

    @Override
    public String toString() {
        System.out.println("Title : " + title + ", Author: " + author + ", Price: " + price + ", Sport : "
                + this.sport.name + ", Participated: " + this.sport.isParticipated);
        return super.toString();
    }

}

public class DeepCloneableApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sport sport = new Sport("Badminton", true);
        Student student = new Student("Geeta-Bodhni", "Damodar Satvelekar", 1000, sport);
        System.out.println("Before Clone");
        student.toString();
        Student student2 = (Student) student.clone();
        student2.author = "Shree Paad Damodar Satvelekar Sahab";
        student2.sport.name = "Cricket";
        student2.sport.isParticipated = false;
        System.out.println("After Clone");
        student.toString();
        student2.toString();

    }

}

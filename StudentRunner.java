public class StudentRunner {
    public static void main(String[] args){
        Student student1 = new Student("Jimmy", "McPerson", 4.0, 458367234);
        Student student2 = new Student("Theodore", "McLastname", 3.2, 528943834);

        student1.introduceStudent();
        student1.giveExtraCredit();
        student1.introduceStudent();

        student2.introduceStudent();
    }
}

public class Student {
    String firstName;
    String lastName;
    Double gpa;
    int osisNum;

    public Student(String nameF, String nameL, double average, int osis){

        firstName = nameF;
        lastName = nameL;
        gpa = average;
        osisNum = osis;
    }

    public void introduceStudent(){
        System.out.println(firstName + " " + lastName + "'s OSIS number is " + osisNum + " and their GPA is " + gpa);
    }

    public void giveExtraCredit(){
        gpa += 0.2;
    }

}

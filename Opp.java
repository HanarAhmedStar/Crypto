
package opp;



 class Person {
    String name;
    int age;
    String gender;
Person(String name, int age, String gender){

    this.name = name;
    this.age = age;
    this.gender = gender;

}
public void printName(){

    System.out.println(this.name);
}}
 
class Student extends Person{
      String college;
   
         Student(String name, int age, String gender,String college) {
            super(name, age, gender);
            this.college = college;
        }
        public void printColl(){
            System.out.println(this.college);
        }
}

public class Opp{
  public static void main(String[] args) {
        Student hanar = new Student("Hanar", 19, "Female", "IT");
        hanar.printName();
        hanar.printColl();}
}
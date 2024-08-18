// Write a Java program that, given as input name, age and chronicCondition of some patients, prints the filtered stream of patients whose age is below 30 and chronicCondition is Diabetes. Complete the program as specified below.
// • Class Patient has/should have the following members:
//    – Private instance variables String name, int age and String chronicCondition
//    – A constructor to initialize instance variables
//    – Method toString to print in the format shown in the test cases
//    – Accessor methods for age and chronicCondition
//    – Method patientProcessor should take an ArrayList of Patient objects as input and returns a filtered stream of diabetic patients who are below 30 years.
// • Class StreamTest has the following members:
//    – Method main creates an ArrayList of Patient objects by taking input in the order of name, age and chronicCondition then invokes the method patientProcessor to filter patients whose age is below 30 and chronicCondition is Diabetes and finally display those patients.
// What you have to do
// • Define method patientProcessor in class Patient.


import java.util.*;
import java.util.stream.*;


class Patient 
{
  private String name;
  private int age;
  private String chronicCondition;
  public Patient(String name, int age, String chronicCondition) 
  {
    this.name = name;
    this.age = age;
    this.chronicCondition = chronicCondition;
  }

  @Override
  public String toString() 
  {
    return this.name + " - " + this.age ;
  }

  public int getage() 
  {
    return this.age;
  }

  public String getchronicCondition() 
  {
    return this.chronicCondition;
  }

  public static Stream<Patient> patientProcessor(ArrayList<Patient> patient)
  {
    return patient.stream().filter(p -> p.age < 30 && p.chronicCondition.equals("Diabetes"));
  }
}


public class p56PatientStream 
{
  public static void main(String[] args) 
  {
    ArrayList<Patient> Patients = new ArrayList<>();
    Patient patient1 = new Patient("Lavanya",32,"Hypertension");
    Patients.add(patient1);
    Patient patient2 = new Patient("Manu",26,"Diabetes");
    Patients.add(patient2);
    Patient patient3 = new Patient("Payal",28,"Hypertension");
    Patients.add(patient3);
    Patient patient4 = new Patient("Rajini",45,"Diabetes");
    Patients.add(patient4);

    Stream<Patient> filteredStream = Patient.patientProcessor(Patients);
    filteredStream.forEach(System.out::println);
  }
}
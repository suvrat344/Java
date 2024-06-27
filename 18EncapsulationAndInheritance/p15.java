// Create a class Person with attributes name and age. Override equals() to compare Person objects based on their attributes. Override hashCode() consistent with the definition of equals()

class Person
{
  public String name;
  public int age;

  
  public Person(String name,int age)
  {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj)
  {
    if(obj instanceof Person)
    {
      Person person = (Person) obj;
      return age == person.age && name.equals(person.name);
    }
    return false;
  }

  @Override
  public int hashCode()
  {
    int result = 17;
    result = 31 * result + (name == null ? 0 : name.hashCode());
    result = result + age;
    return result;
  }
}

public class p15 
{
  public static void main(String[] args) 
  {
      Person p1 = new Person("Ajay",18);

      Person p2 = new Person("Ajay",18);

      System.out.println(p1.equals(p2));

      System.out.println("Hashcode of p1 : " + p1.hashCode());
      System.out.println("Hashcode of p2 : " + p2.hashCode());
  }
}

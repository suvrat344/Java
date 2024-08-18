// Write a Java program that allows the user to create projects, add team members to each project, and ensure that every project has at least one team member. If the project doesn’t have any member then add default team member. The program takes project name, number of team members followed by team members names of some projects as input and finally prints the project list with their team members. Complete the program as specified below.
// • Class NoTeamMemberException extends the Exception class and should have the following member:
//    – Constructor that call its super class constructor
// • Class Project has/should have the following members:
//    – Private instance variables String projectName and List<String> teamMembers
//    – A constructor to initialize the instance variables
//    – Method addTeamMember that adds a team member to the project
//    – Method toString to print in the format shown in the test cases
//    – Method hasTeamMembers that returns true if the project has team members, and NoTeamMemberException otherwise
// • Class ProjectManager has the following members:
//    – Method updateProjectList that takes a Project list as a parameter and checks if each project has at least one team member. If not, it catches the NoTeamMemberException,adds a default team member to the project
//    – Method displayProjectList that takes a Project list as a parameter and prints the updated project list
//    – Method main takes input to create Project list and invokes the updateProjectList method to ensure that each project has at least one team member and also invokes the displayProjectList method to print the updated project list.
// What you have to do
// • Define class NoTeamMemberException
// • Define method updateProjectList in class ProjectManager

import java.util.*;

class NoTeamMemberException extends Exception
{
  public NoTeamMemberException()
  {
    super();
  }
}

class Project 
{
  private String projectName;
  private List<String> teamMembers;

  public Project(String projectName) 
  {
    this.projectName = projectName;
    this.teamMembers = new ArrayList<>();
  }

  public void addTeamMember(String memberName) 
  {
    teamMembers.add(memberName);
  }

  @Override
  public String toString() 
  {
    return "Project: " + this.projectName + ", Team Members: " + this.teamMembers;
  }

  public boolean hasTeamMembers() throws NoTeamMemberException 
  {
    if (!teamMembers.isEmpty()) 
    {
      return true;
    } 
    else 
    {
      throw new NoTeamMemberException();
    }
  }
}


public class p55ProjectManager 
{
  static void updateProjectList(List<Project> proj)
  {
    for(Project project : proj)
    {
      try
      {
        project.hasTeamMembers();
      }
      catch(NoTeamMemberException e)
      {
        project.addTeamMember("Default");
      }
    }
  }

  static void displayProjectList(List<Project> projectList) 
  {
    System.out.println("Updated Project List:");
    for (Project project : projectList) 
    {
      System.out.println(project);
    }
  }

  public static void main(String[] args) 
  {
    List<Project> projectList = new ArrayList<>();

    Project project1 = new Project("ChatGPT-Enhancement 3");
    projectList.add(project1);
    project1.addTeamMember("Alice");
    project1.addTeamMember("Bob");
    project1.addTeamMember("Charlie");

    Project project2 = new Project("OpenAI-Research 2");
    projectList.add(project2);
    project2.addTeamMember("David");
    project2.addTeamMember("Eva");

    Project project3 = new Project("ProjectX 1");
    projectList.add(project3);
    project3.addTeamMember("Ian");

    try 
    {
      for (Project project : projectList)
      {
        project.hasTeamMembers();
      }
    } 
    catch (NoTeamMemberException e) 
    {
      System.out.println("Exception caught: " + e.getMessage());
    }
    updateProjectList(projectList);
    displayProjectList(projectList);
  }
}
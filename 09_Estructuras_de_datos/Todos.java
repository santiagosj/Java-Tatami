// import the ArrayList package here:
import java.util.ArrayList;

class Todos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    ArrayList<String> toDoList = new ArrayList<String>();

    String toDo1 = "Water plants";
    String toDo2 = "Learn Java";
    String toDo3 = "Play the piano";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);
    System.out.println(toDoList.get(0));
    
  }
  
}
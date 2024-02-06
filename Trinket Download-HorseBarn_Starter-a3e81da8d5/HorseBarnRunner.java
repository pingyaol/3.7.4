import java.util.ArrayList; 
/*
 * Activity 3.7.3
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn(); 
    ArrayList<Horse> barnSpaces = new ArrayList<Horse>(); 
    barnSpaces = barn.getSpaces(); 
    double avgWeight = 0; 

    int numSpaces = barnSpaces.size();
    for (int i = 0; i < numSpaces; i++)
    {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Patches"))
        System.out.println("Bye bye " +  barnSpaces.remove(i));

      else if (h.getName().equals("Lady"))
        System.out.println("Bye bye " + barnSpaces.remove(i));

      else if (h.getName().equals("Duke")) {
        barnSpaces.remove(i); 
        Horse princess = new Horse ("Princess", 1445); 
        barnSpaces.add(i, princess); 
      } 

      else if (h.getName().equals("Silver")) {
        Horse chief = new Horse ("Chief", 1505); 
        barnSpaces.add(i + 1, chief); 
      }

      else if (h.getName().equals("Buddy")) {
        Horse gypsy = new Horse("Gypsy", 1335); 
        Horse magic = new Horse("Magic", 1425); 
        barnSpaces.add(i + 1, magic); 
        barnSpaces.add(i, gypsy); 
      }
    }
    for (int i = 0; i < numSpaces; i++)
    {
      System.out.println(barnSpaces.get(i)); 
      avgWeight += barnSpaces.get(i).getWeight(); 
    }
    avgWeight /= barnSpaces.size(); 

    System.out.println(avgWeight); 
    System.out.println("more than average weight"); 
    for (int i = 0; i < numSpaces; i++)
    {
      if (barnSpaces.get(i).getWeight() > avgWeight) {
        System.out.println(barnSpaces.get(i)); 
      }
    }
  }
} 
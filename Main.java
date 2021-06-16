import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of first person without spaces:");
    String firstPerson = sc.nextLine();
    System.out.println("Enter the name of Second person without spaces:");
    String secondPerson = sc.nextLine();
    char firstchar[] = firstPerson.toCharArray();
    char secondchar[] = secondPerson.toCharArray();
    int similarchar=0,i,j;
    for(i=0;i<firstchar.length;i++)
    {
      for(j=0;j<secondchar.length;j++)
      {
        if(firstchar[i] == secondchar[j] && firstchar[i] != ' ' && secondchar[j] != '@')
        {
          secondchar[j] = '@';
          similarchar++;
        }
      }
    }
    System.out.println(similarchar);
    char game[] = {'f','l','a','m','e','s'};
    j = 6;
    i = ((similarchar-1) % 6);
    int k = i;
    while(j>1)
    {
      if(game[i] != '#' )
      {
//        document.write("<br>"+game[i]);
        game[i] = '#';
        j--;
        i = ((similarchar-1) % 6);
      }
      else
      {
      System.out.println(game[i]);
        if(i == 5)
        {
          i = 0;
        }
        else{
        i++;

      }
      }
    }

    for (i=0;i<game.length ;i++ ) {
      if(game[i] != '#' )
      System.out.println("Result is"+game[i]);
    }

  }
}

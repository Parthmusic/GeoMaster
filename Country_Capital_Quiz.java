import java.io.*;
public class Country_Capital_Quiz
{
    public static void main () throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        File file = new File ("C:\\Users\\parth\\Downloads\\Countries.txt");
        BufferedReader alive = new BufferedReader (new FileReader(file));
        File file1 = new File ("C:\\Users\\parth\\Downloads\\Capitals.txt");
        BufferedReader dead = new BufferedReader (new FileReader(file1));
        BufferedReader in = new BufferedReader (read);
        int d=0,j=0,s=0,sum=0,life=3,q=0,w=1,turns=11,i,red=0,r,kar=0,t=0,g=0,h=0,wasp=1,hawk=1;
        boolean found=false,re=true;
        String capital,country;
        String ans[] = new String[turns];
        int m[] = new int[turns];
        String arr[][] = new String[2][196];
        String st;
     
     
        while ((st = alive.readLine()) != null)
 
     {
     arr[0][h]=st;
     //System.out.println(arr[0][h]);
     h++;
     
    }
    h=0;  
    while ((st = dead.readLine()) != null)
 
     {
     arr[1][h]=st;
     //System.out.println(arr[1][h]);
     h++;
     
    }
           
          //code to see if the rand num is already in array
           while(j<turns)
           // if already in array go back
           //code to push the num in array
            {
                found=false;
                r= (int)(Math.random()*(arr[0].length));
                //r= (int)(Math.random()*(25));
                //System.out.println(r);
                for(i=0;i<j;i++)
                {
                    if(r==m[i])
                    {
                    found = true;
                    break;
                }
                }  
                if(found==false)
                {    
                m[j]=r;
                j++;
             }
                    //kar+=1;
                   
                 //if(j==turns)
                 //break;
            //if (kar==3)
            //break label;
             
           
          }
               
            System.out.println("**********************************************");
           System.out.println("******       Welcome to GeoMaster!      ******");
           System.out.println("******    Guess the country-capitals    ******");
           System.out.println("**********************************************");
           System.out.println("**** Turns : 0 ** Score : 0 ** Lives : "+life+"  ****");
           System.out.println("**********************************************");
           System.out.println("Enter your choice:\n1: Name Capitals of the given Countries\n2: Name Countries to which the given capitals belong");    //for(i=0;i<10;i++)
           int parth = Integer.parseInt(in.readLine());
           System.out.print('\u000C');
           switch (parth)
           {
               case 1:
        for(i=1;i<turns;i++)
        {
           System.out.println("**********************************************");
           System.out.println("******       Welcome to GeoMaster!      ******");
           System.out.println("******    Guess the country-capitals    ******");
           System.out.println("**********************************************");
           System.out.println("**** Turns : "+(i-1)+" ** Score : "+sum+" ** Lives : "+life+"  ****");
           System.out.println("**********************************************");
           //System.out.println("Enter your choice:\n1: Name Capitals of the given Countries\n2: Name Countries to which the given capitals belong");
           
           System.out.println(arr[0][m[i]]);
           System.out.println("Enter it's capital");
          // System.out.println("\t\t\t"+"Score - "+sum+"/"+i+"\t"+"Lives = "+life);
           capital = in.readLine();
           //System.out.println(capital);
           ans[i]= capital;
           if(m[i]==20&&capital.equalsIgnoreCase("La Paz"))
           capital="Sucre";
           boolean y = capital.equalsIgnoreCase(arr[1][m[i]]);
                  if (y==true)
                  {
                  System.out.println("Correct!!!");
                  sum+=1;
                 
                  }
           
               else
            {
                s+=1;
                System.out.println("Incorrect!"+"\t"+"The correct answer was "+arr[1][m[i]]);
                life--;
            }
           //}
        if(s==3)
        {
           
            System.out.println("That was 3 incorrect answers..."+"\t"+"You lose!\nPress any key to view your performance");
            String input = in.readLine();
            System.out.print('\u000C');
            System.out.println("**********************************************");
          System.out.println("******             GeoMaster!           ******");
          System.out.println("******     Your Performance Summary     ******");
          System.out.println("**********************************************");
          System.out.println("**** Turns : "+(i)+" ** Score : "+sum+" ** Lives : "+life+"  ****");
          System.out.println("**********************************************");
          //System.out.println("Country"+"\t\t\t"+"Your Answer\t\t\t"+"Correct Answer");
          double december = (sum*100)/i;
          System.out.println("Your Percentage: "+december+"%");
          re=false;
            break;
        }
        //else
        //{
       
        System.out.println("Press enter to continue or 'Y' to give up");
          String choice = in.readLine();
          //String choice = "k";
          //System.out.println(choice);
         String lc_choice=choice.toLowerCase();
         //System.out.println(lc_choice);
          if (lc_choice.equals("y"))
          {
              System.out.println("Bye!");
              re=false;
             break;
         }
         System.out.print('\u000C');
        //}
       
         
       
      }
      if (re==true)
      {
          System.out.println("**********************************************");
          System.out.println("******             GeoMaster!           ******");
          System.out.println("******     Your Performance Summary     ******");
          System.out.println("**********************************************");
          System.out.println("**** Turns : "+(i-1)+" ** Score : "+sum+" ** Lives : "+life+"  ***");
          System.out.println("**********************************************");
          //System.out.println("Country"+"\t\t\t"+"Your Answer\t\t\t"+"Correct Answer");
          double december = (sum*100)/(i-1);
          System.out.println("Your Percentage: "+december+"%");
          
           /*for(g=1;g<turns;g++)
           {
             System.out.print(arr[0][m[g]]);
             System.out.print("\t\t\t"+ans[g]);
             System.out.print("\t\t\t"+arr[1][m[g]]);
             System.out.println();
           }*/
      }
      break;
      case 2:
      for(i=1;i<turns;i++)
        {
           System.out.println("**********************************************");
           System.out.println("******       Welcome to GeoMaster!      ******");
           System.out.println("******    Guess the country-capitals    ******");
           System.out.println("**********************************************");
           System.out.println("**** Turns : "+(i-1)+" ** Score : "+sum+" ** Lives : "+life+"  ****");
           System.out.println("**********************************************");
           //System.out.println("Enter your choice:\n1: Name Capitals of the given Countries\n2: Name Countries to which the given capitals belong");
           
           System.out.println(arr[1][m[i]]);
           System.out.println("Enter the country it belongs to:");
          // System.out.println("\t\t\t"+"Score - "+sum+"/"+i+"\t"+"Lives = "+life);
           country = in.readLine();
           //System.out.println(country);
           //ans[i]= country;
           boolean f = country.equalsIgnoreCase(arr[0][m[i]]);
           //System.out.println(f);
                  if (f==true)
                  {
                  System.out.println("Correct!!!");
                  sum+=1;
                 
                  }
           
               else
            {
                s+=1;
                System.out.println("Incorrect!"+"\t"+"The correct answer was "+arr[0][m[i]]);
                life--;
            }
           //}
        if(s==3)
        {
           
            System.out.println("That was 3 incorrect answers..."+"\t"+"You lose!\nPress any key to view your performance");
            String input = in.readLine();
            System.out.print('\u000C');
            System.out.println("**********************************************");
          System.out.println("******             GeoMaster!           ******");
          System.out.println("******     Your Performance Summary     ******");
          System.out.println("**********************************************");
          System.out.println("**** Turns : "+(i)+" ** Score : "+sum+" ** Lives : "+life+"  ****");
          System.out.println("**********************************************");
          //System.out.println("Country"+"\t\t\t"+"Your Answer\t\t\t"+"Correct Answer");
          double december = (sum*100)/i;
          System.out.println("You lost all your lives!");
          System.out.println("Your Percentage: "+december+"%");
          re=false;
            break;
        }
        //else
        //{
       
        System.out.println("Press enter to continue or 'Y' to give up");
          String choice = in.readLine();
          //String choice = "k";
          //System.out.println(choice);
         String lc_choice=choice.toLowerCase();
         //System.out.println(lc_choice);
          if (lc_choice.equals("y"))
          {
              System.out.println("Bye!");
              re=false;
             break;
         }
         System.out.print('\u000C');
        //}
       
         
       
      }
      if (re==true)
      {
          System.out.println("**********************************************");
          System.out.println("******             GeoMaster!           ******");
          System.out.println("******     Your Performance Summary     ******");
          System.out.println("**********************************************");
          System.out.println("**** Turns : "+(i-1)+" ** Score : "+sum+" ** Lives : "+life+"  ****");
          System.out.println("**********************************************");
          //System.out.println("Country"+"\t\t\t"+"Your Answer\t\t\t"+"Correct Answer");
          double december = (sum*100)/(i-1);
          System.out.println("Your Percentage: "+december+"%");
          
           /*for(g=1;g<turns;g++)
           {
             System.out.print(arr[0][m[g]]);
             System.out.print("\t\t\t"+ans[g]);
             System.out.print("\t\t\t"+arr[1][m[g]]);
             System.out.println();
           }*/
      }
      break;
      default:
      System.out.println("Invalid Choice!");
      
    } 
    
    
}

}

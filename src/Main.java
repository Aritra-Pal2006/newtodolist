import java.util.*;

class test
{
    ArrayList<String> list = new ArrayList<String>();
    void intolist(String todo)
    {

        list.add(todo);

    }
    void display()
    {
        for (String s : list)
        {
            System.out.println(s);
        }
    }

    void delete()
    {
        Scanner sc=new Scanner(System.in);
        String del=sc.nextLine();
        list.remove(del);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        test obj=new test();

        while(true)
        {
            System.out.println("Press 1 for taking the inputs from the user");
            System.out.println("Press 2 for displaying");
            System.out.println("Press 3 for deletion");

            int choice = sc.nextInt();


            switch(choice) {

                case 1 :
                    obj.input();
                    break;

                case 2 :
                    obj.display();
                    break;

                case 3 :
                    obj.delete();
                    break;


            }

        }



    }
    public void input()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Todo");

        String ns=sc.nextLine();
        intolist(ns);



    }
}
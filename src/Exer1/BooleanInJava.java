package Exer1;

public class BooleanInJava
{
    public static void main(String[] args)
    {

        //int a = 0;
        //boolean b = (a == 0);
        //System.out.println(b);
        //Boolean can only be true or false. but it can also be anything that results into true or false.
        // boolean b = a == 0; så om a är lika med 0 så är resultatet true så b är nu true.
        //boolean används mest för if statements.

        //if samma som boolean vi måste lägga in något som är sant eller falskt i ()
        //if(true)
        //        {
        //            System.out.println("We passed our first door");
        //        }


        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if(passedDoor)
        {
            System.out.println("We passed our first door");
            doorCount = doorCount + 1;
        }

        if(passedDoor)
        {
            System.out.println("We passed our second door");
            doorCount = doorCount + 1;
        }

        if(passedDoor)
        {
            System.out.println("We passed our third door");
            doorCount = doorCount + 1;
        }

        if(doorCount == 3) {
            passedAllDoors = true;
        }

        if(passedAllDoors) {
            System.out.println("Congratulations you went through all the doors!");
        }


    }

}

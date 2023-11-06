package Exer1;


import java.util.Random;

public class ZombieKiller {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Welcome to Zombieland!");
        //Vi har skapat Arrays i form av backpack och zombies. ett sätt att samla data eller ett index.
        //börjar alltid med 0 så shotgun är 0 osv
        //kan även vara in istället för string osv
        String backpack [] = {"Waterpistol", "Assault Rifle", "Sniper"};
        String zombies [] = {"Close-range zombie Damien", "Mid-range zombie Pete", "Long-range Zombie Dave"};


        int zanda = rand.nextInt(3);
        int randa = rand.nextInt(3);


        System.out.println(randa + " " + zanda);
        System.out.println("You reach into your backpack and find a:");

        System.out.println(backpack [randa]);

        System.out.println("Now defend yourself against the smelly:");
        System.out.println(zombies [zanda]);




    }
}

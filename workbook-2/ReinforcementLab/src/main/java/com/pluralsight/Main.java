package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Character hCharacter = new Character("Hero", 45, 10);
        System.out.println("\nInitial player: \n" + hCharacter.getFullStatus());

        Enemy[] enemies = new Enemy[5];
        for(int i = 0; i < enemies.length; i++){
            enemies[i] = new Enemy("Enemy " + (i + 1), (int)(Math.random() * 30 + 5));
            System.out.println(enemies[i].getName() + " has " +
                    enemies[i].getHealth() + " health and "+
                    enemies[i].getDamage() + " attack damage");
        }
        System.out.println("--------------------------------------------------------------------------");

        battle(hCharacter, enemies);

        System.out.println("\nBattle has ended. Player Final Status: \n" +
                hCharacter.getFullStatus());
    }
    
    public static void battle (Character player, Enemy[] enemies){
        for (Enemy enemy: enemies) {
            System.out.println("=======================================================");
            System.out.println(player.getDescription() + " vs " + enemy.getName());
            System.out.println("=======================================================");
            while (player.getHealth() > 0 && enemy.getHealth() > 0){
                if(Math.random() > 0.5) {
                    player.attack(enemy);
                    System.out.println(player.getDescription() + " attacked " + enemy.getName() + " with regular attack. "
                            + enemy.getName() + " health is now " + enemy.getHealth());
                }else {
                    player.attack(enemy, 1.5);
                    System.out.println(player.getDescription() + " attacked " + enemy.getName() + " with special attack. "
                            + enemy.getName() + " health is now " + enemy.getHealth());
                }
                if(enemy.getHealth() <= 0) {
                    System.out.println(enemy.getName() + " has been defeated.");
                    break;
                }

                enemy.attack(player);
                System.out.println(enemy.getName() + " attacked " + player.getDescription() + ". " + player.getDescription()
                + " health is now " + enemy.getHealth());

                if(player.getHealth() <= 0) {
                    System.out.println(player.getDescription() + " has been defeated.");
                    break;
                }
            }
            System.out.println();
        }
    }
}


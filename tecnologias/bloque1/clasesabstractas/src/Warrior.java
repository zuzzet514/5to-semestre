public class Warrior extends Character {
    private String weapon;

    public Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    public void upgradeWeapon() {
        System.out.println("El guerrero " + getName() + " ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + getName() + " ataca a " + enemy.getName());
        int damage = (int)(Math.random()*20);
        int healthEnemy = enemy.getHealth();
        enemy.setHealth(enemy.getHealth() - damage);
    }

    @Override
    public void heal() {
        int healing = (int)(Math.random()*15);
        int health = getHealth();
        System.out.println(getName() + " has been healing " + healing + " health");
        setHealth(health -healing);
    }

    @Override
    public void useSpecialAbility(Character enemy) {
        System.out.println("El guerrero " + getName() + " ataca a " + enemy.getName() + " con su super.");
        int enemyHealth = enemy.getHealth();
        int damage = (int)(Math.random()*45);
    }
}

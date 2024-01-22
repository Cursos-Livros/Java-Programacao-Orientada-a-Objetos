package Desafio.entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        if (life < 0) {
            life = 0;
        }
        return life;
    }

    public void takeDamage(Champion other) {
        int damage = other.attack - armor;
        if (damage < 0) {
            life -= 1;
        } else {
            life -= damage;
        }
    }

    public String status() {
        String death = (life <= 0) ? " (morreu)" : "";
        return getName() + ": " + getLife() + " " + death;
    }
}

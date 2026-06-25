package oops-practice.gcr-codebase.polymorphism;

class adventure_game {
    public void performAttack() {
        System.out.println("Performing a generic attack.");
    }
}
class Warrior extends adventure_game {
    @Override
    public void performAttack() {
        System.out.println("Warrior performs a powerful sword attack!");
    }
}
class Mage extends adventure_game {
    @Override
    public void performAttack() {
        System.out.println("Mage casts a fireball spell!");
    }
}
class Archer extends adventure_game {
    @Override
    public void performAttack() {
        System.out.println("Archer shoots a precise arrow!");
    }
}
class Main {
    public static void main(String[] args) {
        adventure_game character1 = new Warrior();
        adventure_game character2 = new Mage();
        adventure_game character3 = new Archer();

        character1.performAttack();
        character2.performAttack();
        character3.performAttack();
    }
}

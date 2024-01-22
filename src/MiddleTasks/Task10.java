package MiddleTasks;

public class Task10 {
}

class Mage {
    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    String getInfo() {
        return "name: " + name + "level: " + level + "damage: " + damage + "type: " + type;
    }

    String fight(Mage mage) {
        if (this.type.equals("fire") && this.type.equals("ice")) {
            return name;
        } else if (this.type.equals("ice") && this.type.equals("earth")) {
            return name;
        } else if (this.type.equals("earth") && this.type.equals("fire")) {
            return name;
        } else if (!this.type.equals(mage.type)) {
            return mage.name;
        } else {
            if (this.level > mage.level) {
                return this.name;
            } else if (this.level < mage.level) {
                return mage.name;
            } else {
                if (this.damage > mage.damage) {
                    return this.name;
                } else if (this.damage < mage.damage) {
                    return mage.name;
                } else {
                    return "draw";
                }
            }
        }
    }
}

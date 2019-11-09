package seedu.hustler.game.avatar;

import seedu.hustler.game.shop.items.armors.Armor;
import seedu.hustler.game.shop.items.weapons.Weapon;
import java.util.Optional;

public interface Stats extends Convertible {
    public Stats upStats(int level);
    public int getDamage();
    public int getDefence();
    public int getSpeed();
    public int getStamina();
    public String getStats(Optional<Weapon> weapon, Optional<Armor> armor);
}

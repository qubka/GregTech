package muramasa.gti.tree;

import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum ResinState implements IStringSerializable {

    NONE,
    EMPTY,
    FILLED;

    @Override //Needed for generating BlockStates with the correct lower case name
    public String toString() {
        return getString();
    }

    @Override
    public String getString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}

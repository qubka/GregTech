package muramasa.gti.tile.single;

import muramasa.antimatter.capability.impl.MachineEnergyHandler;
import muramasa.antimatter.machine.types.Machine;
import muramasa.antimatter.tile.TileEntityStorage;
import tesseract.util.Dir;

import javax.annotation.Nonnull;
import java.util.Optional;

import static muramasa.antimatter.machine.MachineFlag.ENERGY;

public class TileBatteryBufferCreative extends TileEntityStorage {

    public TileBatteryBufferCreative(Machine<?> type) {
        super(type);
    }

    @Override
    public void onLoad() {
        if (isServerSide() && has(ENERGY)) energyHandler = Optional.of(new MachineEnergyHandler(this) {
            @Override
            public long extract(long toInsert, boolean simulate) {
                return 0L;
            }

            @Override
            public boolean canOutput(@Nonnull Dir direction) {
                return tile.getOutputFacing().getIndex() == direction.getIndex();
            }
        });
        super.onLoad();
    }
}
package binnie.core.machines.base;

import javax.annotation.Nullable;

import net.minecraft.util.EnumFacing;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fluids.capability.IFluidHandler;

import binnie.core.machines.inventory.TankSlot;
import binnie.core.machines.power.ITankMachine;
import binnie.core.machines.power.TankInfo;

class DefaultTankContainer implements ITankMachine {

	private static final TankInfo[] TANK_INFOS_EMPTY = new TankInfo[0];

	@Override
	public TankInfo[] getTankInfos() {
		return TANK_INFOS_EMPTY;
	}

	@Override
	public boolean isTankReadOnly(final int index) {
		return false;
	}

	@Override
	public boolean isLiquidValidForTank(final FluidStack liquid, final int index) {
		return false;
	}

	@Override
	public TankSlot addTank(final int index, final String name, final int capacity) {
		return null;
	}

	@Override
	public TankSlot addTank(int index, ResourceLocation name, int capacity) {
		return null;
	}

	@Override
	public IFluidTank getTank(final int index) {
		return null;
	}

	@Override
	public TankSlot getTankSlot(final int index) {
		return null;
	}

	@Override
	@Nullable
	public IFluidHandler getHandler(@Nullable EnumFacing from) {
		return null;
	}

	@Nullable
	@Override
	public IFluidHandler getHandler(int[] targetTanks) {
		return null;
	}

	private static final IFluidTank[] FLUID_TANKS_EMPTY = new IFluidTank[0];

	@Override
	public IFluidTank[] getTanks() {
		return FLUID_TANKS_EMPTY;
	}
}

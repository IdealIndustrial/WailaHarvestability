package squeek.wailaharvestability.proxy;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ProxyGregTech
{
	public static final String modID = "gregtech";
	public static final String oreBlockID = "gt.blockores";
	public static final String oreBlockUB1_ID = "ub1";
	public static final String oreBlockUB2_ID = "ub2";
	public static final String oreBlockUB3_ID = "ub3";
	public static final String oreBlockUniqueIdentifier = modID + ":" + oreBlockID;
	public static final String oreBlockUniqueIdentifierUB1 = oreBlockUniqueIdentifier + "." + oreBlockUB1_ID;
	public static final String oreBlockUniqueIdentifierUB2 = oreBlockUniqueIdentifier + "." + oreBlockUB2_ID;
	public static final String oreBlockUniqueIdentifierUB3 = oreBlockUniqueIdentifier + "." + oreBlockUB3_ID;
	public static final String casingID = "gt.blockcasings";
	public static final String casingUniqueIdentifier = modID + ":" + casingID;
	public static final String machineID = "gt.blockmachines";
	public static final String machineUniqueIdentifier = modID + ":" + machineID;
	public static boolean isModLoaded = Loader.isModLoaded(modID);

	public static boolean isOreBlock(Block block)
	{
		return isModLoaded && (GameRegistry.findUniqueIdentifierFor(block).toString().equals(oreBlockUniqueIdentifier) ||
				GameRegistry.findUniqueIdentifierFor(block).toString().equals(oreBlockUniqueIdentifierUB1) ||
				GameRegistry.findUniqueIdentifierFor(block).toString().equals(oreBlockUniqueIdentifierUB2) ||
				GameRegistry.findUniqueIdentifierFor(block).toString().equals(oreBlockUniqueIdentifierUB3));
	}

	public static boolean isCasing(Block block)
	{
		return isModLoaded && GameRegistry.findUniqueIdentifierFor(block).toString().equals(casingUniqueIdentifier);
	}

	public static boolean isMachine(Block block)
	{
		return isModLoaded && GameRegistry.findUniqueIdentifierFor(block).toString().equals(machineUniqueIdentifier);
	}
}

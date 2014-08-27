package ca.scp.tmp;

import java.util.Random;

import ca.scp.tmp.block.TMP_Blocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TMP_WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch (world.provider.dimensionId){
		
		case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
		case 1: GenerateEnd(random, chunkX * 16, chunkZ * 16, world); break;
		case -1: GenerateNether(random, chunkX * 16, chunkZ * 16, world); break;
		
		}
	}

	private void GenerateNether(Random random, int x, int z, World world) {
		
	}

	private void GenerateEnd(Random random, int x, int z, World world) {
		
	}

	private void GenerateOverworld(Random random, int x, int z, World world) {
		
		this.addOreSpawn(TMP_Blocks.ruby_ore, world, random, x, z, 1, 2, 35, 0, 15);
		this.addOreSpawn(TMP_Blocks.ruby_ore, world, random, x, z, 1, 2, 35, 0, 15);
		this.addOreSpawn(TMP_Blocks.sapphire_ore, world, random, x, z, 1, 2, 50, 0, 128);
		this.addOreSpawn(TMP_Blocks.sapphire_ore, world, random, x, z, 1, 2, 50, 0, 15);
		
	}
	
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY ){
    	
        WorldGenMinable minable = new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone);
        
        for (int i = 0; i < chancesToSpawn; i++){
        	
            int posX = blockXPos + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(15);
            minable.generate(world, random, posX, posY, posZ);
            
        }
    }

}

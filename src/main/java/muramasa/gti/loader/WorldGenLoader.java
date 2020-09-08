package muramasa.gti.loader;

import muramasa.antimatter.AntimatterConfig;
import muramasa.antimatter.Data;
import muramasa.antimatter.worldgen.StoneLayerOre;
import muramasa.antimatter.worldgen.object.WorldGenOreSmall;
import muramasa.antimatter.worldgen.object.WorldGenStoneLayer;
import muramasa.antimatter.worldgen.object.WorldGenVeinLayer;
import muramasa.antimatter.worldgen.old.WorldGenAsteroid;
import muramasa.gti.data.GregTechData;
import muramasa.gti.tree.RubberTreeWorldGen;

import static muramasa.antimatter.Ref.*;
import static muramasa.gti.data.Materials.*;
import static net.minecraft.world.World.*;

public class WorldGenLoader {


    public static void init() {
        //TODO probably increase max generation heights for most things
        //TODO add GC dims to all objects

        //RubberTreeWorldGen.build();

        new WorldGenAsteroid("asteroids", THE_END, ASTEROIDS);

//        new WorldGenStone("granite_black_tiny", GRANITE_BLACK, 1, 75, 5, 0, 180, OVERWORLD);
//        new WorldGenStone("granite_black_small", GRANITE_BLACK, 1, 100, 10, 0, 180, OVERWORLD);
//        new WorldGenStone("granite_black_medium", GRANITE_BLACK, 1, 200, 10, 0, 120, OVERWORLD);
//        new WorldGenStone("granite_black_large", GRANITE_BLACK, 1, 300, 70, 0, 120, OVERWORLD);
//        new WorldGenStone("granite_black_huge", GRANITE_BLACK, 1, 400, 150, 0, 120, OVERWORLD);
//
//        new WorldGenStone("granite_red_tiny", GRANITE_RED, 1, 75, 5, 0, 180, OVERWORLD);
//        new WorldGenStone("granite_red_small", GRANITE_RED, 1, 100, 10, 0, 180, OVERWORLD);
//        new WorldGenStone("granite_red_medium", GRANITE_RED, 1, 200, 10, 0, 120, OVERWORLD);
//        new WorldGenStone("granite_red_large", GRANITE_RED, 1, 300, 70, 0, 120, OVERWORLD);
//        new WorldGenStone("granite_red_huge", GRANITE_RED, 1, 400, 150, 0, 120, OVERWORLD);
//
//        new WorldGenStone("marble_tiny", MARBLE, 1, 75, 5, 0, 180, OVERWORLD);
//        new WorldGenStone("marble_small", MARBLE, 1, 100, 10, 0, 180, OVERWORLD);
//        new WorldGenStone("marble_medium", MARBLE, 1, 200, 10, 0, 120, OVERWORLD);
//        new WorldGenStone("marble_large", MARBLE, 1, 300, 70, 0, 120, OVERWORLD);
//        new WorldGenStone("marble_huge", MARBLE, 1, 400, 150, 0, 120, OVERWORLD);
//
//        new WorldGenStone("basalt_tiny", BASALT, 1, 75, 5, 0, 180, OVERWORLD);
//        new WorldGenStone("basalt_small", BASALT, 1, 100, 10, 0, 180, OVERWORLD);
//        new WorldGenStone("basalt_medium", BASALT, 1, 200, 10, 0, 120, OVERWORLD);
//        new WorldGenStone("basalt_large", BASALT, 1, 300, 70, 0, 120, OVERWORLD);
//        new WorldGenStone("basalt_huge", BASALT, 1, 400, 150, 0, 120, OVERWORLD);
        
        WorldGenStoneLayer.add(GregTechData.STONE, 4, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.STONE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.STONE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.STONE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.STONE, 1, OVERWORLD); //Ores
        
        WorldGenStoneLayer.add(GregTechData.GRANITE_BLACK, 2, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.GRANITE_BLACK, 1, OVERWORLD).forEach(w -> w.addOres(
            new StoneLayerOre(Cooperite, U32, 0, 16),
            new StoneLayerOre(Iridium, U64, 0, 8)
        ));

        WorldGenStoneLayer.add(GregTechData.GRANITE_RED, 2, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.GRANITE_RED, 1, OVERWORLD).forEach(w -> w.addOres(
            new StoneLayerOre(Pitchblende, U32, 0, 18),
            new StoneLayerOre(Uraninite, U32, 0, 16),
            new StoneLayerOre(Tantalite, U16, 20, 50)
        ));

        WorldGenStoneLayer.add(GregTechData.KOMATIITE, 4, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.KOMATIITE, 1, OVERWORLD).forEach(w -> w.addOres(
            new StoneLayerOre(Magnesite, U16, 20, 50),
            new StoneLayerOre(Cinnabar, U12, 0, 32),
            new StoneLayerOre(Redstone, U8, 0, 30),
            new StoneLayerOre(Pyrite, U12, 0, 30)
        ));

        WorldGenStoneLayer.add(GregTechData.BASALT, 3, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.BASALT, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.BASALT, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.MARBLE, 4, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.MARBLE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.LIMESTONE, 3, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.LIMESTONE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.LIMESTONE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.GREEN_SCHIST, 1, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.GREEN_SCHIST, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.BLUE_SCHIST, 1, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.BLUE_SCHIST, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.KIMBERLITE, 3, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.KIMBERLITE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.QUARTZITE, 4, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.QUARTZITE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.GRANITE, 3, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.GRANITE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.GRANITE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.DIORITE, 3, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.DIORITE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.DIORITE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(GregTechData.ANDESITE, 4, OVERWORLD);
        WorldGenStoneLayer.add(GregTechData.ANDESITE, 1, OVERWORLD); //Ores
        WorldGenStoneLayer.add(GregTechData.ANDESITE, 1, OVERWORLD); //Ores

        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(Coal).asState(), 1, OVERWORLD);
        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(Lignite).asState(), 1, OVERWORLD);
        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(Salt).asState(), 1, OVERWORLD);
        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(RockSalt).asState(), 1, OVERWORLD);
        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(Bauxite).asState(), 1, OVERWORLD);
        WorldGenStoneLayer.add(Data.ORE_STONE.get().get(OilShale).asState(), 1, OVERWORLD);

        WorldGenStoneLayer.addCollision(GregTechData.BASALT.getState(), GregTechData.LIMESTONE.getState(),
            new StoneLayerOre(Ilmenite, U8, 0, 32),
            new StoneLayerOre(Rutile, U12, 0, 32)
        );

        if (AntimatterConfig.WORLD.ORE_VEINS) {
            new WorldGenVeinLayer("naquadah", 10, 60, 10, 5, 32, Naquadah, Naquadah, Naquadah, EnrichedNaquadah, THE_END);
            //new WorldGenVeinLayer("lignite", 50, 130, 160, 8, 32, Lignite, Lignite, Lignite, Coal, OVERWORLD);
            //new WorldGenVeinLayer("coal", 50, 80, 80, 6, 32, Coal, Coal, Coal, Lignite, OVERWORLD);
            new WorldGenVeinLayer("magnetite", 50, 120, 160, 3, 32, Magnetite, Magnetite, Iron, VanadiumMagnetite, OVERWORLD, THE_NETHER);
            new WorldGenVeinLayer("gold", 60, 80, 160, 3, 32, Magnetite, Magnetite, VanadiumMagnetite, Gold, OVERWORLD);
            new WorldGenVeinLayer("iron", 10, 40, 120, 4, 24, BrownLimonite, YellowLimonite, BandedIron, Malachite, OVERWORLD, THE_NETHER);
            new WorldGenVeinLayer("cassiterite", 40, 120, 50, 5, 24, Tin, Tin, Cassiterite, Tin, OVERWORLD, THE_END);
            new WorldGenVeinLayer("tetrahedrite", 80, 120, 70, 4, 24, Tetrahedrite, Tetrahedrite, Copper, Stibnite, OVERWORLD, THE_NETHER);
            new WorldGenVeinLayer("nether_quartz", 40, 80, 80, 5, 24, NetherQuartz, NetherQuartz, NetherQuartz, NetherQuartz, THE_NETHER);
            new WorldGenVeinLayer("sulfur", 5, 20, 100, 5, 24, Sulfur, Sulfur, Pyrite, Sphalerite, THE_NETHER);
            new WorldGenVeinLayer("copper", 10, 30, 80, 4, 24, Chalcopyrite, Iron, Pyrite, Copper, OVERWORLD, THE_NETHER);
            //new WorldGenVeinLayer("bauxite", 50, 90, 80, 4, 24, Bauxite, Bauxite, Aluminium, Ilmenite, OVERWORLD);
            //new WorldGenVeinLayer("salts", 50, 60, 50, 3, 24, RockSalt, Salt, Lepidolite, Spodumene, OVERWORLD);
            new WorldGenVeinLayer("redstone", 10, 40, 60, 3, 24, Redstone, Redstone, Ruby, Cinnabar, OVERWORLD, THE_NETHER);
            new WorldGenVeinLayer("soapstone", 10, 40, 40, 3, 16, Soapstone, Talc, Glauconite, Pentlandite, OVERWORLD);
            new WorldGenVeinLayer("nickel", 10, 40, 40, 3, 16, Garnierite, Nickel, Cobaltite, Pentlandite, OVERWORLD, THE_NETHER, THE_END);
            new WorldGenVeinLayer("platinum", 40, 50, 5, 3, 16, Cooperite, Palladium, Platinum, Iridium, OVERWORLD, THE_END);
            new WorldGenVeinLayer("pitchblende", 10, 40, 40, 3, 16, Pitchblende, Pitchblende, Uraninite, Uraninite, OVERWORLD);
            new WorldGenVeinLayer("uranium", 20, 30, 20, 3, 16, Uraninite, Uraninite, Uranium, Uranium, OVERWORLD);
            new WorldGenVeinLayer("monazite", 20, 40, 30, 3, 16, Bastnasite, Bastnasite, Bastnasite/*Monazite*/, Neodymium, OVERWORLD);
            new WorldGenVeinLayer("molybdenum", 20, 50, 5, 3, 16, Wulfenite, Molybdenite, Molybdenum, Molybdenum/*Powellite*/, OVERWORLD, THE_END);
            new WorldGenVeinLayer("tungstate", 20, 50, 10, 3, 16, Scheelite, Scheelite, Tungstate, Lithium, OVERWORLD, THE_END);
            new WorldGenVeinLayer("sapphire", 10, 40, 60, 3, 16, Almandine, Pyrope, BlueSapphire, GreenSapphire, OVERWORLD);
            new WorldGenVeinLayer("manganese", 20, 30, 20, 3, 16, Grossular, Spessartine, Pyrolusite, Tantalite, OVERWORLD, THE_END);
            new WorldGenVeinLayer("quartz", 40, 80, 60, 3, 16, Quartzite, Barite, Barite/*CertusQuartz*/, Barite/*CertusQuartz*/, OVERWORLD);
            new WorldGenVeinLayer("diamond", 5, 20, 40, 2, 16, Graphite, Graphite, Diamond, Coal, OVERWORLD);
            new WorldGenVeinLayer("olivine", 10, 40, 60, 3, 16, Bentonite, Magnesite, Olivine, Glauconite, OVERWORLD, THE_END);
            //new WorldGenLayer("apatite", 40, 60, 60, 3, 16, Apatite, Apatite, TricalciumPhosphate, Pyrochlore);
            new WorldGenVeinLayer("gelena", 30, 60, 40, 5, 16, Galena, Galena, Silver, Lead, OVERWORLD);
            new WorldGenVeinLayer("lapis", 20, 50, 40, 5, 16, Lapis/*Lazurite*/, Lapis/*Sodalite*/, Lapis, Calcite, OVERWORLD, THE_END);
            new WorldGenVeinLayer("beryllium", 5, 30, 30, 3, 16, Beryllium, Beryllium, Emerald, Thorium, OVERWORLD, THE_END);
            new WorldGenVeinLayer("oilsands", 50, 80, 80, 6, 32, Oilsands, Oilsands, Oilsands, Oilsands, OVERWORLD);
        }

        new WorldGenOreSmall(60, 120, 16, Chalcopyrite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(60, 120, 16, Cassiterite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(60, 120, 16, Copper, OVERWORLD, THE_NETHER, THE_END, MOON, MARS);
        new WorldGenOreSmall(60, 120, 16, Tin, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(80, 120, 8, Bismuth, OVERWORLD, THE_NETHER, MOON, MARS);
        new WorldGenOreSmall(60, 100, 24, Coal, OVERWORLD);

        //TODO replace and also swap ORE_SMALL tags in Materials
        //new WorldGenOreSmall(40, 80, 24, Hematite, OVERWORLD, THE_NETHER, THE_END, MOON, MARS);
        new WorldGenOreSmall(40, 80, 16, Iron, OVERWORLD, THE_NETHER, THE_END, MOON, MARS);

        new WorldGenOreSmall(40, 80, 6, Salt, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(40, 80, 6, RockSalt, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(30, 60, 12, Sphalerite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(40, 70, 4, Zinc, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);

        //TODO replace and also swap ORE_SMALL tags in Materials
        //new WorldGenOreSmall(30, 60, 2, Smithsonite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(20, 40, 8, Nickel, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);

        new WorldGenOreSmall(40, 80, 8, Galena, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(40, 80, 8, Lead, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 4, Gold, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 4, Pyrite, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 4, Silver, OVERWORLD, THE_NETHER, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 4, Pyrolusite, OVERWORLD, THE_NETHER, THE_END, MOON, MARS);
        new WorldGenOreSmall(20, 40, 4, Garnierite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(20, 40, 4, Pentlandite, OVERWORLD, THE_NETHER, THE_END, MARS);
        new WorldGenOreSmall(20, 40, 2, Stibnite, OVERWORLD, THE_NETHER, THE_END, MARS);
        //new WorldGenOreSmall(20, 40, 8, Asbestos, OVERWORLD);
        //new WorldGenOreSmall(20, 40, 4, Eudialyte, OVERWORLD);
        //new WorldGenOreSmall(20, 40, 4, Azurite, OVERWORLD);
        //new WorldGenOreSmall(1, 250, 1, Zeolite, OVERWORLD);
        new WorldGenOreSmall(20, 40, 4, Lapis, OVERWORLD);
        new WorldGenOreSmall(5, 20, 8, Redstone, OVERWORLD, THE_NETHER, MARS);
        new WorldGenOreSmall(5, 10, 2, Graphite, OVERWORLD, THE_NETHER, MARS);
        //new WorldGenOreSmall(5, 50, 1, Sheelite, OVERWORLD, THE_END, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 4, Cooperite, THE_END, ASTEROIDS);
        //new WorldGenOreSmall(20, 40, 4, Sperrylite, THE_END, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 6, Platinum, THE_END, ASTEROIDS);
        new WorldGenOreSmall(20, 40, 6, Iridium, THE_END, ASTEROIDS);
        new WorldGenOreSmall(30, 120, 64, NetherQuartz, THE_NETHER);
        new WorldGenOreSmall(10, 60, 8, Saltpeter, THE_NETHER);
        //new WorldGenOreSmall(10, 60, 8, SodiumNitrate, THE_NETHER);
        new WorldGenOreSmall("sulfur_nether", 10, 60, 32, Sulfur, THE_NETHER);
        new WorldGenOreSmall("sulfur_overworld", 5, 15, 8, Sulfur, OVERWORLD, MARS);

        //TODO replace with GarnetSand?
        new WorldGenOreSmall(5, 250, 1, RedGarnet, OVERWORLD, THE_NETHER, MARS, ASTEROIDS);
        new WorldGenOreSmall(5, 250, 1, YellowGarnet, OVERWORLD, THE_NETHER, MARS, ASTEROIDS);

        new WorldGenOreSmall(5, 10, 2, Diamond, OVERWORLD, THE_NETHER, MOON, MARS, ASTEROIDS);
        new WorldGenOreSmall(5, 250, 1, Emerald, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Aquamarine, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Morganite, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Heliodor, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Goshenite, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Bixbite, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Maxixe, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Dioptase, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Ruby, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, BlueSapphire, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, GreenSapphire, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, YellowSapphire, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, OrangeSapphire, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, PurpleSapphire, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Olivine, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Craponite, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Topaz, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Tanzanite, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Amethyst, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Alexandrite, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Opal, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Jasper, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, BlueTopaz, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, BalasRuby, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Spinel, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Pyrope, OVERWORLD, MARS);

        new WorldGenOreSmall(5, 250, 1, Almandine, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Spessartine, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Andradite, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Grossular, OVERWORLD, MARS);
        new WorldGenOreSmall(5, 250, 1, Uvarovite, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Jade, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Amazonite, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, RedOnyx, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, BlackOnyx, OVERWORLD, MARS);
        //new WorldGenOreSmall(5, 250, 1, Amber, OVERWORLD, MARS);
    }
}

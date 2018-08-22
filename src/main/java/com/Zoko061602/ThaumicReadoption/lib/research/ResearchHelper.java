package com.Zoko061602.ThaumicReadoption.lib.research;

import net.minecraft.block.Block;
import thaumcraft.api.research.ResearchEntry.EnumResearchMeta;
import thaumcraft.api.research.ResearchStage;
import thaumcraft.api.research.theorycraft.TheorycraftCard;
import thaumcraft.api.research.theorycraft.TheorycraftManager;

public class ResearchHelper {

	private static class REB extends ResearchEntryBuilder{}
	public static class RSB extends ResearchStageBuilder{}
	public static class RAB extends ResearchAddendumBuilder{}



	public static void makeResearch(String tag, String tab, String name, int Xpos, int Ypos, Object icon,ResearchStage[] stages,String[] parents, EnumResearchMeta... meta) {
		 ResearchEntryBuilder reb = new REB().setBaseInfo(tag, tab, name, Xpos, Ypos, icon);
		 reb.setStages(stages);
         reb.setParents(parents);
         reb.setMeta(meta);
         reb.buildAndRegister();
		}

	public static void makeReadoptionResearch(String tag,String name, int Xpos, int Ypos,Object icon, ResearchStage[] stages, String[] parents, EnumResearchMeta... meta) {
			makeResearch(tag, "READOPTION", name, Xpos, Ypos, icon, stages, parents, meta);
		}

	public static void createAid(Block block, Class<TheorycraftCard>[] cards) {
		if(TheorycraftManager.aids.get(block.getLocalizedName())==null)
         TheorycraftManager.aids.put(block.getLocalizedName(), new AidBase(block, cards));
	}

}
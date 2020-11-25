package com.mindtree.pratice2.entity;

public class Block {
	
	private int blockId;
	private String blockName;
	public Block() {
		super();
	}
	public Block(int blockId, String blockName) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
	}
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	@Override
	public String toString() {
		return "Block [blockId=" + blockId + ", blockName=" + blockName + "]";
	}
	

}

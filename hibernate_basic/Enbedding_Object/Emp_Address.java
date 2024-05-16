package hibernate_basic.Enbedding_Object;

import jakarta.persistence.Embeddable;

@Embeddable
public class Emp_Address {
	private String district;
	private String block;
	private String village;
	private int word;
	private int makan_No;

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getWord() {
		return word;
	}

	public void setWord(int word) {
		this.word = word;
	}

	public int getMakan_No() {
		return makan_No;
	}

	public void setMakan_No(int makan_No) {
		this.makan_No = makan_No;
	}

}

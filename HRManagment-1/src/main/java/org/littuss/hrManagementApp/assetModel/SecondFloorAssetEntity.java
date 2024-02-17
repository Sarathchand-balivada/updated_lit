package org.littuss.hrManagementApp.assetModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SecondFloorAssetEntity")


public class SecondFloorAssetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String normalChairs;
	private String wheelChairs;
	private String acRemotes;
	private String fanRemotes;
	private String pedestals;
	private String airConditioners;
	private String laptops;
	private String mouse;
	private String chargers;
	private String bags;
	private String fans;
	private String dustbins;
	private String tables;
	public SecondFloorAssetEntity() {
		
	}
	public SecondFloorAssetEntity(long id, String normalChairs, String wheelChairs, String acRemotes, String fanRemotes,
			String pedestals, String airConditioners, String laptops, String mouse, String chargers, String bags,
			String fans, String dustbins, String tables) {
		super();
		this.id = id;
		this.normalChairs = normalChairs;
		this.wheelChairs = wheelChairs;
		this.acRemotes = acRemotes;
		this.fanRemotes = fanRemotes;
		this.pedestals = pedestals;
		this.airConditioners = airConditioners;
		this.laptops = laptops;
		this.mouse = mouse;
		this.chargers = chargers;
		this.bags = bags;
		this.fans = fans;
		this.dustbins = dustbins;
		this.tables = tables;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNormalChairs() {
		return normalChairs;
	}
	public void setNormalChairs(String normalChairs) {
		this.normalChairs = normalChairs;
	}
	public String getWheelChairs() {
		return wheelChairs;
	}
	public void setWheelChairs(String wheelChairs) {
		this.wheelChairs = wheelChairs;
	}
	public String getAcRemotes() {
		return acRemotes;
	}
	public void setAcRemotes(String acRemotes) {
		this.acRemotes = acRemotes;
	}
	public String getFanRemotes() {
		return fanRemotes;
	}
	public void setFanRemotes(String fanRemotes) {
		this.fanRemotes = fanRemotes;
	}
	public String getPedestals() {
		return pedestals;
	}
	public void setPedestals(String pedestals) {
		this.pedestals = pedestals;
	}
	public String getAirConditioners() {
		return airConditioners;
	}
	public void setAirConditioners(String airConditioners) {
		this.airConditioners = airConditioners;
	}
	public String getLaptops() {
		return laptops;
	}
	public void setLaptops(String laptops) {
		this.laptops = laptops;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public String getChargers() {
		return chargers;
	}
	public void setChargers(String chargers) {
		this.chargers = chargers;
	}
	public String getBags() {
		return bags;
	}
	public void setBags(String bags) {
		this.bags = bags;
	}
	public String getFans() {
		return fans;
	}
	public void setFans(String fans) {
		this.fans = fans;
	}
	public String getDustbins() {
		return dustbins;
	}
	public void setDustbins(String dustbins) {
		this.dustbins = dustbins;
	}
	public String getTables() {
		return tables;
	}
	public void setTables(String tables) {
		this.tables = tables;
	}
	@Override
	public String toString() {
		return "SecondFloorAssetEntity [id=" + id + ", normalChairs=" + normalChairs + ", wheelChairs=" + wheelChairs
				+ ", acRemotes=" + acRemotes + ", fanRemotes=" + fanRemotes + ", pedestals=" + pedestals
				+ ", airConditioners=" + airConditioners + ", laptops=" + laptops + ", mouse=" + mouse + ", chargers="
				+ chargers + ", bags=" + bags + ", fans=" + fans + ", dustbins=" + dustbins + ", tables=" + tables
				+ "]";
	}
	
	
}
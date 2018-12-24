package hw.cloud.prometheus.entity;

import java.math.BigDecimal;

public class CityRates {

	private Long id;

	private String cityName;
	private String province;
	private BigDecimal pensionRatePerson;
	private BigDecimal medicalRatePerson;
	private BigDecimal unempolyeeRatePerson;
	private BigDecimal basicHousingRatePerson;
	private BigDecimal supplementHousingRatePerson;

	public CityRates() {
		super();
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public BigDecimal getPensionRatePerson() {
		return pensionRatePerson;
	}

	public void setPensionRatePerson(BigDecimal pensionRatePerson) {
		this.pensionRatePerson = pensionRatePerson;
	}

	public BigDecimal getMedicalRatePerson() {
		return medicalRatePerson;
	}

	public void setMedicalRatePerson(BigDecimal medicalRatePerson) {
		this.medicalRatePerson = medicalRatePerson;
	}

	public BigDecimal getUnempolyeeRatePerson() {
		return unempolyeeRatePerson;
	}

	public void setUnempolyeeRatePerson(BigDecimal unempolyeeRatePerson) {
		this.unempolyeeRatePerson = unempolyeeRatePerson;
	}

	public BigDecimal getBasicHousingRatePerson() {
		return basicHousingRatePerson;
	}

	public void setBasicHousingRatePerson(BigDecimal basicHousingRatePerson) {
		this.basicHousingRatePerson = basicHousingRatePerson;
	}

	public BigDecimal getSupplementHousingRatePerson() {
		return supplementHousingRatePerson;
	}

	public void setSupplementHousingRatePerson(BigDecimal supplementHousingRatePerson) {
		this.supplementHousingRatePerson = supplementHousingRatePerson;
	}
	
	@Override
	public String toString() {
		return "CityRates [id=" + id + ", cityName=" + cityName + ", province=" + province + ", pensionRatePerson="
				+ pensionRatePerson + ", medicalRatePerson=" + medicalRatePerson + ", unempolyeeRatePerson="
				+ unempolyeeRatePerson + ", basicHousingRatePerson=" + basicHousingRatePerson
				+ ", supplementHousingRatePerson=" + supplementHousingRatePerson + "]";
	}

}

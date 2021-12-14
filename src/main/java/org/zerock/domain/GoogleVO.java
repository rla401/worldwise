package org.zerock.domain;

public class GoogleVO {
		
	private String areaCd;
	private String cdNm;
	private String regionArea;
	private String col0;
	private String col1;
	private String col2;
	private String col3;
	private String col4;
	private String col5;
	private String col6;
	private String col7;
	private String col8;
	private String col9;
	private int tot;
	
	public GoogleVO() {
		
	}

	public GoogleVO(String areaCd, String cdNm, String regionArea, String col0, String col1, String col2, String col3,
			String col4, String col5, String col6, String col7, String col8, String col9, int tot) {
		super();
		this.areaCd = areaCd;
		this.cdNm = cdNm;
		this.regionArea = regionArea;
		this.col0 = col0;
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
		this.col4 = col4;
		this.col5 = col5;
		this.col6 = col6;
		this.col7 = col7;
		this.col8 = col8;
		this.col9 = col9;
		this.tot = tot;
	}

	public String getAreaCd() {
		return areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	public String getCdNm() {
		return cdNm;
	}

	public void setCdNm(String cdNm) {
		this.cdNm = cdNm;
	}

	public String getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(String regionArea) {
		this.regionArea = regionArea;
	}

	public String getCol0() {
		return col0;
	}

	public void setCol0(String col0) {
		this.col0 = col0;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2;
	}

	public String getCol3() {
		return col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3;
	}

	public String getCol4() {
		return col4;
	}

	public void setCol4(String col4) {
		this.col4 = col4;
	}

	public String getCol5() {
		return col5;
	}

	public void setCol5(String col5) {
		this.col5 = col5;
	}

	public String getCol6() {
		return col6;
	}

	public void setCol6(String col6) {
		this.col6 = col6;
	}

	public String getCol7() {
		return col7;
	}

	public void setCol7(String col7) {
		this.col7 = col7;
	}

	public String getCol8() {
		return col8;
	}

	public void setCol8(String col8) {
		this.col8 = col8;
	}

	public String getCol9() {
		return col9;
	}

	public void setCol9(String col9) {
		this.col9 = col9;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	@Override
	public String toString() {
		return "GoogleVO [areaCd=" + areaCd + ", cdNm=" + cdNm + ", regionArea=" + regionArea + ", col0=" + col0
				+ ", col1=" + col1 + ", col2=" + col2 + ", col3=" + col3 + ", col4=" + col4 + ", col5=" + col5
				+ ", col6=" + col6 + ", col7=" + col7 + ", col8=" + col8 + ", col9=" + col9 + ", tot=" + tot + "]";
	}
}

package QuanliCLB.model;

public class Permission {
	public String idPhanQuyen;
	public int PhanQuyen;
	public String tenModule;
	public String icon;
	public String linkForm;
	
	public Permission() {
		// TODO Auto-generated constructor stub
	}

	public Permission(String idPhanQuyen, int phanQuyen, String tenModule, String icon, String linkForm) {
		this.idPhanQuyen = idPhanQuyen;
		PhanQuyen = phanQuyen;
		this.tenModule = tenModule;
		this.icon = icon;
		this.linkForm = linkForm;
	}

	public String getIdPhanQuyen() {
		return idPhanQuyen;
	}

	public void setIdPhanQuyen(String idPhanQuyen) {
		this.idPhanQuyen = idPhanQuyen;
	}

	public int getPhanQuyen() {
		return PhanQuyen;
	}

	public void setPhanQuyen(int phanQuyen) {
		PhanQuyen = phanQuyen;
	}

	public String getTenModule() {
		return tenModule;
	}

	public void setTenModule(String tenModule) {
		this.tenModule = tenModule;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLinkForm() {
		return linkForm;
	}

	public void setLinkForm(String linkForm) {
		this.linkForm = linkForm;
	}
	
	
}

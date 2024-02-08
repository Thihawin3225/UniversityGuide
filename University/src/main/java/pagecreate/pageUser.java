package pagecreate;

public class pageUser {
    private int id;
    private String uniname;
    private String location;
    private String desc;
    private String logo;
    private String image;
	public pageUser(int id, String uniname, String location, String desc, String logo, String image) {
		super();
		this.id = id;
		this.uniname = uniname;
		this.location = location;
		this.desc = desc;
		this.logo = logo;
		this.image = image;
	}
	public pageUser(String uniname, String location, String desc, String logo, String image) {
		super();
		this.uniname = uniname;
		this.location = location;
		this.desc = desc;
		this.logo = logo;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
    
    
    
}


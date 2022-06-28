
public class User {
	private int id;
	private String name,username,password,gender,programmingskill,contact,email,college,skills2,skills3,skills4;
	
	
	
	

	
	public User(int id, String contact, String name, String username, String password, String gender,
			String programmingskill, String email) {
		super();
		this.id = id;
		this.contact = contact;
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.programmingskill = programmingskill;
		this.email = email;
	}
	
	public User(String contact, String name, String username, String password, String gender, String programmingskill,
			String email) {
		super();
		this.contact = contact;
		this.name = name;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.programmingskill = programmingskill;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProgrammingskill() {
		return programmingskill;
	}
	public void setProgrammingskill(String programmingskill) {
		this.programmingskill = programmingskill;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills2() {
		return skills2;
	}

	public void setSkills2(String skills2) {
		this.skills2 = skills2;
	}

	public String getSkills3() {
		return skills3;
	}

	public void setSkills3(String skills3) {
		this.skills3 = skills3;
	}

	public String getSkills4() {
		return skills4;
	}

	public void setSkills4(String skills4) {
		this.skills4 = skills4;
	}

	
	
}


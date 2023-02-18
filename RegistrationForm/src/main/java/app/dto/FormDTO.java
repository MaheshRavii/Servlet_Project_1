package app.dto;

import java.util.Arrays;

public class FormDTO 
{
	private String name;
	private String email;
	private int age;
	private String occupation;
//	private String ans;
	private String [] skills;
	private String cmds;
	public FormDTO(String name, String email, int age, String occupation, String[] skills, String cmds) 
	{
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.occupation = occupation;
		this.skills = skills;
		this.cmds = cmds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getCmds() {
		return cmds;
	}
	public void setCmds(String cmds) {
		this.cmds = cmds;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}

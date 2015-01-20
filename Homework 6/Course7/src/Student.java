
public class Student {
	private String name;
	private String sirName;
	private String fakNum;
	private String group;
	
	public Student(String name, String sirName, String fakNum, String group){
		super();
		this.name = name;
		this.sirName = sirName;
		this.fakNum = fakNum;
		this.group = group;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + this.name + ", sirName=" + this.sirName + ", fakNum="
				+ this.fakNum + ", group=" + this.group + "]";
	}
}

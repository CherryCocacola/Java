package Chapter9;

public class Get_set {
	private String name;
	private String id;
	private int no;
	private int hp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name+"/이채은/이태훈";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no =no ;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp+8;
	}
}

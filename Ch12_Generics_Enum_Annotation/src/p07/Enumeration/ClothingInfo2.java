package p07.Enumeration;

public class ClothingInfo2 
{
	String code, name, material;
	int season;
	static final int SPRING = 1;
	static final int SUMMER = 2;
	static final int AUTUMN = 3;
	static final int WINTER = 4;
	
	public ClothingInfo2(String code, String name, String material, int season) 
	{
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getMaterial() 
	{
		return material;
	}

	public void setMaterial(String material) 
	{
		this.material = material;
	}

	public int getSeason() 
	{
		return season;
	}

	public void setSeason(int season) 
	{
		this.season = season;
	}
}
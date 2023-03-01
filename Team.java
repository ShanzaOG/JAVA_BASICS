public class Team
{
	/* This is a Team with one member.
	 * The member has a name, type, level and rank
	 */
	Member member;
	public Team(Member member)// Who is in this Team?
	{
		this.member = member;// one 'member' is in this Team
	}

	//our main entry point
	public static void main(String[] args)
	{
		Member myMember = new Member("Shanza", "Allan", 10, 1);
		Team myTeam = new Team(myMember);
		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
	}
}

class Member 
{
	private String name;
	private String type;
	private int level;//integer
	private int rank; 

	public Member(String name, String type, int level, int rank)
	{
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}

/* Let's define our getter functions here */
	public String getName()//what is your name?
	{
		return this.name;//this is my name?
	}

	public String getType()
	{
		return this.type;
	}

	public int getLevel()
	{
		return this.level;
	}

	public int getRank()
	{
		return this.rank;
	}
}


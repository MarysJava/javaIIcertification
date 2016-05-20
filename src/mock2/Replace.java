package mock2;

class Replace {
	public static void main(String[] args) {
		String talk = "Pick a little, talk a little, pick a little, talk a little, cheep cheep cheep, talk a lot, pick a little more";
		String eat = talk.replaceAll("talk", "eat").replace("cheep", "burp");
		System.out.println(eat);
	}
}
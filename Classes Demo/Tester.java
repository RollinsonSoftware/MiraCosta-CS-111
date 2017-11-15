public class Tester
{
	public static void main(String[] args)
	{
		Tweet myFirstTweet;
		
		myFirstTweet = new Tweet();
		myFirstTweet.setTimeStamp("03/16/2016 12:07 PM");
		myFirstTweet.setMessage("hello world!");
		System.out.println( myFirstTweet.toString() );
		myFirstTweet.incrementLikes();
		System.out.println("Number of likes: " + myFirstTweet.getLikes() );
		myFirstTweet.incrementLikes();
		System.out.println("Number of likes: " + myFirstTweet.getLikes() );
		myFirstTweet.incrementLikes();
		System.out.println("Number of likes: " + myFirstTweet.getLikes() );
	}

}

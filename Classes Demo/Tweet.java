public class Tweet
{
	private String message, timeStamp;
	private char category;
	private int numLikes;
	
	public String toString()
	{
		return "Tweet: " + message + " @ " + timeStamp + " (" + category + ") [Likes: " +
		 numLikes + "] ";
	}
	//PRECONDITION: timeStamp argument is valid.
	public void setTimeStamp(String timeStamp)
	{
		this.timeStamp = timeStamp;
	}
	public boolean setMessage(String message)
	{
		int messageSize;
		messageSize = message.length();
		if ((messageSize > 0) && (messageSize <= 140))
		{
			this.message = message;
			return true; 
		}
		else
		{
			return false;
		}
	}
	public void incrementLikes()
	{
		++numLikes;
	}
	public int getLikes()
	{
		return numLikes;
	}
	public boolean equals(Tweet other)
	{
		return this.numLikes == other.numLikes &&
		 this.message.equals(other.message) &&
		 this.timeStamp.equals(other.timeStamp) &&
		 this.category == other.category;
	}
}

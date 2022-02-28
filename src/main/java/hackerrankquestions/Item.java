package hackerrankquestions;

public class Item {

	private String mediatype;
	private String mediaid;
	
	public Item(String mediatype, String mediaid) {
		super();
		this.mediatype = mediatype;
		this.mediaid = mediaid;
	}

	public String getMediatype() {
		return mediatype;
	}

	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}

	public String getMediaid() {
		return mediaid;
	}

	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
	}
	
	
}

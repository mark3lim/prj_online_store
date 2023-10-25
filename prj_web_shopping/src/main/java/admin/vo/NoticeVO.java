package admin.vo;

public class NoticeVO {
	
	private String noticeTitle, noticeText, noticeDate;
	private int ncode, viewNum;
	
	public NoticeVO() {
	}

	public NoticeVO(String noticeTitle, String noticeText, String noticeDate, int ncode, int viewNum) {
		this.noticeTitle = noticeTitle;
		this.noticeText = noticeText;
		this.noticeDate = noticeDate;
		this.ncode = ncode;
		this.viewNum = viewNum;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeText() {
		return noticeText;
	}

	public void setNoticeText(String noticeText) {
		this.noticeText = noticeText;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public int getNcode() {
		return ncode;
	}

	public void setNcode(int ncode) {
		this.ncode = ncode;
	}

	public int getViewNum() {
		return viewNum;
	}

	public void setViewNum(int viewNum) {
		this.viewNum = viewNum;
	}

	@Override
	public String toString() {
		return "NoticeVO [noticeTitle=" + noticeTitle + ", noticeText=" + noticeText + ", noticeDate=" + noticeDate
				+ ", ncode=" + ncode + ", viewNum=" + viewNum + "]";
	}
}
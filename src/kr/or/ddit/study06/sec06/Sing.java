package kr.or.ddit.study06.sec06;

public class Sing {
	// 노래 제목
	// 노래 가사 일부
	// 가수
	// 발매년도
	
	private String title;
	private String lyrics;
	private String singer;
	private String pubYear;
	
	
    // getter : 데이터를 반환할 때
	// setter : 데이터를 입력받을 때
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
	public String getPubYear() {
		return pubYear;
	}
	public void setPubYear(String pubYear) {
		this.pubYear = pubYear;
	}
	

}

	package com.suhyeon.ex00.dto;
	
	public class BoardDto {
		
		private int bnum; //게시판번호
		private String bid;
		private String bname;
		private String bquestion;
		private String bemail;
		private String mdate; //게시판에 글 작성한 날짜(시간)
		
		public BoardDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BoardDto(int bnum, String bid, String bname, String bquestion, String bemail, String mdate) {
			super();
			this.bnum = bnum;
			this.bid = bid;
			this.bname = bname;
			this.bquestion = bquestion;
			this.bemail = bemail;
			this.mdate = mdate;
		}

		public int getBnum() {
			return bnum;
		}

		public void setBnum(int bnum) {
			this.bnum = bnum;
		}

		public String getBid() {
			return bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public String getBquestion() {
			return bquestion;
		}

		public void setBquestion(String bquestion) {
			this.bquestion = bquestion;
		}

		public String getBemail() {
			return bemail;
		}

		public void setBemail(String bemail) {
			this.bemail = bemail;
		}

		public String getMdate() {
			return mdate;
		}

		public void setMdate(String mdate) {
			this.mdate = mdate;
		}
		
	}

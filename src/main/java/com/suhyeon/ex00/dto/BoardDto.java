	package com.suhyeon.ex00.dto;
	
	public class BoardDto {
		
		private int qnum; //게시판번호
		private String qid;
		private String qname;
		private String qquestion;
		private String qemail;
		private String qdate; //게시판에 글 작성한 날짜(시간)
		
		public BoardDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BoardDto(int qnum, String qid, String qname, String qquestion, String qemail, String qdate) {
			super();
			this.qnum = qnum;
			this.qid = qid;
			this.qname = qname;
			this.qquestion = qquestion;
			this.qemail = qemail;
			this.qdate = qdate;
		}

		public int getQnum() {
			return qnum;
		}

		public void setQnum(int qnum) {
			this.qnum = qnum;
		}

		public String getQid() {
			return qid;
		}

		public void setQid(String qid) {
			this.qid = qid;
		}

		public String getQname() {
			return qname;
		}

		public void setQname(String qname) {
			this.qname = qname;
		}

		public String getQquestion() {
			return qquestion;
		}

		public void setQquestion(String qquestion) {
			this.qquestion = qquestion;
		}

		public String getQemail() {
			return qemail;
		}

		public void setQemail(String qemail) {
			this.qemail = qemail;
		}

		public String getQdate() {
			return qdate;
		}

		public void setQdate(String qdate) {
			this.qdate = qdate;
		}

		
		
	}

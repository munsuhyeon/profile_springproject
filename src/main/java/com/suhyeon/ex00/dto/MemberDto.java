	package com.suhyeon.ex00.dto;


public class MemberDto {
	
		private String mid;
		private String mpw;
		private String mname;
		private String memail;
		private String mdate; //가입한 날짜
		public MemberDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MemberDto(String mid, String mpw, String mname, String memail,String mdate) {
			super();
			this.mid = mid;
			this.mpw = mpw;
			this.mname = mname;
			this.memail = memail;
			this.mdate = mdate;
		}
		public String getMid() {
			return mid;
		}
		public void setMid(String mid) {
			this.mid = mid;
		}
		public String getMpw() {
			return mpw;
		}
		public void setMpw(String mpw) {
			this.mpw = mpw;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public String getMemail() {
			return memail;
		}
		public void setMemail(String memail) {
			this.memail = memail;
		}
		public String getMdate() {
			return memail;
		}
		public void setMdate(String mdate) {
			this.memail = memail;
		}
		
	}

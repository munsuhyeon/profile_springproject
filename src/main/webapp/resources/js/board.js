/**
 * 
 */
 
function boardConfirm() {

   if(document.reg_frm.qid.value.length == 0) {
      alert("아이디는 필수 입력사항입니다.");
      reg_frm.qid.focus();
      return;
   }
   
   if(document.reg_frm.qcontent.value.length < 4 ) {
      alert("최소 10자이상 입력해주세요");
      reg_frm.qcontent.focus();
      return;
   }
   
   if(document.reg_frm.qname.value.length == 0) {
      alert("이름은 필수사항입니다.");
      reg_frm.qname.focus();
      return;
   }
   
   if(document.reg_frm.qemail.value.length == 0) {
      alert("이메일은 필수사항입니다.");
      reg_frm.qemail.focus();
      return;
   }

   document.reg_frm.submit();
}
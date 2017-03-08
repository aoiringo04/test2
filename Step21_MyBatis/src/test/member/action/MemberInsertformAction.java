package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class MemberInsertformAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//현재는 비즈니스 로직을 수행할게 없다.
		
		return new ActionForward("/views/member/insertform.jsp");
	}
	
}











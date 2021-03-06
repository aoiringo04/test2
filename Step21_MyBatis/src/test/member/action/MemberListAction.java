package test.member.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberListAction extends Action{

	@Override
	public ActionForward execute
		(HttpServletRequest request, HttpServletResponse response) {
		//1. 회원목록을 얻어온다.
		List<MemberDto> list=MemberDao.getInstance().getList();
		//2. request 에 Model 을 담는다.
		request.setAttribute("list", list);
		//3. view 페이지로 forward 이동할수 있도록 ActionForward 객체생성
		ActionForward af=new ActionForward("/views/member/list.jsp");
		//4. ActionForward 객체 리턴해주기 
		return af;
	}

}











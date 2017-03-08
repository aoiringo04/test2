package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberInsertAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//1. 폼 전송된 파라미터 추출해서
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		//2. DB 에 저장하고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		MemberDao.getInstance().insert(dto);
		//3. redirect 이동 할수 있도록 ActionForward 객체 생성해서
		ActionForward af=new ActionForward("/member/list.do", true);
		//4. 리턴해준다. 
		return af;
	}

}



















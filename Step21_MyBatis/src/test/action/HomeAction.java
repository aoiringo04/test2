package test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class HomeAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//DB 에서 공지사항을 읽어온다.
		List<String> list=new ArrayList<>();
		list.add("어쩌구...");
		list.add("저쩌구...");
		list.add("내일 모래 크리스마스...");
		
		//request 에 담는다.
		request.setAttribute("list", list);
		
		//ActionForward 객체를 리턴해 준다.
		return new ActionForward("/views/home.jsp");
	}

}













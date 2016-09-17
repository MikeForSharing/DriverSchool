package com.lhh.car.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Finance;
import com.lhh.car.domain.Reserve;
import com.lhh.car.domain.User;
import com.lhh.car.util.CoachUtil;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class FinanceAction extends BaseAction<Finance> {
	
	private Long userId;
	
	//列表
	public String list() throws Exception {	
		List<Finance> financeList = financeService.findAll();
		ActionContext.getContext().put("financeList", financeList);
 		return "list";
	}
	
	//删除页面
		public String delete() throws Exception {
			financeService.delete(model.getId());
			return "toList";
		}
		
		
		public String addUI() throws Exception {
			//将user列表信息列出
			List<User> userList = userService.findAll();
			ActionContext.getContext().put("userList", userList);
			
			return "saveUI";
		}
		
		public String add() throws Exception {
			//将数据封装到对象中（当model是实体类型时，将未封装的属性设置到model后，可以使用model）
			model.setUser(userService.getById(userId));

			//将对象保存到数据库中
//			if(model.getUser().getId().equals(userId)) {
//				return "repeat";
//			} else {
				financeService.save(model);
				return "toList";
//			}
			
		}
		
		public String editUI() throws Exception {
			//将user列表信息列出
			//将user列表信息列出
			List<User> userList = userService.findAll();
			ActionContext.getContext().put("userList", userList);
			
			
			//数据回显
			Finance finance = financeService.getById(model.getId());
			ActionContext.getContext().getValueStack().push(finance);
			if(finance.getUser() != null) {
				userId = finance.getUser().getId();
			}
			return "saveUI";
		}

		public String edit() throws Exception {
			//1:将对象从数据库中拿出
			Finance finance = financeService.getById(model.getId());
			//2:设置对象的属性
			finance.setDate(model.getDate());
			finance.setMoney(model.getMoney());
			finance.setType(model.getType());
			finance.setUser(userService.getById(userId));
//			reserve.setCoach(coachService.getById(userId));

			//3:将对象保存到数据库
			financeService.update(finance);
			
			return "toList";
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

}

package util;

import java.text.SimpleDateFormat;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;


public class DateBindingInitializer implements WebBindingInitializer{

	@Override
	public void initBinder(WebDataBinder arg0, WebRequest arg1) {
		// TODO Auto-generated method stub
		System.out.println("注册全局日期转换器");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		MyCustomDateEdtior edtior=new MyCustomDateEdtior(sdf,true);
		arg0.registerCustomEditor(java.util.Date.class, edtior);
	}
	
	
}

package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.StringUtils;

public class MyCustomDateEdtior extends CustomDateEditor{
	private final DateFormat dateFormat;
	private final boolean allowEmpty;
	private final int exactDateLength;
	
	public MyCustomDateEdtior(DateFormat dateFormat, boolean allowEmpty) {
		super(dateFormat, allowEmpty);
		this.dateFormat=dateFormat;
		this.allowEmpty=allowEmpty;
		this.exactDateLength=-1;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setAsText(String arg0) throws IllegalArgumentException {
		if (this.allowEmpty&&!StringUtils.hasText(arg0)) {
			setValue(null);
		}else if (arg0!=null&&this.exactDateLength>=0&&arg0.length()!=this.exactDateLength) {
			throw new IllegalAccessError("Could not parse date: it is not exactly" + this.exactDateLength + "characters long");
		}else {
			if (arg0!=null&&arg0.length()>"yyyy-MM-dd".length()) {
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					setValue(sdf.parse(arg0));
				} catch (ParseException ex) {
					throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
				}
			}
		}
	}
	
}

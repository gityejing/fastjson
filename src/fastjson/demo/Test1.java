package fastjson.demo;

import java.util.Date;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
public class Test1 {

	public static void main(String[] args) {
//		test();
	}
	
	@Test
	public void test(){
		User user = new User();
		user.setAge(13);
		user.setName("hello");
		user.setBirthday(new Date());
		user.setId("429005");
		String js = JSON.toJSONString(user, SerializerFeature.WriteDateUseDateFormat);
		js = JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd", SerializerFeature.WriteDateUseDateFormat);
		System.out.println(js);
	}
}

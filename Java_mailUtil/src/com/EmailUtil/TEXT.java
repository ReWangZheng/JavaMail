package com.EmailUtil;

public class TEXT {

	public static void main(String[] args)
	{
		emailUtil util=emailUtil.getEmailUtil(emailUtil.PROTOCOL_SMTP, emailUtil.COM163, "wz29370330@163.com", "wz429812");
		util.setMessage("���","wz29370330@163.com","29370330@qq.com","������Һø��˰�");
		util.send();
		
	}
}

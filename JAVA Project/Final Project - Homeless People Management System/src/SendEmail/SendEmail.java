/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SendEmail;


import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author mengtingyang
 */
public class SendEmail {
// 邮箱服务器
    private String host = "smtp.126.com";
    // 这个是你的邮箱用户名
    private String username = "yangmuxi86@126.com";
    // 你的邮箱密码
    private String password = "yangmuxi86";
    
    private String mail_head_name = "DO-NOT-REPLY REMINDER";
    private String mail_head_value = "DO-NOT-REPLY REMINDER";
    private String mail_to;
    private String mail_from = "yangmuxi86@126.com";
    private String mail_subject = "DO-NOT-REPLY REMINDER";
    private String mail_body = "This email reminds you the examination will be held on tomorrow";
    private String personalName;

    public String getMail_to() {
        return mail_to;
    }

    public void setMail_to(String mail_to) {
        this.mail_to = mail_to;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }
   
    
   
    public void send() throws Exception
    {
        try
        {
            Properties props = new Properties(); // 获取系统环境
            Authenticator auth = new Email_Autherticator(); // 进行邮件服务器用户认证
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props, auth);
            // 设置session,和邮件服务器进行通讯。
            MimeMessage message = new MimeMessage(session);
            // message.setContent("foobar, "application/x-foobar"); // 设置邮件格式
            message.setSubject(mail_subject); // 设置邮件主题
            message.setText(mail_body); // 设置邮件正文
            message.setHeader(mail_head_name, mail_head_value); // 设置邮件标题
            message.setSentDate(new Date()); // 设置邮件发送日期
            Address address = new InternetAddress(mail_from, personalName);
            message.setFrom(address); // 设置邮件发送者的地址
            Address toAddress = new InternetAddress(mail_to); // 设置邮件接收方的地址
            message.addRecipient(Message.RecipientType.TO, toAddress);
            Transport.send(message); // 发送邮件
            System.out.println("send ok!");
        } catch (Exception ex)
        {
            ex.printStackTrace();
            throw new Exception(ex.getMessage());
        }
    }
  
    public class Email_Autherticator extends Authenticator
    {
        public Email_Autherticator()
        {
            super();
        }
        public Email_Autherticator(String user, String pwd)
        {
            super();
            username = user;
            password = pwd;
        }
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(username, password);
        }
    }

}

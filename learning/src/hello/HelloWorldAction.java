package hello;
import com.opensymphony.xwork2.Action;


public class HelloWorldAction implements Action {

	private String account;
	private String password;
	private String submitFlag;
	
	public HelloWorldAction(){
		System.out.println("Action����ʼ��");
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		System.out.println("�û�����Ĳ���Ϊ��account = "+account+" ,password"+password+" ,submitFlag" +submitFlag);
		return "towelcome";
	}
	
	public String getAccount(){
		return account;
	}
	public void setAccount(String account){
		this.account = account;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getSubmitFlag(){
		return submitFlag;
	}
	public void setSubmitFlag(String submitFlag){
		this.submitFlag = submitFlag;
	}

}

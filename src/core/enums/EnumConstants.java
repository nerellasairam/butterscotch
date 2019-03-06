package core.enums;

public enum EnumConstants  {

	ONE(1,"OK"),TWO(2,"GOOD");

	
	
	
	
	int priority;
	String status;
	
	 public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	 EnumConstants (int i,String status){
		 this.priority=i;
		 this.status=status;
	 }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

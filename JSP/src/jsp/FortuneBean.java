package jsp;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{

	private String fortune = "";
	private Date today ;

	public FortuneBean() {}; //引数なしのコンストラクタ

	public String getFortune(){
		return this.fortune;
	}

	public void setFortune(String fortune) {
		this.fortune = fortune;
	}
	//getは取ってくるだけだから引数はいらない、リターンで返す
	//setはgetで取ってきたものを置くから引数で指定、戻り値はないからvoid 変数名
	public Date getToday() {
		return this.today;
	}

	public void setToday(Date today) {
		this.today = today;
	}
}

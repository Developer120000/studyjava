package com.ict.study;

import java.io.Serializable;

public class Protocol1 implements Serializable{
	int cmd;
	String msg;
	
	public Protocol1() {}

	public Protocol1(int cmd, String msg) {
		super();
		this.cmd = cmd;
		this.msg = msg;
	}

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}

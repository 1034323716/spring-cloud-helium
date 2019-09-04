package org.helium.sample.adapter.common;

import com.feinno.superpojo.SuperPojo;
import com.feinno.superpojo.annotation.Field;
import org.helium.framework.task.DedicatedTaskArgs;

public class MessageArgs extends SuperPojo implements DedicatedTaskArgs {
	@Field(id = 1)
	private String mobile;
	@Field(id = 2)
	private String type;
	@Field(id = 3)
	private int priority;
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String getTag() {
		return mobile;
	}
}

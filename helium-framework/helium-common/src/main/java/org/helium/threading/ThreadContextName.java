/*
 * FAE, Feinno App Engine
 *  
 * Create by gaolei Jun 7, 2012
 * 
 * Copyright (c) 2012 北京新媒传信科技有限公司
 */
package org.helium.threading;

import com.feinno.superpojo.type.EnumInteger;

/**
 * 预定义线程上下文
 *
 * Created by Coral
 */
public enum ThreadContextName implements EnumInteger
{
	ROOT(0),
	LOGGING_MARKER(1),
	EXECUTOR(2),
	SESSION_ID(3),
	SESSION_TASK(4),
	SESSION_CONTEXT(5),
	JAVA_FLOW(6),
	;
	private int value;
	private ThreadContextName(int value)
	{
		this.value = value;
	}
	@Override
	public int intValue()
	{
		return value;
	}
}

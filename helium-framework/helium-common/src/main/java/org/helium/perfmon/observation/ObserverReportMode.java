package org.helium.perfmon.observation;

import com.feinno.superpojo.type.EnumInteger;


/**
 * {在这里补充类的功能说明}
 * 
 * Created by Coral
 */
public enum ObserverReportMode implements EnumInteger
{
	NONE(0),
	SUMMARY(1),
	ALL(2),
	;
	
	private int value;
	
	ObserverReportMode(int value)
	{
		this.value = value;
	}
	
	@Override
	public int intValue()
	{
		return value;
	}
}

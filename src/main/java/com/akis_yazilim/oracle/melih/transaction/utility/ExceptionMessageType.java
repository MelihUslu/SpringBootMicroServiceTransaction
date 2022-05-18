package com.akis_yazilim.oracle.melih.transaction.utility;

public enum ExceptionMessageType
{
	FIND_BY_ID("Entity can not be found."),
	SAVE("Save operation is not successful."),
	DELETE("Delete operation is not successful."),
	UPDATE("Update operation is not successful."),
	FIND_ALL("Entity list can not be created.");

	private String value;

	private ExceptionMessageType(String value) {
		this.value = value;
	}

	public String getValue()
	{
		return value;
	}
}

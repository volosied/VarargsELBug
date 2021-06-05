package com.test;

public enum TestEnum implements EnumInterface {

	VALUE1("SomeValue01"),

	VALUE2("SomeValue02");

	private String messageKey;

	TestEnum(final String messageKey) {
		this.messageKey = messageKey;
	}

	@Override
	public String getMessageKey() {
		return messageKey;
	}
}

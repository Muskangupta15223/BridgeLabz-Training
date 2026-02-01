package com.functionalinterface.sensitivedatatagging;

import java.util.function.Function;

public interface EncryptionUtils {
	
	   static Function<String, String> encrypt =
	            data -> "ENC(" + data + ")";
}

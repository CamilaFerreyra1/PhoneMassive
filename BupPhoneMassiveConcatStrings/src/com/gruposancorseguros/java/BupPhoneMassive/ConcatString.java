package com.gruposancorseguros.java.BupPhoneMassive;

public class ConcatString {
/*
	public static String concatStringFound(String documentNumberSrh, String tributaryCodeNumberSrh, 
												String fullNameSrh, String originIDSrh, String personIDRes,
												String documentTypeIDRes, String documentNumberRes, String tributaryCodeTypeIDRes,
												String tributaryCodeNumberRes, String lastNameRes, String firstNameRes,
												String birthDateRes, String deathDateRes, String genderIDRes, String entityTypeIDRes) {
		
		StringBuffer foundBuff = new StringBuffer();
		char dotAndComma = ';';
		foundBuff.append(documentNumberSrh);
		foundBuff.append(dotAndComma);
		foundBuff.append(tributaryCodeNumberSrh);
		foundBuff.append(dotAndComma);
		foundBuff.append(fullNameSrh);
		foundBuff.append(dotAndComma);
		foundBuff.append(originIDSrh);
		foundBuff.append(dotAndComma);
		foundBuff.append(personIDRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(documentTypeIDRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(documentNumberRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(tributaryCodeTypeIDRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(tributaryCodeNumberRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(lastNameRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(firstNameRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(birthDateRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(deathDateRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(genderIDRes);
		foundBuff.append(dotAndComma);
		foundBuff.append(entityTypeIDRes);
		foundBuff.append("\n");
		
		return foundBuff.toString();
	}
	*/
	public static String concatStringFound (String FullName, String DocumentTypeId, String DocumentNumber,String TributaryCodeTypeId,
			String TributaryCodeNumber,  String PersonId, String PhoneTypeId,
			String AreaCode,String PhoneNumber, String PhoneId, String Error) {
	    StringBuffer foundBuff = new StringBuffer();
	    char semicolon = ';';
	    
	    foundBuff.append(FullName);
	    foundBuff.append(semicolon);
	    foundBuff.append(DocumentTypeId);
	    foundBuff.append(semicolon);
	    foundBuff.append(DocumentNumber);
	    foundBuff.append(semicolon);
	    foundBuff.append(TributaryCodeTypeId);
	    foundBuff.append(semicolon);
	    foundBuff.append(TributaryCodeNumber);
	    foundBuff.append(semicolon);
	    foundBuff.append(PersonId);
	    foundBuff.append(semicolon);
	    foundBuff.append(PhoneTypeId);
	    foundBuff.append(semicolon);
	    foundBuff.append(AreaCode);
	    foundBuff.append(semicolon);
	    foundBuff.append(PhoneNumber);
	    foundBuff.append(semicolon);
	    foundBuff.append(PhoneId);
	    foundBuff.append(semicolon);
	    foundBuff.append(Error);
	    foundBuff.append("");
	    foundBuff.append("\n");

	    return foundBuff.toString();
	}

	
	public static String concatMsgBody (String StartTimeString, String EndTimeString, String DurationSeconds, String TotalPerson,
										String numPeopleFound, String numPeopleNOTFound, String numPhoneForged, String numPhoneNOTForged) {
		StringBuilder msgBodyBuff = new StringBuilder();
		
		msgBodyBuff.append("- Total personas ingresadas: ");
		msgBodyBuff.append(TotalPerson);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Encontradas en BUP: ");
		msgBodyBuff.append(numPeopleFound);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- No encontrados en BUP: ");
		msgBodyBuff.append(numPeopleNOTFound);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Se creo el telefono: ");
		msgBodyBuff.append(numPhoneForged);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- No se pudo crear el telefono: ");
		msgBodyBuff.append(numPhoneNOTForged);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		msgBodyBuff.append("Informacion del proceso: ");
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de inicio: ");
		msgBodyBuff.append(StartTimeString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de fin: ");
		msgBodyBuff.append(EndTimeString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Tiempo de proceso: ");
		msgBodyBuff.append(DurationSeconds);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		/*
		msgBodyBuff.append("El proceso comenz�: ");
		msgBodyBuff.append(processInitString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("El proceso finaliz�: ");
		msgBodyBuff.append(endTimestampString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("El proceso dur�: ");
		msgBodyBuff.append(duration);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("El total de personas ingresadas fueron: ");
		msgBodyBuff.append(cardItems);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("En BUP se encontraron: ");
		msgBodyBuff.append(foundInBup);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("En Fuentes Externas se encontraron: ");
		msgBodyBuff.append(foundExternalSources);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		*/
		
		return msgBodyBuff.toString();
	}
	
	public static String concatInsertQuery(String requestId, String id, String documentNumber,
											String tributaryCode, String fullName, String index ) {
		
		StringBuilder queryBuff = new StringBuilder();
		char singleQuote = '\'';
		char comma = ',';
		
		queryBuff.append("INSERT INTO qc.PeopleMassiveSearch (Id, OriginID, DocumentNumber, TributaryCodeNumber, FullName, InputDate, [Order])VALUES (");
		queryBuff.append(singleQuote);
		queryBuff.append(requestId);
		queryBuff.append(singleQuote);
		queryBuff.append(comma);
		queryBuff.append(singleQuote);
		queryBuff.append(id);
		queryBuff.append(singleQuote);
		queryBuff.append(comma);
		queryBuff.append(documentNumber);
		queryBuff.append(comma);
		queryBuff.append(tributaryCode);
		queryBuff.append(comma);
		queryBuff.append(fullName);
		queryBuff.append(comma);
		queryBuff.append("CURRENT_TIMESTAMP");
		queryBuff.append(comma);
		queryBuff.append(index);
		queryBuff.append(");");
		
		return queryBuff.toString();
	}
}
/*	
	public static String concatMsgBodyEmails (String processInitString, String endTimestampString, String duration, String cardItems,
										String foundInBup, String emailsEncontrados) {
		StringBuilder msgBodyBuff = new StringBuilder();

		msgBodyBuff.append("- Emails encontrados en BUP: ");
		msgBodyBuff.append(emailsEncontrados);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- De un total de personas encontradas en BUP: ");
		msgBodyBuff.append(foundInBup);
		msgBodyBuff.append(" (De ");
		msgBodyBuff.append(cardItems);
		msgBodyBuff.append(" personas que se ingresaron)");
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		msgBodyBuff.append("Informaci�n del proceso: ");
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de inicio: ");
		msgBodyBuff.append(processInitString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de fin: ");
		msgBodyBuff.append(endTimestampString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Tiempo de proceso: ");
		msgBodyBuff.append(duration);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		return msgBodyBuff.toString();
	}
	public static String concatStringFoundEmails(String mailId, String mailAddress, 
												String personId) {
		
		StringBuffer foundBuff = new StringBuffer();
		char dotAndComma = ';';
		foundBuff.append(mailId);
		foundBuff.append(dotAndComma);
		foundBuff.append(mailAddress);
		foundBuff.append(dotAndComma);
		foundBuff.append(personId);
		foundBuff.append("\n");
		
		return foundBuff.toString();
	}
	public static String concatStringNotFoundEmails (String personId) {
		StringBuffer notFoundBuff = new StringBuffer();
		
		notFoundBuff.append(";;");
		notFoundBuff.append(personId);
		notFoundBuff.append("\n");
		
		return notFoundBuff.toString();
	}
	
	public static String concatMsgBodyPhones (String processInitString, String endTimestampString, String duration, String cardItems,
										String foundInBup, String phonesEncontrados) {
		StringBuilder msgBodyBuff = new StringBuilder();

		msgBodyBuff.append("- Telefonos encontrados en BUP: ");
		msgBodyBuff.append(phonesEncontrados);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- De un total de personas encontradas en BUP: ");
		msgBodyBuff.append(foundInBup);
		msgBodyBuff.append(" (De ");
		msgBodyBuff.append(cardItems);
		msgBodyBuff.append(" personas que se ingresaron)");
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		msgBodyBuff.append("Informaci�n del proceso: ");
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de inicio: ");
		msgBodyBuff.append(processInitString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Fecha y hora de fin: ");
		msgBodyBuff.append(endTimestampString);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append("- Tiempo de proceso: ");
		msgBodyBuff.append(duration);
		msgBodyBuff.append(System.lineSeparator());
		msgBodyBuff.append(System.lineSeparator());
		
		return msgBodyBuff.toString();
	}
	public static String concatStringFoundPhones(String phoneId, String areaCode, String phoneNumber, String internalPhone, String phoneType, 
			String personId) {
		
		StringBuffer foundBuff = new StringBuffer();
		char dotAndComma = ';';
		foundBuff.append(phoneId);
		foundBuff.append(dotAndComma);
		foundBuff.append(areaCode);
		foundBuff.append(dotAndComma);
		foundBuff.append(phoneNumber);
		foundBuff.append(dotAndComma);
		foundBuff.append(internalPhone);
		foundBuff.append(dotAndComma);
		foundBuff.append(phoneType);
		foundBuff.append(dotAndComma);
		foundBuff.append(personId);
		foundBuff.append("\n");
		
		return foundBuff.toString();
	}
	public static String concatStringNotFoundPhones (String personId) {
		StringBuffer notFoundBuff = new StringBuffer();
		
		notFoundBuff.append(";;;;;");
		notFoundBuff.append(personId);
		notFoundBuff.append("\n");
		
		return notFoundBuff.toString();
	}
	
}
*/
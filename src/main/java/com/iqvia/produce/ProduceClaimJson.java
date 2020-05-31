package com.iqvia.produce;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@Configuration
@EnableBinding(Source.class)
public class ProduceClaimJson {
	
//	@Bean
//	public  IntegrationFlow stringFlow()
//	{
//		return IntegrationFlows.from(getname())
//				.channel(Source.OUTPUT)
//				.get();
//	}
//	
//	public String getname()
//	{
//		String value = "{\r\n" + 
//	      		"  \"resourceType\": \"MedicationRequest\",\r\n" + 
//	      		"  \"id\": \"431837\",\r\n" + 
//	      		"  \"meta\": {\r\n" + 
//	      		"    \"versionId\": \"1\",\r\n" + 
//	      		"    \"lastUpdated\": \"2019-12-16T15:28:18.377+00:00\",\r\n" + 
//	      		"    \"source\": \"#1D6a5ZvM9ldncHf3\"\r\n" + 
//	      		"  },\r\n" + 
//	      		"  \"status\": \"stopped\",\r\n" + 
//	      		"  \"intent\": \"order\",\r\n" + 
//	      		"  \"medicationCodeableConcept\": {\r\n" + 
//	      		"    \"coding\": [\r\n" + 
//	      		"      {\r\n" + 
//	      		"        \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\r\n" + 
//	      		"        \"code\": \"746030\",\r\n" + 
//	      		"        \"display\": \"Atenolol 50 MG / Chlorthalidone 25 MG Oral Tablet\"\r\n" + 
//	      		"      }\r\n" + 
//	      		"    ],\r\n" + 
//	      		"    \"text\": \"Atenolol 50 MG / Chlorthalidone 25 MG Oral Tablet\"\r\n" + 
//	      		"  },\r\n" + 
//	      		"  \"subject\": {\r\n" + 
//	      		"    \"reference\": \"Patient/431798\"\r\n" + 
//	      		"  },\r\n" + 
//	      		"  \"encounter\": {\r\n" + 
//	      		"    \"reference\": \"Encounter/431836\"\r\n" + 
//	      		"  },\r\n" + 
//	      		"  \"authoredOn\": \"1975-04-03T18:20:26+01:00\",\r\n" + 
//	      		"  \"requester\": {\r\n" + 
//	      		"    \"reference\": \"Practitioner/431800\",\r\n" + 
//	      		"    \"display\": \"Dr. Dian810 Greenfelder433\"\r\n" + 
//	      		"  },\r\n" + 
//	      		"  \"reasonReference\": [\r\n" + 
//	      		"    {\r\n" + 
//	      		"      \"reference\": \"Condition/431802\"\r\n" + 
//	      		"    }\r\n" + 
//	      		"  ],\r\n" + 
//	      		"  \"dosageInstruction\": [\r\n" + 
//	      		"    {\r\n" + 
//	      		"      \"sequence\": 1,\r\n" + 
//	      		"      \"timing\": {\r\n" + 
//	      		"        \"repeat\": {\r\n" + 
//	      		"          \"frequency\": 1,\r\n" + 
//	      		"          \"period\": 1.0,\r\n" + 
//	      		"          \"periodUnit\": \"d\"\r\n" + 
//	      		"        }\r\n" + 
//	      		"      },\r\n" + 
//	      		"      \"asNeededBoolean\": false,\r\n" + 
//	      		"      \"doseAndRate\": [\r\n" + 
//	      		"        {\r\n" + 
//	      		"          \"type\": {\r\n" + 
//	      		"            \"coding\": [\r\n" + 
//	      		"              {\r\n" + 
//	      		"                \"system\": \"http://terminology.hl7.org/CodeSystem/dose-rate-type\",\r\n" + 
//	      		"                \"code\": \"ordered\",\r\n" + 
//	      		"                \"display\": \"Ordered\"\r\n" + 
//	      		"              }\r\n" + 
//	      		"            ]\r\n" + 
//	      		"          },\r\n" + 
//	      		"          \"doseQuantity\": {\r\n" + 
//	      		"            \"value\": 1.0\r\n" + 
//	      		"          }\r\n" + 
//	      		"        }\r\n" + 
//	      		"      ]\r\n" + 
//	      		"    }\r\n" + 
//	      		"  ]\r\n" + 
//	      		"}";
//
//		return value;
//	}
	
@InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedRate = "5000"))
	public Message<?> generate() {
	      String value = "{\r\n" + 
	      		"  \"resourceType\": \"MedicationRequest\",\r\n" + 
	      		"  \"id\": \"431837\",\r\n" + 
	      		"  \"meta\": {\r\n" + 
	      		"    \"versionId\": \"1\",\r\n" + 
	      		"    \"lastUpdated\": \"2019-12-16T15:28:18.377+00:00\",\r\n" + 
	      		"    \"source\": \"#1D6a5ZvM9ldncHf3\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"status\": \"stopped\",\r\n" + 
	      		"  \"intent\": \"order\",\r\n" + 
	      		"  \"medicationCodeableConcept\": {\r\n" + 
	      		"    \"coding\": [\r\n" + 
	      		"      {\r\n" + 
	      		"        \"system\": \"http://www.nlm.nih.gov/research/umls/rxnorm\",\r\n" + 
	      		"        \"code\": \"746030\",\r\n" + 
	      		"        \"display\": \"Atenolol 50 MG / Chlorthalidone 25 MG Oral Tablet\"\r\n" + 
	      		"      }\r\n" + 
	      		"    ],\r\n" + 
	      		"    \"text\": \"Atenolol 50 MG / Chlorthalidone 25 MG Oral Tablet\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"subject\": {\r\n" + 
	      		"    \"reference\": \"Patient/431798\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"encounter\": {\r\n" + 
	      		"    \"reference\": \"Encounter/431836\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"authoredOn\": \"1975-04-03T18:20:26+01:00\",\r\n" + 
	      		"  \"requester\": {\r\n" + 
	      		"    \"reference\": \"Practitioner/431800\",\r\n" + 
	      		"    \"display\": \"Dr. Dian810 Greenfelder433\"\r\n" + 
	      		"  },\r\n" + 
	      		"  \"reasonReference\": [\r\n" + 
	      		"    {\r\n" + 
	      		"      \"reference\": \"Condition/431802\"\r\n" + 
	      		"    }\r\n" + 
	      		"  ],\r\n" + 
	      		"  \"dosageInstruction\": [\r\n" + 
	      		"    {\r\n" + 
	      		"      \"sequence\": 1,\r\n" + 
	      		"      \"timing\": {\r\n" + 
	      		"        \"repeat\": {\r\n" + 
	      		"          \"frequency\": 1,\r\n" + 
	      		"          \"period\": 1.0,\r\n" + 
	      		"          \"periodUnit\": \"d\"\r\n" + 
	      		"        }\r\n" + 
	      		"      },\r\n" + 
	      		"      \"asNeededBoolean\": false,\r\n" + 
	      		"      \"doseAndRate\": [\r\n" + 
	      		"        {\r\n" + 
	      		"          \"type\": {\r\n" + 
	      		"            \"coding\": [\r\n" + 
	      		"              {\r\n" + 
	      		"                \"system\": \"http://terminology.hl7.org/CodeSystem/dose-rate-type\",\r\n" + 
	      		"                \"code\": \"ordered\",\r\n" + 
	      		"                \"display\": \"Ordered\"\r\n" + 
	      		"              }\r\n" + 
	      		"            ]\r\n" + 
	      		"          },\r\n" + 
	      		"          \"doseQuantity\": {\r\n" + 
	      		"            \"value\": 1.0\r\n" + 
	      		"          }\r\n" + 
	      		"        }\r\n" + 
	      		"      ]\r\n" + 
	      		"    }\r\n" + 
	      		"  ]\r\n" + 
	      		"}";
	      System.out.println("Sending: " + value);
	      return MessageBuilder.withPayload(value)
	                .setHeader("partitionKey", "medication")
	                .build();
	    }


}

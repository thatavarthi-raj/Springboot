package com.app.request.params;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RequestParamsController {

	@GetMapping(value = "/request-params", produces = TEXT_PLAIN_VALUE)
	public ResponseEntity<String> requestParams(RequestParamsModel requestHeaderParamsModel) {
		log.info("request param1={}, param2={}", requestHeaderParamsModel.getReqParam1(),
				requestHeaderParamsModel.getReqParam2());
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
}
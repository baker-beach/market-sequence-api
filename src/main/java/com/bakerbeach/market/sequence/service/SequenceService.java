package com.bakerbeach.market.sequence.service;

public interface SequenceService {

	Long generateId(String key) throws SequenceServiceException;

	Long generateId(String key, Long maxRandomOffset) throws SequenceServiceException;

}

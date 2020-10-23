package com.bolttech.edirect.rulesengine.service;

public interface IRulesService<T> {

    T execute(T t);

}

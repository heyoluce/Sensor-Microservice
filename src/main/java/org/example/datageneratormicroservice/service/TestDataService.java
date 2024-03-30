package org.example.datageneratormicroservice.service;

import org.example.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);
}

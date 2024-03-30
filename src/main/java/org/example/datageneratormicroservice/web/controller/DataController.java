package org.example.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.example.datageneratormicroservice.model.Data;
import org.example.datageneratormicroservice.model.test.DataTestOptions;
import org.example.datageneratormicroservice.service.KafkaDataService;
import org.example.datageneratormicroservice.service.TestDataService;
import org.example.datageneratormicroservice.web.dto.DataDTO;
import org.example.datageneratormicroservice.web.dto.DataTestOptionsDTO;
import org.example.datageneratormicroservice.web.dto.mapper.DataMapper;
import org.example.datageneratormicroservice.web.dto.mapper.DataTestOptionsMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDTO dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDTO testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }

}

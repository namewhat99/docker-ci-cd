package com.example.docker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ChatStreamResponseDto implements Serializable {
    private String id;
    private String object;
    private Long created;
    private String model;
    @JsonProperty("system_fingerprint")
    private String system_fingerprint;
    private List<Choice> choices;

    @Data
    public static class Choice{
        private Delta delta;
        private Integer index;
        @JsonProperty("finish_reason")
        private String finishReason;
        private String logprobs;

        @Data
        public static class Delta{
            private String content;
        }
    }
}

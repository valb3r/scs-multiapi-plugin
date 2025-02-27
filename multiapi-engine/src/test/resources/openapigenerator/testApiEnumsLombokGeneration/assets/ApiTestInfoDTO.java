package com.sngular.multifileplugin.enumlombokgeneration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.ArrayList;
import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
public class ApiTestInfoDTO {

  @JsonProperty(value ="testers")
  @Singular("tester")
  private List<String> testers;

  @JsonProperty(value ="testName")
  @NonNull
  private String testName;


  @Builder
  @Jacksonized
  private ApiTestInfoDTO(List<String> testers, @NonNull String testName) {
    this.testers = testers;
    this.testName = testName;

  }

}

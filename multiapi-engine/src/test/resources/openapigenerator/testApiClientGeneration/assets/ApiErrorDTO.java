package com.sngular.multifileplugin.testapiclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
public class ApiErrorDTO {

  @JsonProperty(value ="code")
  @NonNull
  private Integer code;

  @JsonProperty(value ="message")
  @NonNull
  private String message;


  @Builder
  @Jacksonized
  private ApiErrorDTO(@NonNull Integer code, @NonNull String message) {
    this.code = code;
    this.message = message;

  }

}

package com.sngular.scsplugin.filegeneration.model.event.consumer;

import com.sngular.scsplugin.filegeneration.model.event.OrderCreatedDTO;

public interface IPublishOperationFileGeneration {

  void publishOperationFileGeneration(final OrderCreatedDTO value);
}
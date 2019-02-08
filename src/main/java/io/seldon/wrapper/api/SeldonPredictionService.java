package io.seldon.wrapper.api;

import io.seldon.protos.PredictionProtos.Feedback;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import io.seldon.protos.PredictionProtos.SeldonMessageList;

public interface SeldonPredictionService {
	default public SeldonMessage predict(SeldonMessage request) {
		return SeldonMessage.newBuilder().build();
	}
	default public SeldonMessage route(SeldonMessage request) {
		return SeldonMessage.newBuilder().build();
	}
	default public SeldonMessage sendFeedback(Feedback request) {
		return SeldonMessage.newBuilder().build();
	}
	default public SeldonMessage transformInput(SeldonMessage request) {
		return SeldonMessage.newBuilder().build();
	}
	default public SeldonMessage transformOutput(SeldonMessage request) {
		return SeldonMessage.newBuilder().build();
	}
	default public SeldonMessage aggregate(SeldonMessageList request) {
		return SeldonMessage.newBuilder().build();
	}
}

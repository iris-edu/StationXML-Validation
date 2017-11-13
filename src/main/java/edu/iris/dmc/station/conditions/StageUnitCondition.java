package edu.iris.dmc.station.conditions;

import edu.iris.dmc.fdsn.station.model.Channel;
import edu.iris.dmc.fdsn.station.model.Network;
import edu.iris.dmc.fdsn.station.model.Response;
import edu.iris.dmc.fdsn.station.model.ResponseStage;
import edu.iris.dmc.fdsn.station.model.Station;
import edu.iris.dmc.fdsn.station.model.Units;
import edu.iris.dmc.station.rules.Result;

public class StageUnitCondition extends AbstractCondition {

	public StageUnitCondition(boolean required, String description) {
		super(required, description);
	}

	@Override
	public Result evaluate(Network network) {
		throw new IllegalArgumentException("method not supported!");
	}

	@Override
	public Result evaluate(Station station) {
		throw new IllegalArgumentException("method not supported!");
	}

	@Override
	public Result evaluate(Channel channel) {
		throw new IllegalArgumentException("method not supported!");
	}

	@Override
	public Result evaluate(Channel channel,Response response) {
		if (this.required) {
			if (response == null) {
				return Result.of(false, "expected response but was null");
			}
		}
		if (response.getStage() != null && !response.getStage().isEmpty()) {
			Units[] current = null;
			int i = 1;
			for (ResponseStage stage : response.getStage()) {
				Units[] units = getUnits(stage);
				if (units == null) {
					return Result.of(false, "stage [ null units for stage " + stage.getNumber().intValue() + "]");
				} else {
					if (current != null) {

						if (!current[1].getName().equals(units[0].getName())) {
							return Result.of(false, "stage [" + stage.getNumber().intValue() + "]");
						}
					}
				}
				current = units;
			}
		}
		return Result.of(true, null);
	}

	public Units[] getUnits(ResponseStage stage) {

		if (stage.getPolesZeros() != null) {
			return new Units[] { stage.getPolesZeros().getInputUnits(), stage.getPolesZeros().getOutputUnits() };
		}
		if (stage.getResponseList() != null) {
			return new Units[] { stage.getResponseList().getInputUnits(), stage.getResponseList().getOutputUnits() };
		}
		if (stage.getFIR() != null) {
			return new Units[] { stage.getFIR().getInputUnits(), stage.getFIR().getOutputUnits() };
		}
		if (stage.getPolynomial() != null) {
			return new Units[] { stage.getPolynomial().getInputUnits(), stage.getPolynomial().getOutputUnits() };
		}
		if (stage.getCoefficients() != null) {
			return new Units[] { stage.getCoefficients().getInputUnits(), stage.getCoefficients().getOutputUnits() };
		}
		return null;
	}
}
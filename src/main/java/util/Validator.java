package util;

import java.util.List;

import bridgeConstant.Constant;
import bridgeConstant.ErrorLog;

public class Validator {
	private static final String NUMBER_REGEX = "\\d+";

	private static final int SIZE_LOWER_INCLUSIVE = 3;
	private static final int SIZE_UPPER_INCLUSIVE = 20;

	public static void validateBridgeSize(List<String> bridge, int size) {
		if (bridge.size() != size) {
			throw new IllegalArgumentException(ErrorLog.LENGTH_IS_NOT_MATCHED_EXCEPTION.log());
		}
	}

	public static void validateBridgeSizeRange(int size) {
		if (size < SIZE_LOWER_INCLUSIVE || size > SIZE_UPPER_INCLUSIVE) {
			throw new IllegalArgumentException(ErrorLog.INVALID_LENGTH_RANGE_EXCEPTION.log());
		}
	}

	public static void validateSizeIsNaturalNumber(String number) {
		if (!number.matches(NUMBER_REGEX)) {
			throw new IllegalArgumentException(ErrorLog.NOT_NATURAL_NUMBER_EXCEPTION.log());
		}
	}

	public static void validateMovingIsCellPosition(String moving) {
		if (!moving.equals(Constant.UPPER_POSITION) && !moving.equals(Constant.LOWER_POSITION)) {
			throw new IllegalArgumentException(ErrorLog.INVALID_MOVING_INPUT_EXCEPTION.log());
		}
	}

	public static void validateGameCommand(String gameCommand) {
		if (!gameCommand.equals(Constant.RESTART) && !gameCommand.equals(Constant.QUIT)) {
			throw new IllegalArgumentException(ErrorLog.INVALID_GAME_COMMAND_EXCEPTION.log());
		}
	}

	public static void validateBridgeComponent(List<String> bridge) {
		if (bridge.stream()
			.anyMatch(cell -> !cell.equals(Constant.UPPER_POSITION) && !cell.equals(Constant.LOWER_POSITION))) {
			throw new IllegalArgumentException(ErrorLog.INVALID_BRIDGE_COMPONENT_EXCEPTION.log());
		}
	}
}

package org.phoenix.common.util;

import org.apache.commons.lang3.StringUtils;

public class NumberUtils {
	public static int str2Int(String str) {
		if (StringUtils.isEmpty(str)) {
			return 0;
		}
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static short str2Short(String str) {
		if (StringUtils.isEmpty(str)) {
			return 0;
		}
		try {
			return Short.parseShort(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}

package org.phoenix.common.util;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtils {
	private static Logger logger = LoggerFactory.getLogger(JsonUtils.class);

	public static JSONObject parseJSONObject(String body) {
		try {
			JSONObject jsonObject = new JSONObject(body);
			return jsonObject;
		} catch (JSONException e) {
			logger.error("parse json failed:" + body, e);
		}
		return null;
	}
}

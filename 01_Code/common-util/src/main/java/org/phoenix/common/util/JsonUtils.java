package org.phoenix.common.util;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtils {
	private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
	
	public static JSONObject parseJSONObject(String body) {
		try {
			JSONObject jsonObject = new JSONObject(body);
			return jsonObject;
		} catch (JSONException e) {
			logger.warn("parse json failed:" + body);
		}
		return null;
	}
}

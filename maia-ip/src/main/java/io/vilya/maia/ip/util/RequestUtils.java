/**
 * 
 */
package io.vilya.maia.ip.util;

import com.google.common.base.Strings;
import com.google.common.net.HttpHeaders;

import io.vertx.core.http.HttpServerRequest;

/**
 * @author erkea <erkea@vilya.io>
 *
 */
public class RequestUtils {

	private RequestUtils() {}
	
	public static String getRealIp(HttpServerRequest request) {
		String ip = request.getHeader(HttpHeaders.X_FORWARDED_FOR);
		if (Strings.isNullOrEmpty(ip)) {
			return ip;
		}
		
		return request.remoteAddress().host();
	}
	
}

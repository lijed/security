package com.grailsinaction.security

import java.lang.invoke.DirectMethodHandle.StaticAccessor;

class SecurityTagLib {
	
    static defaultEncodeAs = 'html'
	
	static namespace = "sec"  //default name space is g
	
    //static encodeAsForTags = [tagName: 'raw']
	
	def isLoggedIn = { attrs, body ->
		if (session["user"] != null) {
			out << body()
		}
	}

	def isNotLoggedIn = { attrs, body ->
		if (session["user"] == null) {
			out << body()
		}
	}

	def userId = {
		out << session["user"]?.userId
	}
}

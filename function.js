function generateKixerGuid() { 
	return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
	var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
	return v.toString(16);
  });
}
		
function setKixerCookie(name, value, minutes, path, domain, secure){  
	var cookie = name + '=' + escape(value);  
	if (minutes){  
		var expiration = new Date((new Date()).getTime() + minutes*60000);  
		cookie += ';expires=' + expiration.toGMTString();  
	}  
	if (path) cookie += ';path=' + path;  
	if (domain) cookie += ';domain=' + domain;  
	if (secure) cookie += ';secure';  
	document.cookie = cookie;  
}  
  
function getKixerCookie(name){  
	var str_cookies = document.cookie;  
	var arr_cookies = str_cookies.split(';');  
	var num_cookies = arr_cookies.length;  
	for(var i = 0; i < num_cookies; i++){  
		 var arr = arr_cookies[i].split("=");  
		 if(arr[0] == name) return unescape(arr[1]);  
	}  
	return null;  
} 
